package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ย, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0579 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0574 f1873;

    public C0579(C0574 c0574) {
        this.f1873 = c0574;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        AbstractC0430 m262 = AbstractC0430.m262();
        C0596 c0596 = this.f1873.f1868.f1520;
        synchronized (m262) {
            m262.f1224.add(c0596);
        }
        AbstractC1008.m611(new C0586(this));
    }
}
