package io.sentry.android.core;

import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7217w1;
import io.sentry.android.core.F;
import io.sentry.h3;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class Y implements F.a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f67033a;

    /* renamed from: b, reason: collision with root package name */
    private final long f67034b;

    /* renamed from: c, reason: collision with root package name */
    private TimerTask f67035c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.l<Timer> f67036d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67037e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final A1 f67038f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f67039g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f67040h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67041i;

    Y(@NotNull A1 a12, long j11, boolean z11, boolean z12) {
        io.sentry.transport.c a11 = io.sentry.transport.c.a();
        this.f67033a = new AtomicLong(0L);
        this.f67036d = new io.sentry.util.l<>(new U7.m());
        this.f67037e = new io.sentry.util.a();
        this.f67034b = j11;
        this.f67039g = z11;
        this.f67040h = z12;
        this.f67038f = a12;
        this.f67041i = a11;
    }

    public static /* synthetic */ void a(Y y11, io.sentry.U u11) {
        h3 x11;
        AtomicLong atomicLong = y11.f67033a;
        if (atomicLong.get() != 0 || (x11 = u11.x()) == null || x11.h() == null) {
            return;
        }
        atomicLong.set(x11.h().getTime());
    }

    private void e(@NotNull String str) {
        if (this.f67040h) {
            C7141f c7141f = new C7141f();
            c7141f.r("navigation");
            c7141f.o(str, "state");
            c7141f.n("app.lifecycle");
            c7141f.p(I2.INFO);
            this.f67038f.f(c7141f);
        }
    }

    private void f() {
        InterfaceC7097a0 a11 = this.f67037e.a();
        try {
            TimerTask timerTask = this.f67035c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f67035c = null;
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.F.a
    public final void c() {
        f();
        this.f67041i.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC7217w1 interfaceC7217w1 = new InterfaceC7217w1() { // from class: io.sentry.android.core.W
            @Override // io.sentry.InterfaceC7217w1
            public final void e(io.sentry.U u11) {
                Y.a(Y.this, u11);
            }
        };
        A1 a12 = this.f67038f;
        a12.m(interfaceC7217w1);
        AtomicLong atomicLong = this.f67033a;
        long j11 = atomicLong.get();
        if (j11 == 0 || j11 + this.f67034b <= currentTimeMillis) {
            if (this.f67039g) {
                a12.l();
            }
            a12.getOptions().getReplayController().start();
        }
        a12.getOptions().getReplayController().resume();
        atomicLong.set(currentTimeMillis);
        e("foreground");
    }

    @Override // io.sentry.android.core.F.a
    public final void j() {
        this.f67041i.getClass();
        this.f67033a.set(System.currentTimeMillis());
        this.f67038f.getOptions().getReplayController().pause();
        InterfaceC7097a0 a11 = this.f67037e.a();
        try {
            f();
            this.f67035c = new X(this);
            this.f67036d.a().schedule(this.f67035c, this.f67034b);
            a11.close();
            e("background");
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
