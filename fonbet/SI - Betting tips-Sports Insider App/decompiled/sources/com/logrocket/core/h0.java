package com.logrocket.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f6586a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b, reason: collision with root package name */
    public static Proxy f6587b;

    public static void a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = (100 > httpURLConnection.getResponseCode() || httpURLConnection.getResponseCode() > 399) ? new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while (bufferedReader.readLine() != null) {
        }
        bufferedReader.close();
    }

    public static void b(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            c(th2);
        }
    }

    public static void c(Throwable th2) {
        if (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        f6586a.execute(new aa.c(13, th2));
    }
}
