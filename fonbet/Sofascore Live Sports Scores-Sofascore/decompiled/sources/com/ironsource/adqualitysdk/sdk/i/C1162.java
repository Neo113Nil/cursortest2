package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｱ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1162 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1097 f3651;

    public C1162(C1097 c1097) {
        this.f3651 = c1097;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1097 c1097 = this.f3651;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1097.getClass();
        return new C1105(c1097, chartboostDelegate, c0683);
    }
}
