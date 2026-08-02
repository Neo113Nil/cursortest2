package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0671 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0635 f2279;

    public C0671(C0635 c0635) {
        this.f2279 = c0635;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0635 c0635 = this.f2279;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0635.getClass();
        return Long.valueOf(appLovinAd.getAdIdNumber());
    }
}
