package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class p implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17494c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final j f17495a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f17496b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        if (this.f17496b.equals(pVar.f17496b)) {
            return this.f17495a.compareTo(pVar.f17495a);
        }
        int compare = Long.compare(this.f17495a.b0() - (this.f17496b.f17297b * 1000000000), pVar.f17495a.b0() - (pVar.f17496b.f17297b * 1000000000));
        return compare == 0 ? this.f17495a.compareTo(pVar.f17495a) : compare;
    }

    static {
        j jVar = j.f17478e;
        ZoneOffset zoneOffset = ZoneOffset.f17296g;
        jVar.getClass();
        new p(jVar, zoneOffset);
        j jVar2 = j.f17479f;
        ZoneOffset zoneOffset2 = ZoneOffset.f17295f;
        jVar2.getClass();
        new p(jVar2, zoneOffset2);
    }

    public p(j jVar, ZoneOffset zoneOffset) {
        this.f17495a = (j) Objects.requireNonNull(jVar, "time");
        this.f17496b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final p Q(j jVar, ZoneOffset zoneOffset) {
        return (this.f17495a == jVar && this.f17496b.equals(zoneOffset)) ? this : new p(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).P() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                j jVar = this.f17495a;
                jVar.getClass();
                return j$.time.temporal.q.d(jVar, pVar);
            }
            return ((j$.time.temporal.a) pVar).f17512b;
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f17496b.f17297b;
            }
            return this.f17495a.C(pVar);
        }
        return pVar.x(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                return Q(this.f17495a, ZoneOffset.X(aVar.f17512b.a(j, aVar)));
            }
            return Q(this.f17495a.c(j, pVar), this.f17496b);
        }
        return (p) pVar.z(this, j);
    }

    @Override // j$.time.temporal.l
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final p d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return Q(this.f17495a.d(j, temporalUnit), this.f17496b);
        }
        return (p) temporalUnit.i(this, j);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17533d || xVar == j$.time.temporal.q.f17534e) {
            return this.f17496b;
        }
        if (((xVar == j$.time.temporal.q.f17530a) || (xVar == j$.time.temporal.q.f17531b)) || xVar == j$.time.temporal.q.f17535f) {
            return null;
        }
        if (xVar == j$.time.temporal.q.f17536g) {
            return this.f17495a;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.NANOS;
        }
        return xVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.f17495a.b0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f17496b.f17297b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f17495a.equals(pVar.f17495a) && this.f17496b.equals(pVar.f17496b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17495a.hashCode() ^ this.f17496b.f17297b;
    }

    public final String toString() {
        return this.f17495a.toString() + this.f17496b.f17298c;
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return (p) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
