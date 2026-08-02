package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0703 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0700 f2378;

    public C0703(C0700 c0700) {
        this.f2378 = c0700;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0700 c0700 = this.f2378;
        Banner banner = (Banner) arrayList.get(0);
        BannerAdShowListener bannerAdShowListener = (BannerAdShowListener) arrayList.get(1);
        c0700.getClass();
        banner.setAdShowListener(bannerAdShowListener);
        return null;
    }
}
