package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1826Jt implements InterfaceC2330bU {
    public final /* synthetic */ C1815Ji A00;

    public C1826Jt(C1815Ji c1815Ji) {
        this.A00 = c1815Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2330bU
    public final void ADY() {
        VI vi;
        AbstractC1904Mt abstractC1904Mt;
        C2369c7 c2369c7;
        C2329bT c2329bT;
        C2329bT c2329bT2;
        C2369c7 c2369c72;
        AbstractC1904Mt abstractC1904Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC1904Mt = this.A00.A0W;
        if (abstractC1904Mt != null) {
            C1815Ji c1815Ji = this.A00;
            abstractC1904Mt2 = this.A00.A0W;
            c1815Ji.A0m(((AnonymousClass85) abstractC1904Mt2).A0M().toString());
        }
        c2369c7 = this.A00.A0b;
        if (c2369c7.A0D() != null) {
            c2369c72 = this.A00.A0b;
            c2369c72.A0D().ACQ();
        }
        c2329bT = this.A00.A09;
        if (c2329bT != null) {
            c2329bT2 = this.A00.A09;
            c2329bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
