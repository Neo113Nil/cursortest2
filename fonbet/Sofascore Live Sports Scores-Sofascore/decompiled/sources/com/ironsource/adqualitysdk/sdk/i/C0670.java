package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0670 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f2278;

    public C0670(C0558 c0558) {
        this.f2278 = c0558;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0558 c0558 = this.f2278;
        Iterator it = (c0558.f1840 != null ? new ArrayList(c0558.f1840) : new ArrayList()).iterator();
        while (it.hasNext()) {
            ((C0845) it.next()).m511();
        }
        List m358 = C0558.m358(this.f2278);
        if (m358 != null) {
            ((ArrayList) m358).clear();
        }
        this.f2278.f1840 = null;
        this.f2278.f1835 = null;
    }
}
