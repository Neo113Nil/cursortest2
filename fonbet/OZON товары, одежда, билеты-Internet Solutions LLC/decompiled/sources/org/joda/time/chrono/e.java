package org.joda.time.chrono;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ImpreciseDateTimeField;

/* loaded from: classes6.dex */
final class e extends ImpreciseDateTimeField {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79184d;

    e(BasicChronology basicChronology) {
        super(DateTimeFieldType.c0(), basicChronology.l0());
        this.f79184d = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return null;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        BasicChronology basicChronology = this.f79184d;
        return basicChronology.B0(basicChronology.C0(j11)) > 52;
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long G(long j11) {
        return j11 - I(j11);
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        BasicChronology basicChronology = this.f79184d;
        long I11 = basicChronology.R().I(j11);
        return basicChronology.A0(basicChronology.D0(I11), I11) > 1 ? I11 - ((r0 - 1) * 604800000) : I11;
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        int abs = Math.abs(i11);
        BasicChronology basicChronology = this.f79184d;
        k0.w(this, abs, basicChronology.w0(), basicChronology.u0());
        int C02 = basicChronology.C0(j11);
        if (C02 == i11) {
            return j11;
        }
        int q02 = BasicChronology.q0(j11);
        int B02 = basicChronology.B0(C02);
        int B03 = basicChronology.B0(i11);
        if (B03 < B02) {
            B02 = B03;
        }
        int A02 = basicChronology.A0(basicChronology.D0(j11), j11);
        if (A02 <= B02) {
            B02 = A02;
        }
        long J02 = basicChronology.J0(i11, j11);
        int C03 = basicChronology.C0(J02);
        if (C03 < i11) {
            J02 += 604800000;
        } else if (C03 > i11) {
            J02 -= 604800000;
        }
        return basicChronology.h().M(q02, ((B02 - basicChronology.A0(basicChronology.D0(J02), J02)) * 604800000) + J02);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        return i11 == 0 ? j11 : M(this.f79184d.C0(j11) + i11, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long b(long j11, long j12) {
        return a(k0.v(j12), j11);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        return this.f79184d.C0(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        if (j11 < j12) {
            return -l(j12, j11);
        }
        BasicChronology basicChronology = this.f79184d;
        int C02 = basicChronology.C0(j11);
        int C03 = basicChronology.C0(j12);
        long I11 = j11 - I(j11);
        long I12 = j12 - I(j12);
        if (I12 >= 31449600000L && basicChronology.B0(C02) <= 52) {
            I12 -= 604800000;
        }
        int i11 = C02 - C03;
        if (I11 < I12) {
            i11--;
        }
        return i11;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final org.joda.time.d p() {
        return this.f79184d.S();
    }

    @Override // org.joda.time.b
    public final int u() {
        return this.f79184d.u0();
    }

    @Override // org.joda.time.b
    public final int y() {
        return this.f79184d.w0();
    }
}
