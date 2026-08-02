package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.interstitial.InterstitialAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j0 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ p0 f184;

    public j0(p0 p0Var) {
        this.f184 = p0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        p0 p0Var = this.f184;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        p0Var.getClass();
        return interstitialAd.getInfo();
    }
}
