package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1146 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f3627;

    public C1146(C1143 c1143) {
        this.f3627 = c1143;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1143 c1143 = this.f3627;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        c1143.getClass();
        return dTBAdResponse.getDTBAds();
    }
}
