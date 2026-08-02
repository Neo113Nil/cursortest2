package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
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
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDateTime<g>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f17285c = S(g.f17470d, j.f17478e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f17286d = S(g.f17471e, j.f17479f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final g f17287a;

    /* renamed from: b, reason: collision with root package name */
    public final j f17288b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.w(this, zoneOffset);
    }

    public static LocalDateTime now() {
        a Y = j$.com.android.tools.r8.a.Y();
        Objects.requireNonNull(Y, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return ofEpochSecond(ofEpochMilli.getEpochSecond(), ofEpochMilli.getNano(), Y.f17303a.Q().d(ofEpochMilli));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k a() {
        return ((g) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return ZonedDateTime.P(this, zoneId, null);
    }

    public static LocalDateTime S(g gVar, j jVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(((g) f()).D(), j$.time.temporal.a.EPOCH_DAY).c(b().b0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.Q().d(instant));
    }

    public static LocalDateTime ofEpochSecond(long j, int i5, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j6 = i5;
        j$.time.temporal.a.NANO_OF_SECOND.C(j6);
        return new LocalDateTime(g.a0(j$.com.android.tools.r8.a.S(j + zoneOffset.f17297b, 86400)), j.U((((int) j$.com.android.tools.r8.a.R(r5, r7)) * 1000000000) + j6));
    }

    public static LocalDateTime Q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(g.R(temporalAccessor), j.R(temporalAccessor));
            } catch (b e7) {
                throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e7);
            }
        }
        return ((ZonedDateTime) temporalAccessor).f17299a;
    }

    public LocalDateTime(g gVar, j jVar) {
        this.f17287a = gVar;
        this.f17288b = jVar;
    }

    public final LocalDateTime X(g gVar, j jVar) {
        return (this.f17287a == gVar && this.f17288b == jVar) ? this : new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.P();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).P()) {
                j jVar = this.f17288b;
                jVar.getClass();
                return j$.time.temporal.q.d(jVar, pVar);
            }
            return this.f17287a.k(pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).P() ? this.f17288b.i(pVar) : this.f17287a.i(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).P() ? this.f17288b.C(pVar) : this.f17287a.C(pVar);
        }
        return pVar.x(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b f() {
        return this.f17287a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j b() {
        return this.f17288b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return X(gVar, this.f17288b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).P()) {
                return X(this.f17287a, this.f17288b.c(j, pVar));
            }
            return X(this.f17287a.c(j, pVar), this.f17288b);
        }
        return (LocalDateTime) pVar.z(this, j);
    }

    public LocalDateTime truncatedTo(TemporalUnit temporalUnit) {
        g gVar = this.f17287a;
        j jVar = this.f17288b;
        jVar.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() > 86400) {
                throw new j$.time.temporal.r("Unit is too large to be used for truncation");
            }
            long j = duration.f17280a;
            long j6 = duration.f17281b;
            if (j < 0) {
                j++;
                j6 -= 1000000000;
            }
            long N = j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j, 1000000000L), j6);
            if (86400000000000L % N != 0) {
                throw new j$.time.temporal.r("Unit must divide into a standard day without remainder");
            }
            jVar = j.U((jVar.b0() / N) * N);
        }
        return X(gVar, jVar);
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.i(this, j);
        }
        switch (h.f17475a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return V(this.f17287a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime plusDays = plusDays(j / 86400000000L);
                return plusDays.V(plusDays.f17287a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime plusDays2 = plusDays(j / 86400000);
                return plusDays2.V(plusDays2.f17287a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return U(j);
            case 5:
                return V(this.f17287a, 0L, j, 0L, 0L);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return X(this.f17287a.d(j, temporalUnit), this.f17288b);
        }
    }

    public LocalDateTime plusDays(long j) {
        return X(this.f17287a.d0(j), this.f17288b);
    }

    public LocalDateTime plusHours(long j) {
        return V(this.f17287a, j, 0L, 0L, 0L);
    }

    public final LocalDateTime U(long j) {
        return V(this.f17287a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    public final LocalDateTime V(g gVar, long j, long j6, long j10, long j11) {
        if ((j | j6 | j10 | j11) == 0) {
            return X(gVar, this.f17288b);
        }
        long j12 = 1;
        long b02 = this.f17288b.b0();
        long j13 = ((((j % 24) * 3600000000000L) + ((j6 % 1440) * 60000000000L) + ((j10 % 86400) * 1000000000) + (j11 % 86400000000000L)) * j12) + b02;
        long S = j$.com.android.tools.r8.a.S(j13, 86400000000000L) + (((j / 24) + (j6 / 1440) + (j10 / 86400) + (j11 / 86400000000000L)) * j12);
        long R = j$.com.android.tools.r8.a.R(j13, 86400000000000L);
        return X(gVar.d0(S), R == b02 ? this.f17288b : j.U(R));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17535f) {
            return this.f17287a;
        }
        return j$.com.android.tools.r8.a.t(this, xVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return P((LocalDateTime) chronoLocalDateTime);
        }
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    public final int P(LocalDateTime localDateTime) {
        int P = this.f17287a.P(localDateTime.f17287a);
        return P == 0 ? this.f17288b.compareTo(localDateTime.f17288b) : P;
    }

    public final boolean R(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return P((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long D = this.f17287a.D();
        long D2 = chronoLocalDateTime.f().D();
        if (D >= D2) {
            return D == D2 && this.f17288b.b0() < chronoLocalDateTime.b().b0();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f17287a.equals(localDateTime.f17287a) && this.f17288b.equals(localDateTime.f17288b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17287a.hashCode() ^ this.f17288b.hashCode();
    }

    public final String toString() {
        return this.f17287a.toString() + "T" + this.f17288b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
