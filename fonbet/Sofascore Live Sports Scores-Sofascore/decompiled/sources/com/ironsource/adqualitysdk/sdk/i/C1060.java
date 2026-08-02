package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1060 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3349;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3350;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3351;

    public C1060(C1027 c1027, Activity activity, Bundle bundle) {
        this.f3349 = c1027;
        this.f3351 = activity;
        this.f3350 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (C1027.m619(this.f3349, this.f3351)) {
            this.f3349.f3284.getClass();
            Bundle bundle = this.f3350;
            if (bundle != null) {
                bundle.putBoolean(C1027.f3276, this.f3349.f3282);
            }
            this.f3349.f3280 = true;
        }
    }
}
