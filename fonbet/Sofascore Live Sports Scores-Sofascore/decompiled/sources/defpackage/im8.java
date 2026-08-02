package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class im8 implements Application.ActivityLifecycleCallbacks {
    public wb3 d;
    public final Handler a = new Handler();
    public boolean b = false;
    public boolean c = true;
    public final wt1 e = new wt1();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.c = true;
        wb3 wb3Var = this.d;
        Handler handler = this.a;
        if (wb3Var != null) {
            handler.removeCallbacks(wb3Var);
        }
        wb3 wb3Var2 = new wb3(this, 27);
        this.d = wb3Var2;
        handler.postDelayed(wb3Var2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.c = false;
        boolean z = this.b;
        this.b = true;
        wb3 wb3Var = this.d;
        if (wb3Var != null) {
            this.a.removeCallbacks(wb3Var);
        }
        if (z) {
            return;
        }
        this.e.onNext("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
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
