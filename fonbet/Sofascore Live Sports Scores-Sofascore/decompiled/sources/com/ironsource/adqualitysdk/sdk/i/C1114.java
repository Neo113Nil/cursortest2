package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1114 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3501;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Y f3502;

    public C1114(C1064 c1064, Y y) {
        this.f3501 = c1064;
        this.f3502 = y;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        Iterator it = this.f3501.f3362.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                AbstractC1008.m610(new C1130(this, view));
            }
        }
    }
}
