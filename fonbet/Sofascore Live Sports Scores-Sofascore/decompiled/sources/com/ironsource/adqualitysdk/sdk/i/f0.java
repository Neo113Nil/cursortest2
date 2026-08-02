package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f0 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ p0 f139;

    public f0(p0 p0Var) {
        this.f139 = p0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        p0 p0Var = this.f139;
        BannerAdView bannerAdView = (BannerAdView) arrayList.get(0);
        BannerAdEventListener bannerAdEventListener = (BannerAdEventListener) arrayList.get(1);
        p0Var.getClass();
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        return null;
    }
}
