package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.Reward;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l0 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ p0 f186;

    public l0(p0 p0Var) {
        this.f186 = p0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        p0 p0Var = this.f186;
        Reward reward = (Reward) arrayList.get(0);
        p0Var.getClass();
        return reward.getType();
    }
}
