package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵊ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0840 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f2779;

    public C0840(C0833 c0833) {
        this.f2779 = c0833;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0833 c0833 = this.f2779;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c0833.getClass();
        return ad.getMeta(str);
    }
}
