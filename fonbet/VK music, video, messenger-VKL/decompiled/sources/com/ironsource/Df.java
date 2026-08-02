package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes13.dex */
public class Df extends Thread {
    private static Df b;
    private a a;

    public class a extends HandlerThread {
        private Handler a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.a;
        }

        public void b() {
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
            try {
                if (b == null) {
                    b = new Df();
                }
                df = b;
            } catch (Throwable th) {
                throw th;
            }
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
