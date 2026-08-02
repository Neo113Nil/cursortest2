package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import defpackage.b3f;
import defpackage.b8f;
import defpackage.csj;
import defpackage.d6b;
import defpackage.dmi;
import defpackage.dv0;
import defpackage.eqd;
import defpackage.fsj;
import defpackage.fyj;
import defpackage.jvd;
import defpackage.l10;
import defpackage.me0;
import defpackage.oi3;
import defpackage.r0;
import defpackage.r38;
import defpackage.t6b;
import defpackage.wi3;
import defpackage.wxf;
import defpackage.z58;
import defpackage.zid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, t6b {
    public static ThreadPoolExecutor A;
    public static final Timer x = new Timer();
    public static final long y = 60000000;
    public static volatile AppStartTrace z;
    public final fyj b;
    public final oi3 c;
    public final csj d;
    public Application e;
    public final Timer g;
    public final Timer h;
    public PerfSession r;
    public boolean a = false;
    public boolean f = false;
    public Timer i = null;
    public Timer j = null;
    public Timer k = null;
    public Timer l = null;
    public Timer m = null;
    public Timer n = null;
    public Timer o = null;
    public Timer p = null;
    public Timer q = null;
    public boolean s = false;
    public int t = 0;
    public final me0 u = new me0(this);
    public boolean v = false;
    public zid w = null;

    public AppStartTrace(fyj fyjVar, wxf wxfVar, oi3 oi3Var, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.b = fyjVar;
        this.c = oi3Var;
        A = threadPoolExecutor;
        csj w = fsj.w();
        w.q("_experiment_app_start_ttid");
        this.d = w;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.g = new Timer((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        dv0 dv0Var = (dv0) r38.c().b(dv0.class);
        if (dv0Var != null) {
            long micros2 = timeUnit.toMicros(dv0Var.b);
            timer = new Timer((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.h = timer;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String y2 = dmi.y(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(y2))) {
                return true;
            }
        }
        return false;
    }

    public final Timer a() {
        Timer timer = this.h;
        return timer != null ? timer : x;
    }

    public final Timer b() {
        Timer timer = this.g;
        return timer != null ? timer : a();
    }

    public final void d(csj csjVar) {
        if (this.o == null || this.p == null || this.q == null) {
            return;
        }
        A.execute(new r0(11, this, csjVar));
        f();
    }

    public final synchronized void f() {
        if (this.a) {
            b8f.i.f.d(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000c, B:8:0x001c, B:10:0x0020, B:13:0x0025, B:15:0x0029, B:19:0x0037, B:21:0x0055, B:29:0x0012, B:31:0x0016, B:33:0x001a), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z2;
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                zid zidVar = this.w;
                if (zidVar == null || zidVar.b != 1) {
                    this.s = true;
                }
            } else if (this.j != null) {
                this.s = true;
                this.j = null;
            }
            if (!this.s && this.i == null) {
                if (!this.v && !c(this.e)) {
                    z2 = false;
                    this.v = z2;
                    new WeakReference(activity);
                    this.i = new Timer();
                    if (b().b(this.i) > y) {
                        this.f = true;
                    }
                }
                z2 = true;
                this.v = z2;
                new WeakReference(activity);
                this.i = new Timer();
                if (b().b(this.i) > y) {
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View findViewById;
        if (this.s || this.f) {
            return;
        }
        oi3 oi3Var = this.c;
        oi3Var.getClass();
        jvd h = oi3Var.h(wi3.Q());
        if ((h.b() ? ((Boolean) h.a()).booleanValue() : false) && (findViewById = activity.findViewById(R.id.content)) != null) {
            findViewById.getViewTreeObserver().removeOnDrawListener(this.u);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [le0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [le0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [le0] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View findViewById;
        try {
            if (!this.s && !this.f) {
                oi3 oi3Var = this.c;
                oi3Var.getClass();
                jvd h = oi3Var.h(wi3.Q());
                final int i = 0;
                boolean booleanValue = h.b() ? ((Boolean) h.a()).booleanValue() : false;
                if (booleanValue && (findViewById = activity.findViewById(R.id.content)) != null) {
                    findViewById.getViewTreeObserver().addOnDrawListener(this.u);
                    findViewById.getViewTreeObserver().addOnDrawListener(new z58(findViewById, new Runnable(this) { // from class: le0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.b;
                            switch (i2) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    csj csjVar = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        csj w = fsj.w();
                                        w.q("_experiment_onDrawFoQ");
                                        w.o(appStartTrace.b().a);
                                        w.p(appStartTrace.b().b(appStartTrace.q));
                                        csjVar.j((fsj) w.build());
                                        if (appStartTrace.g != null) {
                                            csj w2 = fsj.w();
                                            w2.q("_experiment_procStart_to_classLoad");
                                            w2.o(appStartTrace.b().a);
                                            w2.p(appStartTrace.b().b(appStartTrace.a()));
                                            csjVar.j((fsj) w2.build());
                                        }
                                        csjVar.n(appStartTrace.v ? "true" : "false");
                                        csjVar.m(appStartTrace.t, "onDrawCount");
                                        csjVar.i(appStartTrace.r.a());
                                        appStartTrace.d(csjVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    csj csjVar2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        csjVar2.o(appStartTrace.b().a);
                                        csjVar2.p(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(csjVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    csj csjVar3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        csj w3 = fsj.w();
                                        w3.q("_experiment_preDrawFoQ");
                                        w3.o(appStartTrace.b().a);
                                        w3.p(appStartTrace.b().b(appStartTrace.p));
                                        csjVar3.j((fsj) w3.build());
                                        appStartTrace.d(csjVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    csj w4 = fsj.w();
                                    w4.q("_as");
                                    w4.o(appStartTrace.a().a);
                                    w4.p(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    csj w5 = fsj.w();
                                    w5.q("_astui");
                                    w5.o(appStartTrace.a().a);
                                    w5.p(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((fsj) w5.build());
                                    if (appStartTrace.k != null) {
                                        csj w6 = fsj.w();
                                        w6.q("_astfd");
                                        w6.o(appStartTrace.i.a);
                                        w6.p(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((fsj) w6.build());
                                        csj w7 = fsj.w();
                                        w7.q("_asti");
                                        w7.o(appStartTrace.k.a);
                                        w7.p(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((fsj) w7.build());
                                    }
                                    w4.h(arrayList);
                                    w4.i(appStartTrace.r.a());
                                    appStartTrace.b.c((fsj) w4.build(), of0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                    final int i2 = 1;
                    final int i3 = 2;
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new b3f(findViewById, new Runnable(this) { // from class: le0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            AppStartTrace appStartTrace = this.b;
                            switch (i22) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    csj csjVar = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        csj w = fsj.w();
                                        w.q("_experiment_onDrawFoQ");
                                        w.o(appStartTrace.b().a);
                                        w.p(appStartTrace.b().b(appStartTrace.q));
                                        csjVar.j((fsj) w.build());
                                        if (appStartTrace.g != null) {
                                            csj w2 = fsj.w();
                                            w2.q("_experiment_procStart_to_classLoad");
                                            w2.o(appStartTrace.b().a);
                                            w2.p(appStartTrace.b().b(appStartTrace.a()));
                                            csjVar.j((fsj) w2.build());
                                        }
                                        csjVar.n(appStartTrace.v ? "true" : "false");
                                        csjVar.m(appStartTrace.t, "onDrawCount");
                                        csjVar.i(appStartTrace.r.a());
                                        appStartTrace.d(csjVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    csj csjVar2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        csjVar2.o(appStartTrace.b().a);
                                        csjVar2.p(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(csjVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    csj csjVar3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        csj w3 = fsj.w();
                                        w3.q("_experiment_preDrawFoQ");
                                        w3.o(appStartTrace.b().a);
                                        w3.p(appStartTrace.b().b(appStartTrace.p));
                                        csjVar3.j((fsj) w3.build());
                                        appStartTrace.d(csjVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    csj w4 = fsj.w();
                                    w4.q("_as");
                                    w4.o(appStartTrace.a().a);
                                    w4.p(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    csj w5 = fsj.w();
                                    w5.q("_astui");
                                    w5.o(appStartTrace.a().a);
                                    w5.p(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((fsj) w5.build());
                                    if (appStartTrace.k != null) {
                                        csj w6 = fsj.w();
                                        w6.q("_astfd");
                                        w6.o(appStartTrace.i.a);
                                        w6.p(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((fsj) w6.build());
                                        csj w7 = fsj.w();
                                        w7.q("_asti");
                                        w7.o(appStartTrace.k.a);
                                        w7.p(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((fsj) w7.build());
                                    }
                                    w4.h(arrayList);
                                    w4.i(appStartTrace.r.a());
                                    appStartTrace.b.c((fsj) w4.build(), of0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: le0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i3;
                            AppStartTrace appStartTrace = this.b;
                            switch (i22) {
                                case 0:
                                    Timer timer = AppStartTrace.x;
                                    csj csjVar = appStartTrace.d;
                                    if (appStartTrace.q == null) {
                                        appStartTrace.q = new Timer();
                                        csj w = fsj.w();
                                        w.q("_experiment_onDrawFoQ");
                                        w.o(appStartTrace.b().a);
                                        w.p(appStartTrace.b().b(appStartTrace.q));
                                        csjVar.j((fsj) w.build());
                                        if (appStartTrace.g != null) {
                                            csj w2 = fsj.w();
                                            w2.q("_experiment_procStart_to_classLoad");
                                            w2.o(appStartTrace.b().a);
                                            w2.p(appStartTrace.b().b(appStartTrace.a()));
                                            csjVar.j((fsj) w2.build());
                                        }
                                        csjVar.n(appStartTrace.v ? "true" : "false");
                                        csjVar.m(appStartTrace.t, "onDrawCount");
                                        csjVar.i(appStartTrace.r.a());
                                        appStartTrace.d(csjVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    Timer timer2 = AppStartTrace.x;
                                    csj csjVar2 = appStartTrace.d;
                                    if (appStartTrace.o == null) {
                                        appStartTrace.o = new Timer();
                                        csjVar2.o(appStartTrace.b().a);
                                        csjVar2.p(appStartTrace.b().b(appStartTrace.o));
                                        appStartTrace.d(csjVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    Timer timer3 = AppStartTrace.x;
                                    csj csjVar3 = appStartTrace.d;
                                    if (appStartTrace.p == null) {
                                        appStartTrace.p = new Timer();
                                        csj w3 = fsj.w();
                                        w3.q("_experiment_preDrawFoQ");
                                        w3.o(appStartTrace.b().a);
                                        w3.p(appStartTrace.b().b(appStartTrace.p));
                                        csjVar3.j((fsj) w3.build());
                                        appStartTrace.d(csjVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer4 = AppStartTrace.x;
                                    csj w4 = fsj.w();
                                    w4.q("_as");
                                    w4.o(appStartTrace.a().a);
                                    w4.p(appStartTrace.a().b(appStartTrace.l));
                                    ArrayList arrayList = new ArrayList(3);
                                    csj w5 = fsj.w();
                                    w5.q("_astui");
                                    w5.o(appStartTrace.a().a);
                                    w5.p(appStartTrace.a().b(appStartTrace.i));
                                    arrayList.add((fsj) w5.build());
                                    if (appStartTrace.k != null) {
                                        csj w6 = fsj.w();
                                        w6.q("_astfd");
                                        w6.o(appStartTrace.i.a);
                                        w6.p(appStartTrace.i.b(appStartTrace.k));
                                        arrayList.add((fsj) w6.build());
                                        csj w7 = fsj.w();
                                        w7.q("_asti");
                                        w7.o(appStartTrace.k.a);
                                        w7.p(appStartTrace.k.b(appStartTrace.l));
                                        arrayList.add((fsj) w7.build());
                                    }
                                    w4.h(arrayList);
                                    w4.i(appStartTrace.r.a());
                                    appStartTrace.b.c((fsj) w4.build(), of0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.l != null) {
                    return;
                }
                new WeakReference(activity);
                this.l = new Timer();
                this.r = SessionManager.getInstance().perfSession();
                l10 c = l10.c();
                activity.getClass();
                a().b(this.l);
                c.getClass();
                final int i4 = 3;
                A.execute(new Runnable(this) { // from class: le0
                    public final /* synthetic */ AppStartTrace b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i22 = i4;
                        AppStartTrace appStartTrace = this.b;
                        switch (i22) {
                            case 0:
                                Timer timer = AppStartTrace.x;
                                csj csjVar = appStartTrace.d;
                                if (appStartTrace.q == null) {
                                    appStartTrace.q = new Timer();
                                    csj w = fsj.w();
                                    w.q("_experiment_onDrawFoQ");
                                    w.o(appStartTrace.b().a);
                                    w.p(appStartTrace.b().b(appStartTrace.q));
                                    csjVar.j((fsj) w.build());
                                    if (appStartTrace.g != null) {
                                        csj w2 = fsj.w();
                                        w2.q("_experiment_procStart_to_classLoad");
                                        w2.o(appStartTrace.b().a);
                                        w2.p(appStartTrace.b().b(appStartTrace.a()));
                                        csjVar.j((fsj) w2.build());
                                    }
                                    csjVar.n(appStartTrace.v ? "true" : "false");
                                    csjVar.m(appStartTrace.t, "onDrawCount");
                                    csjVar.i(appStartTrace.r.a());
                                    appStartTrace.d(csjVar);
                                    break;
                                }
                                break;
                            case 1:
                                Timer timer2 = AppStartTrace.x;
                                csj csjVar2 = appStartTrace.d;
                                if (appStartTrace.o == null) {
                                    appStartTrace.o = new Timer();
                                    csjVar2.o(appStartTrace.b().a);
                                    csjVar2.p(appStartTrace.b().b(appStartTrace.o));
                                    appStartTrace.d(csjVar2);
                                    break;
                                }
                                break;
                            case 2:
                                Timer timer3 = AppStartTrace.x;
                                csj csjVar3 = appStartTrace.d;
                                if (appStartTrace.p == null) {
                                    appStartTrace.p = new Timer();
                                    csj w3 = fsj.w();
                                    w3.q("_experiment_preDrawFoQ");
                                    w3.o(appStartTrace.b().a);
                                    w3.p(appStartTrace.b().b(appStartTrace.p));
                                    csjVar3.j((fsj) w3.build());
                                    appStartTrace.d(csjVar3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer4 = AppStartTrace.x;
                                csj w4 = fsj.w();
                                w4.q("_as");
                                w4.o(appStartTrace.a().a);
                                w4.p(appStartTrace.a().b(appStartTrace.l));
                                ArrayList arrayList = new ArrayList(3);
                                csj w5 = fsj.w();
                                w5.q("_astui");
                                w5.o(appStartTrace.a().a);
                                w5.p(appStartTrace.a().b(appStartTrace.i));
                                arrayList.add((fsj) w5.build());
                                if (appStartTrace.k != null) {
                                    csj w6 = fsj.w();
                                    w6.q("_astfd");
                                    w6.o(appStartTrace.i.a);
                                    w6.p(appStartTrace.i.b(appStartTrace.k));
                                    arrayList.add((fsj) w6.build());
                                    csj w7 = fsj.w();
                                    w7.q("_asti");
                                    w7.o(appStartTrace.k.a);
                                    w7.p(appStartTrace.k.b(appStartTrace.l));
                                    arrayList.add((fsj) w7.build());
                                }
                                w4.h(arrayList);
                                w4.i(appStartTrace.r.a());
                                appStartTrace.b.c((fsj) w4.build(), of0.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!booleanValue) {
                    f();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.s && this.k == null && !this.f) {
            this.k = new Timer();
        }
    }

    @eqd(d6b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.s || this.f || this.n != null) {
            return;
        }
        this.n = new Timer();
        csj w = fsj.w();
        w.q("_experiment_firstBackgrounding");
        w.o(b().a);
        w.p(b().b(this.n));
        this.d.j((fsj) w.build());
    }

    @eqd(d6b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.s || this.f || this.m != null) {
            return;
        }
        this.m = new Timer();
        csj w = fsj.w();
        w.q("_experiment_firstForegrounding");
        w.o(b().a);
        w.p(b().b(this.m));
        this.d.j((fsj) w.build());
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
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
