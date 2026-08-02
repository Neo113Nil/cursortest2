package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0801 extends AbstractC0280 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f2553;

    public C0801(C0785 c0785) {
        this.f2553 = c0785;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2553.f2526.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2553.f2526.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0785 c0785 = this.f2553;
        c0785.f2526.postDelayed(new C0793(c0785, activity), 500L);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0785 c0785 = this.f2553;
        if (c0785.f2528) {
            c0785.f2528 = false;
            c0785.f2527.mo455(activity);
        }
        c0785.f2526.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f2553.f2526.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2553.f2526.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2553.f2526.removeCallbacksAndMessages(null);
    }
}
