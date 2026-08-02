package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0373 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0338 f1114;

    public C0373(C0338 c0338) {
        this.f1114 = c0338;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        HashSet hashSet;
        C0331.m186(this.f1114.f830, true);
        C0331 c0331 = this.f1114.f830;
        synchronized (c0331) {
            hashSet = new HashSet(c0331.f812);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0795) it.next()).mo230();
        }
    }
}
