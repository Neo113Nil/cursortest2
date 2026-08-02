package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oe0 implements Application.ActivityLifecycleCallbacks {
    public static final l10 q = l10.c();
    public static volatile oe0 r;
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final WeakHashMap c;
    public final WeakHashMap d;
    public final HashMap e;
    public final HashSet f;
    public final HashSet g;
    public final AtomicInteger h;
    public final fyj i;
    public final oi3 j;
    public final wxf k;
    public Timer l;
    public Timer m;
    public of0 n;
    public boolean o;
    public boolean p;

    public oe0(fyj fyjVar, wxf wxfVar) {
        oi3 e = oi3.e();
        l10 l10Var = ir8.e;
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new AtomicInteger(0);
        this.n = of0.BACKGROUND;
        this.o = false;
        this.p = true;
        this.i = fyjVar;
        this.k = wxfVar;
        this.j = e;
    }

    public static oe0 a() {
        if (r == null) {
            synchronized (oe0.class) {
                try {
                    if (r == null) {
                        r = new oe0(fyj.s, new wxf(18));
                    }
                } finally {
                }
            }
        }
        return r;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l = (Long) this.e.get(str);
                HashMap hashMap = this.e;
                if (l == null) {
                    hashMap.put(str, 1L);
                } else {
                    hashMap.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if (((z48) it.next()) != null) {
                        try {
                            y48.a();
                        } catch (IllegalStateException e) {
                            z48.a.e("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Activity activity) {
        jvd jvdVar;
        WeakHashMap weakHashMap = this.d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        ir8 ir8Var = (ir8) this.b.get(activity);
        sz8 sz8Var = ir8Var.b;
        HashMap hashMap = ir8Var.c;
        l10 l10Var = ir8.e;
        if (ir8Var.d) {
            if (!hashMap.isEmpty()) {
                l10Var.getClass();
                hashMap.clear();
            }
            jvd a = ir8Var.a();
            try {
                sz8Var.x(ir8Var.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                l10Var.e("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                a = new jvd();
            }
            ((axn) sz8Var.b).b = new SparseIntArray[9];
            ir8Var.d = false;
            jvdVar = a;
        } else {
            l10Var.getClass();
            jvdVar = new jvd();
        }
        if (jvdVar.b()) {
            stg.a(trace, (hr8) jvdVar.a());
            trace.stop();
        } else {
            q.e("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void e(String str, Timer timer, Timer timer2) {
        if (this.j.o()) {
            csj w = fsj.w();
            w.q(str);
            w.o(timer.a);
            w.p(timer.b(timer2));
            w.i(SessionManager.getInstance().perfSession().a());
            int andSet = this.h.getAndSet(0);
            synchronized (this.e) {
                try {
                    w.k(this.e);
                    if (andSet != 0) {
                        w.m(andSet, "_tsns");
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.i.c((fsj) w.build(), of0.FOREGROUND_BACKGROUND);
        }
    }

    public final void f(Activity activity) {
        if (this.j.o()) {
            ir8 ir8Var = new ir8(activity);
            this.b.put(activity, ir8Var);
            if (activity instanceof FragmentActivity) {
                xp8 xp8Var = new xp8(this.k, this.i, this, ir8Var);
                this.c.put(activity, xp8Var);
                ((FragmentActivity) activity).k().Z(xp8Var, true);
            }
        }
    }

    public final void g(of0 of0Var) {
        this.n = of0Var;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    ne0 ne0Var = (ne0) ((WeakReference) it.next()).get();
                    if (ne0Var != null) {
                        ne0Var.onUpdateAppState(this.n);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        WeakHashMap weakHashMap = this.c;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).k().n0((ap8) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.a.isEmpty()) {
                this.l = new Timer();
                this.a.put(activity, Boolean.TRUE);
                if (this.p) {
                    g(of0.FOREGROUND);
                    c();
                    this.p = false;
                } else {
                    e("_bs", this.m, this.l);
                    g(of0.FOREGROUND);
                }
            } else {
                this.a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.j.o()) {
                if (!this.b.containsKey(activity)) {
                    f(activity);
                }
                ((ir8) this.b.get(activity)).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.i, this.k, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        d(activity);
        if (this.a.containsKey(activity)) {
            this.a.remove(activity);
            if (this.a.isEmpty()) {
                Timer timer = new Timer();
                this.m = timer;
                e("_fs", this.l, timer);
                g(of0.BACKGROUND);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
