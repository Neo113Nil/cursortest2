package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
final class b extends org.joda.time.field.f {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79181d;

    b(BasicChronology basicChronology, org.joda.time.d dVar) {
        super(DateTimeFieldType.L(), dVar);
        this.f79181d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79181d.b0();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        return this.f79181d.H0(j11);
    }

    @Override // org.joda.time.field.a
    protected final int Q(int i11, long j11) {
        this.f79181d.getClass();
        if (i11 > 365 || i11 < 1) {
            return v(j11);
        }
        return 365;
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        BasicChronology basicChronology = this.f79181d;
        return ((int) ((j11 - basicChronology.F0(basicChronology.D0(j11))) / 86400000)) + 1;
    }

    @Override // org.joda.time.b
    public final int u() {
        this.f79181d.getClass();
        return 366;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int v(long j11) {
        BasicChronology basicChronology = this.f79181d;
        return basicChronology.I0(basicChronology.D0(j11)) ? 366 : 365;
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final int y() {
        return 1;
    }
}
