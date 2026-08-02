package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4620wb {
    private static final String g = "wb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final C4410kg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC4386ja f = new a();

    /* renamed from: com.ironsource.wb$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4620wb c4620wb = C4620wb.this;
            c4620wb.a.b(c4620wb.f);
            C4620wb.this.c.b();
            C4620wb.this.b.run();
        }
    }

    public C4620wb(Runnable runnable, com.ironsource.lifecycle.b bVar, C4410kg c4410kg) {
        this.b = runnable;
        this.a = bVar;
        this.c = c4410kg;
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

    /* renamed from: com.ironsource.wb$a */
    public class a implements InterfaceC4386ja {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4386ja
        public void a() {
            C4620wb.this.c.c(System.currentTimeMillis());
            C4620wb.this.c();
        }

        @Override // com.ironsource.InterfaceC4386ja
        public void b() {
            C4620wb.this.c.b(System.currentTimeMillis());
            C4620wb c4620wb = C4620wb.this;
            c4620wb.b(c4620wb.c.a());
        }

        @Override // com.ironsource.InterfaceC4386ja
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4386ja
        public void d() {
        }
    }
}
