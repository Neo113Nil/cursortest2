package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0869Jt implements InterfaceC1373bU {
    public final /* synthetic */ C0858Ji A00;

    public C0869Jt(C0858Ji c0858Ji) {
        this.A00 = c0858Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1373bU
    public final void ADY() {
        VI vi;
        AbstractC0947Mt abstractC0947Mt;
        C1412c7 c1412c7;
        C1372bT c1372bT;
        C1372bT c1372bT2;
        C1412c7 c1412c72;
        AbstractC0947Mt abstractC0947Mt2;
        vi = this.A00.A0Y;
        vi.A04(VH.A0J, null);
        abstractC0947Mt = this.A00.A0W;
        if (abstractC0947Mt != null) {
            C0858Ji c0858Ji = this.A00;
            abstractC0947Mt2 = this.A00.A0W;
            c0858Ji.A0m(((AnonymousClass85) abstractC0947Mt2).A0M().toString());
        }
        c1412c7 = this.A00.A0b;
        if (c1412c7.A0D() != null) {
            c1412c72 = this.A00.A0b;
            c1412c72.A0D().ACQ();
        }
        c1372bT = this.A00.A09;
        if (c1372bT != null) {
            c1372bT2 = this.A00.A09;
            c1372bT2.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
