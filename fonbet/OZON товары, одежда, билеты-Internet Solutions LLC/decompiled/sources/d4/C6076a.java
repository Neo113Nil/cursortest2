package d4;

import m3.C8050C;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6076a extends AbstractC6077b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61129a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61130b;

    private C6076a(long j11, long j12) {
        this.f61129a = j12;
        this.f61130b = j11;
    }

    static C6076a d(C8050C c8050c, int i11, long j11) {
        long G11 = c8050c.G();
        int i12 = i11 - 4;
        c8050c.n(0, i12, new byte[i12]);
        return new C6076a(G11, j11);
    }

    @Override // d4.AbstractC6077b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f61129a);
        sb2.append(", identifier= ");
        return P4.f.a(this.f61130b, " }", sb2);
    }
}
