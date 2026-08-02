package io.sentry.android.core;

import Bl0.C2645f;
import Hj.C3143a;
import Oy.C3715a;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.A1;
import io.sentry.B0;
import io.sentry.EnumC7162k0;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7134d0;
import io.sentry.InterfaceC7142f0;
import io.sentry.InterfaceC7166l0;
import io.sentry.O2;
import io.sentry.S2;
import io.sentry.T1;
import io.sentry.W2;
import io.sentry.Y0;
import io.sentry.android.core.performance.j;
import io.sentry.e3;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.s3;
import io.sentry.t3;
import io.sentry.u3;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements InterfaceC7166l0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f66834a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f66835b;

    /* renamed from: c, reason: collision with root package name */
    private A1 f66836c;

    /* renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f66837d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66840g;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC7134d0 f66843j;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C7102c f66850q;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66838e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66839f = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f66841h = false;

    /* renamed from: i, reason: collision with root package name */
    private io.sentry.D f66842i = null;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, InterfaceC7134d0> f66844k = new WeakHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, InterfaceC7134d0> f66845l = new WeakHashMap<>();

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, io.sentry.android.core.performance.b> f66846m = new WeakHashMap<>();

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private T1 f66847n = new S2(new Date(0), 0);

    /* renamed from: o, reason: collision with root package name */
    private Future<?> f66848o = null;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<Activity, InterfaceC7142f0> f66849p = new WeakHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66851r = new io.sentry.util.a();

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66852s = new io.sentry.util.a();

    public ActivityLifecycleIntegration(@NotNull Application application, @NotNull I i11, @NotNull C7102c c7102c) {
        io.sentry.util.p.b(application, "Application is required");
        this.f66834a = application;
        this.f66835b = i11;
        this.f66850q = c7102c;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f66840g = true;
        }
    }

    public static /* synthetic */ void j(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC7134d0 interfaceC7134d0, InterfaceC7134d0 interfaceC7134d02) {
        activityLifecycleIntegration.getClass();
        q(interfaceC7134d0, interfaceC7134d02);
    }

    public static /* synthetic */ void k(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.U u11, InterfaceC7142f0 interfaceC7142f0, InterfaceC7142f0 interfaceC7142f02) {
        if (interfaceC7142f02 == null) {
            activityLifecycleIntegration.getClass();
            u11.t(interfaceC7142f0);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f66837d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC7142f0.getName());
            }
        }
    }

    public static /* synthetic */ void o(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, e3 e3Var) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f66850q.i(activity, e3Var.k());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f66837d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(I2.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private void p() {
        io.sentry.android.core.performance.l i11 = io.sentry.android.core.performance.j.m().i(this.f66837d);
        O2 o22 = i11.k() ? new O2(i11.c() * 1000000) : null;
        if (!this.f66838e || o22 == null) {
            return;
        }
        r(this.f66843j, o22, null);
    }

    private static void q(InterfaceC7134d0 interfaceC7134d0, InterfaceC7134d0 interfaceC7134d02) {
        if (interfaceC7134d0 == null || interfaceC7134d0.h()) {
            return;
        }
        String description = interfaceC7134d0.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = interfaceC7134d0.getDescription() + " - Deadline Exceeded";
        }
        interfaceC7134d0.j(description);
        T1 r11 = interfaceC7134d02 != null ? interfaceC7134d02.r() : null;
        if (r11 == null) {
            r11 = interfaceC7134d0.s();
        }
        r(interfaceC7134d0, r11, n3.DEADLINE_EXCEEDED);
    }

    private static void r(InterfaceC7134d0 interfaceC7134d0, @NotNull T1 t12, n3 n3Var) {
        if (interfaceC7134d0 == null || interfaceC7134d0.h()) {
            return;
        }
        if (n3Var == null) {
            n3Var = interfaceC7134d0.getStatus() != null ? interfaceC7134d0.getStatus() : n3.OK;
        }
        interfaceC7134d0.f(n3Var, t12);
    }

    private void s(InterfaceC7142f0 interfaceC7142f0, InterfaceC7134d0 interfaceC7134d0, InterfaceC7134d0 interfaceC7134d02) {
        if (interfaceC7142f0 == null || interfaceC7142f0.h()) {
            return;
        }
        n3 n3Var = n3.DEADLINE_EXCEEDED;
        if (interfaceC7134d0 != null && !interfaceC7134d0.h()) {
            interfaceC7134d0.n(n3Var);
        }
        q(interfaceC7134d02, interfaceC7134d0);
        Future<?> future = this.f66848o;
        if (future != null) {
            future.cancel(false);
            this.f66848o = null;
        }
        n3 status = interfaceC7142f0.getStatus();
        if (status == null) {
            status = n3.OK;
        }
        interfaceC7142f0.n(status);
        A1 a12 = this.f66836c;
        if (a12 != null) {
            a12.m(new Y6.k(this, interfaceC7142f0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(InterfaceC7134d0 interfaceC7134d0, InterfaceC7134d0 interfaceC7134d02) {
        io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
        io.sentry.android.core.performance.l h11 = m11.h();
        io.sentry.android.core.performance.l n11 = m11.n();
        if (h11.j() && h11.i()) {
            h11.o();
        }
        if (n11.j() && n11.i()) {
            n11.o();
        }
        p();
        InterfaceC7097a0 a11 = this.f66852s.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f66837d;
            if (sentryAndroidOptions != null && interfaceC7134d02 != null) {
                T1 now = sentryAndroidOptions.getDateProvider().now();
                interfaceC7134d02.b("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(now.b(interfaceC7134d02.s()))), B0.a.MILLISECOND);
                r(interfaceC7134d02, now, null);
            } else if (interfaceC7134d02 != null && !interfaceC7134d02.h()) {
                interfaceC7134d02.finish();
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

    private void v(@NotNull Activity activity) {
        WeakHashMap<Activity, InterfaceC7134d0> weakHashMap;
        WeakHashMap<Activity, InterfaceC7134d0> weakHashMap2;
        Boolean bool;
        O2 o22;
        T1 t12;
        m3 m3Var;
        InterfaceC7142f0 interfaceC7142f0;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f66836c != null) {
            WeakHashMap<Activity, InterfaceC7142f0> weakHashMap3 = this.f66849p;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f66838e) {
                weakHashMap3.put(activity, Y0.t());
                if (this.f66837d.isEnableAutoTraceIdGeneration()) {
                    this.f66836c.m(new C3143a());
                    return;
                }
                return;
            }
            Iterator<Map.Entry<Activity, InterfaceC7142f0>> it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                weakHashMap = this.f66845l;
                weakHashMap2 = this.f66844k;
                if (!hasNext) {
                    break;
                }
                Map.Entry<Activity, InterfaceC7142f0> next = it.next();
                s(next.getValue(), weakHashMap2.get(next.getKey()), weakHashMap.get(next.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.l i11 = io.sentry.android.core.performance.j.m().i(this.f66837d);
            s3 s3Var = null;
            if (K.g() && i11.j()) {
                O2 d11 = i11.d();
                bool = Boolean.valueOf(io.sentry.android.core.performance.j.m().j() == j.d.COLD);
                o22 = d11;
            } else {
                bool = null;
                o22 = null;
            }
            u3 u3Var = new u3();
            long deadlineTimeout = this.f66837d.getDeadlineTimeout();
            u3Var.o(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
            if (this.f66837d.isEnableActivityLifecycleTracingAutoFinish()) {
                u3Var.p(this.f66837d.getIdleTimeout());
                u3Var.g();
            }
            u3Var.r();
            u3Var.q(new C7107h(this, weakReference, simpleName));
            if (this.f66841h || o22 == null || bool == null) {
                t12 = this.f66847n;
            } else {
                s3 g10 = io.sentry.android.core.performance.j.m().g();
                io.sentry.android.core.performance.j.m().t(null);
                s3Var = g10;
                t12 = o22;
            }
            u3Var.f(t12);
            u3Var.n(s3Var != null);
            u3Var.e("auto.ui.activity");
            InterfaceC7142f0 s11 = this.f66836c.s(new t3(simpleName, io.sentry.protocol.D.COMPONENT, "ui.load", s3Var), u3Var);
            m3 m3Var2 = new m3();
            m3Var2.e("auto.ui.activity");
            if (this.f66841h || o22 == null || bool == null) {
                m3Var = m3Var2;
            } else {
                InterfaceC7134d0 q11 = s11.q(bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start", o22, EnumC7162k0.SENTRY, m3Var2);
                s11 = s11;
                m3Var = m3Var2;
                this.f66843j = q11;
                p();
            }
            String concat = simpleName.concat(" initial display");
            EnumC7162k0 enumC7162k0 = EnumC7162k0.SENTRY;
            T1 t13 = t12;
            final InterfaceC7134d0 q12 = s11.q("ui.load.initial_display", concat, t13, enumC7162k0, m3Var);
            weakHashMap2.put(activity, q12);
            if (!this.f66839f || this.f66842i == null || this.f66837d == null) {
                interfaceC7142f0 = s11;
            } else {
                final InterfaceC7134d0 q13 = s11.q("ui.load.full_display", simpleName.concat(" full display"), t13, enumC7162k0, m3Var);
                interfaceC7142f0 = s11;
                try {
                    weakHashMap.put(activity, q13);
                    this.f66848o = this.f66837d.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.j(ActivityLifecycleIntegration.this, q13, q12);
                        }
                    }, 25000L);
                } catch (RejectedExecutionException e11) {
                    this.f66837d.getLogger().a(I2.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e11);
                }
            }
            this.f66836c.m(new aM.f(this, interfaceC7142f0));
            weakHashMap3.put(activity, interfaceC7142f0);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f66834a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f66837d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f66850q.j();
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66837d = sentryAndroidOptions;
        this.f66836c = a12;
        this.f66838e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f66842i = this.f66837d.getFullyDisplayedReporter();
        this.f66839f = this.f66837d.isEnableTimeToFullDisplayTracing();
        this.f66834a.registerActivityLifecycleCallbacks(this);
        this.f66837d.getLogger().c(I2.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.j.a("ActivityLifecycle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.android.core.d] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        io.sentry.D d11;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f66840g) {
            onActivityPreCreated(activity, bundle);
        }
        InterfaceC7097a0 a11 = this.f66851r.a();
        try {
            if (this.f66836c != null && (sentryAndroidOptions = this.f66837d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f66836c.m(new C3715a(C2645f.b(activity)));
            }
            v(activity);
            final InterfaceC7134d0 interfaceC7134d0 = this.f66844k.get(activity);
            final InterfaceC7134d0 interfaceC7134d02 = this.f66845l.get(activity);
            this.f66841h = true;
            if (this.f66838e && interfaceC7134d0 != null && interfaceC7134d02 != null && (d11 = this.f66842i) != 0) {
                d11.b(new Object() { // from class: io.sentry.android.core.d
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66851r.a();
        WeakHashMap<Activity, io.sentry.android.core.performance.b> weakHashMap = this.f66846m;
        try {
            io.sentry.android.core.performance.b remove = weakHashMap.remove(activity);
            if (remove != null) {
                remove.a();
            }
            boolean z11 = this.f66838e;
            WeakHashMap<Activity, InterfaceC7142f0> weakHashMap2 = this.f66849p;
            if (z11) {
                InterfaceC7134d0 interfaceC7134d0 = this.f66843j;
                n3 n3Var = n3.CANCELLED;
                if (interfaceC7134d0 != null && !interfaceC7134d0.h()) {
                    interfaceC7134d0.n(n3Var);
                }
                WeakHashMap<Activity, InterfaceC7134d0> weakHashMap3 = this.f66844k;
                InterfaceC7134d0 interfaceC7134d02 = weakHashMap3.get(activity);
                WeakHashMap<Activity, InterfaceC7134d0> weakHashMap4 = this.f66845l;
                InterfaceC7134d0 interfaceC7134d03 = weakHashMap4.get(activity);
                n3 n3Var2 = n3.DEADLINE_EXCEEDED;
                if (interfaceC7134d02 != null && !interfaceC7134d02.h()) {
                    interfaceC7134d02.n(n3Var2);
                }
                q(interfaceC7134d03, interfaceC7134d02);
                Future<?> future = this.f66848o;
                if (future != null) {
                    future.cancel(false);
                    this.f66848o = null;
                }
                if (this.f66838e) {
                    s(weakHashMap2.get(activity), null, null);
                }
                this.f66843j = null;
                weakHashMap3.remove(activity);
                weakHashMap4.remove(activity);
            }
            weakHashMap2.remove(activity);
            if (weakHashMap2.isEmpty() && !activity.isChangingConfigurations()) {
                this.f66841h = false;
                this.f66847n = new S2(new Date(0L), 0L);
                weakHashMap.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66851r.a();
        try {
            if (!this.f66840g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(@NotNull Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = this.f66846m.get(activity);
        if (bVar != null) {
            InterfaceC7142f0 interfaceC7142f0 = this.f66843j;
            if (interfaceC7142f0 == null) {
                interfaceC7142f0 = this.f66849p.get(activity);
            }
            bVar.b(interfaceC7142f0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(@NotNull Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f66846m.get(activity);
        if (bVar != null) {
            InterfaceC7142f0 interfaceC7142f0 = this.f66843j;
            if (interfaceC7142f0 == null) {
                interfaceC7142f0 = this.f66849p.get(activity);
            }
            bVar.c(interfaceC7142f0);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(@NotNull Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f66846m.put(activity, bVar);
        if (this.f66841h) {
            return;
        }
        A1 a12 = this.f66836c;
        T1 now = a12 != null ? a12.getOptions().getDateProvider().now() : C7111l.a();
        this.f66847n = now;
        bVar.f(now);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(@NotNull Activity activity) {
        this.f66841h = true;
        A1 a12 = this.f66836c;
        this.f66847n = a12 != null ? a12.getOptions().getDateProvider().now() : C7111l.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(@NotNull Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f66846m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f66837d;
            bVar.g(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : C7111l.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66851r.a();
        try {
            if (!this.f66840g) {
                onActivityPostStarted(activity);
            }
            if (this.f66838e) {
                final InterfaceC7134d0 interfaceC7134d0 = this.f66844k.get(activity);
                final InterfaceC7134d0 interfaceC7134d02 = this.f66845l.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.k.a(activity, new Runnable() { // from class: io.sentry.android.core.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.t(interfaceC7134d02, interfaceC7134d0);
                        }
                    }, this.f66835b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.t(interfaceC7134d02, interfaceC7134d0);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        InterfaceC7097a0 a11 = this.f66851r.a();
        try {
            if (!this.f66840g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f66838e) {
                this.f66850q.e(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
    }
}
