package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﬤ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1010 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3254;

    public C1010(C0987 c0987) {
        this.f3254 = c0987;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        ArrayList arrayList = new ArrayList(this.f3254.f3221.values());
        this.f3254.f3221.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1027 c1027 = (C1027) it.next();
            c1027.f3217 = null;
            c1027.f3284 = null;
            AbstractC0430 m262 = AbstractC0430.m262();
            synchronized (m262) {
                m262.f1224.remove(c1027);
            }
        }
    }
}
