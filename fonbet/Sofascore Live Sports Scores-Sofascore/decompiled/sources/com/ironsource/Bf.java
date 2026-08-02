package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Bf extends Thread {
    private static Bf b;
    private a a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    private Bf() {
        a aVar = new a(getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        this.a.b();
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

    public static synchronized Bf a() {
        Bf bf;
        synchronized (Bf.class) {
            bf = b;
            if (bf == null) {
                bf = new Bf();
                b = bf;
            }
        }
        return bf;
    }
}
