package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.adview.AdViewController;
import com.applovin.sdk.AppLovinAdDisplayListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒸ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0675 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0635 f2285;

    public C0675(C0635 c0635) {
        this.f2285 = c0635;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0635 c0635 = this.f2285;
        AdViewController adViewController = (AdViewController) arrayList.get(0);
        AppLovinAdDisplayListener appLovinAdDisplayListener = (AppLovinAdDisplayListener) arrayList.get(1);
        c0635.getClass();
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        return null;
    }
}
