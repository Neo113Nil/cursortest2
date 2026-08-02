package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.AbstractC4856v2;
import io.sentry.C4734d;
import io.sentry.C4739e;
import io.sentry.C4781m1;
import io.sentry.C4867x3;
import io.sentry.E1;
import io.sentry.EnumC4788n3;
import io.sentry.EnumC4832t0;
import io.sentry.F3;
import io.sentry.I;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4780m0;
import io.sentry.InterfaceC4790o0;
import io.sentry.InterfaceC4839u0;
import io.sentry.K0;
import io.sentry.L1;
import io.sentry.N1;
import io.sentry.android.core.C4673d0;
import io.sentry.android.core.performance.m;
import io.sentry.e4;
import io.sentry.f4;
import io.sentry.l4;
import io.sentry.m4;
import io.sentry.n4;
import io.sentry.o4;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements InterfaceC4839u0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: v, reason: collision with root package name */
    public static final long f50615v = TimeUnit.MINUTES.toNanos(1);

    /* renamed from: a, reason: collision with root package name */
    public final Application f50616a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i0 f50617b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4740e0 f50618c;

    /* renamed from: d, reason: collision with root package name */
    public SentryAndroidOptions f50619d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50622g;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4780m0 f50625j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4790o0 f50626k;

    /* renamed from: r, reason: collision with root package name */
    public final C4682i f50633r;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50620e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50621f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50623h = false;

    /* renamed from: i, reason: collision with root package name */
    public io.sentry.I f50624i = null;

    /* renamed from: l, reason: collision with root package name */
    public final WeakHashMap f50627l = new WeakHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f50628m = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f50629n = new WeakHashMap();

    /* renamed from: o, reason: collision with root package name */
    public AbstractC4856v2 f50630o = new C4867x3(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public Future f50631p = null;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f50632q = new WeakHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final C4843a f50634s = new C4843a();

    /* renamed from: t, reason: collision with root package name */
    public boolean f50635t = false;

    /* renamed from: u, reason: collision with root package name */
    public final C4843a f50636u = new C4843a();

    public ActivityLifecycleIntegration(Application application, C4683i0 c4683i0, C4682i c4682i) {
        this.f50616a = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f50617b = (C4683i0) io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
        this.f50633r = (C4682i) io.sentry.util.w.c(c4682i, "ActivityFramesTracker is required");
        if (c4683i0.d() >= 29) {
            this.f50622g = true;
        }
    }

    public static /* synthetic */ void D0(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, InterfaceC4790o0 interfaceC4790o0) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f50633r.k(activity, interfaceC4790o0.h());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f50619d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private String k2(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public static /* synthetic */ void m1(InterfaceC4790o0 interfaceC4790o0, InterfaceC4730c0 interfaceC4730c0, InterfaceC4790o0 interfaceC4790o02) {
        if (interfaceC4790o02 == interfaceC4790o0) {
            interfaceC4730c0.H();
        }
    }

    public static /* synthetic */ void w0(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC4730c0 interfaceC4730c0, InterfaceC4790o0 interfaceC4790o0, InterfaceC4790o0 interfaceC4790o02) {
        if (interfaceC4790o02 == null) {
            activityLifecycleIntegration.getClass();
            interfaceC4730c0.D(interfaceC4790o0);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f50619d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC4790o0.getName());
            }
        }
    }

    public final void A2(Activity activity, boolean z10) {
        if (this.f50620e && z10) {
            j2((InterfaceC4790o0) this.f50632q.get(activity), null, null);
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50619d = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50618c = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        this.f50620e = r2(this.f50619d);
        this.f50624i = this.f50619d.getFullyDisplayedReporter();
        this.f50621f = this.f50619d.isEnableTimeToFullDisplayTracing();
        this.f50616a.registerActivityLifecycleCallbacks(this);
        if (this.f50620e && this.f50619d.isEnableStandaloneAppStartTracing()) {
            io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
            v10.L(new m.c() { // from class: io.sentry.android.core.j
                @Override // io.sentry.android.core.performance.m.c
                public final void a() {
                    ActivityLifecycleIntegration.this.v2();
                }
            });
            v10.j().g(new C4673d0.a() { // from class: io.sentry.android.core.n
            });
            io.sentry.util.n.a("StandaloneAppStart");
        }
        this.f50619d.getLogger().c(EnumC4788n3.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.n.a("ActivityLifecycle");
    }

    public final void T1() {
        Future future = this.f50631p;
        if (future != null) {
            future.cancel(false);
            this.f50631p = null;
        }
    }

    public final void Y1() {
        this.f50623h = false;
        this.f50630o = new C4867x3(0L, 0L);
        this.f50629n.clear();
    }

    public void Z1(final InterfaceC4730c0 interfaceC4730c0, final InterfaceC4790o0 interfaceC4790o0) {
        interfaceC4730c0.W(new L1.c() { // from class: io.sentry.android.core.t
            @Override // io.sentry.L1.c
            public final void a(InterfaceC4790o0 interfaceC4790o02) {
                ActivityLifecycleIntegration.m1(InterfaceC4790o0.this, interfaceC4730c0, interfaceC4790o02);
            }
        });
    }

    public final m4 a2(String str, String str2, String str3) {
        SentryAndroidOptions sentryAndroidOptions = this.f50619d;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isTracingEnabled()) {
            return null;
        }
        E1 a10 = E1.a(this.f50619d.getLogger(), str, str2 == null ? null : Collections.singletonList(str2), this.f50619d);
        Boolean h10 = a10.h();
        C4734d c10 = a10.c();
        m4 m4Var = new m4(a10.g(), a10.f(), null, h10 != null ? new l4(h10, c10.p(), a10.e()) : null, c10);
        m4Var.E(str3);
        m4Var.F(io.sentry.protocol.E.COMPONENT);
        m4Var.u("ui.load");
        return m4Var;
    }

    public final InterfaceC4790o0 b2(AbstractC4856v2 abstractC4856v2, l4 l4Var, boolean z10) {
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        o4 o4Var = new o4();
        o4Var.t(false);
        o4Var.i(abstractC4856v2);
        o4Var.g("auto.app.start");
        o4Var.s(l4Var != null);
        if (z10) {
            o4Var.x(true);
            long deadlineTimeout = this.f50619d.getDeadlineTimeout();
            o4Var.u(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
            o4Var.w(new n4() { // from class: io.sentry.android.core.l
                @Override // io.sentry.n4
                public final void a(InterfaceC4790o0 interfaceC4790o0) {
                    io.sentry.android.core.performance.m.v().G(interfaceC4790o0.s());
                }
            });
        }
        InterfaceC4790o0 w10 = this.f50618c.w(new m4("App Start", io.sentry.protocol.E.COMPONENT, "app.start", l4Var), o4Var);
        String l10 = v10.l();
        if (l10 != null) {
            w10.k("app.vitals.start.reason", l10);
        }
        v10.K(w10.a().q());
        v10.J(w10.e().c());
        C4739e m10 = w10.m(null);
        v10.E(m10 != null ? m10.b() : null);
        return w10;
    }

    public final void c2() {
        d2(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50616a.unregisterActivityLifecycleCallbacks(this);
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        v10.L(null);
        v10.j().g(null);
        SentryAndroidOptions sentryAndroidOptions = this.f50619d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f50633r.m();
    }

    public final void d2(AbstractC4856v2 abstractC4856v2) {
        if (abstractC4856v2 == null) {
            abstractC4856v2 = io.sentry.android.core.performance.m.v().q(this.f50619d).d();
        }
        if (!this.f50620e || abstractC4856v2 == null) {
            return;
        }
        g2(this.f50625j, abstractC4856v2);
        InterfaceC4790o0 interfaceC4790o0 = this.f50626k;
        if (interfaceC4790o0 != null && !interfaceC4790o0.d()) {
            this.f50626k.t(f4.OK, abstractC4856v2);
        }
        io.sentry.android.core.performance.m.v().j().b(abstractC4856v2);
    }

    public final void e2(InterfaceC4780m0 interfaceC4780m0, InterfaceC4780m0 interfaceC4780m02) {
        if (interfaceC4780m0 == null || interfaceC4780m0.d()) {
            return;
        }
        interfaceC4780m0.c(o2(interfaceC4780m0));
        AbstractC4856v2 s10 = interfaceC4780m02 != null ? interfaceC4780m02.s() : null;
        if (s10 == null) {
            s10 = interfaceC4780m0.u();
        }
        h2(interfaceC4780m0, s10, f4.DEADLINE_EXCEEDED);
    }

    public final void f2(InterfaceC4780m0 interfaceC4780m0) {
        if (interfaceC4780m0 == null || interfaceC4780m0.d()) {
            return;
        }
        interfaceC4780m0.g();
    }

    public final void g2(InterfaceC4780m0 interfaceC4780m0, AbstractC4856v2 abstractC4856v2) {
        h2(interfaceC4780m0, abstractC4856v2, null);
    }

    public final void h2(InterfaceC4780m0 interfaceC4780m0, AbstractC4856v2 abstractC4856v2, f4 f4Var) {
        if (interfaceC4780m0 == null || interfaceC4780m0.d()) {
            return;
        }
        if (f4Var == null) {
            f4Var = interfaceC4780m0.getStatus() != null ? interfaceC4780m0.getStatus() : f4.OK;
        }
        interfaceC4780m0.t(f4Var, abstractC4856v2);
    }

    public final void i2(InterfaceC4780m0 interfaceC4780m0, f4 f4Var) {
        if (interfaceC4780m0 == null || interfaceC4780m0.d()) {
            return;
        }
        interfaceC4780m0.l(f4Var);
    }

    public final void j2(final InterfaceC4790o0 interfaceC4790o0, InterfaceC4780m0 interfaceC4780m0, InterfaceC4780m0 interfaceC4780m02) {
        if (interfaceC4790o0 == null || interfaceC4790o0.d()) {
            return;
        }
        i2(interfaceC4780m0, f4.DEADLINE_EXCEEDED);
        e2(interfaceC4780m02, interfaceC4780m0);
        T1();
        f4 status = interfaceC4790o0.getStatus();
        if (status == null) {
            status = f4.OK;
        }
        interfaceC4790o0.l(status);
        InterfaceC4740e0 interfaceC4740e0 = this.f50618c;
        if (interfaceC4740e0 != null) {
            interfaceC4740e0.l(new N1() { // from class: io.sentry.android.core.s
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    ActivityLifecycleIntegration.this.Z1(interfaceC4730c0, interfaceC4790o0);
                }
            });
        }
    }

    public final String l2(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    public final String m2(boolean z10) {
        return z10 ? "app.start.cold" : "app.start.warm";
    }

    public final InterfaceC4780m0 n2(Activity activity) {
        InterfaceC4790o0 interfaceC4790o0 = this.f50626k;
        if (interfaceC4790o0 != null) {
            return interfaceC4790o0;
        }
        InterfaceC4780m0 interfaceC4780m0 = this.f50625j;
        return interfaceC4780m0 != null ? interfaceC4780m0 : (InterfaceC4780m0) this.f50632q.get(activity);
    }

    public final String o2(InterfaceC4780m0 interfaceC4780m0) {
        String description = interfaceC4780m0.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return interfaceC4780m0.getDescription() + " - Deadline Exceeded";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.I i10;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f50622g) {
            onActivityPreCreated(activity, bundle);
        }
        InterfaceC4765j0 d10 = this.f50634s.d();
        try {
            if (this.f50618c != null && (sentryAndroidOptions = this.f50619d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String a10 = io.sentry.android.core.internal.util.l.a(activity);
                this.f50618c.l(new N1() { // from class: io.sentry.android.core.o
                    @Override // io.sentry.N1
                    public final void a(InterfaceC4730c0 interfaceC4730c0) {
                        interfaceC4730c0.P(a10);
                    }
                });
            }
            x2(activity);
            final InterfaceC4780m0 interfaceC4780m0 = (InterfaceC4780m0) this.f50627l.get(activity);
            final InterfaceC4780m0 interfaceC4780m02 = (InterfaceC4780m0) this.f50628m.get(activity);
            this.f50623h = true;
            if (this.f50620e && interfaceC4780m0 != null && interfaceC4780m02 != null && (i10 = this.f50624i) != null) {
                i10.b(new I.a() { // from class: io.sentry.android.core.p
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC4765j0 d10 = this.f50634s.d();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f50629n.remove(activity);
            if (bVar != null) {
                bVar.a();
            }
            if (this.f50620e) {
                InterfaceC4780m0 interfaceC4780m0 = this.f50625j;
                f4 f4Var = f4.CANCELLED;
                i2(interfaceC4780m0, f4Var);
                InterfaceC4790o0 interfaceC4790o0 = this.f50626k;
                if (interfaceC4790o0 != null && !interfaceC4790o0.d()) {
                    this.f50626k.l(f4Var);
                }
                InterfaceC4780m0 interfaceC4780m02 = (InterfaceC4780m0) this.f50627l.get(activity);
                InterfaceC4780m0 interfaceC4780m03 = (InterfaceC4780m0) this.f50628m.get(activity);
                i2(interfaceC4780m02, f4.DEADLINE_EXCEEDED);
                e2(interfaceC4780m03, interfaceC4780m02);
                T1();
                A2(activity, true);
                this.f50625j = null;
                this.f50626k = null;
                this.f50627l.remove(activity);
                this.f50628m.remove(activity);
            }
            this.f50632q.remove(activity);
            if (this.f50632q.isEmpty() && !activity.isChangingConfigurations()) {
                Y1();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC4765j0 d10 = this.f50634s.d();
        try {
            if (!this.f50622g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f50629n.get(activity);
        if (bVar != null) {
            bVar.b(n2(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f50629n.get(activity);
        if (bVar != null) {
            bVar.c(n2(activity));
            bVar.e();
        }
        c2();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f50629n.put(activity, bVar);
        if (this.f50623h) {
            return;
        }
        InterfaceC4740e0 interfaceC4740e0 = this.f50618c;
        AbstractC4856v2 now = interfaceC4740e0 != null ? interfaceC4740e0.i().getDateProvider().now() : A.a();
        this.f50630o = now;
        bVar.g(now);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f50623h = true;
        InterfaceC4740e0 interfaceC4740e0 = this.f50618c;
        this.f50630o = interfaceC4740e0 != null ? interfaceC4740e0.i().getDateProvider().now() : A.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f50629n.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f50619d;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : A.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC4765j0 d10 = this.f50634s.d();
        try {
            if (!this.f50622g) {
                onActivityPostStarted(activity);
            }
            if (this.f50620e) {
                final InterfaceC4780m0 interfaceC4780m0 = (InterfaceC4780m0) this.f50627l.get(activity);
                final InterfaceC4780m0 interfaceC4780m02 = (InterfaceC4780m0) this.f50628m.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.r.c(activity, new Runnable() { // from class: io.sentry.android.core.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.u2(interfaceC4780m02, interfaceC4780m0);
                        }
                    }, this.f50617b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.u2(interfaceC4780m02, interfaceC4780m0);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC4765j0 d10 = this.f50634s.d();
        try {
            if (!this.f50622g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f50620e) {
                this.f50633r.f(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public final String p2(String str) {
        return str + " full display";
    }

    public final String q2(String str) {
        return str + " initial display";
    }

    public final boolean r2(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    public final boolean s2(Activity activity) {
        return this.f50632q.containsKey(activity);
    }

    public final boolean t2(AbstractC4856v2 abstractC4856v2) {
        AbstractC4856v2 i10 = io.sentry.android.core.performance.m.v().i();
        return i10 == null || abstractC4856v2.b(i10) <= f50615v;
    }

    public final void u2(InterfaceC4780m0 interfaceC4780m0, InterfaceC4780m0 interfaceC4780m02) {
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        io.sentry.android.core.performance.n o10 = v10.o();
        io.sentry.android.core.performance.n w10 = v10.w();
        SentryAndroidOptions sentryAndroidOptions = this.f50619d;
        AbstractC4856v2 now = sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : null;
        if (o10.m() && o10.l()) {
            z2(o10, now);
        }
        if (w10.m() && w10.l()) {
            z2(w10, now);
        }
        d2(now);
        InterfaceC4765j0 d10 = this.f50636u.d();
        try {
            if (this.f50619d == null || interfaceC4780m02 == null || now == null) {
                f2(interfaceC4780m02);
                if (this.f50635t) {
                    f2(interfaceC4780m0);
                }
            } else {
                long millis = TimeUnit.NANOSECONDS.toMillis(now.b(interfaceC4780m02.u()));
                Long valueOf = Long.valueOf(millis);
                K0.a aVar = K0.a.MILLISECOND;
                interfaceC4780m02.o("time_to_initial_display", valueOf, aVar);
                if (interfaceC4780m0 != null && this.f50635t) {
                    this.f50635t = false;
                    interfaceC4780m02.o("time_to_full_display", Long.valueOf(millis), aVar);
                    interfaceC4780m0.o("time_to_full_display", Long.valueOf(millis), aVar);
                    g2(interfaceC4780m0, now);
                }
                g2(interfaceC4780m02, now);
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

    public final void v2() {
        if (this.f50618c == null || this.f50619d == null || !this.f50620e) {
            return;
        }
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        v10.I(null);
        io.sentry.android.core.performance.n p10 = v10.p();
        if (p10.m() && p10.n()) {
            AbstractC4856v2 g10 = p10.g();
            AbstractC4856v2 d10 = p10.d();
            if (g10 == null || d10 == null) {
                return;
            }
            v10.G(d10);
            C4673d0 j10 = v10.j();
            if (j10.d()) {
                j10.b(d10);
            } else if (v10.M(true)) {
                b2(g10, null, false).t(f4.OK, d10);
            }
        }
    }

    public final void w2(e4 e4Var) {
        e4Var.g("auto.ui.activity");
    }

    public final void x2(Activity activity) {
        Boolean bool;
        AbstractC4856v2 abstractC4856v2;
        AbstractC4856v2 abstractC4856v22;
        l4 l4Var;
        Boolean bool2;
        boolean z10;
        boolean z11;
        String n10;
        String g10;
        final InterfaceC4790o0 interfaceC4790o0;
        e4 e4Var;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f50618c == null || s2(activity)) {
            return;
        }
        if (!this.f50620e) {
            this.f50632q.put(activity, C4781m1.v());
            if (this.f50619d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.H.i(this.f50618c);
                return;
            }
            return;
        }
        y2();
        final String k22 = k2(activity);
        io.sentry.android.core.performance.n q10 = io.sentry.android.core.performance.m.v().q(this.f50619d);
        if (AbstractC4704q0.s() && q10.m()) {
            AbstractC4856v2 g11 = q10.g();
            bool = Boolean.valueOf(io.sentry.android.core.performance.m.v().s() == m.b.COLD);
            abstractC4856v2 = g11;
        } else {
            bool = null;
            abstractC4856v2 = null;
        }
        o4 o4Var = new o4();
        long deadlineTimeout = this.f50619d.getDeadlineTimeout();
        o4Var.u(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f50619d.isEnableActivityLifecycleTracingAutoFinish()) {
            o4Var.v(this.f50619d.getIdleTimeout());
            o4Var.j(true);
        }
        o4Var.x(true);
        o4Var.w(new n4() { // from class: io.sentry.android.core.u
            @Override // io.sentry.n4
            public final void a(InterfaceC4790o0 interfaceC4790o02) {
                ActivityLifecycleIntegration.D0(ActivityLifecycleIntegration.this, weakReference, k22, interfaceC4790o02);
            }
        });
        if (this.f50623h || abstractC4856v2 == null || bool == null) {
            abstractC4856v22 = this.f50630o;
            l4Var = null;
        } else {
            l4 m10 = io.sentry.android.core.performance.m.v().m();
            io.sentry.android.core.performance.m.v().I(null);
            l4Var = m10;
            abstractC4856v22 = abstractC4856v2;
        }
        o4Var.i(abstractC4856v22);
        o4Var.s(l4Var != null);
        w2(o4Var);
        boolean d10 = io.sentry.android.core.performance.m.v().j().d();
        boolean z12 = (d10 || io.sentry.android.core.performance.m.v().r() == null) ? false : true;
        boolean z13 = (this.f50623h || abstractC4856v2 == null || bool == null) ? false : true;
        boolean z14 = z13 && this.f50619d.isEnableStandaloneAppStartTracing() && !z12 && !d10;
        if (z14) {
            o4 o4Var2 = new o4();
            o4Var2.t(false);
            o4Var2.i(abstractC4856v2);
            o4Var2.s(l4Var != null);
            o4Var2.g("auto.app.start");
            bool2 = bool;
            z10 = d10;
            z11 = z12;
            InterfaceC4790o0 w10 = this.f50618c.w(new m4("App Start", io.sentry.protocol.E.COMPONENT, "app.start", l4Var), o4Var2);
            this.f50626k = w10;
            w10.k("app.vitals.start.screen", k22);
            String l10 = io.sentry.android.core.performance.m.v().l();
            if (l10 != null) {
                this.f50626k.k("app.vitals.start.reason", l10);
            }
        } else {
            bool2 = bool;
            z10 = d10;
            z11 = z12;
        }
        if (z14) {
            n10 = this.f50626k.e().c();
            C4739e m11 = this.f50626k.m(null);
            if (m11 != null) {
                g10 = m11.b();
            }
            g10 = null;
        } else if (z10 || (z11 && t2(abstractC4856v22))) {
            n10 = io.sentry.android.core.performance.m.v().n();
            g10 = io.sentry.android.core.performance.m.v().g();
        } else {
            n10 = null;
            g10 = null;
        }
        if (z10 && z13) {
            io.sentry.android.core.performance.m.v().j().f("app.vitals.start.screen", k22);
        }
        m4 a22 = n10 == null ? null : a2(n10, g10, k22);
        InterfaceC4790o0 w11 = a22 != null ? this.f50618c.w(a22, o4Var) : this.f50618c.w(new m4(k22, io.sentry.protocol.E.COMPONENT, "ui.load", l4Var), o4Var);
        if (z11 || z10) {
            io.sentry.android.core.performance.m.v().K(null);
            io.sentry.android.core.performance.m.v().J(null);
            io.sentry.android.core.performance.m.v().E(null);
        }
        boolean z15 = z14;
        e4 e4Var2 = new e4();
        w2(e4Var2);
        if (!z13 || z15 || this.f50619d.isEnableStandaloneAppStartTracing()) {
            interfaceC4790o0 = w11;
            e4Var = e4Var2;
        } else {
            interfaceC4790o0 = w11;
            e4Var = e4Var2;
            this.f50625j = w11.q(m2(bool2.booleanValue()), l2(bool2.booleanValue()), abstractC4856v2, EnumC4832t0.SENTRY, e4Var2);
            c2();
        }
        String q22 = q2(k22);
        EnumC4832t0 enumC4832t0 = EnumC4832t0.SENTRY;
        AbstractC4856v2 abstractC4856v23 = abstractC4856v22;
        final InterfaceC4780m0 q11 = interfaceC4790o0.q("ui.load.initial_display", q22, abstractC4856v23, enumC4832t0, e4Var);
        this.f50627l.put(activity, q11);
        if (this.f50621f && this.f50624i != null && this.f50619d != null) {
            final InterfaceC4780m0 q12 = interfaceC4790o0.q("ui.load.full_display", p2(k22), abstractC4856v23, enumC4832t0, e4Var);
            try {
                this.f50628m.put(activity, q12);
                this.f50631p = this.f50619d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.e2(q12, q11);
                    }
                }, 25000L);
            } catch (RejectedExecutionException e10) {
                this.f50619d.getLogger().b(EnumC4788n3.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
            }
        }
        this.f50618c.l(new N1() { // from class: io.sentry.android.core.k
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                ActivityLifecycleIntegration.this.y1(interfaceC4730c0, interfaceC4790o0);
            }
        });
        this.f50632q.put(activity, interfaceC4790o0);
    }

    public void y1(final InterfaceC4730c0 interfaceC4730c0, final InterfaceC4790o0 interfaceC4790o0) {
        interfaceC4730c0.W(new L1.c() { // from class: io.sentry.android.core.m
            @Override // io.sentry.L1.c
            public final void a(InterfaceC4790o0 interfaceC4790o02) {
                ActivityLifecycleIntegration.w0(ActivityLifecycleIntegration.this, interfaceC4730c0, interfaceC4790o0, interfaceC4790o02);
            }
        });
    }

    public final void y2() {
        for (Map.Entry entry : this.f50632q.entrySet()) {
            j2((InterfaceC4790o0) entry.getValue(), (InterfaceC4780m0) this.f50627l.get(entry.getKey()), (InterfaceC4780m0) this.f50628m.get(entry.getKey()));
        }
    }

    public final void z2(io.sentry.android.core.performance.n nVar, AbstractC4856v2 abstractC4856v2) {
        AbstractC4856v2 g10 = nVar.g();
        if (abstractC4856v2 == null || g10 == null) {
            nVar.s();
        } else {
            nVar.q(nVar.j() + TimeUnit.NANOSECONDS.toMillis(abstractC4856v2.b(g10)));
        }
    }
}
