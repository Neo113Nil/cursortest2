package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1051 implements InterfaceC0818 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0898 f3338;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f3339;

    public C1051(C0898 c0898, String str) {
        this.f3338 = c0898;
        this.f3339 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0818
    /* renamed from: ﾒ */
    public final void mo394() {
        C0909 c0909;
        AbstractC0274 m142 = AbstractC0274.m142();
        String decrypt = StringFog.decrypt("B8m6fYe9\n", "dKbVEOvc78Q=\n");
        String str = this.f3339;
        C0346 c0346 = (C0346) m142;
        if (decrypt != null) {
            c0909 = (C0909) c0346.mo152().get(decrypt);
        } else {
            c0346.getClass();
            c0909 = null;
        }
        if (c0909 == null || !c0909.m532(str)) {
            return;
        }
        C0808 c0808 = this.f3338.f3011;
        String str2 = C0808.f2584;
        c0808.m493(true);
    }
}
