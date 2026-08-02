package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔬ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0732 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0635 f2441;

    public C0732(C0635 c0635) {
        this.f2441 = c0635;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0635 c0635 = this.f2441;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) arrayList.get(0);
        c0635.getClass();
        return appLovinNativeAdImpl.getIconUri();
    }
}
