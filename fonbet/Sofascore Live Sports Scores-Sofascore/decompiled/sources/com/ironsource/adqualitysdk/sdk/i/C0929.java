package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ὶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0929 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0912 f3109;

    public C0929(C0912 c0912) {
        this.f3109 = c0912;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0912 c0912 = this.f3109;
        OguryInterstitialAd oguryInterstitialAd = (OguryInterstitialAd) arrayList.get(0);
        OguryInterstitialAdListener oguryInterstitialAdListener = (OguryInterstitialAdListener) arrayList.get(1);
        c0912.getClass();
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        return null;
    }
}
