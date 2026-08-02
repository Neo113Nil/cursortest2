package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzfwm implements Application.ActivityLifecycleCallbacks {
    public boolean a;
    public boolean b;
    public zzfwl c;

    public boolean a() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.b) {
            this.b = true;
            if (this.a) {
                b(true);
                zzfwl zzfwlVar = this.c;
                if (zzfwlVar != null) {
                    zzfwlVar.zzd(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean z = x5n.g().importance == 100 || a();
        if (this.b != z) {
            this.b = z;
            if (this.a) {
                b(z);
                zzfwl zzfwlVar = this.c;
                if (zzfwlVar != null) {
                    zzfwlVar.zzd(z);
                }
            }
        }
    }

    public void b(boolean z) {
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
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
