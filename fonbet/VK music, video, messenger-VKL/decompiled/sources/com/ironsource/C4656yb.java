package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4656yb {
    private final a a;
    protected long b;

    /* renamed from: com.ironsource.yb$a */
    public class a extends Thread {
        private Handler a;

        public /* synthetic */ a(C4656yb c4656yb, int i) {
            this();
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

        private a() {
        }
    }

    public C4656yb() {
        a aVar = new a(this, 0);
        this.a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler a2;
        a aVar = this.a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.post(runnable);
    }
}
