package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3969g implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3971i f140;

    public C3969g(C3971i c3971i) {
        this.f140 = c3971i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3971i c3971i = this.f140;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c3971i.getClass();
        return advertisement.getCampaign();
    }
}
