package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0724Ec implements Comparable<C0724Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0724Ec(C2255qI c2255qI, int i) {
        this.A00 = (c2255qI.A0H & 1) != 0;
        this.A01 = C06129h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0724Ec c0724Ec) {
        return AbstractC2107ns.A01().A09(this.A01, c0724Ec.A01).A09(this.A00, c0724Ec.A00).A05();
    }
}
