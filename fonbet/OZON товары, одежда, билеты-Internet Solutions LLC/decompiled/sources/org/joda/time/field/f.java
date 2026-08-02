package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public abstract class f extends a {

    /* renamed from: b, reason: collision with root package name */
    final long f79229b;

    /* renamed from: c, reason: collision with root package name */
    private final org.joda.time.d f79230c;

    public f(DateTimeFieldType dateTimeFieldType, org.joda.time.d dVar) {
        super(dateTimeFieldType);
        if (!dVar.h()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long g10 = dVar.g();
        this.f79229b = g10;
        if (g10 < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.f79230c = dVar;
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public long G(long j11) {
        long j12 = this.f79229b;
        return j11 >= 0 ? j11 % j12 : (((j11 + 1) % j12) + j12) - 1;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public long H(long j11) {
        long j12 = this.f79229b;
        if (j11 <= 0) {
            return j11 - (j11 % j12);
        }
        long j13 = j11 - 1;
        return (j13 - (j13 % j12)) + j12;
    }

    @Override // org.joda.time.b
    public long I(long j11) {
        long j12 = this.f79229b;
        if (j11 >= 0) {
            return j11 - (j11 % j12);
        }
        long j13 = j11 + 1;
        return (j13 - (j13 % j12)) - j12;
    }

    @Override // org.joda.time.b
    public long M(int i11, long j11) {
        k0.w(this, i11, y(), Q(i11, j11));
        return ((i11 - d(j11)) * this.f79229b) + j11;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return this.f79230c;
    }

    @Override // org.joda.time.b
    public int y() {
        return 0;
    }
}
