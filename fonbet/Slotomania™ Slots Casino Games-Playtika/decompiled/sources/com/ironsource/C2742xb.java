package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2742xb {
    private final a a;
    protected long b;

    /* renamed from: com.ironsource.xb$a */
    private class a extends Thread {
        private Handler a;

        private a() {
        }

        public Handler a() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }
    }

    public C2742xb() {
        a aVar = new a();
        this.a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    protected boolean a(Object obj) {
        return (obj == null || this.a == null) ? false : true;
    }

    protected void a(Runnable runnable) {
        Handler a2;
        a aVar = this.a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.post(runnable);
    }
}
