package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7146g0;
import io.sentry.J0;
import io.sentry.android.core.C7109j;
import io.sentry.android.core.I;
import io.sentry.android.core.K;
import io.sentry.android.core.L;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.s3;
import io.sentry.util.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j extends io.sentry.android.core.performance.a {

    /* renamed from: q, reason: collision with root package name */
    private static volatile j f67321q;

    /* renamed from: p, reason: collision with root package name */
    private static long f67320p = SystemClock.uptimeMillis();

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    public static final io.sentry.util.a f67322r = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d f67323a = d.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.util.l<Boolean> f67324b = new io.sentry.util.l<>(new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile long f67325c = -1;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC7146g0 f67331i = null;

    /* renamed from: j, reason: collision with root package name */
    private C7109j f67332j = null;

    /* renamed from: k, reason: collision with root package name */
    private s3 f67333k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f67334l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67335m = true;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f67336n = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f67337o = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l f67326d = new l();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final l f67327e = new l();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l f67328f = new l();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final HashMap f67329g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f67330h = new ArrayList();

    final class a implements l.a<Boolean> {
        @Override // io.sentry.util.l.a
        @NotNull
        public final Boolean g() {
            return Boolean.valueOf(K.g());
        }
    }

    final class b implements MessageQueue.IdleHandler {
        b() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long uptimeMillis = SystemClock.uptimeMillis();
            j jVar = j.this;
            jVar.f67325c = uptimeMillis;
            j.b(jVar);
            return false;
        }
    }

    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f67339a;

        c(Handler handler) {
            this.f67339a = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.f67325c = SystemClock.uptimeMillis();
            this.f67339a.post(new Runnable() { // from class: io.sentry.android.core.performance.k
                @Override // java.lang.Runnable
                public final void run() {
                    j.b(j.this);
                }
            });
        }
    }

    public enum d {
        UNKNOWN,
        COLD,
        WARM
    }

    static void b(j jVar) {
        if (jVar.f67336n.get() == 0) {
            jVar.f67324b.c(Boolean.FALSE);
            InterfaceC7146g0 interfaceC7146g0 = jVar.f67331i;
            if (interfaceC7146g0 != null && interfaceC7146g0.isRunning()) {
                jVar.f67331i.close();
                jVar.f67331i = null;
            }
            C7109j c7109j = jVar.f67332j;
            if (c7109j == null || !c7109j.j()) {
                return;
            }
            jVar.f67332j.a(true);
            jVar.f67332j = null;
        }
    }

    @NotNull
    public static j m() {
        if (f67321q == null) {
            InterfaceC7097a0 a11 = f67322r.a();
            try {
                if (f67321q == null) {
                    f67321q = new j();
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
        return f67321q;
    }

    public final void c(@NotNull io.sentry.android.core.performance.c cVar) {
        this.f67330h.add(cVar);
    }

    @NotNull
    public final l d() {
        l lVar = new l();
        l lVar2 = this.f67326d;
        lVar.n(lVar2.e(), lVar2.g(), f67320p, "Process Initialization");
        return lVar;
    }

    public final io.sentry.K e() {
        return this.f67332j;
    }

    public final InterfaceC7146g0 f() {
        return this.f67331i;
    }

    public final s3 g() {
        return this.f67333k;
    }

    @NotNull
    public final l h() {
        return this.f67326d;
    }

    @NotNull
    public final l i(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (this.f67323a != d.UNKNOWN && this.f67324b.a().booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                l lVar = this.f67326d;
                if (lVar.j() && lVar.b() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return lVar;
                }
            }
            l lVar2 = this.f67327e;
            if (lVar2.j() && lVar2.b() <= TimeUnit.MINUTES.toMillis(1L)) {
                return lVar2;
            }
        }
        return new l();
    }

    @NotNull
    public final d j() {
        return this.f67323a;
    }

    @NotNull
    public final l k() {
        return this.f67328f;
    }

    @NotNull
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList(this.f67329g.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    @NotNull
    public final l n() {
        return this.f67327e;
    }

    public final void o() {
        this.f67335m = false;
        this.f67329g.clear();
        this.f67330h.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        long uptimeMillis = SystemClock.uptimeMillis();
        L.c().d(activity);
        if (this.f67336n.incrementAndGet() == 1 && !this.f67337o.get()) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.f67326d.g();
            if (!this.f67324b.a().booleanValue() || uptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f67323a = d.WARM;
                this.f67335m = true;
                this.f67326d.l();
                this.f67326d.m(uptimeMillis);
                f67320p = uptimeMillis;
                this.f67329g.clear();
                this.f67328f.l();
            } else if (this.f67323a == d.UNKNOWN) {
                if (bundle != null) {
                    this.f67323a = d.WARM;
                } else if (this.f67325c == -1 || uptimeMillis <= this.f67325c) {
                    this.f67323a = d.COLD;
                } else {
                    this.f67323a = d.WARM;
                }
            }
        }
        this.f67324b.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        L.c().a(activity);
        if (this.f67336n.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f67323a = d.WARM;
        this.f67324b.c(Boolean.TRUE);
        this.f67335m = true;
        this.f67337o.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        L.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        L.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        L.c().d(activity);
        if (this.f67337o.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            io.sentry.android.core.internal.util.k.a(activity, new Runnable() { // from class: io.sentry.android.core.performance.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.p();
                }
            }, new I(J0.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.p();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        L.c().a(activity);
    }

    final synchronized void p() {
        if (!this.f67337o.getAndSet(true)) {
            j m11 = m();
            m11.f67327e.o();
            m11.f67326d.o();
        }
    }

    public final void q(@NotNull Application application) {
        List historicalProcessStartReasons;
        int startupState;
        int startType;
        if (this.f67334l) {
            return;
        }
        this.f67334l = true;
        this.f67324b.b();
        application.registerActivityLifecycleCallbacks(f67321q);
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null && Build.VERSION.SDK_INT >= 35) {
            historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo a11 = e.a(historicalProcessStartReasons.get(0));
                startupState = a11.getStartupState();
                if (startupState == 0) {
                    startType = a11.getStartType();
                    if (startType == 1) {
                        this.f67323a = d.COLD;
                    } else {
                        this.f67323a = d.WARM;
                    }
                }
            }
        }
        d dVar = this.f67323a;
        d dVar2 = d.UNKNOWN;
        if (dVar == dVar2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new b());
        } else if (dVar == dVar2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new c(handler));
        }
    }

    public final void r(C7109j c7109j) {
        this.f67332j = c7109j;
    }

    public final void s(InterfaceC7146g0 interfaceC7146g0) {
        this.f67331i = interfaceC7146g0;
    }

    public final void t(s3 s3Var) {
        this.f67333k = s3Var;
    }

    public final boolean u() {
        return this.f67335m && this.f67324b.a().booleanValue();
    }
}
