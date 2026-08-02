package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕪ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0751 implements InterfaceC0795 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0684 f2478;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0699 f2479;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0473 f2480;

    public C0751(C0684 c0684, AbstractC0473 abstractC0473, InterfaceC0699 interfaceC0699) {
        this.f2478 = c0684;
        this.f2480 = abstractC0473;
        this.f2479 = interfaceC0699;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0795
    /* renamed from: ﾒ */
    public final void mo230() {
        C0331 c0331 = this.f2478.f2326.f2180.f1142;
        synchronized (c0331) {
            c0331.f812.remove(this);
        }
        this.f2478.f2326.m385(this.f2480, this.f2479);
    }
}
