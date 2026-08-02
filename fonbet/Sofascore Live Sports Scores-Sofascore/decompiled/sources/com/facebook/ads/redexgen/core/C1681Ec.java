package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1681Ec implements Comparable<C1681Ec> {
    public final boolean A00;
    public final boolean A01;

    public C1681Ec(C3212qI c3212qI, int i) {
        this.A00 = (c3212qI.A0H & 1) != 0;
        this.A01 = C15699h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1681Ec c1681Ec) {
        return AbstractC3064ns.A01().A09(this.A01, c1681Ec.A01).A09(this.A00, c1681Ec.A00).A05();
    }
}
