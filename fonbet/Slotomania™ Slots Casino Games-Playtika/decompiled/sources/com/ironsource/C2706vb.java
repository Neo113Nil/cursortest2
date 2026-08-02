package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2706vb {
    private static final String g = "vb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final C2407eg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC2473ia f = new a();

    /* renamed from: com.ironsource.vb$a */
    class a implements InterfaceC2473ia {
        a() {
        }

        @Override // com.ironsource.InterfaceC2473ia
        public void a() {
            C2706vb.this.c.c(System.currentTimeMillis());
            C2706vb.this.c();
        }

        @Override // com.ironsource.InterfaceC2473ia
        public void b() {
            C2706vb.this.c.b(System.currentTimeMillis());
            C2706vb c2706vb = C2706vb.this;
            c2706vb.b(c2706vb.c.a());
        }

        @Override // com.ironsource.InterfaceC2473ia
        public void c() {
        }

        @Override // com.ironsource.InterfaceC2473ia
        public void d() {
        }
    }

    /* renamed from: com.ironsource.vb$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C2706vb c2706vb = C2706vb.this;
            c2706vb.a.b(c2706vb.f);
            C2706vb.this.c.b();
            C2706vb.this.b.run();
        }
    }

    public C2706vb(Runnable runnable, com.ironsource.lifecycle.b bVar, C2407eg c2407eg) {
        this.b = runnable;
        this.a = bVar;
        this.c = c2407eg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
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

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }
}
