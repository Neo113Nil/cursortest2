package j$.time;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class g implements j$.time.temporal.l, j$.time.temporal.m, j$.time.chrono.b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final g f17470d = Z(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final g f17471e = Z(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f17472a;

    /* renamed from: b, reason: collision with root package name */
    public final short f17473b;

    /* renamed from: c, reason: collision with root package name */
    public final short f17474c;

    static {
        Z(1970, 1, 1);
    }

    public static g Y(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.f17303a;
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return a0(j$.com.android.tools.r8.a.S(ofEpochMilli.getEpochSecond() + zoneId.Q().d(ofEpochMilli).f17297b, 86400));
    }

    public static g Z(int i5, int i10, int i11) {
        j$.time.temporal.a.YEAR.C(i5);
        j$.time.temporal.a.MONTH_OF_YEAR.C(i10);
        j$.time.temporal.a.DAY_OF_MONTH.C(i11);
        return Q(i5, i10, i11);
    }

    public static g b0(int i5, int i10) {
        long j = i5;
        j$.time.temporal.a.YEAR.C(j);
        j$.time.temporal.a.DAY_OF_YEAR.C(i10);
        boolean O = j$.time.chrono.r.f17346c.O(j);
        if (i10 == 366 && !O) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i5 + "' is not a leap year");
        }
        l S = l.S(((i10 - 1) / 31) + 1);
        if (i10 > (S.Q(O) + S.P(O)) - 1) {
            S = l.f17487a[((((int) 1) + 12) + S.ordinal()) % 12];
        }
        return new g(i5, S.getValue(), (i10 - S.P(O)) + 1);
    }

    public static g a0(long j) {
        long j6;
        j$.time.temporal.a.EPOCH_DAY.C(j);
        long j10 = 719468 + j;
        if (j10 < 0) {
            long j11 = ((j + 719469) / 146097) - 1;
            j6 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j6 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i5 = (int) j13;
        int i10 = ((i5 * 5) + 2) / 153;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i5 - (((i10 * 306) + 5) / 10)) + 1;
        long j14 = j12 + j6 + (i10 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new g(aVar.f17512b.a(j14, aVar), i11, i12);
    }

    public static g R(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        g gVar = (g) temporalAccessor.z(j$.time.temporal.q.f17535f);
        if (gVar != null) {
            return gVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static g Q(int i5, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else if (j$.time.chrono.r.f17346c.O(i5)) {
                i12 = 29;
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i5 + "' is not a leap year");
                }
                throw new b("Invalid date '" + l.S(i10).name() + " " + i11 + "'");
            }
        }
        return new g(i5, i10, i11);
    }

    public static g h0(int i5, int i10, int i11) {
        if (i10 == 2) {
            i11 = Math.min(i11, j$.time.chrono.r.f17346c.O((long) i5) ? 29 : 28);
        } else if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = Math.min(i11, 30);
        }
        return new g(i5, i10, i11);
    }

    public g(int i5, int i10, int i11) {
        this.f17472a = i5;
        this.f17473b = (short) i10;
        this.f17474c = (short) i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.q(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        int i5 = f.f17366a[aVar.ordinal()];
        if (i5 == 1) {
            return j$.time.temporal.s.f(1L, W());
        }
        if (i5 == 2) {
            return j$.time.temporal.s.f(1L, M());
        }
        if (i5 != 3) {
            return i5 != 4 ? aVar.f17512b : this.f17472a <= 0 ? j$.time.temporal.s.f(1L, 1000000000L) : j$.time.temporal.s.f(1L, 999999999L);
        }
        return j$.time.temporal.s.f(1L, (l.S(this.f17473b) != l.FEBRUARY || p()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return S(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return D();
            }
            if (pVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return S(pVar);
            }
            return ((this.f17472a * 12) + this.f17473b) - 1;
        }
        return pVar.x(this);
    }

    public final int S(j$.time.temporal.p pVar) {
        switch (f.f17366a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f17474c;
            case 2:
                return U();
            case 3:
                return ((this.f17474c - 1) / 7) + 1;
            case 4:
                int i5 = this.f17472a;
                return i5 >= 1 ? i5 : 1 - i5;
            case 5:
                return T().getValue();
            case 6:
                return ((this.f17474c - 1) % 7) + 1;
            case 7:
                return ((U() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((U() - 1) / 7) + 1;
            case 10:
                return this.f17473b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f17472a;
            case 13:
                return this.f17472a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.k a() {
        return j$.time.chrono.r.f17346c;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l G() {
        return this.f17472a >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    public final int U() {
        return (l.S(this.f17473b).P(p()) + this.f17474c) - 1;
    }

    public final d T() {
        return d.P(((int) j$.com.android.tools.r8.a.R(D() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.b
    public final boolean p() {
        return j$.time.chrono.r.f17346c.O(this.f17472a);
    }

    public final int W() {
        short s8 = this.f17473b;
        return s8 != 2 ? (s8 == 4 || s8 == 6 || s8 == 9 || s8 == 11) ? 30 : 31 : p() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int M() {
        return p() ? 366 : 365;
    }

    @Override // j$.time.chrono.b
    /* renamed from: j0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g w(j$.time.temporal.m mVar) {
        if (mVar instanceof g) {
            return (g) mVar;
        }
        return (g) mVar.n(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (g) pVar.z(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.C(j);
        switch (f.f17366a[aVar.ordinal()]) {
            case 1:
                int i5 = (int) j;
                if (this.f17474c != i5) {
                    return Z(this.f17472a, this.f17473b, i5);
                }
                return this;
            case 2:
                int i10 = (int) j;
                if (U() != i10) {
                    return b0(this.f17472a, i10);
                }
                return this;
            case 3:
                return f0(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f17472a < 1) {
                    j = 1 - j;
                }
                return k0((int) j);
            case 5:
                return d0(j - T().getValue());
            case 6:
                return d0(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return d0(j - C(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return a0(j);
            case 9:
                return f0(j - C(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i11 = (int) j;
                if (this.f17473b != i11) {
                    j$.time.temporal.a.MONTH_OF_YEAR.C(i11);
                    return h0(this.f17472a, i11, this.f17474c);
                }
                return this;
            case 11:
                return e0(j - (((this.f17472a * 12) + this.f17473b) - 1));
            case 12:
                return k0((int) j);
            case 13:
                if (C(j$.time.temporal.a.ERA) != j) {
                    return k0(1 - this.f17472a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
    }

    public final g k0(int i5) {
        if (this.f17472a == i5) {
            return this;
        }
        j$.time.temporal.a.YEAR.C(i5);
        return h0(i5, this.f17473b, this.f17474c);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b J(j$.time.temporal.o oVar) {
        if (oVar != null) {
            q qVar = (q) oVar;
            return e0((qVar.f17498a * 12) + qVar.f17499b).d0(qVar.f17500c);
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (g) ((q) oVar).i(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final g d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (g) temporalUnit.i(this, j);
        }
        switch (f.f17367b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return d0(j);
            case 2:
                return f0(j);
            case 3:
                return e0(j);
            case 4:
                return g0(j);
            case 5:
                return g0(j$.com.android.tools.r8.a.T(j, 10));
            case 6:
                return g0(j$.com.android.tools.r8.a.T(j, 100));
            case 7:
                return g0(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.N(C(aVar), j), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    public final g g0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return h0(aVar.f17512b.a(this.f17472a + j, aVar), this.f17473b, this.f17474c);
    }

    public final g e0(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = (this.f17472a * 12) + (this.f17473b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j10 = 12;
        return h0(aVar.f17512b.a(j$.com.android.tools.r8.a.S(j6, j10), aVar), ((int) j$.com.android.tools.r8.a.R(j6, j10)) + 1, this.f17474c);
    }

    public final g f0(long j) {
        return d0(j$.com.android.tools.r8.a.T(j, 7));
    }

    public final g d0(long j) {
        if (j == 0) {
            return this;
        }
        long j6 = this.f17474c + j;
        if (j6 > 0) {
            if (j6 <= 28) {
                return new g(this.f17472a, this.f17473b, (int) j6);
            }
            if (j6 <= 59) {
                long W = W();
                if (j6 <= W) {
                    return new g(this.f17472a, this.f17473b, (int) j6);
                }
                short s8 = this.f17473b;
                if (s8 < 12) {
                    return new g(this.f17472a, s8 + 1, (int) (j6 - W));
                }
                j$.time.temporal.a.YEAR.C(this.f17472a + 1);
                return new g(this.f17472a + 1, 1, (int) (j6 - W));
            }
        }
        return a0(j$.com.android.tools.r8.a.N(D(), j));
    }

    @Override // j$.time.temporal.l
    /* renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g x(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, temporalUnit).d(1L, temporalUnit) : d(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        return xVar == j$.time.temporal.q.f17535f ? this : j$.com.android.tools.r8.a.s(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime E(j jVar) {
        return LocalDateTime.S(this, jVar);
    }

    @Override // j$.time.chrono.b
    public final long D() {
        long j = this.f17472a;
        long j6 = this.f17473b;
        long j10 = 365 * j;
        long j11 = (((367 * j6) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j10 : j10 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.f17474c - 1);
        if (j6 > 2) {
            j11 = !p() ? j11 - 2 : j11 - 1;
        }
        return j11 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof g) {
            return P((g) bVar);
        }
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public final int P(g gVar) {
        int i5 = this.f17472a - gVar.f17472a;
        if (i5 != 0) {
            return i5;
        }
        int i10 = this.f17473b - gVar.f17473b;
        return i10 == 0 ? this.f17474c - gVar.f17474c : i10;
    }

    public final boolean V(j$.time.chrono.b bVar) {
        return bVar instanceof g ? P((g) bVar) < 0 : D() < bVar.D();
    }

    @Override // j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && P((g) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i5 = this.f17472a;
        return (((i5 << 11) + (this.f17473b << 6)) + this.f17474c) ^ (i5 & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i5 = this.f17472a;
        short s8 = this.f17473b;
        short s10 = this.f17474c;
        int abs = Math.abs(i5);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs >= 1000) {
            if (i5 > 9999) {
                sb2.append('+');
            }
            sb2.append(i5);
        } else if (i5 < 0) {
            sb2.append(i5 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i5 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            sb2.deleteCharAt(0);
        }
        sb2.append(s8 < 10 ? "-0" : "-");
        sb2.append((int) s8);
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
