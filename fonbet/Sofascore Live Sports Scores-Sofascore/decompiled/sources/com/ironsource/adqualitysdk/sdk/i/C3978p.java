package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3978p implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3981t f193;

    public C3978p(C3981t c3981t) {
        this.f193 = c3981t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3981t c3981t = this.f193;
        AdPayload.AdUnit adUnit = (AdPayload.AdUnit) arrayList.get(0);
        c3981t.getClass();
        return adUnit.getCampaign();
    }
}
