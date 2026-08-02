package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ꭸ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0607 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0445 f1976;

    public C0607(C0445 c0445) {
        this.f1976 = c0445;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0445 c0445 = this.f1976;
        ContextData contextData = (ContextData) arrayList.get(0);
        c0445.getClass();
        return contextData.getAdvertisedContent();
    }
}
