package com.yancheng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

     Logger log = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);




        System.out.println("我们都是");
    }

}
