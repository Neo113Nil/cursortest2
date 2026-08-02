package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1170 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1160 f3659;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3660;

    public C1170(C1160 c1160, ArrayList arrayList) {
        this.f3659 = c1160;
        this.f3660 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        ArrayList m90 = AbstractC3964b.m90(this.f3659.f3649.f3362, this.f3660);
        Iterator it = this.f3660.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Iterator it2 = this.f3659.f3649.f3362.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() == view) {
                        break;
                    }
                } else {
                    this.f3659.f3649.f3362.add(new WeakReference(view));
                    AbstractC1008.m610(new C1175(this, view));
                    break;
                }
            }
        }
        for (int i = 0; i < m90.size(); i++) {
            AbstractC1008.m610(new C1172(this, (View) m90.get(i)));
        }
    }
}
