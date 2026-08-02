package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ა, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0599 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0530 f1970;

    public C0599(C0530 c0530) {
        this.f1970 = c0530;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0530 c0530 = this.f1970;
        MaioAdsListenerInterface maioAdsListenerInterface = (MaioAdsListenerInterface) arrayList.get(0);
        c0530.getClass();
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        return null;
    }
}
