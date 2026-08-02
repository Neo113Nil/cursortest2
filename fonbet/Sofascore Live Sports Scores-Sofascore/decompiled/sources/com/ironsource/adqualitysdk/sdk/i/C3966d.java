package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3966d implements InterfaceC0435 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C3971i f134;

    public C3966d(C3971i c3971i) {
        this.f134 = c3971i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0435
    /* renamed from: ﾒ */
    public final Object mo114(ArrayList arrayList, C0683 c0683) {
        C3971i c3971i = this.f134;
        Repository repository = (Repository) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c3971i.getClass();
        return (Placement) repository.load(str, Placement.class).get();
    }
}
