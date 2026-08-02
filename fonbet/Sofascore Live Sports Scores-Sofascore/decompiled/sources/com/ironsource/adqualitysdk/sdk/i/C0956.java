package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅈ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0956 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0891 f3172;

    public C0956(C0891 c0891) {
        this.f3172 = c0891;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C0891 c0891 = this.f3172;
        Constants.AdType adType = (Constants.AdType) arrayList.get(0);
        c0891.getClass();
        return adType.getPlacementType();
    }
}
