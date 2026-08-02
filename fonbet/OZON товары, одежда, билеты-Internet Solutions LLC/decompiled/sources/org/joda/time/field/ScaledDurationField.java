package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(org.joda.time.d dVar, DurationFieldType durationFieldType) {
        super(dVar, durationFieldType);
        this.iScalar = 100;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
    public final long a(int i11, long j11) {
        return l().b(j11, i11 * this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
    public final long b(long j11, long j12) {
        return l().b(j11, k0.t(this.iScalar, j12));
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.d
    public final int d(long j11, long j12) {
        return l().d(j11, j12) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
    public final long e(long j11, long j12) {
        return l().e(j11, j12) / this.iScalar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScaledDurationField) {
            ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
            if (l().equals(scaledDurationField.l()) && f() == scaledDurationField.f() && this.iScalar == scaledDurationField.iScalar) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.d
    public final long g() {
        return l().g() * this.iScalar;
    }

    public final int hashCode() {
        long j11 = this.iScalar;
        return l().hashCode() + f().hashCode() + ((int) (j11 ^ (j11 >>> 32)));
    }
}
