package j$.time.chrono;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* renamed from: N */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public abstract b Q(long j);

    public abstract b R(long j);

    public abstract b S(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.q(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.x xVar) {
        return j$.com.android.tools.r8.a.s(this, xVar);
    }

    public static b P(k kVar, j$.time.temporal.l lVar) {
        b bVar = (b) lVar;
        if (kVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + kVar.getId() + ", actual: " + bVar.a().getId());
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime E(j$.time.j jVar) {
        return new f(this, jVar);
    }

    @Override // j$.time.temporal.l
    public b d(long j, TemporalUnit temporalUnit) {
        boolean z5 = temporalUnit instanceof ChronoUnit;
        if (!z5) {
            if (!z5) {
                return P(a(), temporalUnit.i(this, j));
            }
            throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
        switch (c.f17308a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Q(j);
            case 2:
                return Q(j$.com.android.tools.r8.a.T(j, 7));
            case 3:
                return R(j);
            case 4:
                return S(j);
            case 5:
                return S(j$.com.android.tools.r8.a.T(j, 10));
            case 6:
                return S(j$.com.android.tools.r8.a.T(j, 100));
            case 7:
                return S(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.N(C(aVar), j), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.b
    public l G() {
        return a().t(j$.time.temporal.q.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.b
    public boolean p() {
        return a().O(C(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.chrono.b
    public int M() {
        return p() ? 366 : 365;
    }

    @Override // j$.time.chrono.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.e(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long D = D();
        return ((int) (D ^ (D >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.l
    public b w(j$.time.temporal.m mVar) {
        return P(a(), mVar.n(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long C = C(j$.time.temporal.a.YEAR_OF_ERA);
        long C2 = C(j$.time.temporal.a.MONTH_OF_YEAR);
        long C3 = C(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(" ");
        sb2.append(G());
        sb2.append(" ");
        sb2.append(C);
        sb2.append(C2 < 10 ? "-0" : "-");
        sb2.append(C2);
        sb2.append(C3 < 10 ? "-0" : "-");
        sb2.append(C3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.l
    public b c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
        return P(a(), pVar.z(this, j));
    }

    @Override // j$.time.chrono.b
    public b J(j$.time.temporal.o oVar) {
        return P(a(), oVar.i(this));
    }

    @Override // j$.time.temporal.l
    /* renamed from: r */
    public b x(long j, TemporalUnit temporalUnit) {
        return P(a(), j$.time.temporal.q.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.b
    public long D() {
        return C(j$.time.temporal.a.EPOCH_DAY);
    }
}
