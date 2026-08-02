package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0627 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0322 f2062;

    public C0627(C0322 c0322) {
        this.f2062 = c0322;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0322 c0322 = this.f2062;
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        c0322.getClass();
        UnityAds.addListener(iUnityAdsListener);
        return null;
    }
}
