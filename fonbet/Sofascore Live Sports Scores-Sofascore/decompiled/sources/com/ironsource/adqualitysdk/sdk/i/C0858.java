package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵝ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0858 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0856 f2876;

    public C0858(C0856 c0856) {
        this.f2876 = c0856;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0358 c0358 = this.f2876.f2873.f2793.f2589;
        String decrypt = StringFog.decrypt("5UhAgtYaluvwUHKAnRI=\n", "gyQh5fh8/5k=\n");
        C0867 c0867 = new C0867(this);
        c0358.getClass();
        C0358.m206().post(new C0399(c0358, decrypt, c0867));
    }
}
