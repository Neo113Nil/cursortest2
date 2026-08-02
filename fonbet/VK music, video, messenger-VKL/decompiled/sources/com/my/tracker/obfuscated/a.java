package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.igl0;
import xsna.l6i;
import xsna.l8y0;

/* loaded from: classes.dex */
public final class a {
    final e0 d;
    final y2 e;
    final w1 f;
    final Application g;
    final Runnable i;
    final Runnable j;
    final Map a = new WeakHashMap();
    final Handler b = m.a;
    final AtomicBoolean c = new AtomicBoolean();
    long k = 0;
    long l = 0;
    final Runnable h = new l8y0(this, 0);

    private a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        this.d = e0Var;
        this.e = y2Var;
        this.f = w1Var;
        this.g = application;
        int i = 2;
        this.i = new igl0(this, i);
        this.j = new l6i(this, i);
    }

    public void e() {
        if (this.c.get()) {
            m.f(this.i);
        }
    }

    public void f() {
        x2.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    public static a a(e0 e0Var, y2 y2Var, w1 w1Var, Application application) {
        return new a(e0Var, y2Var, w1Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(v2.a(this.e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        p1.a(this.g).d(v2.b(this.k));
    }

    public void a() {
        this.g.registerActivityLifecycleCallbacks(new C0362a());
    }

    public void c(Activity activity) {
        if (this.a.remove(activity) == null || !this.a.isEmpty()) {
            return;
        }
        l2.d().b();
        this.c.set(false);
        this.b.removeCallbacks(this.h);
        this.k = System.currentTimeMillis();
        m.a(this.j);
    }

    public void d(Activity activity) {
        m.f(new xsna.c0(10, this, activity));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) != null || this.a.size() > 1) {
            return;
        }
        l2.d().a();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.k >= v2.a(this.e.i())) {
            this.f.c();
            if (this.e.v()) {
                this.d.g();
                a(v2.a(this.e.e()));
                return;
            }
        }
        long j = this.l - currentTimeMillis;
        if (j > 0) {
            a(j);
        } else {
            f();
        }
    }

    public void a(long j) {
        this.b.removeCallbacks(this.h);
        this.c.set(true);
        this.b.postDelayed(this.h, j);
        this.l = System.currentTimeMillis() + j;
    }

    /* renamed from: com.my.tracker.obfuscated.a$a, reason: collision with other inner class name */
    public final class C0362a implements Application.ActivityLifecycleCallbacks {
        public C0362a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
