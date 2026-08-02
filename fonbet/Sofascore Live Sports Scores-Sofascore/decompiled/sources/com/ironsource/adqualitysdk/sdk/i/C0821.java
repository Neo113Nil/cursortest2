package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴷ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0821 implements InterfaceC0818 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0643 f2628;

    public C0821(C0643 c0643) {
        this.f2628 = c0643;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0818
    /* renamed from: ﾒ */
    public final void mo394() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f2628.f2178);
            this.f2628.f2178.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
