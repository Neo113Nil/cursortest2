package H1;

import H1.J;
import e1.AbstractC4134a;
import e1.Z;

/* renamed from: H1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1172e {

    /* renamed from: a, reason: collision with root package name */
    public final a f4411a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4412b;

    /* renamed from: c, reason: collision with root package name */
    public c f4413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4414d;

    /* renamed from: H1.e$a */
    public static class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final d f4415a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4416b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4417c;

        /* renamed from: d, reason: collision with root package name */
        public final long f4418d;

        /* renamed from: e, reason: collision with root package name */
        public final long f4419e;

        /* renamed from: f, reason: collision with root package name */
        public final long f4420f;

        /* renamed from: g, reason: collision with root package name */
        public final long f4421g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f4415a = dVar;
            this.f4416b = j10;
            this.f4417c = j11;
            this.f4418d = j12;
            this.f4419e = j13;
            this.f4420f = j14;
            this.f4421g = j15;
        }

        @Override // H1.J
        public J.a e(long j10) {
            return new J.a(new K(j10, c.h(this.f4415a.a(j10), this.f4417c, this.f4418d, this.f4419e, this.f4420f, this.f4421g)));
        }

        @Override // H1.J
        public boolean i() {
            return true;
        }

        public long k(long j10) {
            return this.f4415a.a(j10);
        }

        @Override // H1.J
        public long m() {
            return this.f4416b;
        }
    }

    /* renamed from: H1.e$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f4422a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4423b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4424c;

        /* renamed from: d, reason: collision with root package name */
        public long f4425d;

        /* renamed from: e, reason: collision with root package name */
        public long f4426e;

        /* renamed from: f, reason: collision with root package name */
        public long f4427f;

        /* renamed from: g, reason: collision with root package name */
        public long f4428g;

        /* renamed from: h, reason: collision with root package name */
        public long f4429h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f4422a = j10;
            this.f4423b = j11;
            this.f4425d = j12;
            this.f4426e = j13;
            this.f4427f = j14;
            this.f4428g = j15;
            this.f4424c = j16;
            this.f4429h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return Z.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f4428g;
        }

        public final long j() {
            return this.f4427f;
        }

        public final long k() {
            return this.f4429h;
        }

        public final long l() {
            return this.f4422a;
        }

        public final long m() {
            return this.f4423b;
        }

        public final void n() {
            this.f4429h = h(this.f4423b, this.f4425d, this.f4426e, this.f4427f, this.f4428g, this.f4424c);
        }

        public final void o(long j10, long j11) {
            this.f4426e = j10;
            this.f4428g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f4425d = j10;
            this.f4427f = j11;
            n();
        }
    }

    /* renamed from: H1.e$d */
    public interface d {
        long a(long j10);
    }

    /* renamed from: H1.e$e, reason: collision with other inner class name */
    public static final class C0097e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0097e f4430d = new C0097e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f4431a;

        /* renamed from: b, reason: collision with root package name */
        public final long f4432b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4433c;

        public C0097e(int i10, long j10, long j11) {
            this.f4431a = i10;
            this.f4432b = j10;
            this.f4433c = j11;
        }

        public static C0097e d(long j10, long j11) {
            return new C0097e(-1, j10, j11);
        }

        public static C0097e e(long j10) {
            return new C0097e(0, -9223372036854775807L, j10);
        }

        public static C0097e f(long j10, long j11) {
            return new C0097e(-2, j10, j11);
        }
    }

    public AbstractC1172e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f4412b = fVar;
        this.f4414d = i10;
        this.f4411a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f4411a.k(j10), this.f4411a.f4417c, this.f4411a.f4418d, this.f4411a.f4419e, this.f4411a.f4420f, this.f4411a.f4421g);
    }

    public final J b() {
        return this.f4411a;
    }

    public int c(InterfaceC1184q interfaceC1184q, I i10) {
        while (true) {
            c cVar = (c) AbstractC4134a.i(this.f4413c);
            long j10 = cVar.j();
            long i11 = cVar.i();
            long k10 = cVar.k();
            if (i11 - j10 <= this.f4414d) {
                e(false, j10);
                return g(interfaceC1184q, j10, i10);
            }
            if (!i(interfaceC1184q, k10)) {
                return g(interfaceC1184q, k10, i10);
            }
            interfaceC1184q.g();
            C0097e a10 = this.f4412b.a(interfaceC1184q, cVar.m());
            int i12 = a10.f4431a;
            if (i12 == -3) {
                e(false, k10);
                return g(interfaceC1184q, k10, i10);
            }
            if (i12 == -2) {
                cVar.p(a10.f4432b, a10.f4433c);
            } else {
                if (i12 != -1) {
                    if (i12 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC1184q, a10.f4433c);
                    e(true, a10.f4433c);
                    return g(interfaceC1184q, a10.f4433c, i10);
                }
                cVar.o(a10.f4432b, a10.f4433c);
            }
        }
    }

    public final boolean d() {
        return this.f4413c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f4413c = null;
        this.f4412b.b();
        f(z10, j10);
    }

    public final int g(InterfaceC1184q interfaceC1184q, long j10, I i10) {
        if (j10 == interfaceC1184q.getPosition()) {
            return 0;
        }
        i10.f4333a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f4413c;
        if (cVar == null || cVar.l() != j10) {
            this.f4413c = a(j10);
        }
    }

    public final boolean i(InterfaceC1184q interfaceC1184q, long j10) {
        long position = j10 - interfaceC1184q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC1184q.l((int) position);
        return true;
    }

    /* renamed from: H1.e$f */
    public interface f {
        C0097e a(InterfaceC1184q interfaceC1184q, long j10);

        default void b() {
        }
    }

    /* renamed from: H1.e$b */
    public static final class b implements d {
        @Override // H1.AbstractC1172e.d
        public long a(long j10) {
            return j10;
        }
    }

    public void f(boolean z10, long j10) {
    }
}
