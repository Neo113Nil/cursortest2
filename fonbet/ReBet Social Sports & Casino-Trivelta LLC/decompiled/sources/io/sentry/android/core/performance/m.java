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
import android.util.Log;
import io.sentry.AbstractC4856v2;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4795p0;
import io.sentry.Q;
import io.sentry.U0;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.android.core.C4673d0;
import io.sentry.android.core.C4683i0;
import io.sentry.android.core.C4705r0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.r;
import io.sentry.l4;
import io.sentry.protocol.u;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class m extends io.sentry.android.core.performance.a {

    /* renamed from: z, reason: collision with root package name */
    public static volatile m f51233z;

    /* renamed from: r, reason: collision with root package name */
    public volatile c f51251r;

    /* renamed from: s, reason: collision with root package name */
    public u f51252s;

    /* renamed from: t, reason: collision with root package name */
    public String f51253t;

    /* renamed from: u, reason: collision with root package name */
    public String f51254u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC4856v2 f51255v;

    /* renamed from: w, reason: collision with root package name */
    public ApplicationStartInfo f51256w;

    /* renamed from: y, reason: collision with root package name */
    public static long f51232y = SystemClock.uptimeMillis();

    /* renamed from: A, reason: collision with root package name */
    public static final C4843a f51231A = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public b f51234a = b.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public final p f51235b = new p(new a());

    /* renamed from: c, reason: collision with root package name */
    public volatile long f51236c = -1;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC4795p0 f51242i = null;

    /* renamed from: j, reason: collision with root package name */
    public Q f51243j = null;

    /* renamed from: k, reason: collision with root package name */
    public l4 f51244k = null;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51245l = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f51246m = true;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f51247n = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f51248o = new AtomicBoolean(false);

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f51249p = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f51250q = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public final C4673d0 f51257x = new C4673d0(this);

    /* renamed from: d, reason: collision with root package name */
    public final n f51237d = new n();

    /* renamed from: e, reason: collision with root package name */
    public final n f51238e = new n();

    /* renamed from: f, reason: collision with root package name */
    public final n f51239f = new n();

    /* renamed from: g, reason: collision with root package name */
    public final Map f51240g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final List f51241h = new ArrayList();

    public class a implements p.a {
        public a() {
        }

        @Override // io.sentry.util.p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(AbstractC4704q0.s());
        }
    }

    public enum b {
        UNKNOWN,
        COLD,
        WARM
    }

    public interface c {
        void a();
    }

    public static /* synthetic */ boolean b(m mVar) {
        mVar.getClass();
        mVar.f51236c = SystemClock.uptimeMillis();
        mVar.f51249p.set(false);
        mVar.x();
        return false;
    }

    public static m v() {
        if (f51233z == null) {
            InterfaceC4765j0 d10 = f51231A.d();
            try {
                if (f51233z == null) {
                    f51233z = new m();
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
        return f51233z;
    }

    public synchronized void A() {
        if (!this.f51248o.getAndSet(true)) {
            m v10 = v();
            v10.w().s();
            v10.o().s();
        }
    }

    public void B(Application application) {
        ActivityManager activityManager;
        List historicalProcessStartReasons;
        int startupState;
        int startType;
        if (this.f51245l) {
            return;
        }
        this.f51245l = true;
        this.f51235b.b();
        application.registerActivityLifecycleCallbacks(f51233z);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            try {
                historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
                if (!historicalProcessStartReasons.isEmpty()) {
                    ApplicationStartInfo a10 = e.a(historicalProcessStartReasons.get(0));
                    this.f51256w = a10;
                    startupState = a10.getStartupState();
                    if (startupState == 0) {
                        startType = a10.getStartType();
                        if (startType == 1) {
                            this.f51234a = b.COLD;
                        } else {
                            this.f51234a = b.WARM;
                        }
                    }
                }
            } catch (RuntimeException e10) {
                Log.w("AppStartMetrics", e10);
            }
        }
        if (this.f51234a == b.UNKNOWN || this.f51251r != null) {
            D();
        }
    }

    public final void C() {
        Map startupTimestamps;
        if (this.f51239f.n()) {
            N(this.f51239f.j() + this.f51239f.c());
            return;
        }
        ApplicationStartInfo applicationStartInfo = this.f51256w;
        if (applicationStartInfo != null && Build.VERSION.SDK_INT >= 35) {
            try {
                startupTimestamps = applicationStartInfo.getStartupTimestamps();
                Long l10 = (Long) startupTimestamps.get(2);
                if (l10 != null) {
                    N(TimeUnit.NANOSECONDS.toMillis(l10.longValue()));
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        N(f51232y);
    }

    public final void D() {
        if (this.f51249p.compareAndSet(false, true)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: io.sentry.android.core.performance.l
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return m.b(m.this);
                }
            });
        }
    }

    public void E(String str) {
        this.f51254u = str;
    }

    public void F(Q q10) {
        this.f51243j = q10;
    }

    public void G(AbstractC4856v2 abstractC4856v2) {
        this.f51255v = abstractC4856v2;
    }

    public void H(InterfaceC4795p0 interfaceC4795p0) {
        this.f51242i = interfaceC4795p0;
    }

    public void I(l4 l4Var) {
        this.f51244k = l4Var;
    }

    public void J(String str) {
        this.f51253t = str;
    }

    public void K(u uVar) {
        this.f51252s = uVar;
    }

    public void L(c cVar) {
        this.f51251r = cVar;
        if (cVar == null || !this.f51245l || this.f51247n.get() != 0 || this.f51248o.get()) {
            return;
        }
        D();
    }

    public boolean M(boolean z10) {
        if (this.f51246m) {
            return z10 || ((Boolean) this.f51235b.a()).booleanValue();
        }
        return false;
    }

    public final void N(long j10) {
        if (this.f51237d.m()) {
            if (this.f51237d.l()) {
                this.f51237d.q(j10);
            }
        } else if (this.f51238e.m() && this.f51238e.l()) {
            this.f51238e.q(j10);
        }
    }

    public void d(io.sentry.android.core.performance.c cVar) {
        this.f51241h.add(cVar);
    }

    public n e() {
        n nVar = new n();
        nVar.r("Process Initialization", this.f51237d.h(), this.f51237d.j(), f51232y);
        return nVar;
    }

    public List f() {
        ArrayList arrayList = new ArrayList(this.f51241h);
        Collections.sort(arrayList);
        return arrayList;
    }

    public String g() {
        return this.f51254u;
    }

    public Q h() {
        return this.f51243j;
    }

    public AbstractC4856v2 i() {
        return this.f51255v;
    }

    public C4673d0 j() {
        return this.f51257x;
    }

    public InterfaceC4795p0 k() {
        return this.f51242i;
    }

    public String l() {
        int reason;
        ApplicationStartInfo applicationStartInfo = this.f51256w;
        if (applicationStartInfo == null || Build.VERSION.SDK_INT < 35) {
            return null;
        }
        reason = applicationStartInfo.getReason();
        switch (reason) {
        }
        return null;
    }

    public l4 m() {
        return this.f51244k;
    }

    public String n() {
        return this.f51253t;
    }

    public n o() {
        return this.f51237d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C4705r0.c().d(activity);
        if (this.f51247n.incrementAndGet() == 1 && !this.f51248o.get()) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.f51237d.j();
            if ((!((Boolean) this.f51235b.a()).booleanValue() || uptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) && !this.f51257x.d()) {
                this.f51234a = b.WARM;
                this.f51246m = true;
                this.f51237d.o();
                this.f51237d.p(uptimeMillis);
                f51232y = uptimeMillis;
                this.f51240g.clear();
                this.f51239f.o();
            } else if (this.f51234a == b.UNKNOWN) {
                if (bundle != null) {
                    this.f51234a = b.WARM;
                } else if (this.f51236c == -1 || uptimeMillis <= this.f51236c) {
                    this.f51234a = b.COLD;
                } else {
                    this.f51234a = b.WARM;
                }
            }
        }
        this.f51235b.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C4705r0.c().a(activity);
        int decrementAndGet = this.f51247n.decrementAndGet();
        if (decrementAndGet < 0) {
            this.f51247n.set(0);
            decrementAndGet = 0;
        }
        if (decrementAndGet != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f51234a = b.WARM;
        this.f51235b.c(Boolean.TRUE);
        this.f51246m = true;
        this.f51248o.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C4705r0.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C4705r0.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C4705r0.c().d(activity);
        if (this.f51248o.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            r.c(activity, new Runnable() { // from class: io.sentry.android.core.performance.j
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.A();
                }
            }, new C4683i0(U0.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.k
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.A();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C4705r0.c().a(activity);
    }

    public n p() {
        return (this.f51237d.m() && this.f51237d.n()) ? this.f51237d : this.f51238e;
    }

    public n q(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f51234a != b.UNKNOWN && ((Boolean) this.f51235b.a()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                n o10 = o();
                if (o10.m() && o10.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return o10;
                }
            }
            n w10 = w();
            if (w10.m() && w10.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                return w10;
            }
        }
        return new n();
    }

    public u r() {
        return this.f51252s;
    }

    public b s() {
        return this.f51234a;
    }

    public n t() {
        return this.f51239f;
    }

    public List u() {
        ArrayList arrayList = new ArrayList(this.f51240g.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public n w() {
        return this.f51238e;
    }

    public final void x() {
        if (this.f51247n.get() == 0) {
            if (this.f51251r == null || !AbstractC4704q0.s()) {
                this.f51235b.c(Boolean.FALSE);
                if (this.f51234a == b.UNKNOWN) {
                    this.f51234a = b.COLD;
                }
                InterfaceC4795p0 interfaceC4795p0 = this.f51242i;
                if (interfaceC4795p0 != null && interfaceC4795p0.isRunning()) {
                    this.f51242i.close();
                    this.f51242i = null;
                }
                Q q10 = this.f51243j;
                if (q10 != null && q10.isRunning()) {
                    this.f51243j.a(true);
                    this.f51243j = null;
                }
                c cVar = this.f51251r;
                if (cVar == null || !this.f51250q.compareAndSet(false, true)) {
                    return;
                }
                C();
                cVar.a();
            }
        }
    }

    public boolean y() {
        return ((Boolean) this.f51235b.a()).booleanValue();
    }

    public void z() {
        this.f51246m = false;
        this.f51240g.clear();
        this.f51241h.clear();
        this.f51257x.a();
    }
}
