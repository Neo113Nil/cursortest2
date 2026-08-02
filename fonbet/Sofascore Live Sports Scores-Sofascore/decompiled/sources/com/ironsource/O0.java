package com.ironsource;

import com.ironsource.M0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class O0 {
    private final M0 a;
    private final Db b;
    private final C4343ub c = c();
    private Timer d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    public O0(M0 m0, @NotNull Db db) {
        this.a = m0;
        this.b = db;
    }

    private synchronized void b(long j) {
        j();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    private C4343ub c() {
        return new C4343ub(new a(), com.ironsource.lifecycle.b.d(), new C4116hg());
    }

    private synchronized void j() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.a.a() == M0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean d() {
        return this.a.c() > 0;
    }

    public void e() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.a.c());
        }
    }

    public void f() {
        if (this.a.a() == M0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.a.d());
        }
    }

    public void g() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.a.a() != M0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.a.d());
    }

    public void i() {
        C4343ub c4343ub = this.c;
        if (c4343ub != null) {
            c4343ub.b();
        }
    }

    public void k() {
        if (this.a.a() != M0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.a.b());
    }

    public void a(long j) {
        C4343ub c4343ub = this.c;
        if (c4343ub != null) {
            c4343ub.a(j);
        }
    }

    public M0 b() {
        return this.a;
    }
}
