package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15016l implements Comparable<C15016l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C15197d A03;

    public C15016l(C15197d c15197d) {
        this.A03 = c15197d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C15016l c15016l) {
        if ((this.A02 == null) != (c15016l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i = this.A00 - c15016l.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c15016l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
