package j$.time;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f17282c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f17283a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17284b;

    public static Instant now() {
        a.f17302b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f17283a, instant2.f17283a);
        return compare != 0 ? compare : this.f17284b - instant2.f17284b;
    }

    static {
        R(-31557014167219200L, 0L);
        R(31556889864403199L, 999999999L);
    }

    public static Instant ofEpochSecond(long j) {
        return P(j, 0);
    }

    public static Instant R(long j, long j6) {
        return P(j$.com.android.tools.r8.a.N(j, j$.com.android.tools.r8.a.S(j6, 1000000000L)), (int) j$.com.android.tools.r8.a.R(j6, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j6 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        return P(j$.com.android.tools.r8.a.S(j, j6), ((int) j$.com.android.tools.r8.a.R(j, j6)) * 1000000);
    }

    public static Instant Q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return R(temporalAccessor.C(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.i(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e7) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e7);
        }
    }

    public static Instant P(long j, int i5) {
        if ((i5 | j) == 0) {
            return f17282c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i5);
    }

    public Instant(long j, int i5) {
        this.f17283a = j;
        this.f17284b = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.d(this, pVar).a(pVar.x(this), pVar);
        }
        int i5 = e.f17364a[((j$.time.temporal.a) pVar).ordinal()];
        if (i5 == 1) {
            return this.f17284b;
        }
        if (i5 == 2) {
            return this.f17284b / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (i5 == 3) {
            return this.f17284b / 1000000;
        }
        if (i5 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f17512b.a(this.f17283a, aVar);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        int i5;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i10 = e.f17364a[((j$.time.temporal.a) pVar).ordinal()];
        if (i10 == 1) {
            i5 = this.f17284b;
        } else if (i10 == 2) {
            i5 = this.f17284b / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f17283a;
                }
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
            }
            i5 = this.f17284b / 1000000;
        }
        return i5;
    }

    public long getEpochSecond() {
        return this.f17283a;
    }

    public int getNano() {
        return this.f17284b;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.z(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.C(j);
        int i5 = e.f17364a[aVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                int i10 = ((int) j) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                if (i10 != this.f17284b) {
                    return P(this.f17283a, i10);
                }
            } else if (i5 == 3) {
                int i11 = ((int) j) * 1000000;
                if (i11 != this.f17284b) {
                    return P(this.f17283a, i11);
                }
            } else {
                if (i5 != 4) {
                    throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
                }
                if (j != this.f17283a) {
                    return P(j, this.f17284b);
                }
            }
        } else if (j != this.f17284b) {
            return P(this.f17283a, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.i(this, j);
        }
        switch (e.f17365b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return S(0L, j);
            case 2:
                return S(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return S(j / 1000, (j % 1000) * 1000000);
            case 4:
                return S(j, 0L);
            case 5:
                return S(j$.com.android.tools.r8.a.T(j, 60), 0L);
            case 6:
                return S(j$.com.android.tools.r8.a.T(j, 3600), 0L);
            case 7:
                return S(j$.com.android.tools.r8.a.T(j, 43200), 0L);
            case 8:
                return S(j$.com.android.tools.r8.a.T(j, 86400), 0L);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    public final Instant S(long j, long j6) {
        if ((j | j6) == 0) {
            return this;
        }
        return R(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(this.f17283a, j), j6 / 1000000000), this.f17284b + (j6 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.NANOS;
        }
        if (xVar == j$.time.temporal.q.f17531b || xVar == j$.time.temporal.q.f17530a || xVar == j$.time.temporal.q.f17534e || xVar == j$.time.temporal.q.f17533d || xVar == j$.time.temporal.q.f17535f || xVar == j$.time.temporal.q.f17536g) {
            return null;
        }
        return xVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.f17283a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f17284b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.P(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j = this.f17283a;
        return (j >= 0 || this.f17284b <= 0) ? j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), this.f17284b / 1000000) : j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j + 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT), (this.f17284b / 1000000) - AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f17283a == instant.f17283a && this.f17284b == instant.f17284b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17283a;
        return (this.f17284b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return (Instant) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
