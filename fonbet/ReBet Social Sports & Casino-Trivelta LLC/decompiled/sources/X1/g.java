package X1;

import e1.J;
import e1.Q;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13417b;

    public g(long j10, long j11) {
        this.f13416a = j10;
        this.f13417b = j11;
    }

    public static g d(J j10, long j11, Q q10) {
        long e10 = e(j10, j11);
        return new g(e10, q10.b(e10));
    }

    public static long e(J j10, long j11) {
        long M10 = j10.M();
        if ((128 & M10) != 0) {
            return 8589934591L & ((((M10 & 1) << 32) | j10.O()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // X1.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f13416a + ", playbackPositionUs= " + this.f13417b + " }";
    }
}
