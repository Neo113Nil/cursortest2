package j$.time;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.format.e0;
import j$.time.format.f0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class v implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17560c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f17561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17562b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i5 = this.f17561a - vVar.f17561a;
        return i5 == 0 ? this.f17562b - vVar.f17562b : i5;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public v(int i5, int i10) {
        this.f17561a = i5;
        this.f17562b = i10;
    }

    public final v T(int i5, int i10) {
        return (this.f17561a == i5 && this.f17562b == i10) ? this : new v(i5, i10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.f17561a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(C(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        int i5;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i10 = u.f17558a[((j$.time.temporal.a) pVar).ordinal()];
        if (i10 == 1) {
            i5 = this.f17562b;
        } else {
            if (i10 == 2) {
                return P();
            }
            if (i10 == 3) {
                int i11 = this.f17561a;
                if (i11 < 1) {
                    i11 = 1 - i11;
                }
                return i11;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    return this.f17561a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
            }
            i5 = this.f17561a;
        }
        return i5;
    }

    public final long P() {
        return ((this.f17561a * 12) + this.f17562b) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final v c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (v) pVar.z(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.C(j);
        int i5 = u.f17558a[aVar.ordinal()];
        if (i5 == 1) {
            int i10 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.C(i10);
            return T(this.f17561a, i10);
        }
        if (i5 == 2) {
            return R(j - P());
        }
        if (i5 == 3) {
            if (this.f17561a < 1) {
                j = 1 - j;
            }
            int i11 = (int) j;
            j$.time.temporal.a.YEAR.C(i11);
            return T(i11, this.f17562b);
        }
        if (i5 == 4) {
            int i12 = (int) j;
            j$.time.temporal.a.YEAR.C(i12);
            return T(i12, this.f17562b);
        }
        if (i5 != 5) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        if (C(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i13 = 1 - this.f17561a;
        j$.time.temporal.a.YEAR.C(i13);
        return T(i13, this.f17562b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final v d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (v) temporalUnit.i(this, j);
        }
        switch (u.f17559b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return R(j);
            case 2:
                return S(j);
            case 3:
                return S(j$.com.android.tools.r8.a.T(j, 10));
            case 4:
                return S(j$.com.android.tools.r8.a.T(j, 100));
            case 5:
                return S(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.N(C(aVar), j), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    public final v S(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return T(aVar.f17512b.a(this.f17561a + j, aVar), this.f17562b);
    }

    public final v R(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = (this.f17561a * 12) + (this.f17562b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j10 = 12;
        return T(aVar.f17512b.a(j$.com.android.tools.r8.a.S(j6, j10), aVar), ((int) j$.com.android.tools.r8.a.R(j6, j10)) + 1);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17531b) {
            return j$.time.chrono.r.f17346c;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.q.c(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.L(lVar).equals(j$.time.chrono.r.f17346c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return lVar.c(P(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f17561a == vVar.f17561a && this.f17562b == vVar.f17562b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17561a ^ (this.f17562b << 27);
    }

    public final String toString() {
        int abs = Math.abs(this.f17561a);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            int i5 = this.f17561a;
            if (i5 < 0) {
                sb2.append(i5 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i5 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f17561a);
        }
        sb2.append(this.f17562b < 10 ? "-0" : "-");
        sb2.append(this.f17562b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return (v) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
