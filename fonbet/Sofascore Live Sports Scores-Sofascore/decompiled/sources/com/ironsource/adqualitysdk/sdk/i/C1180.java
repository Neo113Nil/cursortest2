package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾊ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1180 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f3713;

    public C1180(C1143 c1143) {
        this.f3713 = c1143;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1143 c1143 = this.f3713;
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        c1143.getClass();
        return apsAd.getAdView();
    }
}
