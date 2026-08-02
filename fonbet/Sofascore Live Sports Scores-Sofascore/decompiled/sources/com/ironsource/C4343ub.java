package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4343ub {
    private static final String g = "ub";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final C4116hg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC4128ia f = new a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ub$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4343ub c4343ub = C4343ub.this;
            c4343ub.a.b(c4343ub.f);
            C4343ub.this.c.b();
            C4343ub.this.b.run();
        }
    }

    public C4343ub(Runnable runnable, com.ironsource.lifecycle.b bVar, C4116hg c4116hg) {
        this.b = runnable;
        this.a = bVar;
        this.c = c4116hg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j) {
        if (j < 0) {
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ub$a */
    public class a implements InterfaceC4128ia {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4128ia
        public void a() {
            C4343ub.this.c.c(System.currentTimeMillis());
            C4343ub.this.c();
        }

        @Override // com.ironsource.InterfaceC4128ia
        public void b() {
            C4343ub.this.c.b(System.currentTimeMillis());
            C4343ub c4343ub = C4343ub.this;
            c4343ub.b(c4343ub.c.a());
        }

        @Override // com.ironsource.InterfaceC4128ia
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4128ia
        public void d() {
        }
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a() {
        a(0L);
    }
}
