package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ب, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0469 extends AbstractC0280 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0439 f1518;

    public C0469(C0439 c0439) {
        this.f1518 = c0439;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0280, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC1008.m614(new C0478(this));
    }
}
