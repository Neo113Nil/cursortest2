package org.joda.time.chrono;

import Bl0.k0;
import I0.C3173b;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ImpreciseDateTimeField;

/* loaded from: classes6.dex */
final class k extends ImpreciseDateTimeField {

    /* renamed from: d, reason: collision with root package name */
    private final BasicChronology f79205d;

    /* renamed from: e, reason: collision with root package name */
    private final int f79206e;

    /* renamed from: f, reason: collision with root package name */
    private final int f79207f;

    k(BasicChronology basicChronology) {
        super(DateTimeFieldType.Y(), basicChronology.k0());
        this.f79205d = basicChronology;
        this.f79206e = 12;
        this.f79207f = 2;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79205d.b0();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        BasicChronology basicChronology = this.f79205d;
        int D02 = basicChronology.D0(j11);
        return basicChronology.I0(D02) && basicChronology.y0(D02, j11) == this.f79207f;
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
        BasicChronology basicChronology = this.f79205d;
        int D02 = basicChronology.D0(j11);
        return basicChronology.F0(D02) + basicChronology.z0(D02, basicChronology.y0(D02, j11));
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, 1, this.f79206e);
        BasicChronology basicChronology = this.f79205d;
        int D02 = basicChronology.D0(j11);
        int p02 = basicChronology.p0(D02, basicChronology.y0(D02, j11), j11);
        int s02 = basicChronology.s0(D02, i11);
        if (p02 > s02) {
            p02 = s02;
        }
        return basicChronology.G0(D02, i11, p02) + BasicChronology.v0(j11);
    }

    @Override // org.joda.time.field.a
    protected final int P(String str, Locale locale) {
        return j.g(locale).o(str);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        int i12;
        int i13;
        int i14;
        if (i11 == 0) {
            return j11;
        }
        BasicChronology basicChronology = this.f79205d;
        basicChronology.getClass();
        long v02 = BasicChronology.v0(j11);
        int D02 = basicChronology.D0(j11);
        int y02 = basicChronology.y0(D02, j11);
        int i15 = y02 - 1;
        int i16 = i15 + i11;
        int i17 = this.f79206e;
        if (y02 <= 0 || i16 >= 0) {
            i12 = D02;
        } else {
            int i18 = i11 + i17;
            if (Math.signum(i18) == Math.signum(i11)) {
                i12 = D02 - 1;
            } else {
                i18 = i11 - i17;
                i12 = D02 + 1;
            }
            i16 = i18 + i15;
        }
        if (i16 >= 0) {
            i13 = (i16 / i17) + i12;
            i14 = (i16 % i17) + 1;
        } else {
            i13 = (i16 / i17) + i12;
            int i19 = i13 - 1;
            int abs = Math.abs(i16) % i17;
            if (abs == 0) {
                abs = i17;
            }
            i14 = (i17 - abs) + 1;
            if (i14 != 1) {
                i13 = i19;
            }
        }
        int p02 = basicChronology.p0(D02, y02, j11);
        int s02 = basicChronology.s0(i13, i14);
        if (p02 > s02) {
            p02 = s02;
        }
        return basicChronology.G0(i13, i14, p02) + v02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10 == 1) goto L9;
     */
    @Override // org.joda.time.field.a, org.joda.time.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16;
        int i11 = (int) j12;
        if (i11 == j12) {
            return a(i11, j11);
        }
        BasicChronology basicChronology = this.f79205d;
        basicChronology.getClass();
        long v02 = BasicChronology.v0(j11);
        int D02 = basicChronology.D0(j11);
        int y02 = basicChronology.y0(D02, j11);
        long j17 = (y02 - 1) + j12;
        int i12 = this.f79206e;
        if (j17 >= 0) {
            j13 = v02;
            long j18 = i12;
            j14 = (j17 / j18) + D02;
            j16 = (j17 % j18) + 1;
        } else {
            j13 = v02;
            long j19 = i12;
            j14 = (j17 / j19) + D02;
            j15 = j14 - 1;
            int abs = (int) (Math.abs(j17) % j19);
            if (abs == 0) {
                abs = i12;
            }
            j16 = (i12 - abs) + 1;
        }
        j15 = j14;
        if (j15 < basicChronology.w0() || j15 > basicChronology.u0()) {
            throw new IllegalArgumentException(C3173b.b(j12, "Magnitude of add amount is too large: "));
        }
        int i13 = (int) j15;
        int i14 = (int) j16;
        int p02 = basicChronology.p0(D02, y02, j11);
        int s02 = basicChronology.s0(i13, i14);
        if (p02 > s02) {
            p02 = s02;
        }
        return basicChronology.G0(i13, i14, p02) + j13;
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        BasicChronology basicChronology = this.f79205d;
        return basicChronology.y0(basicChronology.D0(j11), j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String e(int i11, Locale locale) {
        return j.g(locale).p(i11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String h(int i11, Locale locale) {
        return j.g(locale).q(i11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        if (j11 < j12) {
            return -l(j12, j11);
        }
        BasicChronology basicChronology = this.f79205d;
        int D02 = basicChronology.D0(j11);
        int y02 = basicChronology.y0(D02, j11);
        int D03 = basicChronology.D0(j12);
        int y03 = basicChronology.y0(D03, j12);
        long j13 = (((D02 - D03) * this.f79206e) + y02) - y03;
        int p02 = basicChronology.p0(D02, y02, j11);
        if (p02 == basicChronology.s0(D02, y02) && basicChronology.p0(D03, y03, j12) > p02) {
            j12 = basicChronology.g().M(p02, j12);
        }
        return j11 - (basicChronology.F0(D02) + basicChronology.z0(D02, y02)) < j12 - (basicChronology.F0(D03) + basicChronology.z0(D03, y03)) ? j13 - 1 : j13;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final org.joda.time.d p() {
        return this.f79205d.j();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int s(Locale locale) {
        return j.g(locale).k();
    }

    @Override // org.joda.time.b
    public final int u() {
        return this.f79206e;
    }

    @Override // org.joda.time.b
    public final int y() {
        return 1;
    }
}
