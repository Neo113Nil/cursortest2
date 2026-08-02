package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class w extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final j$.time.g f17351d = j$.time.g.Z(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f17352a;

    /* renamed from: b, reason: collision with root package name */
    public final transient x f17353b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f17354c;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime E(j$.time.j jVar) {
        return new f(this, jVar);
    }

    public w(j$.time.g gVar) {
        if (gVar.V(f17351d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        x h10 = x.h(gVar);
        this.f17353b = h10;
        this.f17354c = (gVar.f17472a - h10.f17358b.f17472a) + 1;
        this.f17352a = gVar;
    }

    public w(x xVar, int i5, j$.time.g gVar) {
        if (gVar.V(f17351d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        this.f17353b = xVar;
        this.f17354c = i5;
        this.f17352a = gVar;
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return u.f17349c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        u.f17349c.getClass();
        return this.f17352a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l G() {
        return this.f17353b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j$.time.chrono.d, j$.time.chrono.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M() {
        int M;
        x l6 = this.f17353b.l();
        if (l6 != null) {
            j$.time.g gVar = l6.f17358b;
            if (gVar.f17472a == this.f17352a.f17472a) {
                M = gVar.U() - 1;
                return this.f17354c != 1 ? M - (this.f17353b.f17358b.U() - 1) : M;
            }
        }
        M = this.f17352a.M();
        if (this.f17354c != 1) {
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!e(pVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i5 = v.f17350a[aVar.ordinal()];
        if (i5 == 1) {
            return j$.time.temporal.s.f(1L, this.f17352a.W());
        }
        if (i5 == 2) {
            return j$.time.temporal.s.f(1L, M());
        }
        if (i5 != 3) {
            return u.f17349c.q(aVar);
        }
        x xVar = this.f17353b;
        int i10 = xVar.f17358b.f17472a;
        return xVar.l() != null ? j$.time.temporal.s.f(1L, (r6.f17358b.f17472a - i10) + 1) : j$.time.temporal.s.f(1L, 999999999 - i10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        switch (v.f17350a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                return this.f17354c == 1 ? (this.f17352a.U() - this.f17353b.f17358b.U()) + 1 : this.f17352a.U();
            case 3:
                return this.f17354c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
            case 8:
                return this.f17353b.f17357a;
            default:
                return this.f17352a.C(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final w c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (C(aVar) == j) {
                return this;
            }
            int[] iArr = v.f17350a;
            int i5 = iArr[aVar.ordinal()];
            if (i5 == 3 || i5 == 8 || i5 == 9) {
                u uVar = u.f17349c;
                int a7 = uVar.q(aVar).a(j, aVar);
                int i10 = iArr[aVar.ordinal()];
                if (i10 == 3) {
                    return V(this.f17352a.k0(uVar.u(this.f17353b, a7)));
                }
                if (i10 == 8) {
                    return V(this.f17352a.k0(uVar.u(x.m(a7), this.f17354c)));
                }
                if (i10 == 9) {
                    return V(this.f17352a.k0(a7));
                }
            }
            return V(this.f17352a.c(j, pVar));
        }
        return (w) super.c(j, pVar);
    }

    public final w W(j$.time.x xVar) {
        return (w) super.w(xVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(j$.time.g gVar) {
        return (w) super.w(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b w(j$.time.temporal.m mVar) {
        return (w) super.w(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b J(j$.time.temporal.o oVar) {
        return (w) super.J(oVar);
    }

    @Override // j$.time.chrono.d
    public final b S(long j) {
        return V(this.f17352a.g0(j));
    }

    @Override // j$.time.chrono.d
    public final b R(long j) {
        return V(this.f17352a.e0(j));
    }

    @Override // j$.time.chrono.d
    public final b Q(long j) {
        return V(this.f17352a.d0(j));
    }

    public final w T(long j, ChronoUnit chronoUnit) {
        return (w) super.d(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (w) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (w) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: r */
    public final b x(long j, TemporalUnit temporalUnit) {
        return (w) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return (w) super.x(j, chronoUnit);
    }

    public final w V(j$.time.g gVar) {
        return gVar.equals(this.f17352a) ? this : new w(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long D() {
        return this.f17352a.D();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f17352a.equals(((w) obj).f17352a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 4, this);
    }
}
