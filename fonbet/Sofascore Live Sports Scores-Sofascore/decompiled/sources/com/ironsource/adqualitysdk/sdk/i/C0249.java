package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementVideoListener;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ǃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0249 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1195 f460;

    public C0249(C1195 c1195) {
        this.f460 = c1195;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1195 c1195 = this.f460;
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        TJPlacementVideoListener tJPlacementVideoListener = (TJPlacementVideoListener) arrayList.get(1);
        c1195.getClass();
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        return null;
    }
}
