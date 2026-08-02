package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.internal.adapters.AdAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1191 implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1181 f3772;

    public C1191(C1181 c1181) {
        this.f3772 = c1181;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C1181 c1181 = this.f3772;
        AdAdapter adAdapter = (AdAdapter) arrayList.get(0);
        c1181.getClass();
        return adAdapter.getPlacementType();
    }
}
