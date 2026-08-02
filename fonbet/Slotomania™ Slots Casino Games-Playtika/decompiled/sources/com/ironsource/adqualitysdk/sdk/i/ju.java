package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class ju {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jx f2922;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2920 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Handler f2919 = new Handler(Looper.getMainLooper());

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jr f2921 = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.4
        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ju.m8302(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            ju.m8302(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            ju.m8306(ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            ju.m8305(ju.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            ju.m8302(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            ju.m8302(ju.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            ju.m8302(ju.this);
        }
    };

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ boolean m8304(ju juVar) {
        juVar.f2920 = true;
        return true;
    }

    public ju(jx jxVar) {
        this.f2922 = jxVar;
        jt.m8290().m8295(this.f2921);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8307() {
        this.f2919.removeCallbacksAndMessages(null);
        if (this.f2921 != null) {
            jt.m8290().m8291(this.f2921);
            this.f2921 = null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m8302(ju juVar) {
        juVar.f2919.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8306(ju juVar, Activity activity) {
        if (juVar.f2920) {
            juVar.f2920 = false;
            jx jxVar = juVar.f2922;
            if (jxVar != null) {
                jxVar.mo5966(activity);
            }
        }
        juVar.f2919.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ void m8305(ju juVar, final Activity activity) {
        juVar.f2919.postDelayed(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ju.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                ju.m8304(ju.this);
                if (ju.this.f2922 != null) {
                    ju.this.f2922.mo5967(activity);
                }
            }
        }, 500L);
    }
}
