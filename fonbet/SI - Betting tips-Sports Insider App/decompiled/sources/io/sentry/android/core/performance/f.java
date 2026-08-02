package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.i;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.n2;
import io.sentry.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: m, reason: collision with root package name */
    public static volatile f f15800m;

    /* renamed from: l, reason: collision with root package name */
    public static long f15799l = SystemClock.uptimeMillis();

    /* renamed from: n, reason: collision with root package name */
    public static final io.sentry.util.a f15801n = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public e f15802a = e.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15809h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15810i = true;
    public final AtomicInteger j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f15811k = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final g f15804c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final g f15805d = new g();

    /* renamed from: e, reason: collision with root package name */
    public final g f15806e = new g();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f15807f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15808g = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f15803b = m0.h();

    public static f b() {
        if (f15800m == null) {
            r a7 = f15801n.a();
            try {
                if (f15800m == null) {
                    f15800m = new f();
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
        return f15800m;
    }

    public static void c(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        g gVar = new g();
        gVar.c(uptimeMillis);
        b().f15807f.put(contentProvider, gVar);
    }

    public static void d(ContentProvider contentProvider) {
        long uptimeMillis = SystemClock.uptimeMillis();
        g gVar = (g) b().f15807f.get(contentProvider);
        if (gVar == null || gVar.f15815d != 0) {
            return;
        }
        gVar.f15812a = contentProvider.getClass().getName().concat(".onCreate");
        gVar.f15815d = uptimeMillis;
    }

    public final g a(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f15802a != e.UNKNOWN && this.f15803b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                g gVar = this.f15804c;
                if (gVar.b() && gVar.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return gVar;
                }
            }
            g gVar2 = this.f15805d;
            if (gVar2.b() && gVar2.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return gVar2;
            }
        }
        return new g();
    }

    public final synchronized void e() {
        if (!this.f15811k.getAndSet(true)) {
            f b10 = b();
            g gVar = b10.f15805d;
            gVar.getClass();
            gVar.f15815d = SystemClock.uptimeMillis();
            g gVar2 = b10.f15804c;
            gVar2.getClass();
            gVar2.f15815d = SystemClock.uptimeMillis();
        }
    }

    public final void f(Application application) {
        if (this.f15809h) {
            return;
        }
        boolean z5 = true;
        this.f15809h = true;
        if (!this.f15803b && !m0.h()) {
            z5 = false;
        }
        this.f15803b = z5;
        application.registerActivityLifecycleCallbacks(f15800m);
        new Handler(Looper.getMainLooper()).post(new d(this, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        n0.f15781b.c(activity);
        if (this.j.incrementAndGet() == 1 && !this.f15811k.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            g gVar = this.f15804c;
            long j = uptimeMillis - gVar.f15814c;
            if (!this.f15803b || j > TimeUnit.MINUTES.toMillis(1L)) {
                this.f15802a = e.WARM;
                this.f15810i = true;
                gVar.f15812a = null;
                gVar.f15814c = 0L;
                gVar.f15815d = 0L;
                gVar.f15813b = 0L;
                gVar.f15814c = SystemClock.uptimeMillis();
                gVar.f15813b = System.currentTimeMillis();
                gVar.c(uptimeMillis);
                f15799l = uptimeMillis;
                this.f15807f.clear();
                g gVar2 = this.f15806e;
                gVar2.f15812a = null;
                gVar2.f15814c = 0L;
                gVar2.f15815d = 0L;
                gVar2.f15813b = 0L;
            } else {
                this.f15802a = bundle == null ? e.COLD : e.WARM;
            }
        }
        this.f15803b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        n0 n0Var = n0.f15781b;
        WeakReference weakReference = (WeakReference) n0Var.f15782a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.f15782a = null;
        }
        if (this.j.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f15803b = false;
        this.f15810i = true;
        this.f15811k.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        n0 n0Var = n0.f15781b;
        WeakReference weakReference = (WeakReference) n0Var.f15782a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.f15782a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        n0.f15781b.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        n0.f15781b.c(activity);
        if (this.f15811k.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            i.a(activity, new d(this, 0), new n0(n2.f16660a));
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        n0 n0Var = n0.f15781b;
        WeakReference weakReference = (WeakReference) n0Var.f15782a;
        if (weakReference == null || weakReference.get() == activity) {
            n0Var.f15782a = null;
        }
    }
}
