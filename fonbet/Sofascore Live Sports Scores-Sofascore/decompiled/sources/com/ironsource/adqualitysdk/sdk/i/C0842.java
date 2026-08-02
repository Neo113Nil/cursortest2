package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.lib.samodelspace.saad.SAAd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵌ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0842 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0653 f2784;

    public C0842(C0653 c0653) {
        this.f2784 = c0653;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0653 c0653 = this.f2784;
        SAAd sAAd = (SAAd) arrayList.get(0);
        c0653.getClass();
        return sAAd.writeToJson();
    }
}
