package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public class e extends f {

    /* renamed from: d, reason: collision with root package name */
    private final int f79227d;

    /* renamed from: e, reason: collision with root package name */
    private final org.joda.time.d f79228e;

    public e(DateTimeFieldType dateTimeFieldType, org.joda.time.d dVar, org.joda.time.d dVar2) {
        super(dateTimeFieldType, dVar);
        if (!dVar2.h()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int g10 = (int) (dVar2.g() / this.f79229b);
        this.f79227d = g10;
        if (g10 < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.f79228e = dVar2;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return this.f79228e;
    }

    @Override // org.joda.time.field.f, org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, 0, this.f79227d - 1);
        return ((i11 - d(j11)) * this.f79229b) + j11;
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        int i11 = this.f79227d;
        long j12 = this.f79229b;
        return j11 >= 0 ? (int) ((j11 / j12) % i11) : (i11 - 1) + ((int) (((j11 + 1) / j12) % i11));
    }

    @Override // org.joda.time.b
    public final int u() {
        return this.f79227d - 1;
    }
}
