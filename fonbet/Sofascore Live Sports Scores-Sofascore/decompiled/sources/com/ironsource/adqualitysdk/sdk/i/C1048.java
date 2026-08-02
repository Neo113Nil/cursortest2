package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1048 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3333;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3334;

    public C1048(C1027 c1027, Activity activity) {
        this.f3333 = c1027;
        this.f3334 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (C1027.m619(this.f3333, this.f3334)) {
            AbstractC1008.m614(new C1049(this));
            C1027 c1027 = this.f3333;
            if (c1027.f3281 && !c1027.f3280 && this.f3334.isFinishing()) {
                C1027 c10272 = this.f3333;
                c10272.m390(this.f3334);
                c10272.f3282 = false;
            }
        }
    }
}
