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
public final class t implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17505b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f17506a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17506a - ((t) obj).f17506a;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public static t P(int i5) {
        j$.time.temporal.a.YEAR.C(i5);
        return new t(i5);
    }

    public t(int i5) {
        this.f17506a = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.f17506a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(C(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i5 = s.f17503a[((j$.time.temporal.a) pVar).ordinal()];
        if (i5 == 1) {
            int i10 = this.f17506a;
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i5 == 2) {
            return this.f17506a;
        }
        if (i5 == 3) {
            return this.f17506a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final t c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (t) pVar.z(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.C(j);
        int i5 = s.f17503a[aVar.ordinal()];
        if (i5 == 1) {
            if (this.f17506a < 1) {
                j = 1 - j;
            }
            return P((int) j);
        }
        if (i5 == 2) {
            return P((int) j);
        }
        if (i5 == 3) {
            return C(j$.time.temporal.a.ERA) == j ? this : P(1 - this.f17506a);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final t d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (t) temporalUnit.i(this, j);
        }
        int i5 = s.f17504b[((ChronoUnit) temporalUnit).ordinal()];
        if (i5 == 1) {
            return R(j);
        }
        if (i5 == 2) {
            return R(j$.com.android.tools.r8.a.T(j, 10));
        }
        if (i5 == 3) {
            return R(j$.com.android.tools.r8.a.T(j, 100));
        }
        if (i5 == 4) {
            return R(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
        }
        if (i5 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(j$.com.android.tools.r8.a.N(C(aVar), j), aVar);
        }
        throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
    }

    public final t R(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return P(aVar.f17512b.a(this.f17506a + j, aVar));
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
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.q.c(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.L(lVar).equals(j$.time.chrono.r.f17346c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return lVar.c(this.f17506a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f17506a == ((t) obj).f17506a;
    }

    public final int hashCode() {
        return this.f17506a;
    }

    public final String toString() {
        return Integer.toString(this.f17506a);
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return (t) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
