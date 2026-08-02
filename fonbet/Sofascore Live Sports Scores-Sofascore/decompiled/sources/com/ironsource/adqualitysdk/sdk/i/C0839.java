package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵉ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0839 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f2778;

    public C0839(C0833 c0833) {
        this.f2778 = c0833;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0833 c0833 = this.f2778;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c0833.getClass();
        return ad.getAsset(str);
    }
}
