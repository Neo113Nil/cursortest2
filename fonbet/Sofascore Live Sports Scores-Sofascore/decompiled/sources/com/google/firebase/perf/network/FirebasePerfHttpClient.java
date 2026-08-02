package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import defpackage.a6a;
import defpackage.fc6;
import defpackage.fyj;
import defpackage.xad;
import defpackage.yad;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            xadVar.c(httpRequest.getRequestLine().getMethod());
            Long a = yad.a(httpRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            xadVar.j(timer.a());
            xadVar.d(execute.getStatusLine().getStatusCode());
            Long a2 = yad.a(execute);
            if (a2 != null) {
                xadVar.i(a2.longValue());
            }
            String b = yad.b(execute);
            if (b != null) {
                xadVar.h(b);
            }
            xadVar.b();
            return execute;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpUriRequest.getURI().toString());
            xadVar.c(httpUriRequest.getMethod());
            Long a = yad.a(httpUriRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            xadVar.j(timer.a());
            xadVar.d(execute.getStatusLine().getStatusCode());
            Long a2 = yad.a(execute);
            if (a2 != null) {
                xadVar.i(a2.longValue());
            }
            String b = yad.b(execute);
            if (b != null) {
                xadVar.h(b);
            }
            xadVar.b();
            return execute;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpUriRequest.getURI().toString());
            xadVar.c(httpUriRequest.getMethod());
            Long a = yad.a(httpUriRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            return (T) httpClient.execute(httpUriRequest, new a6a(responseHandler, timer, xadVar));
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpUriRequest.getURI().toString());
            xadVar.c(httpUriRequest.getMethod());
            Long a = yad.a(httpUriRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            return (T) httpClient.execute(httpUriRequest, new a6a(responseHandler, timer, xadVar), httpContext);
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpUriRequest.getURI().toString());
            xadVar.c(httpUriRequest.getMethod());
            Long a = yad.a(httpUriRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            HttpResponse execute = httpClient.execute(httpUriRequest);
            xadVar.j(timer.a());
            xadVar.d(execute.getStatusLine().getStatusCode());
            Long a2 = yad.a(execute);
            if (a2 != null) {
                xadVar.i(a2.longValue());
            }
            String b = yad.b(execute);
            if (b != null) {
                xadVar.h(b);
            }
            xadVar.b();
            return execute;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            xadVar.c(httpRequest.getRequestLine().getMethod());
            Long a = yad.a(httpRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            xadVar.j(timer.a());
            xadVar.d(execute.getStatusLine().getStatusCode());
            Long a2 = yad.a(execute);
            if (a2 != null) {
                xadVar.i(a2.longValue());
            }
            String b = yad.b(execute);
            if (b != null) {
                xadVar.h(b);
            }
            xadVar.b();
            return execute;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            xadVar.c(httpRequest.getRequestLine().getMethod());
            Long a = yad.a(httpRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            return (T) httpClient.execute(httpHost, httpRequest, new a6a(responseHandler, timer, xadVar));
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        xad xadVar = new xad(fyj.s);
        try {
            xadVar.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            xadVar.c(httpRequest.getRequestLine().getMethod());
            Long a = yad.a(httpRequest);
            if (a != null) {
                xadVar.f(a.longValue());
            }
            timer.c();
            xadVar.g(timer.a);
            return (T) httpClient.execute(httpHost, httpRequest, new a6a(responseHandler, timer, xadVar), httpContext);
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }
}
