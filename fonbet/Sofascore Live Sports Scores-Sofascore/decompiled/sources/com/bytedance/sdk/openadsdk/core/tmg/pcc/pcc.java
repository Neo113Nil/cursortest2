package com.bytedance.sdk.openadsdk.core.tmg.pcc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements Application.ActivityLifecycleCallbacks {
    private static volatile pcc pcc;
    private final sf sf;

    private pcc(Application application) {
        this.sf = sf.pcc(application);
    }

    public static pcc pcc(Application application) {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc(application);
                        application.registerActivityLifecycleCallbacks(pcc);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.pcc(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            sfVar.sf(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    public String pcc(String str, long j, int i) {
        sf sfVar = this.sf;
        if (sfVar != null) {
            return sfVar.pcc(str, j, i);
        }
        return "null";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
