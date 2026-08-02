package j$.time;

import com.sports.insider.data.repository.room.news.NewsTable;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, ChronoZonedDateTime<g>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f17299a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17300b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneId f17301c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k a() {
        return ((g) f()).a();
    }

    public static ZonedDateTime P(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f Q = zoneId.Q();
        List f6 = Q.f(localDateTime);
        if (f6.size() == 1) {
            zoneOffset = (ZoneOffset) f6.get(0);
        } else if (f6.size() != 0) {
            if (zoneOffset == null || !f6.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f6.get(0), "offset");
            }
        } else {
            Object e7 = Q.e(localDateTime);
            j$.time.zone.b bVar = e7 instanceof j$.time.zone.b ? (j$.time.zone.b) e7 : null;
            localDateTime = localDateTime.U(Duration.j(bVar.f17574d.f17297b - bVar.f17573c.f17297b, 0).getSeconds());
            zoneOffset = bVar.f17574d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return n(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime n(long j, int i5, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.Q().d(Instant.R(j, i5));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j, i5, d10), zoneId, d10);
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String charSequence2;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        x xVar = new x(0);
        dateTimeFormatter.getClass();
        Objects.requireNonNull(charSequence, NewsTable.TEXT_COLUMN);
        Objects.requireNonNull(xVar, "query");
        try {
            return (ZonedDateTime) dateTimeFormatter.a(charSequence).z(xVar);
        } catch (j$.time.format.w e7) {
            throw e7;
        } catch (RuntimeException e9) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            j$.time.format.w wVar = new j$.time.format.w("Text '" + charSequence2 + "' could not be parsed: " + e9.getMessage(), e9);
            charSequence.toString();
            throw wVar;
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f17299a = localDateTime;
        this.f17300b = zoneOffset;
        this.f17301c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).f17512b;
            }
            return this.f17299a.k(pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i5 = y.f17567a[((j$.time.temporal.a) pVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 == 2) {
                return this.f17300b.f17297b;
            }
            return this.f17299a.i(pVar);
        }
        return j$.com.android.tools.r8.a.l(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i5 = y.f17567a[((j$.time.temporal.a) pVar).ordinal()];
        return i5 != 1 ? i5 != 2 ? this.f17299a.C(pVar) : this.f17300b.f17297b : j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f17300b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId B() {
        return this.f17301c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime v(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f17301c.equals(zoneId) ? this : P(this.f17299a, zoneId, this.f17300b);
    }

    public ZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f17301c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f17299a;
        ZoneOffset zoneOffset = this.f17300b;
        localDateTime.getClass();
        return n(j$.com.android.tools.r8.a.w(localDateTime, zoneOffset), this.f17299a.f17288b.f17485d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime o() {
        return this.f17299a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.b f() {
        return this.f17299a.f17287a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j b() {
        return this.f17299a.f17288b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return P(LocalDateTime.S(gVar, this.f17299a.f17288b), this.f17301c, this.f17300b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i5 = y.f17567a[aVar.ordinal()];
            if (i5 == 1) {
                return n(j, this.f17299a.f17288b.f17485d, this.f17301c);
            }
            if (i5 != 2) {
                return P(this.f17299a.c(j, pVar), this.f17301c, this.f17300b);
            }
            ZoneOffset X = ZoneOffset.X(aVar.f17512b.a(j, aVar));
            return (X.equals(this.f17300b) || !this.f17301c.Q().f(this.f17299a).contains(X)) ? this : new ZonedDateTime(this.f17299a, this.f17301c, X);
        }
        return (ZonedDateTime) pVar.z(this, j);
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.i(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return P(this.f17299a.d(j, temporalUnit), this.f17301c, this.f17300b);
        }
        LocalDateTime d10 = this.f17299a.d(j, temporalUnit);
        ZoneOffset zoneOffset = this.f17300b;
        ZoneId zoneId = this.f17301c;
        Objects.requireNonNull(d10, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.Q().f(d10).contains(zoneOffset)) {
            return new ZonedDateTime(d10, zoneId, zoneOffset);
        }
        d10.getClass();
        return n(j$.com.android.tools.r8.a.w(d10, zoneOffset), d10.f17288b.f17485d, zoneId);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17535f) {
            return this.f17299a.f17287a;
        }
        return j$.com.android.tools.r8.a.u(this, xVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f17299a.equals(zonedDateTime.f17299a) && this.f17300b.equals(zonedDateTime.f17300b) && this.f17301c.equals(zonedDateTime.f17301c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17299a.hashCode() ^ this.f17300b.f17297b) ^ Integer.rotateLeft(this.f17301c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f17299a.toString() + this.f17300b.f17298c;
        ZoneOffset zoneOffset = this.f17300b;
        ZoneId zoneId = this.f17301c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
