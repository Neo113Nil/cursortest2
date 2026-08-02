package io.sentry.android.core;

import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.N1;
import io.sentry.V3;
import io.sentry.android.core.AppState;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class K0 implements AppState.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f50701a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50702b;

    /* renamed from: c, reason: collision with root package name */
    public TimerTask f50703c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.p f50704d;

    /* renamed from: e, reason: collision with root package name */
    public final C4843a f50705e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4740e0 f50706f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f50707g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f50708h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.transport.o f50709i;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (K0.this.f50707g) {
                K0.this.f50706f.endSession();
            }
            K0.this.f50706f.i().getReplayController().stop();
            K0.this.f50706f.i().getContinuousProfiler().a(false);
        }
    }

    public K0(InterfaceC4740e0 interfaceC4740e0, long j10, boolean z10, boolean z11) {
        this(interfaceC4740e0, j10, z10, z11, io.sentry.transport.m.b());
    }

    public static /* synthetic */ void a(K0 k02, InterfaceC4730c0 interfaceC4730c0) {
        V3 M10;
        if (k02.f50701a.get() != 0 || (M10 = interfaceC4730c0.M()) == null || M10.k() == null) {
            return;
        }
        k02.f50701a.set(M10.k().getTime());
    }

    public static /* synthetic */ Timer b() {
        return new Timer(true);
    }

    @Override // io.sentry.android.core.AppState.a
    public void d() {
        i();
        f("foreground");
    }

    public final void f(String str) {
        if (this.f50708h) {
            C4744f c4744f = new C4744f();
            c4744f.A("navigation");
            c4744f.w("state", str);
            c4744f.v("app.lifecycle");
            c4744f.x(EnumC4788n3.INFO);
            this.f50706f.d(c4744f);
        }
    }

    public final void g() {
        InterfaceC4765j0 d10 = this.f50705e.d();
        try {
            TimerTask timerTask = this.f50703c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f50703c = null;
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void h() {
        InterfaceC4765j0 d10 = this.f50705e.d();
        try {
            g();
            this.f50703c = new a();
            ((Timer) this.f50704d.a()).schedule(this.f50703c, this.f50702b);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final void i() {
        g();
        long a10 = this.f50709i.a();
        this.f50706f.l(new N1() { // from class: io.sentry.android.core.J0
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                K0.a(K0.this, interfaceC4730c0);
            }
        });
        long j10 = this.f50701a.get();
        if (j10 == 0 || j10 + this.f50702b <= a10) {
            if (this.f50707g) {
                this.f50706f.t();
            }
            this.f50706f.i().getReplayController().start();
        }
        this.f50706f.i().getReplayController().resume();
        this.f50701a.set(a10);
    }

    @Override // io.sentry.android.core.AppState.a
    public void k() {
        this.f50701a.set(this.f50709i.a());
        this.f50706f.i().getReplayController().pause();
        h();
        f(AppStateModule.APP_STATE_BACKGROUND);
    }

    public K0(InterfaceC4740e0 interfaceC4740e0, long j10, boolean z10, boolean z11, io.sentry.transport.o oVar) {
        this.f50701a = new AtomicLong(0L);
        this.f50704d = new io.sentry.util.p(new p.a() { // from class: io.sentry.android.core.I0
            @Override // io.sentry.util.p.a
            public final Object a() {
                return K0.b();
            }
        });
        this.f50705e = new C4843a();
        this.f50702b = j10;
        this.f50707g = z10;
        this.f50708h = z11;
        this.f50706f = interfaceC4740e0;
        this.f50709i = oVar;
    }
}
