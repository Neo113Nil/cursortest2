package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes4.dex */
public class Df extends Thread {
    private static Df b;
    private a a;

    private class a extends HandlerThread {
        private Handler a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        Handler a() {
            return this.a;
        }

        void b() {
            this.a = new Handler(getLooper());
        }
    }

    private Df() {
        a aVar = new a(getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        this.a.b();
    }

    public static synchronized Df a() {
        Df df;
        synchronized (Df.class) {
            if (b == null) {
                b = new Df();
            }
            df = b;
        }
        return df;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        Handler a2 = aVar.a();
        if (a2 != null) {
            a2.post(runnable);
        }
    }
}
