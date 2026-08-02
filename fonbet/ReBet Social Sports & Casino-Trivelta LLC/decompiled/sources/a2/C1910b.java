package a2;

import H1.E;
import H1.J;
import e1.Z;
import java.math.RoundingMode;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910b implements InterfaceC1915g {

    /* renamed from: a, reason: collision with root package name */
    public final long f14989a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14990b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14991c;

    /* renamed from: d, reason: collision with root package name */
    public final E f14992d;

    public C1910b(long j10, long j11, long j12) {
        this.f14992d = new E(new long[]{j11}, new long[]{0}, j10);
        this.f14989a = j11;
        this.f14990b = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f14991c = -2147483647;
            return;
        }
        long s12 = Z.s1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (s12 > 0 && s12 <= 2147483647L) {
            i10 = (int) s12;
        }
        this.f14991c = i10;
    }

    public boolean a(long j10) {
        return this.f14992d.c(j10, 100000L);
    }

    @Override // a2.InterfaceC1915g
    public long b(long j10) {
        return this.f14992d.b(j10);
    }

    public void c(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f14992d.a(j10, j11);
    }

    @Override // a2.InterfaceC1915g
    public long d() {
        return this.f14989a;
    }

    @Override // H1.J
    public J.a e(long j10) {
        return this.f14992d.e(j10);
    }

    public void f(long j10) {
        this.f14992d.f(j10);
    }

    @Override // a2.InterfaceC1915g
    public long h() {
        return this.f14990b;
    }

    @Override // H1.J
    public boolean i() {
        return this.f14992d.i();
    }

    @Override // a2.InterfaceC1915g
    public int l() {
        return this.f14991c;
    }

    @Override // H1.J
    public long m() {
        return this.f14992d.m();
    }
}
