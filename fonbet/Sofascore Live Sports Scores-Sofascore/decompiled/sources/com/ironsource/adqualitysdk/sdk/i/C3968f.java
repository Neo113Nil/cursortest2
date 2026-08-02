package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3968f implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3971i f138;

    public C3968f(C3971i c3971i) {
        this.f138 = c3971i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3971i c3971i = this.f138;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c3971i.getClass();
        return advertisement.getAdMarketId();
    }
}
