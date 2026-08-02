package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.υ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0360 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f902;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1024 f903;

    public C0360(C0346 c0346, C1024 c1024) {
        this.f902 = c0346;
        this.f903 = c1024;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        C0346 c0346 = this.f902;
        synchronized (c0346) {
            z = c0346.f851;
        }
        if (z) {
            this.f903.mo394();
        } else {
            this.f902.f854.add(this.f903);
        }
    }
}
