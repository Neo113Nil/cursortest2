package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ѕ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0401 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0362 f1163;

    public C0401(C0362 c0362) {
        this.f1163 = c0362;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0362 c0362 = this.f1163;
        PAGRewardItem pAGRewardItem = (PAGRewardItem) arrayList.get(0);
        c0362.getClass();
        return pAGRewardItem.getRewardName();
    }
}
