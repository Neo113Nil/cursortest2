package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m30 implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ n72 b;

    public m30(n72 n72Var, apf apfVar) {
        this.b = n72Var;
        uof uofVar = apfVar.a;
        sl6 sl6Var = ys9.a;
        Object obj = uofVar.b.n.a.get(ys9.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.a;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        n72 n72Var = this.b;
        apf apfVar = (apf) ((WeakReference) n72Var.b).get();
        if (apfVar == null) {
            n72Var.n();
            return;
        }
        fpf d2 = apfVar.d();
        if (d2 != null) {
            synchronized (d2.c) {
                j = d2.a.a;
            }
            d2.b((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        n72 n72Var = this.b;
        apf apfVar = (apf) ((WeakReference) n72Var.b).get();
        if (apfVar == null) {
            n72Var.n();
            return;
        }
        fpf d = apfVar.d();
        if (d != null) {
            synchronized (d.c) {
                j = d.a.a;
            }
            d.b(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
