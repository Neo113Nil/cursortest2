package defpackage;

import com.google.firebase.perf.util.Timer;
import com.ironsource.C4094gc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z5a {
    public static final l10 f = l10.c();
    public final HttpURLConnection a;
    public final xad b;
    public long c = -1;
    public long d = -1;
    public final Timer e;

    public z5a(HttpURLConnection httpURLConnection, Timer timer, xad xadVar) {
        this.a = httpURLConnection;
        this.b = xadVar;
        this.e = timer;
        xadVar.k(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j = this.c;
        xad xadVar = this.b;
        Timer timer = this.e;
        if (j == -1) {
            timer.c();
            long j2 = timer.a;
            this.c = j2;
            xadVar.g(j2);
        }
        try {
            this.a.connect();
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final Object b() {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        xad xadVar = this.b;
        xadVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                xadVar.h(httpURLConnection.getContentType());
                return new v5a((InputStream) content, xadVar, timer);
            }
            xadVar.h(httpURLConnection.getContentType());
            xadVar.i(httpURLConnection.getContentLength());
            xadVar.j(timer.a());
            xadVar.b();
            return content;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        xad xadVar = this.b;
        xadVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                xadVar.h(httpURLConnection.getContentType());
                return new v5a((InputStream) content, xadVar, timer);
            }
            xadVar.h(httpURLConnection.getContentType());
            xadVar.i(httpURLConnection.getContentLength());
            xadVar.j(timer.a());
            xadVar.b();
            return content;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.a;
        xad xadVar = this.b;
        i();
        try {
            xadVar.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.getClass();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new v5a(errorStream, xadVar, this.e) : errorStream;
    }

    public final InputStream e() {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.a;
        int responseCode = httpURLConnection.getResponseCode();
        xad xadVar = this.b;
        xadVar.d(responseCode);
        xadVar.h(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new v5a(inputStream, xadVar, timer) : inputStream;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final OutputStream f() {
        Timer timer = this.e;
        xad xadVar = this.b;
        try {
            OutputStream outputStream = this.a.getOutputStream();
            return outputStream != null ? new w5a(outputStream, xadVar, timer) : outputStream;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final int g() {
        i();
        long j = this.d;
        Timer timer = this.e;
        xad xadVar = this.b;
        if (j == -1) {
            long a = timer.a();
            this.d = a;
            xadVar.d.w(a);
        }
        try {
            int responseCode = this.a.getResponseCode();
            xadVar.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.a;
        i();
        long j = this.d;
        Timer timer = this.e;
        xad xadVar = this.b;
        if (j == -1) {
            long a = timer.a();
            this.d = a;
            xadVar.d.w(a);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            xadVar.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        long j = this.c;
        xad xadVar = this.b;
        if (j == -1) {
            Timer timer = this.e;
            timer.c();
            long j2 = timer.a;
            this.c = j2;
            xadVar.g(j2);
        }
        HttpURLConnection httpURLConnection = this.a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            xadVar.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            xadVar.c(C4094gc.b);
        } else {
            xadVar.c(C4094gc.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
