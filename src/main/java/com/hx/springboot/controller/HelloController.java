package com.hx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxinqiang
 * @content
 * @create 2018-09-19 17:30
 */

/*
//注解到类上表示：这个类的所有方法返回的数据直接写给浏览器，如果是对象转为json数据
@ResponseBody
@Controller
*/

//可以用@RestController 代替上面2个注解
@RestController
public class HelloController {


    //这就是 restapi 风格的
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }
}
