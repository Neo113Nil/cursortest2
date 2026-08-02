package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Т, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0382 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0346 f1123;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0818 f1124;

    public C0382(C0346 c0346, InterfaceC0818 interfaceC0818) {
        this.f1123 = c0346;
        this.f1124 = interfaceC0818;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        this.f1123.f853.add(this.f1124);
        C0346 c0346 = this.f1123;
        synchronized (c0346) {
            z = c0346.f851;
        }
        if (z) {
            this.f1124.mo394();
        }
    }
}
