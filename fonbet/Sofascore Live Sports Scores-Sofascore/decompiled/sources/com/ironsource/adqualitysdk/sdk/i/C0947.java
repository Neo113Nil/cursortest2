package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.⁀, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0947 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0933 f3156;

    public C0947(C0933 c0933) {
        this.f3156 = c0933;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0933 c0933 = this.f3156;
        PresageInterstitial presageInterstitial = (PresageInterstitial) arrayList.get(0);
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) arrayList.get(1);
        c0933.getClass();
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        return null;
    }
}
