package b1;

import android.net.Uri;
import android.util.Pair;
import b1.C2348b;
import b1.z;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Objects;

/* renamed from: b1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2346O {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2346O f24345a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f24346b = Z.K0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f24347c = Z.K0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final String f24348d = Z.K0(2);

    /* renamed from: b1.O$a */
    public class a extends AbstractC2346O {
        @Override // b1.AbstractC2346O
        public int b(Object obj) {
            return -1;
        }

        @Override // b1.AbstractC2346O
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // b1.AbstractC2346O
        public int i() {
            return 0;
        }

        @Override // b1.AbstractC2346O
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // b1.AbstractC2346O
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // b1.AbstractC2346O
        public int p() {
            return 0;
        }
    }

    /* renamed from: b1.O$b */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final String f24349h = Z.K0(0);

        /* renamed from: i, reason: collision with root package name */
        public static final String f24350i = Z.K0(1);

        /* renamed from: j, reason: collision with root package name */
        public static final String f24351j = Z.K0(2);

        /* renamed from: k, reason: collision with root package name */
        public static final String f24352k = Z.K0(3);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24353l = Z.K0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f24354a;

        /* renamed from: b, reason: collision with root package name */
        public Object f24355b;

        /* renamed from: c, reason: collision with root package name */
        public int f24356c;

        /* renamed from: d, reason: collision with root package name */
        public long f24357d;

        /* renamed from: e, reason: collision with root package name */
        public long f24358e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f24359f;

        /* renamed from: g, reason: collision with root package name */
        public C2348b f24360g = C2348b.f24539f;

        public int a(int i10) {
            return this.f24360g.a(i10).f24562b;
        }

        public long b(int i10, int i11) {
            C2348b.a a10 = this.f24360g.a(i10);
            if (a10.f24562b != -1) {
                return a10.durationsUs[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f24360g.f24546b;
        }

        public int d(long j10) {
            return this.f24360g.b(j10, this.f24357d);
        }

        public int e(long j10) {
            return this.f24360g.c(j10, this.f24357d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f24354a, bVar.f24354a) && Objects.equals(this.f24355b, bVar.f24355b) && this.f24356c == bVar.f24356c && this.f24357d == bVar.f24357d && this.f24358e == bVar.f24358e && this.f24359f == bVar.f24359f && Objects.equals(this.f24360g, bVar.f24360g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f24360g.a(i10).f24561a;
        }

        public long g() {
            return this.f24360g.f24547c;
        }

        public int h(int i10, int i11) {
            C2348b.a a10 = this.f24360g.a(i10);
            if (a10.f24562b != -1) {
                return a10.states[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f24354a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f24355b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f24356c) * 31;
            long j10 = this.f24357d;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f24358e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f24359f ? 1 : 0)) * 31) + this.f24360g.hashCode();
        }

        public long i(int i10) {
            return this.f24360g.a(i10).f24564d;
        }

        public long j() {
            return Z.J1(this.f24357d);
        }

        public long k() {
            return this.f24357d;
        }

        public int l(int i10) {
            return this.f24360g.a(i10).c();
        }

        public int m(int i10, int i11) {
            return this.f24360g.a(i10).d(i11);
        }

        public long n() {
            return Z.J1(this.f24358e);
        }

        public long o() {
            return this.f24358e;
        }

        public int p() {
            return this.f24360g.f24549e;
        }

        public boolean q(int i10) {
            return !this.f24360g.a(i10).e();
        }

        public boolean r(int i10) {
            return i10 == c() - 1 && this.f24360g.d(i10);
        }

        public boolean s(int i10) {
            return this.f24360g.a(i10).f24565e;
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11) {
            return u(obj, obj2, i10, j10, j11, C2348b.f24539f, false);
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11, C2348b c2348b, boolean z10) {
            this.f24354a = obj;
            this.f24355b = obj2;
            this.f24356c = i10;
            this.f24357d = j10;
            this.f24358e = j11;
            this.f24360g = c2348b;
            this.f24359f = z10;
            return this;
        }
    }

    /* renamed from: b1.O$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public Object f24378b;

        /* renamed from: d, reason: collision with root package name */
        public Object f24380d;

        /* renamed from: e, reason: collision with root package name */
        public long f24381e;

        /* renamed from: f, reason: collision with root package name */
        public long f24382f;

        /* renamed from: g, reason: collision with root package name */
        public long f24383g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f24384h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24385i;

        /* renamed from: j, reason: collision with root package name */
        public z.g f24386j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f24387k;

        /* renamed from: l, reason: collision with root package name */
        public long f24388l;

        /* renamed from: m, reason: collision with root package name */
        public long f24389m;

        /* renamed from: n, reason: collision with root package name */
        public int f24390n;

        /* renamed from: o, reason: collision with root package name */
        public int f24391o;

        /* renamed from: p, reason: collision with root package name */
        public long f24392p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f24367q = new Object();

        /* renamed from: r, reason: collision with root package name */
        public static final Object f24368r = new Object();

        /* renamed from: s, reason: collision with root package name */
        public static final z f24369s = new z.c().d("androidx.media3.common.Timeline").i(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        public static final String f24370t = Z.K0(1);

        /* renamed from: u, reason: collision with root package name */
        public static final String f24371u = Z.K0(2);

        /* renamed from: v, reason: collision with root package name */
        public static final String f24372v = Z.K0(3);

        /* renamed from: w, reason: collision with root package name */
        public static final String f24373w = Z.K0(4);

        /* renamed from: x, reason: collision with root package name */
        public static final String f24374x = Z.K0(5);

        /* renamed from: y, reason: collision with root package name */
        public static final String f24375y = Z.K0(6);

        /* renamed from: z, reason: collision with root package name */
        public static final String f24376z = Z.K0(7);

        /* renamed from: A, reason: collision with root package name */
        public static final String f24361A = Z.K0(8);

        /* renamed from: B, reason: collision with root package name */
        public static final String f24362B = Z.K0(9);

        /* renamed from: C, reason: collision with root package name */
        public static final String f24363C = Z.K0(10);

        /* renamed from: D, reason: collision with root package name */
        public static final String f24364D = Z.K0(11);

        /* renamed from: E, reason: collision with root package name */
        public static final String f24365E = Z.K0(12);

        /* renamed from: F, reason: collision with root package name */
        public static final String f24366F = Z.K0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f24377a = f24367q;

        /* renamed from: c, reason: collision with root package name */
        public z f24379c = f24369s;

        public long a() {
            return Z.m0(this.f24383g);
        }

        public long b() {
            return Z.J1(this.f24388l);
        }

        public long c() {
            return this.f24388l;
        }

        public long d() {
            return Z.J1(this.f24389m);
        }

        public long e() {
            return this.f24392p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f24377a, cVar.f24377a) && Objects.equals(this.f24379c, cVar.f24379c) && Objects.equals(this.f24380d, cVar.f24380d) && Objects.equals(this.f24386j, cVar.f24386j) && this.f24381e == cVar.f24381e && this.f24382f == cVar.f24382f && this.f24383g == cVar.f24383g && this.f24384h == cVar.f24384h && this.f24385i == cVar.f24385i && this.f24387k == cVar.f24387k && this.f24388l == cVar.f24388l && this.f24389m == cVar.f24389m && this.f24390n == cVar.f24390n && this.f24391o == cVar.f24391o && this.f24392p == cVar.f24392p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f24386j != null;
        }

        public c g(Object obj, z zVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, z.g gVar, long j13, long j14, int i10, int i11, long j15) {
            z.h hVar;
            this.f24377a = obj;
            this.f24379c = zVar != null ? zVar : f24369s;
            this.f24378b = (zVar == null || (hVar = zVar.f24655b) == null) ? null : hVar.f24757i;
            this.f24380d = obj2;
            this.f24381e = j10;
            this.f24382f = j11;
            this.f24383g = j12;
            this.f24384h = z10;
            this.f24385i = z11;
            this.f24386j = gVar;
            this.f24388l = j13;
            this.f24389m = j14;
            this.f24390n = i10;
            this.f24391o = i11;
            this.f24392p = j15;
            this.f24387k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f24377a.hashCode()) * 31) + this.f24379c.hashCode()) * 31;
            Object obj = this.f24380d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            z.g gVar = this.f24386j;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f24381e;
            int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f24382f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f24383g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f24384h ? 1 : 0)) * 31) + (this.f24385i ? 1 : 0)) * 31) + (this.f24387k ? 1 : 0)) * 31;
            long j13 = this.f24388l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f24389m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f24390n) * 31) + this.f24391o) * 31;
            long j15 = this.f24392p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f24356c;
        if (n(i12, cVar).f24391o != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f24390n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2346O)) {
            return false;
        }
        AbstractC2346O abstractC2346O = (AbstractC2346O) obj;
        if (abstractC2346O.p() != p() || abstractC2346O.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(abstractC2346O.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(abstractC2346O.g(i11, bVar2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != abstractC2346O.a(true) || (c10 = c(true)) != abstractC2346O.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != abstractC2346O.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (p10 * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            i11 = (i11 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) AbstractC4134a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        AbstractC4134a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f24390n;
        f(i11, bVar);
        while (i11 < cVar.f24391o && bVar.f24358e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f24358e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long j12 = j10 - bVar.f24358e;
        long j13 = bVar.f24357d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(AbstractC4134a.e(bVar.f24355b), Long.valueOf(Math.max(0L, j12)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
