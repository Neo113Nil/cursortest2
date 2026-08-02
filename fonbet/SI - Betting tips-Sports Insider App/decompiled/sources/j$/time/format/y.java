package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f17467a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f17468b;

    /* renamed from: c, reason: collision with root package name */
    public int f17469c;

    public y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.k kVar = dateTimeFormatter.f17372e;
        if (kVar != null) {
            j$.time.chrono.k kVar2 = (j$.time.chrono.k) temporalAccessor.z(j$.time.temporal.q.f17531b);
            ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17530a);
            j$.time.chrono.b bVar = null;
            kVar = Objects.equals(kVar, kVar2) ? null : kVar;
            Objects.equals(null, zoneId);
            if (kVar != null) {
                j$.time.chrono.k kVar3 = kVar != null ? kVar : kVar2;
                if (kVar != null) {
                    if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = kVar3.A(temporalAccessor);
                    } else if (kVar != j$.time.chrono.r.f17346c || kVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.e(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + kVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new x(bVar, temporalAccessor, kVar3, zoneId);
            }
        }
        this.f17467a = temporalAccessor;
        this.f17468b = dateTimeFormatter;
    }

    public final Object b(j$.time.x xVar) {
        TemporalAccessor temporalAccessor = this.f17467a;
        Object z5 = temporalAccessor.z(xVar);
        if (z5 != null || this.f17469c != 0) {
            return z5;
        }
        throw new j$.time.b("Unable to extract " + xVar + " from temporal " + temporalAccessor);
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i5 = this.f17469c;
        TemporalAccessor temporalAccessor = this.f17467a;
        if (i5 <= 0 || temporalAccessor.e(pVar)) {
            return Long.valueOf(temporalAccessor.C(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.f17467a.toString();
    }
}
