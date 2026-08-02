package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public final class x implements TemporalAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f17463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f17464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.k f17465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f17466d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    public x(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.k kVar, ZoneId zoneId) {
        this.f17463a = bVar;
        this.f17464b = temporalAccessor;
        this.f17465c = kVar;
        this.f17466d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f17463a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.e(pVar);
        }
        return this.f17464b.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f17463a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.k(pVar);
        }
        return this.f17464b.k(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.f17463a;
        if (bVar != null && pVar.isDateBased()) {
            return bVar.C(pVar);
        }
        return this.f17464b.C(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.x xVar) {
        if (xVar == j$.time.temporal.q.f17531b) {
            return this.f17465c;
        }
        if (xVar == j$.time.temporal.q.f17530a) {
            return this.f17466d;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return this.f17464b.z(xVar);
        }
        return xVar.g(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.k kVar = this.f17465c;
        if (kVar != null) {
            str = " with chronology " + kVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f17466d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f17464b + str + str2;
    }
}
