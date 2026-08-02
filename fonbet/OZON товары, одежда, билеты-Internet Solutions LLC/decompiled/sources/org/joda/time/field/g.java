package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public final class g extends b {

    /* renamed from: c, reason: collision with root package name */
    final int f79231c;

    /* renamed from: d, reason: collision with root package name */
    final org.joda.time.d f79232d;

    /* renamed from: e, reason: collision with root package name */
    final org.joda.time.d f79233e;

    public g(org.joda.time.b bVar, org.joda.time.d dVar, DateTimeFieldType dateTimeFieldType) {
        super(bVar, dateTimeFieldType);
        this.f79233e = dVar;
        this.f79232d = bVar.n();
        this.f79231c = 100;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79233e;
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
        int i12 = this.f79231c;
        k0.w(this, i11, 0, i12 - 1);
        int d11 = R().d(j11);
        return R().M(((d11 >= 0 ? d11 / i12 : ((d11 + 1) / i12) - 1) * i12) + i11, j11);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int d(long j11) {
        int d11 = R().d(j11);
        int i11 = this.f79231c;
        if (d11 >= 0) {
            return d11 % i11;
        }
        return ((d11 + 1) % i11) + (i11 - 1);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final org.joda.time.d n() {
        return this.f79232d;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int u() {
        return this.f79231c - 1;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int y() {
        return 0;
    }

    public g(c cVar) {
        this(cVar, cVar.C());
    }

    public g(c cVar, DateTimeFieldType dateTimeFieldType) {
        this(cVar, cVar.R().n(), dateTimeFieldType);
    }

    public g(c cVar, org.joda.time.d dVar, DateTimeFieldType dateTimeFieldType) {
        super(cVar.R(), dateTimeFieldType);
        this.f79231c = cVar.f79219c;
        this.f79232d = dVar;
        this.f79233e = cVar.f79220d;
    }
}
