package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ị, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0907 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f3032;

    public C0907(C0833 c0833) {
        this.f3032 = c0833;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0833 c0833 = this.f3032;
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(1);
        c0833.getClass();
        videoAd.setAdListener(videoAdListener);
        return null;
    }
}
