package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.bvf;
import xsna.dlr;
import xsna.ef2;
import xsna.ra2;
import xsna.to2;
import xsna.txi;
import xsna.u12;
import xsna.xop0;
import xsna.ywc0;

/* loaded from: classes13.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    public static final long p = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace q;
    public static ThreadPoolExecutor r;
    public final xop0 c;
    public final txi d;
    public final i.b e;
    public Application f;
    public PerfSession n;
    public boolean b = false;
    public boolean g = false;
    public Timer h = null;
    public Timer i = null;
    public Timer j = null;
    public Timer k = null;
    public Timer l = null;
    public Timer m = null;
    public boolean o = false;

    public static class a implements Runnable {
        public final AppStartTrace b;

        public a(AppStartTrace appStartTrace) {
            this.b = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.b;
            if (appStartTrace.i == null) {
                appStartTrace.o = true;
            }
        }
    }

    public AppStartTrace(@NonNull xop0 xop0Var, @NonNull bvf bvfVar, @NonNull txi txiVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
        this.c = xop0Var;
        this.d = txiVar;
        r = threadPoolExecutor;
        i.b z = i.z();
        z.p("_experiment_app_start_ttid");
        this.e = z;
    }

    public static AppStartTrace a() {
        if (q != null) {
            return q;
        }
        xop0 xop0Var = xop0.t;
        bvf bvfVar = new bvf();
        if (q == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (q == null) {
                        q = new AppStartTrace(xop0Var, bvfVar, txi.e(), new ThreadPoolExecutor(0, 1, 10 + p, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public static Timer b() {
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        long startUptimeMillis = Process.getStartUptimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startUptimeMillis);
        long micros2 = timeUnit.toMicros(startElapsedRealtime);
        return new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros2, micros);
    }

    public final synchronized void c(@NonNull Context context) {
        if (this.b) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.b = true;
            this.f = (Application) applicationContext;
        }
    }

    public final synchronized void d() {
        if (this.b) {
            this.f.unregisterActivityLifecycleCallbacks(this);
            this.b = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.o && this.i == null) {
            new WeakReference(activity);
            this.i = new Timer();
            if (FirebasePerfProvider.getAppStartTime().e(this.i) > p) {
                this.g = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.m == null || this.l == null) {
            Timer timer = new Timer();
            i.b z = i.z();
            z.p("_experiment_onPause");
            z.n(timer.b);
            z.o(timer.c - b().c);
            this.e.f(z.build());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.o && !this.g) {
                boolean f = this.d.f();
                if (f) {
                    View findViewById = activity.findViewById(R.id.content);
                    findViewById.getViewTreeObserver().addOnDrawListener(new dlr(findViewById, new u12(this, 2)));
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new ywc0(findViewById, new to2(this, 1)));
                }
                if (this.k != null) {
                    return;
                }
                new WeakReference(activity);
                this.k = new Timer();
                this.h = FirebasePerfProvider.getAppStartTime();
                this.n = SessionManager.getInstance().perfSession();
                ra2 d = ra2.d();
                activity.getClass();
                this.h.e(this.k);
                d.a();
                r.execute(new ef2(this, 1));
                if (!f && this.b) {
                    d();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.o && this.j == null && !this.g) {
            this.j = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.m == null || this.l == null) {
            Timer timer = new Timer();
            i.b z = i.z();
            z.p("_experiment_onStop");
            z.n(timer.b);
            z.o(timer.c - b().c);
            this.e.f(z.build());
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
