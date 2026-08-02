package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final s f17541f = s.f(1, 7);

    /* renamed from: g, reason: collision with root package name */
    public static final s f17542g = s.g(0, 4, 6);

    /* renamed from: h, reason: collision with root package name */
    public static final s f17543h = s.g(0, 52, 54);

    /* renamed from: i, reason: collision with root package name */
    public static final s f17544i = s.g(1, 52, 53);

    /* renamed from: a, reason: collision with root package name */
    public final String f17545a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17546b;

    /* renamed from: c, reason: collision with root package name */
    public final TemporalUnit f17547c;

    /* renamed from: d, reason: collision with root package name */
    public final TemporalUnit f17548d;

    /* renamed from: e, reason: collision with root package name */
    public final s f17549e;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public final j$.time.chrono.b e(j$.time.chrono.k kVar, int i5, int i10, int i11) {
        j$.time.chrono.b I = kVar.I(i5, 1, 1);
        int h10 = h(1, b(I));
        int i12 = i11 - 1;
        return I.d(((Math.min(i10, a(h10, I.M() + this.f17546b.f17553b) - 1) - 1) * 7) + i12 + (-h10), (TemporalUnit) ChronoUnit.DAYS);
    }

    public t(String str, u uVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, s sVar) {
        this.f17545a = str;
        this.f17546b = uVar;
        this.f17547c = temporalUnit;
        this.f17548d = temporalUnit2;
        this.f17549e = sVar;
    }

    @Override // j$.time.temporal.p
    public final long x(TemporalAccessor temporalAccessor) {
        int c2;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17548d;
        if (temporalUnit == chronoUnit) {
            c2 = b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == u.f17551h) {
                    c2 = d(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    c2 = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int b10 = b(temporalAccessor);
                int i5 = temporalAccessor.i(a.DAY_OF_YEAR);
                c2 = a(h(i5, b10), i5);
            }
        } else {
            int b11 = b(temporalAccessor);
            int i10 = temporalAccessor.i(a.DAY_OF_MONTH);
            c2 = a(h(i10, b11), i10);
        }
        return c2;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return q.e(temporalAccessor.i(a.DAY_OF_WEEK) - this.f17546b.f17552a.getValue()) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int b10 = b(temporalAccessor);
        int i5 = temporalAccessor.i(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int i10 = temporalAccessor.i(aVar);
        int h10 = h(i10, b10);
        int a7 = a(h10, i10);
        return a7 == 0 ? i5 - 1 : a7 >= a(h10, ((int) temporalAccessor.k(aVar).f17540d) + this.f17546b.f17553b) ? i5 + 1 : i5;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int a7;
        int b10 = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int i5 = temporalAccessor.i(aVar);
        int h10 = h(i5, b10);
        int a10 = a(h10, i5);
        if (a10 == 0) {
            return d(j$.com.android.tools.r8.a.L(temporalAccessor).A(temporalAccessor).x(i5, ChronoUnit.DAYS));
        }
        return (a10 <= 50 || a10 < (a7 = a(h10, ((int) temporalAccessor.k(aVar).f17540d) + this.f17546b.f17553b))) ? a10 : (a10 - a7) + 1;
    }

    public final int h(int i5, int i10) {
        int e7 = q.e(i5 - i10);
        return e7 + 1 > this.f17546b.f17553b ? 7 - e7 : -e7;
    }

    public static int a(int i5, int i10) {
        return ((i10 - 1) + (i5 + 7)) / 7;
    }

    @Override // j$.time.temporal.p
    public final l z(l lVar, long j) {
        if (this.f17549e.a(j, this) == lVar.i(this)) {
            return lVar;
        }
        if (this.f17548d != ChronoUnit.FOREVER) {
            return lVar.d(r0 - r1, this.f17547c);
        }
        u uVar = this.f17546b;
        return e(j$.com.android.tools.r8.a.L(lVar), (int) j, lVar.i(uVar.f17556e), lVar.i(uVar.f17554c));
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor k(Map map, d0 d0Var, e0 e0Var) {
        j$.time.chrono.b bVar;
        j$.time.chrono.b bVar2;
        a aVar;
        j$.time.chrono.b bVar3;
        long longValue = ((Long) map.get(this)).longValue();
        int M = j$.com.android.tools.r8.a.M(longValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        s sVar = this.f17549e;
        u uVar = this.f17546b;
        TemporalUnit temporalUnit = this.f17548d;
        if (temporalUnit == chronoUnit) {
            long e7 = q.e((sVar.a(longValue, this) - 1) + (uVar.f17552a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(e7));
            return null;
        }
        a aVar2 = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        int e9 = q.e(aVar2.f17512b.a(((Long) map.get(aVar2)).longValue(), aVar2) - uVar.f17552a.getValue()) + 1;
        j$.time.chrono.k L = j$.com.android.tools.r8.a.L(d0Var);
        a aVar3 = a.YEAR;
        if (!map.containsKey(aVar3)) {
            if ((temporalUnit != u.f17551h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(uVar.f17557f) || !map.containsKey(uVar.f17556e)) {
                return null;
            }
            t tVar = uVar.f17557f;
            int a7 = tVar.f17549e.a(((Long) map.get(tVar)).longValue(), uVar.f17557f);
            if (e0Var == e0.LENIENT) {
                bVar = e(L, a7, 1, e9).d(j$.com.android.tools.r8.a.U(((Long) map.get(uVar.f17556e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                t tVar2 = uVar.f17556e;
                j$.time.chrono.b e10 = e(L, a7, tVar2.f17549e.a(((Long) map.get(tVar2)).longValue(), uVar.f17556e), e9);
                if (e0Var == e0.STRICT && c(e10) != a7) {
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                bVar = e10;
            }
            map.remove(this);
            map.remove(uVar.f17557f);
            map.remove(uVar.f17556e);
            map.remove(aVar2);
            return bVar;
        }
        int a10 = aVar3.f17512b.a(((Long) map.get(aVar3)).longValue(), aVar3);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            a aVar4 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar4)) {
                long longValue2 = ((Long) map.get(aVar4)).longValue();
                long j = M;
                if (e0Var == e0.LENIENT) {
                    j$.time.chrono.b d10 = L.I(a10, 1, 1).d(j$.com.android.tools.r8.a.U(longValue2, 1L), (TemporalUnit) chronoUnit2);
                    int b10 = b(d10);
                    int i5 = d10.i(a.DAY_OF_MONTH);
                    bVar3 = d10.d(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(j, a(h(i5, b10), i5)), 7), e9 - b(d10)), (TemporalUnit) ChronoUnit.DAYS);
                    aVar = aVar4;
                } else {
                    aVar = aVar4;
                    j$.time.chrono.b I = L.I(a10, aVar.f17512b.a(longValue2, aVar), 1);
                    long a11 = sVar.a(j, this);
                    int b11 = b(I);
                    int i10 = I.i(a.DAY_OF_MONTH);
                    j$.time.chrono.b d11 = I.d((((int) (a11 - a(h(i10, b11), i10))) * 7) + (e9 - b(I)), (TemporalUnit) ChronoUnit.DAYS);
                    if (e0Var == e0.STRICT && d11.C(aVar) != longValue2) {
                        throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                    }
                    bVar3 = d11;
                }
                map.remove(this);
                map.remove(aVar3);
                map.remove(aVar);
                map.remove(aVar2);
                return bVar3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j6 = M;
        j$.time.chrono.b I2 = L.I(a10, 1, 1);
        if (e0Var == e0.LENIENT) {
            int b12 = b(I2);
            int i11 = I2.i(a.DAY_OF_YEAR);
            bVar2 = I2.d(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(j6, a(h(i11, b12), i11)), 7), e9 - b(I2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long a12 = sVar.a(j6, this);
            int b13 = b(I2);
            int i12 = I2.i(a.DAY_OF_YEAR);
            j$.time.chrono.b d12 = I2.d((((int) (a12 - a(h(i12, b13), i12))) * 7) + (e9 - b(I2)), (TemporalUnit) ChronoUnit.DAYS);
            if (e0Var == e0.STRICT && d12.C(aVar3) != a10) {
                throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
            }
            bVar2 = d12;
        }
        map.remove(this);
        map.remove(aVar3);
        map.remove(aVar2);
        return bVar2;
    }

    @Override // j$.time.temporal.p
    public final s n() {
        return this.f17549e;
    }

    @Override // j$.time.temporal.p
    public final boolean i(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.e(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17548d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.e(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.e(a.DAY_OF_YEAR);
        }
        if (temporalUnit == u.f17551h) {
            return temporalAccessor.e(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.e(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final s j(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f17548d;
        if (temporalUnit == chronoUnit) {
            return this.f17549e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (temporalUnit == u.f17551h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.f17512b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    public final s f(TemporalAccessor temporalAccessor, a aVar) {
        int h10 = h(temporalAccessor.i(aVar), b(temporalAccessor));
        s k6 = temporalAccessor.k(aVar);
        return s.f(a(h10, (int) k6.f17537a), a(h10, (int) k6.f17540d));
    }

    public final s g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.e(aVar)) {
            return f17543h;
        }
        int b10 = b(temporalAccessor);
        int i5 = temporalAccessor.i(aVar);
        int h10 = h(i5, b10);
        int a7 = a(h10, i5);
        if (a7 != 0) {
            if (a7 >= a(h10, this.f17546b.f17553b + ((int) temporalAccessor.k(aVar).f17540d))) {
                return g(j$.com.android.tools.r8.a.L(temporalAccessor).A(temporalAccessor).d((r0 - i5) + 8, (TemporalUnit) ChronoUnit.DAYS));
            }
            return s.f(1L, r1 - 1);
        }
        return g(j$.com.android.tools.r8.a.L(temporalAccessor).A(temporalAccessor).x(i5 + 7, ChronoUnit.DAYS));
    }

    public final String toString() {
        return this.f17545a + "[" + this.f17546b.toString() + "]";
    }
}
