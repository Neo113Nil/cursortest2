package org.joda.time.chrono;

import B0.A0;
import Bl0.k0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ImpreciseDateTimeField;

/* loaded from: classes6.dex */
final class f extends ImpreciseDateTimeField {

    /* renamed from: d, reason: collision with root package name */
    protected final BasicChronology f79185d;

    f(BasicChronology basicChronology) {
        super(DateTimeFieldType.e0(), basicChronology.l0());
        this.f79185d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return null;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        BasicChronology basicChronology = this.f79185d;
        return basicChronology.I0(basicChronology.D0(j11));
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long G(long j11) {
        return j11 - I(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long H(long j11) {
        BasicChronology basicChronology = this.f79185d;
        int D02 = basicChronology.D0(j11);
        return j11 != basicChronology.F0(D02) ? basicChronology.F0(D02 + 1) : j11;
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        BasicChronology basicChronology = this.f79185d;
        return basicChronology.F0(basicChronology.D0(j11));
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        BasicChronology basicChronology = this.f79185d;
        k0.w(this, i11, basicChronology.w0(), basicChronology.u0());
        return basicChronology.J0(i11, j11);
    }

    @Override // org.joda.time.b
    public final long O(int i11, long j11) {
        BasicChronology basicChronology = this.f79185d;
        k0.w(this, i11, basicChronology.w0() - 1, basicChronology.u0() + 1);
        return basicChronology.J0(i11, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        if (i11 == 0) {
            return j11;
        }
        int D02 = this.f79185d.D0(j11);
        int i12 = D02 + i11;
        if ((D02 ^ i12) >= 0 || (D02 ^ i11) < 0) {
            return M(i12, j11);
        }
        throw new ArithmeticException(A0.a(D02, i11, "The calculation caused an overflow: ", " + "));
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long b(long j11, long j12) {
        return a(k0.v(j12), j11);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        return this.f79185d.D0(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        BasicChronology basicChronology = this.f79185d;
        return j11 < j12 ? -basicChronology.E0(j12, j11) : basicChronology.E0(j11, j12);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final org.joda.time.d p() {
        return this.f79185d.j();
    }

    @Override // org.joda.time.b
    public final int u() {
        return this.f79185d.u0();
    }

    @Override // org.joda.time.b
    public final int y() {
        return this.f79185d.w0();
    }
}
