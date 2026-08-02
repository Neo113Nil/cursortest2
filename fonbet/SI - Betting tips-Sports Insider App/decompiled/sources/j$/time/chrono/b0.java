package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class b0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f17307a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime E(j$.time.j jVar) {
        return new f(this, jVar);
    }

    public b0(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f17307a = gVar;
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return z.f17361c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        z.f17361c.getClass();
        return this.f17307a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final l G() {
        return T() >= 1 ? c0.ROC : c0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.q(this, pVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i5 = a0.f17306a[aVar.ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return this.f17307a.k(pVar);
        }
        if (i5 != 4) {
            return z.f17361c.q(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.f17512b;
        return j$.time.temporal.s.f(1L, T() <= 0 ? (-sVar.f17537a) + 1912 : sVar.f17540d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i5 = a0.f17306a[((j$.time.temporal.a) pVar).ordinal()];
            if (i5 == 4) {
                int T = T();
                if (T < 1) {
                    T = 1 - T;
                }
                return T;
            }
            if (i5 == 5) {
                return ((T() * 12) + this.f17307a.f17473b) - 1;
            }
            if (i5 == 6) {
                return T();
            }
            if (i5 != 7) {
                return this.f17307a.C(pVar);
            }
            return T() < 1 ? 0 : 1;
        }
        return pVar.x(this);
    }

    public final int T() {
        return this.f17307a.f17472a - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (C(aVar) == j) {
                return this;
            }
            int[] iArr = a0.f17306a;
            int i5 = iArr[aVar.ordinal()];
            if (i5 != 4) {
                if (i5 == 5) {
                    z.f17361c.q(aVar).b(j, aVar);
                    long T = T() * 12;
                    return V(this.f17307a.e0(j - ((T + r10.f17473b) - 1)));
                }
                if (i5 != 6) {
                }
            }
            int a7 = z.f17361c.q(aVar).a(j, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 4) {
                return V(this.f17307a.k0(T() >= 1 ? a7 + 1911 : 1912 - a7));
            }
            if (i10 == 6) {
                return V(this.f17307a.k0(a7 + 1911));
            }
            if (i10 == 7) {
                return V(this.f17307a.k0(1912 - T()));
            }
            return V(this.f17307a.c(j, pVar));
        }
        return (b0) super.c(j, pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(j$.time.g gVar) {
        return (b0) super.w(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b w(j$.time.temporal.m mVar) {
        return (b0) super.w(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b J(j$.time.temporal.o oVar) {
        return (b0) super.J(oVar);
    }

    @Override // j$.time.chrono.d
    public final b S(long j) {
        return V(this.f17307a.g0(j));
    }

    @Override // j$.time.chrono.d
    public final b R(long j) {
        return V(this.f17307a.e0(j));
    }

    @Override // j$.time.chrono.d
    public final b Q(long j) {
        return V(this.f17307a.d0(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b d(long j, TemporalUnit temporalUnit) {
        return (b0) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l d(long j, TemporalUnit temporalUnit) {
        return (b0) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: r */
    public final b x(long j, TemporalUnit temporalUnit) {
        return (b0) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return (b0) super.x(j, chronoUnit);
    }

    public final b0 V(j$.time.g gVar) {
        return gVar.equals(this.f17307a) ? this : new b0(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long D() {
        return this.f17307a.D();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f17307a.equals(((b0) obj).f17307a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 7, this);
    }
}
