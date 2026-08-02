package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.q4;
import androidx.core.app.FrameMetricsAggregator;
import com.sports.insider.MyApp;
import io.appmetrica.analytics.impl.ap;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.f2;
import io.sentry.g5;
import io.sentry.j5;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.p1;
import io.sentry.q1;
import io.sentry.q6;
import io.sentry.v6;
import io.sentry.w6;
import io.sentry.y2;
import io.sentry.y3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements q1, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final MyApp f15448a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15449b;

    /* renamed from: c, reason: collision with root package name */
    public y3 f15450c;

    /* renamed from: d, reason: collision with root package name */
    public SentryAndroidOptions f15451d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15454g;
    public io.sentry.i1 j;
    public final q4 q;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15452e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15453f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15455h = false;

    /* renamed from: i, reason: collision with root package name */
    public io.sentry.g0 f15456i = null;

    /* renamed from: k, reason: collision with root package name */
    public final WeakHashMap f15457k = new WeakHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final WeakHashMap f15458l = new WeakHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f15459m = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public k4 f15460n = new j5(new Date(0), 0);

    /* renamed from: o, reason: collision with root package name */
    public Future f15461o = null;

    /* renamed from: p, reason: collision with root package name */
    public final WeakHashMap f15462p = new WeakHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.a f15463r = new io.sentry.util.a();

    /* renamed from: s, reason: collision with root package name */
    public final io.sentry.util.a f15464s = new io.sentry.util.a();

    public ActivityLifecycleIntegration(MyApp myApp, n0 n0Var, q4 q4Var) {
        this.f15448a = myApp;
        this.f15449b = n0Var;
        this.q = q4Var;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15454g = true;
        }
    }

    public static void k(io.sentry.i1 i1Var, io.sentry.i1 i1Var2) {
        if (i1Var == null || i1Var.d()) {
            return;
        }
        String description = i1Var.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = i1Var.getDescription() + " - Deadline Exceeded";
        }
        i1Var.p(description);
        k4 w10 = i1Var2 != null ? i1Var2.w() : null;
        if (w10 == null) {
            w10 = i1Var.z();
        }
        n(i1Var, w10, q6.DEADLINE_EXCEEDED);
    }

    public static void n(io.sentry.i1 i1Var, k4 k4Var, q6 q6Var) {
        if (i1Var == null || i1Var.d()) {
            return;
        }
        if (q6Var == null) {
            q6Var = i1Var.getStatus() != null ? i1Var.getStatus() : q6.OK;
        }
        i1Var.x(q6Var, k4Var);
    }

    public final void c() {
        g5 g5Var;
        io.sentry.android.core.performance.g a7 = io.sentry.android.core.performance.f.b().a(this.f15451d);
        if (a7.f15815d != 0) {
            g5Var = new g5((a7.b() ? a7.f15813b + a7.a() : 0L) * 1000000);
        } else {
            g5Var = null;
        }
        if (!this.f15452e || g5Var == null) {
            return;
        }
        n(this.j, g5Var, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15448a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f15451d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(b5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        q4 q4Var = this.q;
        io.sentry.r a7 = ((io.sentry.util.a) q4Var.f897g).a();
        try {
            if (q4Var.c()) {
                q4Var.d(new aa.c(29, q4Var), "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) ((io.sentry.util.f) q4Var.f892b).a()).f1255a.p();
            }
            ((ConcurrentHashMap) q4Var.f894d).clear();
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.g0 g0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f15454g) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.r a7 = this.f15463r.a();
        try {
            if (this.f15450c != null && (sentryAndroidOptions = this.f15451d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                String q = k2.x.q(activity);
                y3 y3Var = this.f15450c;
                com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(q, 7);
                y3Var.getClass();
                d4.c(qVar);
            }
            w(activity);
            io.sentry.i1 i1Var = (io.sentry.i1) this.f15457k.get(activity);
            io.sentry.i1 i1Var2 = (io.sentry.i1) this.f15458l.get(activity);
            this.f15455h = true;
            if (this.f15452e && i1Var != null && i1Var2 != null && (g0Var = this.f15456i) != null) {
                g0Var.f16424a.add(new ap(17));
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.f15458l;
        WeakHashMap weakHashMap2 = this.f15457k;
        WeakHashMap weakHashMap3 = this.f15459m;
        io.sentry.r a7 = this.f15463r.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity);
            if (bVar != null) {
                io.sentry.i1 i1Var = bVar.f15793d;
                if (i1Var != null && !i1Var.d()) {
                    bVar.f15793d.h(q6.CANCELLED);
                }
                bVar.f15793d = null;
                io.sentry.i1 i1Var2 = bVar.f15794e;
                if (i1Var2 != null && !i1Var2.d()) {
                    bVar.f15794e.h(q6.CANCELLED);
                }
                bVar.f15794e = null;
            }
            boolean z5 = this.f15452e;
            WeakHashMap weakHashMap4 = this.f15462p;
            if (z5) {
                io.sentry.i1 i1Var3 = this.j;
                q6 q6Var = q6.CANCELLED;
                if (i1Var3 != null && !i1Var3.d()) {
                    i1Var3.h(q6Var);
                }
                io.sentry.i1 i1Var4 = (io.sentry.i1) weakHashMap2.get(activity);
                io.sentry.i1 i1Var5 = (io.sentry.i1) weakHashMap.get(activity);
                q6 q6Var2 = q6.DEADLINE_EXCEEDED;
                if (i1Var4 != null && !i1Var4.d()) {
                    i1Var4.h(q6Var2);
                }
                k(i1Var5, i1Var4);
                Future future = this.f15461o;
                if (future != null) {
                    future.cancel(false);
                    this.f15461o = null;
                }
                if (this.f15452e) {
                    r((k1) weakHashMap4.get(activity), null, null);
                }
                this.j = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.f15455h = false;
                this.f15460n = new j5(new Date(0L), 0L);
                weakHashMap3.clear();
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.r a7 = this.f15463r.a();
        try {
            if (!this.f15454g) {
                onActivityPrePaused(activity);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f15459m.get(activity);
        if (bVar != null) {
            io.sentry.i1 i1Var = this.j;
            if (i1Var == null) {
                i1Var = (io.sentry.i1) this.f15462p.get(activity);
            }
            if (bVar.f15791b == null || i1Var == null) {
                return;
            }
            io.sentry.i1 a7 = io.sentry.android.core.performance.b.a(i1Var, bVar.f15790a.concat(".onCreate"), bVar.f15791b);
            bVar.f15793d = a7;
            a7.l();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f15459m.get(activity);
        if (bVar != null) {
            io.sentry.i1 i1Var = this.j;
            if (i1Var == null) {
                i1Var = (io.sentry.i1) this.f15462p.get(activity);
            }
            if (bVar.f15792c != null && i1Var != null) {
                io.sentry.i1 a7 = io.sentry.android.core.performance.b.a(i1Var, bVar.f15790a.concat(".onStart"), bVar.f15792c);
                bVar.f15794e = a7;
                a7.l();
            }
            io.sentry.i1 i1Var2 = bVar.f15793d;
            if (i1Var2 == null || bVar.f15794e == null) {
                return;
            }
            k4 w10 = i1Var2.w();
            k4 w11 = bVar.f15794e.w();
            if (w10 == null || w11 == null) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            j.f15758a.getClass();
            j5 j5Var = new j5();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(j5Var.b(bVar.f15793d.z()));
            long millis2 = timeUnit.toMillis(j5Var.b(w10));
            long millis3 = timeUnit.toMillis(j5Var.b(bVar.f15794e.z()));
            long millis4 = timeUnit.toMillis(j5Var.b(w11));
            io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
            String description = bVar.f15793d.getDescription();
            long millis5 = timeUnit.toMillis(bVar.f15793d.z().d());
            io.sentry.android.core.performance.g gVar = cVar.f15795a;
            gVar.f15812a = description;
            gVar.f15813b = millis5;
            gVar.f15814c = uptimeMillis - millis;
            gVar.f15815d = uptimeMillis - millis2;
            String description2 = bVar.f15794e.getDescription();
            long millis6 = timeUnit.toMillis(bVar.f15794e.z().d());
            io.sentry.android.core.performance.g gVar2 = cVar.f15796b;
            gVar2.f15812a = description2;
            gVar2.f15813b = millis6;
            gVar2.f15814c = uptimeMillis - millis3;
            gVar2.f15815d = uptimeMillis - millis4;
            io.sentry.android.core.performance.f.b().f15808g.add(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        k4 j5Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f15459m.put(activity, bVar);
        if (this.f15455h) {
            return;
        }
        y3 y3Var = this.f15450c;
        if (y3Var != null) {
            j5Var = y3Var.m().getDateProvider().a();
        } else {
            j.f15758a.getClass();
            j5Var = new j5();
        }
        this.f15460n = j5Var;
        bVar.f15791b = j5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        k4 j5Var;
        this.f15455h = true;
        y3 y3Var = this.f15450c;
        if (y3Var != null) {
            j5Var = y3Var.m().getDateProvider().a();
        } else {
            j.f15758a.getClass();
            j5Var = new j5();
        }
        this.f15460n = j5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        k4 j5Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f15459m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f15451d;
            if (sentryAndroidOptions != null) {
                j5Var = sentryAndroidOptions.getDateProvider().a();
            } else {
                j.f15758a.getClass();
                j5Var = new j5();
            }
            bVar.f15792c = j5Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.r a7 = this.f15463r.a();
        try {
            if (!this.f15454g) {
                onActivityPostStarted(activity);
            }
            if (this.f15452e) {
                final io.sentry.i1 i1Var = (io.sentry.i1) this.f15457k.get(activity);
                final io.sentry.i1 i1Var2 = (io.sentry.i1) this.f15458l.get(activity);
                if (activity.getWindow() != null) {
                    final int i5 = 0;
                    io.sentry.android.core.internal.util.i.a(activity, new Runnable(this) { // from class: io.sentry.android.core.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f15563b;

                        {
                            this.f15563b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    this.f15563b.t(i1Var2, i1Var);
                                    break;
                                default:
                                    this.f15563b.t(i1Var2, i1Var);
                                    break;
                            }
                        }
                    }, this.f15449b);
                } else {
                    final int i10 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f15563b;

                        {
                            this.f15563b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f15563b.t(i1Var2, i1Var);
                                    break;
                                default:
                                    this.f15563b.t(i1Var2, i1Var);
                                    break;
                            }
                        }
                    });
                }
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.r a7 = this.f15463r.a();
        try {
            if (!this.f15454g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f15452e) {
                this.q.a(activity);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void r(k1 k1Var, io.sentry.i1 i1Var, io.sentry.i1 i1Var2) {
        if (k1Var == null || k1Var.d()) {
            return;
        }
        q6 q6Var = q6.DEADLINE_EXCEEDED;
        if (i1Var != null && !i1Var.d()) {
            i1Var.h(q6Var);
        }
        k(i1Var2, i1Var);
        Future future = this.f15461o;
        if (future != null) {
            future.cancel(false);
            this.f15461o = null;
        }
        q6 status = k1Var.getStatus();
        if (status == null) {
            status = q6.OK;
        }
        k1Var.h(status);
        if (this.f15450c != null) {
            d4.c(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(this, k1Var));
        }
    }

    public final void t(io.sentry.i1 i1Var, io.sentry.i1 i1Var2) {
        io.sentry.android.core.performance.f b10 = io.sentry.android.core.performance.f.b();
        io.sentry.android.core.performance.g gVar = b10.f15804c;
        io.sentry.android.core.performance.g gVar2 = b10.f15805d;
        if (gVar.b() && gVar.f15815d == 0) {
            gVar.f15815d = SystemClock.uptimeMillis();
        }
        if (gVar2.b() && gVar2.f15815d == 0) {
            gVar2.f15815d = SystemClock.uptimeMillis();
        }
        c();
        io.sentry.r a7 = this.f15464s.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f15451d;
            if (sentryAndroidOptions != null && i1Var2 != null) {
                k4 a10 = sentryAndroidOptions.getDateProvider().a();
                i1Var2.u("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(a10.b(i1Var2.z()))), f2.MILLISECOND);
                n(i1Var2, a10, null);
            } else if (i1Var2 != null && !i1Var2.d()) {
                i1Var2.l();
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void w(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean bool;
        g5 g5Var;
        k4 k4Var;
        com.android.billingclient.api.i iVar;
        k1 k1Var;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f15450c != null) {
            WeakHashMap weakHashMap3 = this.f15462p;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f15452e) {
                weakHashMap3.put(activity, y2.f17254a);
                if (this.f15451d.isEnableAutoTraceIdGeneration()) {
                    this.f15450c.y(new io.sentry.clientreport.a(4));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                weakHashMap = this.f15458l;
                weakHashMap2 = this.f15457k;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                r((k1) entry.getValue(), (io.sentry.i1) weakHashMap2.get(entry.getKey()), (io.sentry.i1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.g a7 = io.sentry.android.core.performance.f.b().a(this.f15451d);
            if (m0.h() && a7.b()) {
                g5 g5Var2 = a7.b() ? new g5(a7.f15813b * 1000000) : null;
                bool = Boolean.valueOf(io.sentry.android.core.performance.f.b().f15802a == io.sentry.android.core.performance.e.COLD);
                g5Var = g5Var2;
            } else {
                bool = null;
                g5Var = null;
            }
            w6 w6Var = new w6();
            long deadlineTimeout = this.f15451d.getDeadlineTimeout();
            w6Var.f17240h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.f15451d.isEnableActivityLifecycleTracingAutoFinish()) {
                w6Var.f17239g = this.f15451d.getIdleTimeout();
                w6Var.f4027a = true;
            }
            w6Var.f17238f = true;
            w6Var.f17241i = new e(this, weakReference, simpleName);
            if (this.f15455h || g5Var == null || bool == null) {
                k4Var = this.f15460n;
            } else {
                io.sentry.android.core.performance.f.b().getClass();
                io.sentry.android.core.performance.f.b().getClass();
                k4Var = g5Var;
            }
            w6Var.f4028b = k4Var;
            w6Var.f17237e = false;
            w6Var.f4030d = "auto.ui.activity";
            k1 r5 = this.f15450c.r(new v6(simpleName, io.sentry.protocol.h0.COMPONENT, "ui.load", null), w6Var);
            com.android.billingclient.api.i iVar2 = new com.android.billingclient.api.i(4);
            iVar2.f4030d = "auto.ui.activity";
            if (this.f15455h || g5Var == null || bool == null) {
                iVar = iVar2;
            } else {
                io.sentry.i1 s8 = r5.s(bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start", g5Var, p1.SENTRY, iVar2);
                r5 = r5;
                iVar = iVar2;
                this.j = s8;
                c();
            }
            String concat = simpleName.concat(" initial display");
            p1 p1Var = p1.SENTRY;
            k4 k4Var2 = k4Var;
            io.sentry.i1 s10 = r5.s("ui.load.initial_display", concat, k4Var2, p1Var, iVar);
            weakHashMap2.put(activity, s10);
            if (!this.f15453f || this.f15456i == null || this.f15451d == null) {
                k1Var = r5;
            } else {
                io.sentry.i1 s11 = r5.s("ui.load.full_display", simpleName.concat(" full display"), k4Var2, p1Var, iVar);
                k1Var = r5;
                try {
                    weakHashMap.put(activity, s11);
                    this.f15461o = this.f15451d.getExecutorService().l(new androidx.appcompat.app.t(this, s11, s10), 25000L);
                } catch (RejectedExecutionException e7) {
                    this.f15451d.getLogger().e(b5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e7);
                }
            }
            y3 y3Var = this.f15450c;
            com.google.firebase.messaging.g gVar = new com.google.firebase.messaging.g(9, this, k1Var);
            y3Var.getClass();
            d4.c(gVar);
            weakHashMap3.put(activity, k1Var);
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15451d = sentryAndroidOptions;
        this.f15450c = y3.f17255a;
        this.f15452e = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f15456i = this.f15451d.getFullyDisplayedReporter();
        this.f15453f = this.f15451d.isEnableTimeToFullDisplayTracing();
        this.f15448a.registerActivityLifecycleCallbacks(this);
        this.f15451d.getLogger().h(b5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        rh.g.a("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
