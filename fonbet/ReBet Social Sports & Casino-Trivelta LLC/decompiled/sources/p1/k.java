package p1;

import e1.Z;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final i f62960a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62961b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62962c;

    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f62963d;

        /* renamed from: e, reason: collision with root package name */
        public final long f62964e;

        /* renamed from: f, reason: collision with root package name */
        public final List f62965f;

        /* renamed from: g, reason: collision with root package name */
        public final long f62966g;

        /* renamed from: h, reason: collision with root package name */
        public final long f62967h;

        /* renamed from: i, reason: collision with root package name */
        public final long f62968i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f62963d = j12;
            this.f62964e = j13;
            this.f62965f = list;
            this.f62968i = j14;
            this.f62966g = j15;
            this.f62967h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f62967h) + this.f62968i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f62966g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f62967h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f62963d;
        }

        public long f(long j10, long j11) {
            if (this.f62965f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f62968i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f62965f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f62963d))).f62974b * 1000000) / this.f62961b;
            }
            long g10 = g(j11);
            return (g10 == -1 || j10 != (e() + g10) - 1) ? (this.f62964e * 1000000) / this.f62961b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 != 0) {
                if (this.f62965f != null) {
                    long j12 = (g10 + e10) - 1;
                    long j13 = e10;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == e10 ? j13 : j12;
                }
                long j16 = this.f62963d + (j10 / ((this.f62964e * 1000000) / this.f62961b));
                if (j16 >= e10) {
                    return g10 == -1 ? j16 : Math.min(j16, (e10 + g10) - 1);
                }
            }
            return e10;
        }

        public final long j(long j10) {
            List list = this.f62965f;
            return Z.p1(list != null ? ((d) list.get((int) (j10 - this.f62963d))).f62973a - this.f62962c : (j10 - this.f62963d) * this.f62964e, 1000000L, this.f62961b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f62965f != null;
        }
    }

    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List f62969j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f62969j = list2;
        }

        @Override // p1.k.a
        public long g(long j10) {
            return this.f62969j.size();
        }

        @Override // p1.k.a
        public i k(j jVar, long j10) {
            return (i) this.f62969j.get((int) (j10 - this.f62963d));
        }

        @Override // p1.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final n f62970j;

        /* renamed from: k, reason: collision with root package name */
        public final n f62971k;

        /* renamed from: l, reason: collision with root package name */
        public final long f62972l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f62970j = nVar;
            this.f62971k = nVar2;
            this.f62972l = j13;
        }

        @Override // p1.k
        public i a(j jVar) {
            n nVar = this.f62970j;
            if (nVar == null) {
                return super.a(jVar);
            }
            androidx.media3.common.a aVar = jVar.f62947b;
            return new i(nVar.a(aVar.f20529a, 0L, aVar.f20538j, 0L), 0L, -1L);
        }

        @Override // p1.k.a
        public long g(long j10) {
            if (this.f62965f != null) {
                return r0.size();
            }
            long j11 = this.f62972l;
            if (j11 != -1) {
                return (j11 - this.f62963d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return com.google.common.math.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f62961b)), BigInteger.valueOf(this.f62964e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p1.k.a
        public i k(j jVar, long j10) {
            List list = this.f62965f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f62963d))).f62973a : (j10 - this.f62963d) * this.f62964e;
            n nVar = this.f62971k;
            androidx.media3.common.a aVar = jVar.f62947b;
            return new i(nVar.a(aVar.f20529a, j10, aVar.f20538j, j11), 0L, -1L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f62973a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62974b;

        public d(long j10, long j11) {
            this.f62973a = j10;
            this.f62974b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f62973a == dVar.f62973a && this.f62974b == dVar.f62974b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f62973a) * 31) + ((int) this.f62974b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f62960a = iVar;
        this.f62961b = j10;
        this.f62962c = j11;
    }

    public i a(j jVar) {
        return this.f62960a;
    }

    public long b() {
        return Z.p1(this.f62962c, 1000000L, this.f62961b);
    }

    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f62975d;

        /* renamed from: e, reason: collision with root package name */
        public final long f62976e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f62975d = j12;
            this.f62976e = j13;
        }

        public i c() {
            long j10 = this.f62976e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f62975d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
