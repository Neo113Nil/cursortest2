package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    final int f79219c;

    /* renamed from: d, reason: collision with root package name */
    final ScaledDurationField f79220d;

    /* renamed from: e, reason: collision with root package name */
    final org.joda.time.d f79221e;

    /* renamed from: f, reason: collision with root package name */
    private final int f79222f;

    /* renamed from: g, reason: collision with root package name */
    private final int f79223g;

    public c(b bVar, org.joda.time.d dVar, DateTimeFieldType dateTimeFieldType) {
        super(bVar, dateTimeFieldType);
        org.joda.time.d n11 = bVar.n();
        if (n11 == null) {
            this.f79220d = null;
        } else {
            this.f79220d = new ScaledDurationField(n11, dateTimeFieldType.N());
        }
        this.f79221e = dVar;
        this.f79219c = 100;
        int y11 = bVar.y();
        int i11 = y11 >= 0 ? y11 / 100 : ((y11 + 1) / 100) - 1;
        int u11 = bVar.u();
        int i12 = u11 >= 0 ? u11 / 100 : ((u11 + 1) / 100) - 1;
        this.f79222f = i11;
        this.f79223g = i12;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final org.joda.time.d B() {
        org.joda.time.d dVar = this.f79221e;
        return dVar != null ? dVar : super.B();
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long G(long j11) {
        return M(d(R().G(j11)), j11);
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        org.joda.time.b R11 = R();
        return R11.I(R11.M(d(j11) * this.f79219c, j11));
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final long M(int i11, long j11) {
        int i12;
        k0.w(this, i11, this.f79222f, this.f79223g);
        int d11 = R().d(j11);
        int i13 = this.f79219c;
        if (d11 >= 0) {
            i12 = d11 % i13;
        } else {
            i12 = ((d11 + 1) % i13) + (i13 - 1);
        }
        return R().M((i11 * i13) + i12, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long a(int i11, long j11) {
        return R().a(i11 * this.f79219c, j11);
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long b(long j11, long j12) {
        return R().b(j11, j12 * this.f79219c);
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int d(long j11) {
        int d11 = R().d(j11);
        return d11 >= 0 ? d11 / this.f79219c : ((d11 + 1) / r3) - 1;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int l(long j11, long j12) {
        return R().l(j11, j12) / this.f79219c;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long m(long j11, long j12) {
        return R().m(j11, j12) / this.f79219c;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final org.joda.time.d n() {
        return this.f79220d;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int u() {
        return this.f79223g;
    }

    @Override // org.joda.time.field.b, org.joda.time.b
    public final int y() {
        return this.f79222f;
    }
}
