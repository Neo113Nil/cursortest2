package org.joda.time.chrono;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
final class l extends org.joda.time.field.b {

    /* renamed from: c, reason: collision with root package name */
    private final BasicChronology f79208c;

    l(org.joda.time.b bVar, BasicChronology basicChronology) {
        super(bVar, DateTimeFieldType.g0());
        this.f79208c = basicChronology;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79208c.m();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long G(long j11) {
        return R().G(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long H(long j11) {
        return R().H(j11);
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        return R().I(j11);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, 1, u());
        if (this.f79208c.D0(j11) <= 0) {
            i11 = 1 - i11;
        }
        return super.M(i11, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        return R().a(i11, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long b(long j11, long j12) {
        return R().b(j11, j12);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int d(long j11) {
        int d11 = R().d(j11);
        return d11 <= 0 ? 1 - d11 : d11;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int l(long j11, long j12) {
        return R().l(j11, j12);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        return R().m(j11, j12);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int u() {
        return R().u();
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int y() {
        return 1;
    }
}
