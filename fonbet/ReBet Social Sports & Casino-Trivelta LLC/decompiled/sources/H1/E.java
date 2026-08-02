package H1;

import H1.J;
import e1.AbstractC4134a;
import e1.C4157y;
import e1.Z;

/* loaded from: classes.dex */
public final class E implements J {

    /* renamed from: a, reason: collision with root package name */
    public final C4157y f4323a;

    /* renamed from: b, reason: collision with root package name */
    public final C4157y f4324b;

    /* renamed from: c, reason: collision with root package name */
    public long f4325c;

    public E(long[] jArr, long[] jArr2, long j10) {
        AbstractC4134a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f4323a = new C4157y(length);
            this.f4324b = new C4157y(length);
        } else {
            int i10 = length + 1;
            C4157y c4157y = new C4157y(i10);
            this.f4323a = c4157y;
            C4157y c4157y2 = new C4157y(i10);
            this.f4324b = c4157y2;
            c4157y.a(0L);
            c4157y2.a(0L);
        }
        this.f4323a.b(jArr);
        this.f4324b.b(jArr2);
        this.f4325c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f4324b.d() == 0 && j10 > 0) {
            this.f4323a.a(0L);
            this.f4324b.a(0L);
        }
        this.f4323a.a(j11);
        this.f4324b.a(j10);
    }

    public long b(long j10) {
        if (this.f4324b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f4324b.c(Z.e(this.f4323a, j10, true, true));
    }

    public boolean c(long j10, long j11) {
        if (this.f4324b.d() == 0) {
            return false;
        }
        C4157y c4157y = this.f4324b;
        return j10 - c4157y.c(c4157y.d() - 1) < j11;
    }

    @Override // H1.J
    public J.a e(long j10) {
        if (this.f4324b.d() == 0) {
            return new J.a(K.f4338c);
        }
        int e10 = Z.e(this.f4324b, j10, true, true);
        K k10 = new K(this.f4324b.c(e10), this.f4323a.c(e10));
        if (k10.f4339a == j10 || e10 == this.f4324b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = e10 + 1;
        return new J.a(k10, new K(this.f4324b.c(i10), this.f4323a.c(i10)));
    }

    public void f(long j10) {
        this.f4325c = j10;
    }

    @Override // H1.J
    public boolean i() {
        return this.f4324b.d() > 0;
    }

    @Override // H1.J
    public long m() {
        return this.f4325c;
    }
}
