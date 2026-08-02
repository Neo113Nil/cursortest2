package j$.time.chrono;

import com.sports.insider.data.repository.room.news.NewsTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    public final transient f f17327a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f17328b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ZoneId f17329c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.l(this, pVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long toEpochSecond() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.x xVar) {
        return j$.com.android.tools.r8.a.u(this, xVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    public static j P(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, fVar);
        }
        j$.time.zone.f Q = zoneId.Q();
        LocalDateTime Q2 = LocalDateTime.Q(fVar);
        List f6 = Q.f(Q2);
        if (f6.size() == 1) {
            zoneOffset = (ZoneOffset) f6.get(0);
        } else if (f6.size() != 0) {
            if (zoneOffset == null || !f6.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f6.get(0);
            }
            fVar = fVar;
        } else {
            Object e7 = Q.e(Q2);
            j$.time.zone.b bVar = e7 instanceof j$.time.zone.b ? (j$.time.zone.b) e7 : null;
            fVar = fVar.R(fVar.f17314a, 0L, 0L, Duration.j(bVar.f17574d.f17297b - bVar.f17573c.f17297b, 0).getSeconds(), 0L);
            zoneOffset = bVar.f17574d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, fVar);
    }

    public static j Q(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.Q().d(instant);
        Objects.requireNonNull(d10, "offset");
        return new j(zoneId, d10, (f) kVar.F(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), d10)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((f) o()).k(pVar);
            }
            return ((j$.time.temporal.a) pVar).f17512b;
        }
        return pVar.j(this);
    }

    public static j n(k kVar, j$.time.temporal.l lVar) {
        j jVar = (j) lVar;
        if (kVar.equals(jVar.a())) {
            return jVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + jVar.a().getId());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i5 = h.f17323a[((j$.time.temporal.a) pVar).ordinal()];
            if (i5 == 1) {
                return toEpochSecond();
            }
            if (i5 != 2) {
                return ((f) o()).C(pVar);
            }
            return g().f17297b;
        }
        return pVar.x(this);
    }

    public j(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.f17327a = (f) Objects.requireNonNull(fVar, NewsTable.DATE_TIME_COLUMN);
        this.f17328b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f17329c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f17328b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b f() {
        return ((f) o()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j b() {
        return ((f) o()).b();
    }

    public final int hashCode() {
        return (this.f17327a.hashCode() ^ this.f17328b.f17297b) ^ Integer.rotateLeft(this.f17329c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime o() {
        return this.f17327a;
    }

    public final String toString() {
        String str = this.f17327a.toString() + this.f17328b.f17298c;
        ZoneOffset zoneOffset = this.f17328b;
        ZoneId zoneId = this.f17329c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId B() {
        return this.f17329c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime v(ZoneId zoneId) {
        return P(zoneId, this.f17328b, this.f17327a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return n(a(), pVar.z(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i5 = i.f17325a[aVar.ordinal()];
        if (i5 == 1) {
            return d(j - j$.com.android.tools.r8.a.x(this), ChronoUnit.SECONDS);
        }
        if (i5 != 2) {
            return P(this.f17329c, this.f17328b, this.f17327a.c(j, pVar));
        }
        ZoneOffset X = ZoneOffset.X(aVar.f17512b.a(j, aVar));
        f fVar = this.f17327a;
        fVar.getClass();
        return Q(a(), Instant.R(j$.com.android.tools.r8.a.w(fVar, X), fVar.f17315b.f17485d), this.f17329c);
    }

    @Override // j$.time.temporal.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final j d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return n(a(), this.f17327a.d(j, temporalUnit).n(this));
        }
        return n(a(), temporalUnit.i(this, j));
    }

    private Object writeReplace() {
        return new d0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.g(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(j$.time.g gVar) {
        return n(a(), gVar.n(this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return n(a(), j$.time.temporal.q.b(this, j, chronoUnit));
    }
}
