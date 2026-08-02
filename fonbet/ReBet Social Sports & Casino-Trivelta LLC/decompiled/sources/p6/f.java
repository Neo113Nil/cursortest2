package p6;

import T7.A;
import T7.C1678s;
import T7.C1682w;
import T7.J;
import T7.Y;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import g6.C4331C;
import g6.N;
import h6.p;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f63057a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final String f63058b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f63059c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile ScheduledFuture f63060d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f63061e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f63062f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile m f63063g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f63064h;

    /* renamed from: i, reason: collision with root package name */
    public static String f63065i;

    /* renamed from: j, reason: collision with root package name */
    public static long f63066j;

    /* renamed from: k, reason: collision with root package name */
    public static int f63067k;

    /* renamed from: l, reason: collision with root package name */
    public static WeakReference f63068l;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityCreated");
            g.a();
            f.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityDestroyed");
            f.f63057a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityPaused");
            g.a();
            f.f63057a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityResumed");
            g.a();
            f.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f.f63067k++;
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            J.f10993e.b(N.APP_EVENTS, f.f63058b, "onActivityStopped");
            p.f47798b.h();
            f.f63067k--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f63058b = canonicalName;
        f63059c = Executors.newSingleThreadScheduledExecutor();
        f63061e = new Object();
        f63062f = new AtomicInteger(0);
        f63064h = new AtomicBoolean(false);
    }

    public static final Activity l() {
        WeakReference weakReference = f63068l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID m() {
        m mVar;
        if (f63063g == null || (mVar = f63063g) == null) {
            return null;
        }
        return mVar.d();
    }

    public static final boolean o() {
        return f63067k == 0;
    }

    public static final void p(Activity activity) {
        f63059c.execute(new Runnable() { // from class: p6.d
            @Override // java.lang.Runnable
            public final void run() {
                f.q();
            }
        });
    }

    public static final void q() {
        if (f63063g == null) {
            f63063g = m.f63090g.b();
        }
    }

    public static final void t(final long j10, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f63063g == null) {
            f63063g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        m mVar = f63063g;
        if (mVar != null) {
            mVar.k(Long.valueOf(j10));
        }
        if (f63062f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: p6.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(j10, activityName);
                }
            };
            synchronized (f63061e) {
                f63060d = f63059c.schedule(runnable, f63057a.n(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j11 = f63066j;
        i.e(activityName, j11 > 0 ? (j10 - j11) / 1000 : 0L);
        m mVar2 = f63063g;
        if (mVar2 == null) {
            return;
        }
        mVar2.m();
    }

    public static final void u(long j10, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f63063g == null) {
            f63063g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        if (f63062f.get() <= 0) {
            n nVar = n.f63097a;
            n.e(activityName, f63063g, f63065i);
            m.f63090g.a();
            f63063g = null;
        }
        synchronized (f63061e) {
            f63060d = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void v(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f63068l = new WeakReference(activity);
        f63062f.incrementAndGet();
        f63057a.k();
        final long currentTimeMillis = System.currentTimeMillis();
        f63066j = currentTimeMillis;
        final String t10 = Y.t(activity);
        k6.e.l(activity);
        i6.b.d(activity);
        t6.e.h(activity);
        n6.k.b();
        final Context applicationContext = activity.getApplicationContext();
        f63059c.execute(new Runnable() { // from class: p6.b
            @Override // java.lang.Runnable
            public final void run() {
                f.w(currentTimeMillis, t10, applicationContext);
            }
        });
    }

    public static final void w(long j10, String activityName, Context appContext) {
        m mVar;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        m mVar2 = f63063g;
        Long e10 = mVar2 == null ? null : mVar2.e();
        if (f63063g == null) {
            f63063g = new m(Long.valueOf(j10), null, null, 4, null);
            n nVar = n.f63097a;
            String str = f63065i;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            n.c(activityName, null, str, appContext);
        } else if (e10 != null) {
            long longValue = j10 - e10.longValue();
            if (longValue > f63057a.n() * 1000) {
                n nVar2 = n.f63097a;
                n.e(activityName, f63063g, f63065i);
                String str2 = f63065i;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                n.c(activityName, null, str2, appContext);
                f63063g = new m(Long.valueOf(j10), null, null, 4, null);
            } else if (longValue > 1000 && (mVar = f63063g) != null) {
                mVar.h();
            }
        }
        m mVar3 = f63063g;
        if (mVar3 != null) {
            mVar3.k(Long.valueOf(j10));
        }
        m mVar4 = f63063g;
        if (mVar4 == null) {
            return;
        }
        mVar4.m();
    }

    public static final void x(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f63064h.compareAndSet(false, true)) {
            C1678s c1678s = C1678s.f11164a;
            C1678s.a(C1678s.b.CodelessEvents, new C1678s.a() { // from class: p6.a
                @Override // T7.C1678s.a
                public final void a(boolean z10) {
                    f.y(z10);
                }
            });
            f63065i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static final void y(boolean z10) {
        if (z10) {
            k6.e.f();
        } else {
            k6.e.e();
        }
    }

    public final void k() {
        ScheduledFuture scheduledFuture;
        synchronized (f63061e) {
            try {
                if (f63060d != null && (scheduledFuture = f63060d) != null) {
                    scheduledFuture.cancel(false);
                }
                f63060d = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int n() {
        A a10 = A.f10965a;
        C1682w f10 = A.f(C4331C.m());
        return f10 == null ? j.a() : f10.n();
    }

    public final void r(Activity activity) {
        k6.e.j(activity);
    }

    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f63062f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f63058b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String t10 = Y.t(activity);
        k6.e.k(activity);
        f63059c.execute(new Runnable() { // from class: p6.c
            @Override // java.lang.Runnable
            public final void run() {
                f.t(currentTimeMillis, t10);
            }
        });
    }
}
