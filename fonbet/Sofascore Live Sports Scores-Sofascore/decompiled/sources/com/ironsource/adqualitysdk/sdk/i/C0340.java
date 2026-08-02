package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.MTGBannerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ΐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0340 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0209 f834;

    public C0340(C0209 c0209) {
        this.f834 = c0209;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0209 c0209 = this.f834;
        MTGBannerView mTGBannerView = (MTGBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c0209.getClass();
        mTGBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
