package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC14835t A02;
    public InterfaceC2883kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C14785o A07 = new C14785o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC14835t interfaceC14835t) {
        this.A02 = interfaceC14835t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C13741k A5I() {
        C13741k c13741k = new C13741k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c13741k.A43(this.A02);
        }
        return c13741k;
    }
}
