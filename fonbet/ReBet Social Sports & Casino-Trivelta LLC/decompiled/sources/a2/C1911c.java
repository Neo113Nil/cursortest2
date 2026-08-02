package a2;

import H1.J;
import H1.K;
import V1.l;
import android.util.Pair;
import e1.Z;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911c implements InterfaceC1915g {

    /* renamed from: a, reason: collision with root package name */
    public final long f14993a;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    public C1911c(long[] jArr, long[] jArr2, long j10) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.f14993a = j10 == -9223372036854775807L ? Z.a1(jArr2[jArr2.length - 1]) : j10;
    }

    public static C1911c a(long j10, l lVar, long j11) {
        int length = lVar.bytesDeviations.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += lVar.f12359c + lVar.bytesDeviations[i12];
            j12 += lVar.f12360d + lVar.millisecondsDeviations[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C1911c(jArr, jArr2, j11);
    }

    public static Pair c(long j10, long[] jArr, long[] jArr2) {
        int h10 = Z.h(jArr, j10, true, true);
        long j11 = jArr[h10];
        long j12 = jArr2[h10];
        int i10 = h10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // a2.InterfaceC1915g
    public long b(long j10) {
        return Z.a1(((Long) c(j10, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // a2.InterfaceC1915g
    public long d() {
        return 0L;
    }

    @Override // H1.J
    public J.a e(long j10) {
        Pair c10 = c(Z.J1(Z.p(j10, 0L, this.f14993a)), this.referenceTimesMs, this.referencePositions);
        return new J.a(new K(Z.a1(((Long) c10.first).longValue()), ((Long) c10.second).longValue()));
    }

    @Override // a2.InterfaceC1915g
    public long h() {
        return -1L;
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // a2.InterfaceC1915g
    public int l() {
        return -2147483647;
    }

    @Override // H1.J
    public long m() {
        return this.f14993a;
    }
}
