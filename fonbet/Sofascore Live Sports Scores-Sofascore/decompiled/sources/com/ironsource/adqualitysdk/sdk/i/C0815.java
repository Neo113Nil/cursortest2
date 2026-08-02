package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴱ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0815 extends AbstractC0280 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f2622;

    public C0815(C1102 c1102) {
        this.f2622 = c1102;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1102 c1102 = this.f2622;
        c1102.m658(AbstractC0615.f2001, C1102.m647(c1102, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1102 c1102 = this.f2622;
        c1102.m658(AbstractC0615.f2000, C1102.m647(c1102, activity));
    }
}
