package net.time4j.calendar;

import li.AbstractC5469c;
import mi.d;
import mi.f;
import mi.n;
import net.time4j.A;
import net.time4j.F;
import net.time4j.calendar.astro.c;
import net.time4j.tz.p;
import oi.EnumC5900A;
import oi.InterfaceC5915k;

/* loaded from: classes5.dex */
public abstract class b implements InterfaceC5915k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f57787a = F.B0(1645, 1, 28).b();

    /* renamed from: b, reason: collision with root package name */
    public static final long f57788b = F.B0(3000, 1, 27).b();

    /* renamed from: c, reason: collision with root package name */
    public static final long f57789c = F.B0(-2636, 2, 15).b();

    public static long m(long j10, long j11) {
        return Math.round((j11 - j10) / 29.530588861d);
    }

    @Override // oi.InterfaceC5915k
    public final long a() {
        return f57788b;
    }

    @Override // oi.InterfaceC5915k
    public long d() {
        return f57787a;
    }

    public abstract d e(int i10, int i11, f fVar, int i12, long j10);

    public final long f(int i10, int i11, f fVar) {
        long p10 = p(q(i10, i11) + ((fVar.getNumber() - 1) * 29));
        return fVar.equals(b(p10).V()) ? p10 : p(p10 + 1);
    }

    public final int g(int i10, int i11) {
        int[] h10 = h();
        int i12 = (((i10 - 1) * 60) + i11) - 1;
        int i13 = ((i12 - h10[0]) / 3) * 2;
        while (true) {
            if (i13 >= h10.length) {
                break;
            }
            int i14 = h10[i13];
            if (i14 < i12) {
                i13 += Math.max(((i12 - i14) / 3) * 2, 2);
            } else if (i14 <= i12) {
                return h10[i13 + 1];
            }
        }
        return 0;
    }

    public abstract int[] h();

    public abstract p i(long j10);

    public final boolean j(long j10, long j11) {
        if (j11 >= j10) {
            return k(j11) || j(j10, o(j11));
        }
        return false;
    }

    public final boolean k(long j10) {
        return (((int) Math.floor(n.l(c.g(n(j10)).c()) / 30.0d)) + 2) % 12 == (((int) Math.floor(n.l(c.g(n(p(j10 + 1))).c()) / 30.0d)) + 2) % 12;
    }

    public boolean l(int i10, int i11, f fVar, int i12) {
        if (i10 < 72 || i10 > 94 || i11 < 1 || i11 > 60 || ((i10 == 72 && i11 < 22) || ((i10 == 94 && i11 > 56) || i12 < 1 || i12 > 30 || fVar == null || (fVar.c() && fVar.getNumber() != g(i10, i11))))) {
            return false;
        }
        if (i12 != 30) {
            return true;
        }
        long f10 = f(i10, i11, fVar);
        return p(1 + f10) - f10 == 30;
    }

    public A n(long j10) {
        return F.G0(j10, EnumC5900A.UTC).j0().K(i(j10));
    }

    public final long o(long j10) {
        return net.time4j.calendar.astro.d.NEW_MOON.c(n(j10)).n0(i(j10)).Z().b();
    }

    public final long p(long j10) {
        return net.time4j.calendar.astro.d.NEW_MOON.b(n(j10)).n0(i(j10)).Z().b();
    }

    public final long q(int i10, int i11) {
        return s((long) Math.floor(f57789c + (((((i10 - 1) * 60) + i11) - 0.5d) * 365.242189d)));
    }

    public final long r(long j10) {
        long w10 = w(j10);
        long w11 = w(370 + w10);
        long p10 = p(w10 + 1);
        long p11 = p(p10 + 1);
        return (m(p10, o(w11 + 1)) == 12 && (k(p10) || k(p11))) ? p(p11 + 1) : p11;
    }

    public final long s(long j10) {
        long r10 = r(j10);
        return j10 >= r10 ? r10 : r(j10 - 180);
    }

    public final long t(int i10, int i11, f fVar, int i12) {
        if (l(i10, i11, fVar, i12)) {
            return (f(i10, i11, fVar) + i12) - 1;
        }
        throw new IllegalArgumentException("Invalid date.");
    }

    @Override // oi.InterfaceC5915k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final long c(d dVar) {
        return t(dVar.P(), dVar.Z().getNumber(), dVar.V(), dVar.p());
    }

    @Override // oi.InterfaceC5915k
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final d b(long j10) {
        long w10 = w(j10);
        long w11 = w(370 + w10);
        long p10 = p(w10 + 1);
        long o10 = o(w11 + 1);
        long o11 = o(j10 + 1);
        boolean z10 = m(p10, o10) == 12;
        long m10 = m(p10, o11);
        if (z10 && j(p10, o11)) {
            m10--;
        }
        int d10 = AbstractC5469c.d(m10, 12);
        int i10 = d10 != 0 ? d10 : 12;
        long floor = (long) Math.floor((1.5d - (i10 / 12.0d)) + ((j10 - f57789c) / 365.242189d));
        int b10 = ((int) AbstractC5469c.b(floor - 1, 60)) + 1;
        int d11 = AbstractC5469c.d(floor, 60);
        int i11 = d11 != 0 ? d11 : 60;
        int i12 = (int) ((j10 - o11) + 1);
        f d12 = f.d(i10);
        if (z10 && k(o11) && !j(p10, o(o11))) {
            d12 = d12.e();
        }
        return e(b10, i11, d12, i12, j10);
    }

    public final long w(long j10) {
        p i10 = i(j10);
        F G02 = F.G0(j10, EnumC5900A.UTC);
        int n10 = (G02.o() <= 11 || G02.p() <= 15) ? G02.n() - 1 : G02.n();
        net.time4j.calendar.astro.b bVar = net.time4j.calendar.astro.b.WINTER_SOLSTICE;
        F P10 = bVar.c(n10).n0(i10).P();
        if (P10.J(G02)) {
            P10 = bVar.c(n10 - 1).n0(i10).P();
        }
        return P10.b();
    }
}
