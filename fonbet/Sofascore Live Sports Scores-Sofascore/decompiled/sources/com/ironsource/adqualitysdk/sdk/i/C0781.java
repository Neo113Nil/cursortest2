package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0781 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0635 f2521;

    public C0781(C0635 c0635) {
        this.f2521 = c0635;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0635 c0635 = this.f2521;
        boolean z = false;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0635.getClass();
        if (appLovinAd != null && (appLovinAd.getSize() == AppLovinAdSize.BANNER || appLovinAd.getSize() == AppLovinAdSize.LEADER || appLovinAd.getSize() == AppLovinAdSize.MREC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
