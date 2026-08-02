package org.joda.time.field;

import Bl0.k0;
import C.C2702w;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j11) {
        super(durationFieldType);
        this.iUnitMillis = j11;
    }

    @Override // org.joda.time.d
    public final long a(int i11, long j11) {
        return k0.s(j11, i11 * this.iUnitMillis);
    }

    @Override // org.joda.time.d
    public final long b(long j11, long j12) {
        long j13 = this.iUnitMillis;
        if (j13 != 1) {
            if (j12 == 1) {
                j12 = j13;
            } else {
                long j14 = 0;
                if (j12 != 0 && j13 != 0) {
                    j14 = j12 * j13;
                    if (j14 / j13 != j12 || ((j12 == Long.MIN_VALUE && j13 == -1) || (j13 == Long.MIN_VALUE && j12 == -1))) {
                        StringBuilder d11 = C2702w.d(j12, "Multiplication overflows a long: ", " * ");
                        d11.append(j13);
                        throw new ArithmeticException(d11.toString());
                    }
                }
                j12 = j14;
            }
        }
        return k0.s(j11, j12);
    }

    @Override // org.joda.time.d
    public final long e(long j11, long j12) {
        return k0.u(j11, j12) / this.iUnitMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
            if (f() == preciseDurationField.f() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.d
    public final long g() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.d
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        long j11 = this.iUnitMillis;
        return f().hashCode() + ((int) (j11 ^ (j11 >>> 32)));
    }
}
