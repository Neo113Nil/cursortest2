package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import xsna.e560;
import xsna.f560;
import xsna.k8x;
import xsna.kq;
import xsna.xop0;

/* loaded from: classes13.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpUriRequest.getURI().toString());
            e560Var.e(httpUriRequest.getMethod());
            Long a = f560.a(httpUriRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            HttpResponse execute = httpClient.execute(httpUriRequest);
            e560Var.l(timer.d());
            e560Var.f(execute.getStatusLine().getStatusCode());
            Long a2 = f560.a(execute);
            if (a2 != null) {
                e560Var.k(a2.longValue());
            }
            String b = f560.b(execute);
            if (b != null) {
                e560Var.j(b);
            }
            e560Var.d();
            return execute;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpUriRequest.getURI().toString());
            e560Var.e(httpUriRequest.getMethod());
            Long a = f560.a(httpUriRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            e560Var.l(timer.d());
            e560Var.f(execute.getStatusLine().getStatusCode());
            Long a2 = f560.a(execute);
            if (a2 != null) {
                e560Var.k(a2.longValue());
            }
            String b = f560.b(execute);
            if (b != null) {
                e560Var.j(b);
            }
            e560Var.d();
            return execute;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpUriRequest.getURI().toString());
            e560Var.e(httpUriRequest.getMethod());
            Long a = f560.a(httpUriRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            return (T) httpClient.execute(httpUriRequest, new k8x(responseHandler, timer, e560Var));
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpUriRequest.getURI().toString());
            e560Var.e(httpUriRequest.getMethod());
            Long a = f560.a(httpUriRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            return (T) httpClient.execute(httpUriRequest, new k8x(responseHandler, timer, e560Var), httpContext);
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            e560Var.e(httpRequest.getRequestLine().getMethod());
            Long a = f560.a(httpRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            e560Var.l(timer.d());
            e560Var.f(execute.getStatusLine().getStatusCode());
            Long a2 = f560.a(execute);
            if (a2 != null) {
                e560Var.k(a2.longValue());
            }
            String b = f560.b(execute);
            if (b != null) {
                e560Var.j(b);
            }
            e560Var.d();
            return execute;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            e560Var.e(httpRequest.getRequestLine().getMethod());
            Long a = f560.a(httpRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            e560Var.l(timer.d());
            e560Var.f(execute.getStatusLine().getStatusCode());
            Long a2 = f560.a(execute);
            if (a2 != null) {
                e560Var.k(a2.longValue());
            }
            String b = f560.b(execute);
            if (b != null) {
                e560Var.j(b);
            }
            e560Var.d();
            return execute;
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            e560Var.e(httpRequest.getRequestLine().getMethod());
            Long a = f560.a(httpRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            return (T) httpClient.execute(httpHost, httpRequest, new k8x(responseHandler, timer, e560Var));
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        e560 e560Var = new e560(xop0.t);
        try {
            e560Var.n(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            e560Var.e(httpRequest.getRequestLine().getMethod());
            Long a = f560.a(httpRequest);
            if (a != null) {
                e560Var.g(a.longValue());
            }
            timer.reset();
            e560Var.i(timer.b);
            return (T) httpClient.execute(httpHost, httpRequest, new k8x(responseHandler, timer, e560Var), httpContext);
        } catch (IOException e) {
            kq.c(timer, e560Var, e560Var);
            throw e;
        }
    }
}
