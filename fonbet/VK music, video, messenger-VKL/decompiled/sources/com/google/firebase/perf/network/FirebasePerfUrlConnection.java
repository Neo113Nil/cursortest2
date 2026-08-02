package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import xsna.a8x;
import xsna.e560;
import xsna.f560;
import xsna.xop0;
import xsna.z7x;

/* loaded from: classes13.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        xop0 xop0Var = xop0.t;
        Timer timer = new Timer();
        timer.reset();
        long j = timer.b;
        e560 e560Var = new e560(xop0Var);
        try {
            URLConnection openConnection = url.openConnection();
            return openConnection instanceof HttpsURLConnection ? new a8x((HttpsURLConnection) openConnection, timer, e560Var).a.b() : openConnection instanceof HttpURLConnection ? new z7x((HttpURLConnection) openConnection, timer, e560Var).a.b() : openConnection.getContent();
        } catch (IOException e) {
            e560Var.i(j);
            e560Var.l(timer.d());
            e560Var.n(url.toString());
            f560.c(e560Var);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new a8x((HttpsURLConnection) obj, new Timer(), new e560(xop0.t)) : obj instanceof HttpURLConnection ? new z7x((HttpURLConnection) obj, new Timer(), new e560(xop0.t)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        xop0 xop0Var = xop0.t;
        Timer timer = new Timer();
        timer.reset();
        long j = timer.b;
        e560 e560Var = new e560(xop0Var);
        try {
            URLConnection openConnection = url.openConnection();
            return openConnection instanceof HttpsURLConnection ? new a8x((HttpsURLConnection) openConnection, timer, e560Var).a.e() : openConnection instanceof HttpURLConnection ? new z7x((HttpURLConnection) openConnection, timer, e560Var).a.e() : openConnection.getInputStream();
        } catch (IOException e) {
            e560Var.i(j);
            e560Var.l(timer.d());
            e560Var.n(url.toString());
            f560.c(e560Var);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        xop0 xop0Var = xop0.t;
        Timer timer = new Timer();
        timer.reset();
        long j = timer.b;
        e560 e560Var = new e560(xop0Var);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new a8x((HttpsURLConnection) openConnection, timer, e560Var).a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new z7x((HttpURLConnection) openConnection, timer, e560Var).a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            e560Var.i(j);
            e560Var.l(timer.d());
            e560Var.n(url.toString());
            f560.c(e560Var);
            throw e;
        }
    }
}
