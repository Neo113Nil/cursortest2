package g4;

import N3.H;
import N3.I;
import android.util.Pair;
import b4.C5535k;
import m3.N;

/* renamed from: g4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6621c implements InterfaceC6623e {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f63755a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f63756b;

    /* renamed from: c, reason: collision with root package name */
    private final long f63757c;

    private C6621c(long j11, long[] jArr, long[] jArr2) {
        this.f63755a = jArr;
        this.f63756b = jArr2;
        this.f63757c = j11 == -9223372036854775807L ? N.Q(jArr2[jArr2.length - 1]) : j11;
    }

    public static C6621c a(long j11, C5535k c5535k, long j12) {
        int length = c5535k.f55520e.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += c5535k.f55518c + c5535k.f55520e[i13];
            j13 += c5535k.f55519d + c5535k.f55521f[i13];
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new C6621c(j12, jArr, jArr2);
    }

    private static Pair<Long, Long> b(long j11, long[] jArr, long[] jArr2) {
        int e11 = N.e(jArr, j11, true);
        long j12 = jArr[e11];
        long j13 = jArr2[e11];
        int i11 = e11 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((jArr[i11] == j12 ? 0.0d : (j11 - j12) / (r6 - j12)) * (jArr2[i11] - j13))) + j13));
    }

    @Override // g4.InterfaceC6623e
    public final long g() {
        return -1L;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f63757c;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        Pair<Long, Long> b11 = b(N.g0(N.j(j11, 0L, this.f63757c)), this.f63756b, this.f63755a);
        I i11 = new I(N.Q(((Long) b11.first).longValue()), ((Long) b11.second).longValue());
        return new H.a(i11, i11);
    }

    @Override // g4.InterfaceC6623e
    public final long h(long j11) {
        return N.Q(((Long) b(j11, this.f63755a, this.f63756b).second).longValue());
    }

    @Override // g4.InterfaceC6623e
    public final int i() {
        return -2147483647;
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }
}
