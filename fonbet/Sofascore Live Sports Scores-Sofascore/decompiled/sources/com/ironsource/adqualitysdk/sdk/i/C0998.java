package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.乁, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0998 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3236;

    public C0998(C0987 c0987) {
        this.f3236 = c0987;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        ArrayList arrayList = new ArrayList(this.f3236.f3220.values());
        this.f3236.f3220.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            a0Var.f3217 = null;
            C1064.m629().m630(a0Var);
        }
    }
}
