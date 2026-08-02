package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮈ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1056 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0891 f3345;

    public C1056(C0891 c0891) {
        this.f3345 = c0891;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0891 c0891 = this.f3345;
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(0);
        c0891.getClass();
        Interstitial.setInterstitialListener(interstitialListener);
        return null;
    }
}
