package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｮ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1159 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1097 f3648;

    public C1159(C1097 c1097) {
        this.f3648 = c1097;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1097 c1097 = this.f3648;
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        c1097.getClass();
        Chartboost.setDelegate(chartboostDelegate);
        return null;
    }
}
