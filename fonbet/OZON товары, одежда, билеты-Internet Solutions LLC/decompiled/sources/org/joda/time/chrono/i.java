package org.joda.time.chrono;

import Bl0.k0;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes6.dex */
final class i extends org.joda.time.field.a {

    /* renamed from: b, reason: collision with root package name */
    private final BasicChronology f79190b;

    i(BasicChronology basicChronology) {
        super(DateTimeFieldType.M());
        this.f79190b = basicChronology;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return null;
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long H(long j11) {
        if (d(j11) == 0) {
            return this.f79190b.J0(1, 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        if (d(j11) == 1) {
            return this.f79190b.J0(1, 0L);
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long J(long j11) {
        return I(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long K(long j11) {
        return I(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long L(long j11) {
        return I(j11);
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, 0, 1);
        if (d(j11) == i11) {
            return j11;
        }
        BasicChronology basicChronology = this.f79190b;
        return basicChronology.J0(-basicChronology.D0(j11), j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long N(long j11, String str, Locale locale) {
        return M(j.g(locale).e(str), j11);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        return this.f79190b.D0(j11) <= 0 ? 0 : 1;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String h(int i11, Locale locale) {
        return j.g(locale).f(i11);
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return UnsupportedDurationField.l(DurationFieldType.d());
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int s(Locale locale) {
        return j.g(locale).i();
    }

    @Override // org.joda.time.b
    public final int u() {
        return 1;
    }

    @Override // org.joda.time.b
    public final int y() {
        return 0;
    }
}
