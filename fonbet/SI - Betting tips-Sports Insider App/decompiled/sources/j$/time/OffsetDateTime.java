package j$.time;

import com.sports.insider.data.repository.room.news.NewsTable;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17289c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f17290a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17291b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f17291b.equals(offsetDateTime2.f17291b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f17290a;
            ZoneOffset zoneOffset = this.f17291b;
            localDateTime.getClass();
            long w10 = j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.f17290a;
            ZoneOffset zoneOffset2 = offsetDateTime2.f17291b;
            localDateTime2.getClass();
            compare = Long.compare(w10, j$.com.android.tools.r8.a.w(localDateTime2, zoneOffset2));
            if (compare == 0) {
                compare = this.f17290a.f17288b.f17485d - offsetDateTime2.f17290a.f17288b.f17485d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f17285c;
        ZoneOffset zoneOffset = ZoneOffset.f17296g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f17286d;
        ZoneOffset zoneOffset2 = ZoneOffset.f17295f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime P(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d10 = zoneId.Q().d(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), d10), d10);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f17290a = (LocalDateTime) Objects.requireNonNull(localDateTime, NewsTable.DATE_TIME_COLUMN);
        this.f17291b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f17290a == localDateTime && this.f17291b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f17290a.k(pVar);
            }
            return ((j$.time.temporal.a) pVar).f17512b;
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i5 = o.f17493a[((j$.time.temporal.a) pVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 == 2) {
                return this.f17291b.f17297b;
            }
            return this.f17290a.i(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i5 = o.f17493a[((j$.time.temporal.a) pVar).ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? this.f17290a.C(pVar) : this.f17291b.f17297b;
        }
        LocalDateTime localDateTime = this.f17290a;
        ZoneOffset zoneOffset = this.f17291b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f17290a;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        LocalDateTime localDateTime = this.f17290a;
        return R(localDateTime.X(gVar, localDateTime.f17288b), this.f17291b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i5 = o.f17493a[aVar.ordinal()];
            if (i5 == 1) {
                return P(Instant.R(j, this.f17290a.f17288b.f17485d), this.f17291b);
            }
            if (i5 == 2) {
                return R(this.f17290a, ZoneOffset.X(aVar.f17512b.a(j, aVar)));
            }
            return R(this.f17290a.c(j, pVar), this.f17291b);
        }
        return (OffsetDateTime) pVar.z(this, j);
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return R(this.f17290a.d(j, temporalUnit), this.f17291b);
        }
        return (OffsetDateTime) temporalUnit.i(this, j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17533d || xVar == j$.time.temporal.q.f17534e) {
            return this.f17291b;
        }
        if (xVar == j$.time.temporal.q.f17530a) {
            return null;
        }
        if (xVar == j$.time.temporal.q.f17535f) {
            return this.f17290a.f17287a;
        }
        if (xVar == j$.time.temporal.q.f17536g) {
            return this.f17290a.f17288b;
        }
        if (xVar == j$.time.temporal.q.f17531b) {
            return j$.time.chrono.r.f17346c;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.NANOS;
        }
        return xVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.f17290a.f17287a.D(), j$.time.temporal.a.EPOCH_DAY).c(this.f17290a.f17288b.b0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f17291b.f17297b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f17290a.equals(offsetDateTime.f17290a) && this.f17291b.equals(offsetDateTime.f17291b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17290a.hashCode() ^ this.f17291b.f17297b;
    }

    public final String toString() {
        return this.f17290a.toString() + this.f17291b.f17298c;
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
