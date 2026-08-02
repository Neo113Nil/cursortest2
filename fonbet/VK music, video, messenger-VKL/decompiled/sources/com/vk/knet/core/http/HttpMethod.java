package com.vk.knet.core.http;

import java.util.HashMap;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpMethod.kt */
/* loaded from: classes.dex */
public final class HttpMethod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final HttpMethod CONNECT;
    public static final a Companion;
    public static final HttpMethod DELETE;
    public static final HttpMethod GET;
    public static final HttpMethod HEAD;
    public static final HttpMethod OPTIONS;
    public static final HttpMethod PATCH;
    public static final HttpMethod POST;
    public static final HttpMethod PUT;
    public static final HttpMethod TRACE;
    private static final HashMap<String, HttpMethod> methodMap;
    private final String methodName;

    /* compiled from: HttpMethod.kt */
    public static final class a {
    }

    static {
        HttpMethod httpMethod = new HttpMethod("GET", 0, "GET");
        GET = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("HEAD", 1, "HEAD");
        HEAD = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("POST", 2, "POST");
        POST = httpMethod3;
        HttpMethod httpMethod4 = new HttpMethod("PUT", 3, "PUT");
        PUT = httpMethod4;
        HttpMethod httpMethod5 = new HttpMethod("PATCH", 4, "PATCH");
        PATCH = httpMethod5;
        HttpMethod httpMethod6 = new HttpMethod("DELETE", 5, "DELETE");
        DELETE = httpMethod6;
        HttpMethod httpMethod7 = new HttpMethod("CONNECT", 6, "CONNECT");
        CONNECT = httpMethod7;
        HttpMethod httpMethod8 = new HttpMethod("OPTIONS", 7, "OPTIONS");
        OPTIONS = httpMethod8;
        HttpMethod httpMethod9 = new HttpMethod("TRACE", 8, "TRACE");
        TRACE = httpMethod9;
        HttpMethod[] httpMethodArr = {httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7, httpMethod8, httpMethod9};
        $VALUES = httpMethodArr;
        $ENTRIES = new asp(httpMethodArr);
        Companion = new a();
        HashMap<String, HttpMethod> hashMap = new HashMap<>();
        hashMap.put(httpMethod.methodName, httpMethod);
        hashMap.put(httpMethod2.methodName, httpMethod2);
        hashMap.put(httpMethod3.methodName, httpMethod3);
        hashMap.put(httpMethod4.methodName, httpMethod4);
        hashMap.put(httpMethod6.methodName, httpMethod6);
        hashMap.put(httpMethod7.methodName, httpMethod7);
        hashMap.put(httpMethod8.methodName, httpMethod8);
        hashMap.put(httpMethod9.methodName, httpMethod9);
        hashMap.put(httpMethod5.methodName, httpMethod5);
        methodMap = hashMap;
    }

    public HttpMethod(String str, int i, String str2) {
        this.methodName = str2;
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }

    public final String i() {
        return this.methodName;
    }
}
