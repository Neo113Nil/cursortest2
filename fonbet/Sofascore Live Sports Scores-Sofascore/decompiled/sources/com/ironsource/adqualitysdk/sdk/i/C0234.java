package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ÿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0234 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1181 f442;

    public C0234(C1181 c1181) {
        this.f442 = c1181;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1181 c1181 = this.f442;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdListener interstitialAdListener = (InterstitialAdListener) arrayList.get(1);
        c1181.getClass();
        interstitialAd.setAdListener(interstitialAdListener);
        return null;
    }
}
