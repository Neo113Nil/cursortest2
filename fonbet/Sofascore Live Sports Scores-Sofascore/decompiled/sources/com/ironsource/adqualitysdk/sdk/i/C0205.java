package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ī, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0205 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f301;

    public C0205(C0833 c0833) {
        this.f301 = c0833;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0833 c0833 = this.f301;
        AdParams adParams = (AdParams) arrayList.get(0);
        c0833.getClass();
        return adParams.getEndCardRedirectUrl();
    }
}
