package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public final class h extends b {
    public h(e eVar, DateTimeFieldType dateTimeFieldType) {
        super(eVar, dateTimeFieldType);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final boolean D(long j11) {
        return R().D(j11);
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

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long J(long j11) {
        return R().J(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long K(long j11) {
        return R().K(j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long L(long j11) {
        return R().L(j11);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final long M(int i11, long j11) {
        int u11 = u();
        k0.w(this, i11, 1, u11);
        if (i11 == u11) {
            i11 = 0;
        }
        return R().M(i11, j11);
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
        return d11 == 0 ? u() : d11;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int l(long j11, long j12) {
        return R().l(j11, j12);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        return R().m(j11, j12);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final org.joda.time.d p() {
        return R().p();
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int u() {
        return R().u() + 1;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int v(long j11) {
        return R().v(j11) + 1;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int y() {
        return 1;
    }
}
