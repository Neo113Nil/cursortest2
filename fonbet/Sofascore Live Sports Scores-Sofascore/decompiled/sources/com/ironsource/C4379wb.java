package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4379wb {
    private final a a;
    protected long b;

    public C4379wb() {
        a aVar = new a(this, 0);
        this.a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    public void a(Runnable runnable) {
        Handler a2;
        a aVar = this.a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return;
        }
        a2.post(runnable);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.wb$a */
    public class a extends Thread {
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

        public /* synthetic */ a(C4379wb c4379wb, int i) {
            this();
        }
    }

    public boolean a(Object obj) {
        return (obj == null || this.a == null) ? false : true;
    }
}
