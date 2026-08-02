package ig;

import ig.AbstractC7072a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class g extends jg.c<f> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final g f66417d = v1(f.f66410e, h.f66422f);

    /* renamed from: e, reason: collision with root package name */
    public static final g f66418e = v1(f.f66411f, h.f66423g);

    /* renamed from: b, reason: collision with root package name */
    private final f f66419b;

    /* renamed from: c, reason: collision with root package name */
    private final h f66420c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66421a;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66421a = iArr;
            try {
                iArr[mg.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66421a[mg.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66421a[mg.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66421a[mg.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66421a[mg.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66421a[mg.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66421a[mg.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private g(f fVar, h hVar) {
        this.f66419b = fVar;
        this.f66420c = hVar;
    }

    private g E1(f fVar, long j11, long j12, long j13, long j14) {
        long j15 = j11 | j12 | j13 | j14;
        h hVar = this.f66420c;
        if (j15 == 0) {
            return M1(fVar, hVar);
        }
        long j16 = j11 / 24;
        long j17 = j16 + (j12 / 1440) + (j13 / 86400) + (j14 / 86400000000000L);
        long j18 = 1;
        long j19 = ((j11 % 24) * 3600000000000L) + ((j12 % 1440) * 60000000000L) + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L);
        long u12 = hVar.u1();
        long j21 = (j19 * j18) + u12;
        long b11 = lg.c.b(j21, 86400000000000L) + (j17 * j18);
        long j22 = ((j21 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j22 != u12) {
            hVar = h.c1(j22);
        }
        return M1(fVar.M1(b11), hVar);
    }

    private g M1(f fVar, h hVar) {
        return (this.f66419b == fVar && this.f66420c == hVar) ? this : new g(fVar, hVar);
    }

    private int j1(g gVar) {
        int j12 = this.f66419b.j1(gVar.f66419b);
        return j12 == 0 ? this.f66420c.compareTo(gVar.f66420c) : j12;
    }

    public static g k1(mg.e eVar) {
        if (eVar instanceof g) {
            return (g) eVar;
        }
        if (eVar instanceof s) {
            return ((s) eVar).x1();
        }
        try {
            return new g(f.l1(eVar), h.L0(eVar));
        } catch (C7073b unused) {
            throw new C7073b("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g u1(p pVar) {
        lg.c.e(pVar, "zone");
        AbstractC7072a.C1099a c1099a = new AbstractC7072a.C1099a(pVar);
        e T02 = e.T0(System.currentTimeMillis());
        return x1(T02.L0(), T02.M0(), c1099a.a().b().a(T02));
    }

    public static g v1(f fVar, h hVar) {
        lg.c.e(fVar, "date");
        lg.c.e(hVar, "time");
        return new g(fVar, hVar);
    }

    private Object writeReplace() {
        return new m((byte) 4, this);
    }

    public static g x1(long j11, int i11, q qVar) {
        lg.c.e(qVar, "offset");
        return new g(f.J1(lg.c.b(j11 + qVar.i(), 86400L)), h.d1(i11, lg.c.d(86400, r2)));
    }

    public final g B1(long j11) {
        return E1(this.f66419b, 0L, 0L, j11, 0L);
    }

    @Override // jg.c
    public final jg.e E0(q qVar) {
        return s.t1(this, qVar, null);
    }

    public final f F1() {
        return this.f66419b;
    }

    @Override // jg.c, java.lang.Comparable
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jg.c<?> cVar) {
        return cVar instanceof g ? j1((g) cVar) : super.compareTo(cVar);
    }

    @Override // jg.c
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final g j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (g) hVar.e(this, j11);
        }
        boolean j12 = ((EnumC8145a) hVar).j();
        h hVar2 = this.f66420c;
        f fVar = this.f66419b;
        return j12 ? M1(fVar, hVar2.c1(j11, hVar)) : M1(fVar.Z(j11, hVar), hVar2);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar != null && hVar.a(this);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        return enumC8145a.b() || enumC8145a.j();
    }

    @Override // jg.c
    /* renamed from: L0 */
    public final jg.c s(long j11, mg.b bVar) {
        return j11 == Long.MIN_VALUE ? M0(Long.MAX_VALUE, bVar).M0(1L, bVar) : M0(-j11, bVar);
    }

    public final g L1(f fVar) {
        return M1(fVar, this.f66420c);
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() ? this.f66420c.Q(hVar) : this.f66419b.Q(hVar) : super.Q(hVar);
    }

    final void R1(DataOutput dataOutput) throws IOException {
        this.f66419b.e2(dataOutput);
        this.f66420c.B1(dataOutput);
    }

    @Override // jg.c
    public final f W0() {
        return this.f66419b;
    }

    @Override // jg.c
    public final h a1() {
        return this.f66420c;
    }

    @Override // jg.c, Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        return jVar == mg.i.b() ? (R) this.f66419b : (R) super.d(jVar);
    }

    @Override // jg.c
    /* renamed from: d1 */
    public final jg.c k1(f fVar) {
        return M1(fVar, this.f66420c);
    }

    @Override // jg.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f66419b.equals(gVar.f66419b) && this.f66420c.equals(gVar.f66420c)) {
                return true;
            }
        }
        return false;
    }

    @Override // jg.c
    public final int hashCode() {
        return this.f66419b.hashCode() ^ this.f66420c.hashCode();
    }

    @Override // jg.c, mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return M1(fVar, this.f66420c);
    }

    public final int l1() {
        return this.f66420c.W0();
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() ? this.f66420c.m(hVar) : this.f66419b.m(hVar) : hVar.f(this);
    }

    public final int m1() {
        return this.f66420c.a1();
    }

    public final int n1() {
        return this.f66419b.v1();
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() ? this.f66420c.p(hVar) : this.f66419b.p(hVar) : hVar.g(this);
    }

    public final boolean q1(g gVar) {
        if (gVar != null) {
            return j1(gVar) > 0;
        }
        long a12 = this.f66419b.a1();
        long a13 = gVar.f66419b.a1();
        if (a12 <= a13) {
            return a12 == a13 && this.f66420c.u1() > gVar.f66420c.u1();
        }
        return true;
    }

    @Override // jg.c, lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        mg.b bVar = (mg.b) kVar;
        return j11 == Long.MIN_VALUE ? M0(Long.MAX_VALUE, bVar).M0(1L, bVar) : M0(-j11, bVar);
    }

    public final boolean t1(g gVar) {
        if (gVar != null) {
            return j1(gVar) < 0;
        }
        long a12 = this.f66419b.a1();
        long a13 = gVar.f66419b.a1();
        if (a12 >= a13) {
            return a12 == a13 && this.f66420c.u1() < gVar.f66420c.u1();
        }
        return true;
    }

    @Override // jg.c, Lf.a
    public final String toString() {
        return this.f66419b.toString() + 'T' + this.f66420c.toString();
    }

    @Override // jg.c, mg.d
    /* renamed from: y1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (g) kVar.a(this, j11);
        }
        int i11 = a.f66421a[((mg.b) kVar).ordinal()];
        h hVar = this.f66420c;
        f fVar = this.f66419b;
        switch (i11) {
            case 1:
                return E1(this.f66419b, 0L, 0L, 0L, j11);
            case 2:
                g M12 = M1(fVar.M1(j11 / 86400000000L), hVar);
                return M12.E1(M12.f66419b, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                g M13 = M1(fVar.M1(j11 / 86400000), hVar);
                return M13.E1(M13.f66419b, 0L, 0L, 0L, (j11 % 86400000) * 1000000);
            case 4:
                return B1(j11);
            case 5:
                return E1(this.f66419b, 0L, j11, 0L, 0L);
            case 6:
                return E1(this.f66419b, j11, 0L, 0L, 0L);
            case 7:
                g M14 = M1(fVar.M1(j11 / 256), hVar);
                return M14.E1(M14.f66419b, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return M1(fVar.O(j11, kVar), hVar);
        }
    }
}
