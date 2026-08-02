package org.joda.time.field;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes6.dex */
public abstract class b extends a {

    /* renamed from: b, reason: collision with root package name */
    private final org.joda.time.b f79218b;

    protected b(org.joda.time.b bVar, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (bVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!bVar.F()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.f79218b = bVar;
    }

    @Override // org.joda.time.b
    public org.joda.time.d B() {
        return this.f79218b.B();
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return this.f79218b.E();
    }

    @Override // org.joda.time.b
    public long M(int i11, long j11) {
        return this.f79218b.M(i11, j11);
    }

    public final org.joda.time.b R() {
        return this.f79218b;
    }

    @Override // org.joda.time.b
    public int d(long j11) {
        return this.f79218b.d(j11);
    }

    @Override // org.joda.time.b
    public org.joda.time.d n() {
        return this.f79218b.n();
    }

    @Override // org.joda.time.b
    public int u() {
        return this.f79218b.u();
    }

    @Override // org.joda.time.b
    public int y() {
        return this.f79218b.y();
    }
}
