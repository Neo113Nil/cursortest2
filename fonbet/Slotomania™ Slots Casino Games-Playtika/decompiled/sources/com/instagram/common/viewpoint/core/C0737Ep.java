package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0737Ep extends AbstractRunnableC1182Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0732Ek A02;

    public C0737Ep(C0732Ek c0732Ek, int i, int i2) {
        this.A02 = c0732Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C0720Dy(this.A00, this.A01));
    }
}
