package org.joda.time.field;

import Bl0.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public final class d extends b {

    /* renamed from: c, reason: collision with root package name */
    private final int f79224c;

    /* renamed from: d, reason: collision with root package name */
    private final int f79225d;

    /* renamed from: e, reason: collision with root package name */
    private final int f79226e;

    public d(org.joda.time.b bVar, int i11) {
        this(bVar, bVar == null ? null : bVar.C(), i11);
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
        k0.w(this, i11, this.f79225d, this.f79226e);
        return super.M(i11 - this.f79224c, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        long a11 = super.a(i11, j11);
        k0.w(this, d(a11), this.f79225d, this.f79226e);
        return a11;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long b(long j11, long j12) {
        long b11 = super.b(j11, j12);
        k0.w(this, d(b11), this.f79225d, this.f79226e);
        return b11;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int d(long j11) {
        return super.d(j11) + this.f79224c;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final org.joda.time.d p() {
        return R().p();
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int u() {
        return this.f79226e;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int y() {
        return this.f79225d;
    }

    public d(org.joda.time.b bVar, DateTimeFieldType dateTimeFieldType, int i11) {
        super(bVar, dateTimeFieldType);
        if (i11 == 0) {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        this.f79224c = i11;
        if (Integer.MIN_VALUE < bVar.y() + i11) {
            this.f79225d = bVar.y() + i11;
        } else {
            this.f79225d = LinearLayoutManager.INVALID_OFFSET;
        }
        if (Integer.MAX_VALUE > bVar.u() + i11) {
            this.f79226e = bVar.u() + i11;
        } else {
            this.f79226e = Integer.MAX_VALUE;
        }
    }
}
