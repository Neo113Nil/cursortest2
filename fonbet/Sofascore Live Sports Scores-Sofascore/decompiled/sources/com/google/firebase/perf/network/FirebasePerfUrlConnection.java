package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import defpackage.fyj;
import defpackage.x5a;
import defpackage.xad;
import defpackage.y5a;
import defpackage.yad;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        fyj fyjVar = fyj.s;
        Timer timer = new Timer();
        timer.c();
        long j = timer.a;
        xad xadVar = new xad(fyjVar);
        try {
            URLConnection openConnection = url.openConnection();
            return openConnection instanceof HttpsURLConnection ? new y5a((HttpsURLConnection) openConnection, timer, xadVar).a.b() : openConnection instanceof HttpURLConnection ? new x5a((HttpURLConnection) openConnection, timer, xadVar).a.b() : openConnection.getContent();
        } catch (IOException e) {
            xadVar.g(j);
            xadVar.j(timer.a());
            xadVar.k(url.toString());
            yad.c(xadVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new y5a((HttpsURLConnection) obj, new Timer(), new xad(fyj.s)) : obj instanceof HttpURLConnection ? new x5a((HttpURLConnection) obj, new Timer(), new xad(fyj.s)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        fyj fyjVar = fyj.s;
        Timer timer = new Timer();
        if (!fyjVar.c.get()) {
            return url.openConnection().getInputStream();
        }
        timer.c();
        long j = timer.a;
        xad xadVar = new xad(fyjVar);
        try {
            URLConnection openConnection = url.openConnection();
            return openConnection instanceof HttpsURLConnection ? new y5a((HttpsURLConnection) openConnection, timer, xadVar).a.e() : openConnection instanceof HttpURLConnection ? new x5a((HttpURLConnection) openConnection, timer, xadVar).a.e() : openConnection.getInputStream();
        } catch (IOException e) {
            xadVar.g(j);
            xadVar.j(timer.a());
            xadVar.k(url.toString());
            yad.c(xadVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        fyj fyjVar = fyj.s;
        Timer timer = new Timer();
        timer.c();
        long j = timer.a;
        xad xadVar = new xad(fyjVar);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new y5a((HttpsURLConnection) openConnection, timer, xadVar).a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new x5a((HttpURLConnection) openConnection, timer, xadVar).a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e) {
            xadVar.g(j);
            xadVar.j(timer.a());
            xadVar.k(url.toString());
            yad.c(xadVar);
            throw e;
        }
    }
}
