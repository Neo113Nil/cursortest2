package H1;

import H1.J;
import H1.y;
import e1.AbstractC4134a;
import e1.Z;

/* loaded from: classes.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    public final y f4481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4482b;

    public x(y yVar, long j10) {
        this.f4481a = yVar;
        this.f4482b = j10;
    }

    public final K a(long j10, long j11) {
        return new K((j10 * 1000000) / this.f4481a.f4487e, this.f4482b + j11);
    }

    @Override // H1.J
    public J.a e(long j10) {
        AbstractC4134a.i(this.f4481a.f4493k);
        y yVar = this.f4481a;
        y.a aVar = yVar.f4493k;
        long[] jArr = aVar.pointSampleNumbers;
        long[] jArr2 = aVar.pointOffsets;
        int h10 = Z.h(jArr, yVar.i(j10), true, false);
        K a10 = a(h10 == -1 ? 0L : jArr[h10], h10 != -1 ? jArr2[h10] : 0L);
        if (a10.f4339a == j10 || h10 == jArr.length - 1) {
            return new J.a(a10);
        }
        int i10 = h10 + 1;
        return new J.a(a10, a(jArr[i10], jArr2[i10]));
    }

    @Override // H1.J
    public boolean i() {
        return true;
    }

    @Override // H1.J
    public long m() {
        return this.f4481a.f();
    }
}
