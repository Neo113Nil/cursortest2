package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1843Kk implements Comparable<C1843Kk> {
    public final int A00;
    public final C1834Kb A01;

    public C1843Kk(int i, C1834Kb c1834Kb) {
        this.A00 = i;
        this.A01 = c1834Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1843Kk c1843Kk) {
        return Integer.compare(this.A00, c1843Kk.A00);
    }
}
