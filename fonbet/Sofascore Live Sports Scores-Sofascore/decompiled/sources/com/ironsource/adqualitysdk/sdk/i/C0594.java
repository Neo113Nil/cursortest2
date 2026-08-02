package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ๆ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0594 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0589 f1958;

    public C0594(C0589 c0589) {
        this.f1958 = c0589;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0589 c0589 = this.f1958;
        LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) arrayList.get(0);
        LevelPlayNativeAdListener levelPlayNativeAdListener = (LevelPlayNativeAdListener) arrayList.get(1);
        c0589.getClass();
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        return null;
    }
}
