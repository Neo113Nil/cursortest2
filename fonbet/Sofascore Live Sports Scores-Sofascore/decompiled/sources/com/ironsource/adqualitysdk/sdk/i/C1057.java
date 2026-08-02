package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1057 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3346;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3347;

    public C1057(C1027 c1027, Activity activity) {
        this.f3346 = c1027;
        this.f3347 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (C1027.m619(this.f3346, this.f3347)) {
            this.f3346.f3284.onActivityPaused(this.f3347);
        }
    }
}
