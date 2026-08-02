package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.য, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0553 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0458 f1821;

    public C0553(C0458 c0458) {
        this.f1821 = c0458;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0458 c0458 = this.f1821;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedListener rewardedListener = (RewardedListener) arrayList.get(1);
        c0458.getClass();
        rewardedAd.setListener(rewardedListener);
        return null;
    }
}
