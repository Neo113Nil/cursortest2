package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.InPlay.CBInPlay;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1150 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1097 f3631;

    public C1150(C1097 c1097) {
        this.f3631 = c1097;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1097 c1097 = this.f3631;
        CBInPlay cBInPlay = (CBInPlay) arrayList.get(0);
        c1097.getClass();
        return cBInPlay.getLocation();
    }
}
