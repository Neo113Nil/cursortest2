package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἱ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0913 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0912 f3058;

    public C0913(C0912 c0912) {
        this.f3058 = c0912;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0912 c0912 = this.f3058;
        OguryRewardedAd oguryRewardedAd = (OguryRewardedAd) arrayList.get(0);
        OguryRewardedAdListener oguryRewardedAdListener = (OguryRewardedAdListener) arrayList.get(1);
        c0912.getClass();
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        return null;
    }
}
