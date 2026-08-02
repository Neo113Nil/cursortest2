package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC05265t A02;
    public InterfaceC1926kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C05215o A07 = new C05215o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC05265t interfaceC05265t) {
        this.A02 = interfaceC05265t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C04171k A5I() {
        C04171k c04171k = new C04171k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c04171k.A43(this.A02);
        }
        return c04171k;
    }
}
