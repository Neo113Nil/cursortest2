package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.о, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0390 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f1139;

    public C0390(C0346 c0346) {
        this.f1139 = c0346;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0346 c0346 = this.f1139;
        synchronized (c0346) {
            c0346.f851 = true;
        }
        C1051 c1051 = this.f1139.f855;
        if (c1051 != null) {
            c1051.mo394();
        }
        Iterator it = new ArrayList(this.f1139.f854).iterator();
        while (it.hasNext()) {
            ((InterfaceC0818) it.next()).mo394();
        }
        this.f1139.f854.clear();
        Iterator it2 = new ArrayList(this.f1139.f853).iterator();
        while (it2.hasNext()) {
            ((InterfaceC0818) it2.next()).mo394();
        }
    }
}
