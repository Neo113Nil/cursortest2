package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘤ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0782 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0708 f2522;

    public C0782(C0708 c0708) {
        this.f2522 = c0708;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0708 c0708 = this.f2522;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) arrayList.get(1);
        c0708.getClass();
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        return null;
    }
}
