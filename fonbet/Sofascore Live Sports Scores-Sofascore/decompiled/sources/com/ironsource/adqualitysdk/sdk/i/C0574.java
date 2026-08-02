package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.บ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0574 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1868;

    public C0574(C0470 c0470) {
        this.f1868 = c0470;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0470 c0470 = this.f1868;
        if (c0470.f1520 == null) {
            c0470.f1520 = new C0596(this);
            c0470.f1522.post(new C0579(this));
        }
    }
}
