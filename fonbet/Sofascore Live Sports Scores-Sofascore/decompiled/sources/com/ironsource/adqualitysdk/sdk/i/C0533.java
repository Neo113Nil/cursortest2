package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܫ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0533 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0458 f1776;

    public C0533(C0458 c0458) {
        this.f1776 = c0458;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0458 c0458 = this.f1776;
        Ad ad = (Ad) arrayList.get(0);
        int intValue = ((Integer) arrayList.get(1)).intValue();
        c0458.getClass();
        return ad.getBundle(intValue);
    }
}
