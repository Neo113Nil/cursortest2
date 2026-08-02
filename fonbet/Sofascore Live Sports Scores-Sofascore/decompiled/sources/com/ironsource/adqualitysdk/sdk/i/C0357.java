package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ο, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0357 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f898;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1051 f899;

    public C0357(C0346 c0346, C1051 c1051) {
        this.f898 = c0346;
        this.f899 = c1051;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        C0346 c0346 = this.f898;
        c0346.f855 = this.f899;
        synchronized (c0346) {
            z = c0346.f851;
        }
        if (z) {
            this.f899.mo394();
        }
    }
}
