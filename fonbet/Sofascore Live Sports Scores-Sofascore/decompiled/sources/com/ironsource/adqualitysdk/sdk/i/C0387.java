package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.к, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0387 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0362 f1136;

    public C0387(C0362 c0362) {
        this.f1136 = c0362;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0362 c0362 = this.f1136;
        PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = (PAGBannerAdInteractionListener) arrayList.get(1);
        c0362.getClass();
        pAGBannerAd.setAdInteractionListener(pAGBannerAdInteractionListener);
        return null;
    }
}
