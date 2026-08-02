package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
final class d extends org.joda.time.field.f {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79183d;

    d(BasicChronology basicChronology, org.joda.time.d dVar) {
        super(DateTimeFieldType.b0(), dVar);
        this.f79183d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79183d.V();
    }

    @Override // org.joda.time.field.f, org.joda.time.field.a, org.joda.time.b
    public final long G(long j11) {
        return super.G(j11 + 259200000);
    }

    @Override // org.joda.time.field.f, org.joda.time.field.a, org.joda.time.b
    public final long H(long j11) {
        return super.H(j11 + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final long I(long j11) {
        return super.I(j11 + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.a
    protected final int Q(int i11, long j11) {
        if (i11 > 52) {
            return v(j11);
        }
        return 52;
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        BasicChronology basicChronology = this.f79183d;
        return basicChronology.A0(basicChronology.D0(j11), j11);
    }

    @Override // org.joda.time.b
    public final int u() {
        return 53;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int v(long j11) {
        BasicChronology basicChronology = this.f79183d;
        return basicChronology.B0(basicChronology.C0(j11));
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final int y() {
        return 1;
    }
}
