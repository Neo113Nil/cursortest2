package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements ChronoLocalDateTime, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    public final transient b f17314a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.j f17315b;

    @Override // java.lang.Comparable
    /* renamed from: H */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.w(this, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.x xVar) {
        return j$.com.android.tools.r8.a.t(this, xVar);
    }

    public static f P(k kVar, j$.time.temporal.l lVar) {
        f fVar = (f) lVar;
        if (kVar.equals(fVar.f17314a.a())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + fVar.f17314a.a().getId());
    }

    public f(b bVar, j$.time.j jVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(jVar, "time");
        this.f17314a = bVar;
        this.f17315b = jVar;
    }

    public final f T(j$.time.temporal.l lVar, j$.time.j jVar) {
        b bVar = this.f17314a;
        return (bVar == lVar && this.f17315b == jVar) ? this : new f(d.P(bVar.a(), lVar), jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k a() {
        return this.f17314a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b f() {
        return this.f17314a;
    }

    public final int hashCode() {
        return this.f17314a.hashCode() ^ this.f17315b.hashCode();
    }

    public final String toString() {
        return this.f17314a.toString() + "T" + this.f17315b.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return P(this.f17314a.a(), j$.time.temporal.q.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.j b() {
        return this.f17315b;
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
            if (!((j$.time.temporal.a) pVar).P()) {
                return this.f17314a.k(pVar);
            }
            j$.time.j jVar = this.f17315b;
            jVar.getClass();
            return j$.time.temporal.q.d(jVar, pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).P() ? this.f17315b.i(pVar) : this.f17314a.i(pVar);
        }
        return k(pVar).a(C(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).P() ? this.f17315b.C(pVar) : this.f17314a.C(pVar);
        }
        return pVar.x(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(j$.time.g gVar) {
        return T(gVar, this.f17315b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final f c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).P()) {
                return T(this.f17314a, this.f17315b.c(j, pVar));
            }
            return T(this.f17314a.c(j, pVar), this.f17315b);
        }
        return P(this.f17314a.a(), pVar.z(this, j));
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final f d(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return P(this.f17314a.a(), temporalUnit.i(this, j));
        }
        switch (e.f17312a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return R(this.f17314a, 0L, 0L, 0L, j);
            case 2:
                f T = T(this.f17314a.d(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.f17315b);
                return T.R(T.f17314a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                f T2 = T(this.f17314a.d(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.f17315b);
                return T2.R(T2.f17314a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return R(this.f17314a, 0L, 0L, j, 0L);
            case 5:
                return R(this.f17314a, 0L, j, 0L, 0L);
            case 6:
                return R(this.f17314a, j, 0L, 0L, 0L);
            case 7:
                f T3 = T(this.f17314a.d(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.f17315b);
                return T3.R(T3.f17314a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return T(this.f17314a.d(j, temporalUnit), this.f17315b);
        }
    }

    public final f R(b bVar, long j, long j6, long j10, long j11) {
        if ((j | j6 | j10 | j11) == 0) {
            return T(bVar, this.f17315b);
        }
        long j12 = j / 24;
        long j13 = ((j % 24) * 3600000000000L) + ((j6 % 1440) * 60000000000L) + ((j10 % 86400) * 1000000000) + (j11 % 86400000000000L);
        long b02 = this.f17315b.b0();
        long j14 = j13 + b02;
        long S = j$.com.android.tools.r8.a.S(j14, 86400000000000L) + j12 + (j6 / 1440) + (j10 / 86400) + (j11 / 86400000000000L);
        long R = j$.com.android.tools.r8.a.R(j14, 86400000000000L);
        return T(bVar.d(S, (TemporalUnit) ChronoUnit.DAYS), R == b02 ? this.f17315b : j$.time.j.U(R));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return j.P(zoneId, null, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(f().D(), j$.time.temporal.a.EPOCH_DAY).c(b().b0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new d0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.com.android.tools.r8.a.f(this, (ChronoLocalDateTime) obj) == 0;
    }
}
