package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ヶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0988 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0987 f3222;

    public C0988(C0987 c0987) {
        this.f3222 = c0987;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        ArrayList arrayList = new ArrayList(this.f3222.f3219.values());
        this.f3222.f3219.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3963a) it.next()).m80();
        }
    }
}
