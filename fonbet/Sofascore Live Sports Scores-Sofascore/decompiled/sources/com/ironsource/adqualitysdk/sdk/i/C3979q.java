package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.Placement;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3979q implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3981t f228;

    public C3979q(C3981t c3981t) {
        this.f228 = c3981t;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3981t c3981t = this.f228;
        Placement placement = (Placement) arrayList.get(0);
        c3981t.getClass();
        return placement.getReferenceId();
    }
}
