package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0817 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0808 f2625;

    public C0817(C0808 c0808) {
        this.f2625 = c0808;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        Iterator it = this.f2625.f2587.iterator();
        while (it.hasNext()) {
            ISAdQualityInitListener iSAdQualityInitListener = (ISAdQualityInitListener) it.next();
            if (iSAdQualityInitListener != null) {
                iSAdQualityInitListener.adQualitySdkInitSuccess();
            }
        }
        this.f2625.f2587.clear();
    }
}
