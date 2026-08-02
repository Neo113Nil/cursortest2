package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
final class a extends org.joda.time.field.f {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79180d;

    a(BasicChronology basicChronology, org.joda.time.d dVar) {
        super(DateTimeFieldType.J(), dVar);
        this.f79180d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79180d.M();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        return this.f79180d.H0(j11);
    }

    @Override // org.joda.time.field.a
    protected final int Q(int i11, long j11) {
        return this.f79180d.r0(i11, j11);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        BasicChronology basicChronology = this.f79180d;
        int D02 = basicChronology.D0(j11);
        return basicChronology.p0(D02, basicChronology.y0(D02, j11), j11);
    }

    @Override // org.joda.time.b
    public final int u() {
        this.f79180d.getClass();
        return 31;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int v(long j11) {
        BasicChronology basicChronology = this.f79180d;
        int D02 = basicChronology.D0(j11);
        return basicChronology.s0(D02, basicChronology.y0(D02, j11));
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final int y() {
        return 1;
    }
}
