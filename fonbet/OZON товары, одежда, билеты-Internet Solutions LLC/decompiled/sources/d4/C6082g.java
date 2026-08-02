package d4;

import m3.C8050C;
import m3.C8056I;

/* renamed from: d4.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6082g extends AbstractC6077b {

    /* renamed from: a, reason: collision with root package name */
    public final long f61139a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61140b;

    private C6082g(long j11, long j12) {
        this.f61139a = j11;
        this.f61140b = j12;
    }

    static C6082g d(C8050C c8050c, long j11, C8056I c8056i) {
        long e11 = e(j11, c8050c);
        return new C6082g(e11, c8056i.b(e11));
    }

    static long e(long j11, C8050C c8050c) {
        long E11 = c8050c.E();
        if ((128 & E11) != 0) {
            return 8589934591L & ((((E11 & 1) << 32) | c8050c.G()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // d4.AbstractC6077b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f61139a);
        sb2.append(", playbackPositionUs= ");
        return P4.f.a(this.f61140b, " }", sb2);
    }
}
