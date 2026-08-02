package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final org.joda.time.d iField;

    public DecoratedDurationField(org.joda.time.d dVar, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (dVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!dVar.i()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = dVar;
    }

    @Override // org.joda.time.d
    public long a(int i11, long j11) {
        return this.iField.a(i11, j11);
    }

    @Override // org.joda.time.d
    public long b(long j11, long j12) {
        return this.iField.b(j11, j12);
    }

    @Override // org.joda.time.d
    public long e(long j11, long j12) {
        return this.iField.e(j11, j12);
    }

    @Override // org.joda.time.d
    public long g() {
        return this.iField.g();
    }

    @Override // org.joda.time.d
    public final boolean h() {
        return this.iField.h();
    }

    public final org.joda.time.d l() {
        return this.iField;
    }
}
