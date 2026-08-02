package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.〵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0972 implements ISAdQualityInitListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0898 f3198;

    public C0972(C0898 c0898) {
        this.f3198 = c0898;
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
        C0808.m482(this.f3198.f3011.f2587, iSAdQualityInitError, str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
    public final void adQualitySdkInitSuccess() {
        C0808 c0808 = this.f3198.f3011;
        String str = C0808.f2584;
        c0808.getClass();
        AbstractC1008.m610(new C0817(c0808));
    }
}
