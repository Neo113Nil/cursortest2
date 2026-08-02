package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɻ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0278 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0209 f504;

    public C0278(C0209 c0209) {
        this.f504 = c0209;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0209 c0209 = this.f504;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0209.getClass();
        return Integer.valueOf(campaignEx.getLinkType());
    }
}
