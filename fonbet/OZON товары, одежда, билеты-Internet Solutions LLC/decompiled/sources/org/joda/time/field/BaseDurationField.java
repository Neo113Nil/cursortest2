package org.joda.time.field;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public abstract class BaseDurationField extends org.joda.time.d implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    protected BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = durationFieldType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.joda.time.d dVar) {
        long g10 = dVar.g();
        long g11 = g();
        if (g11 == g10) {
            return 0;
        }
        return g11 < g10 ? -1 : 1;
    }

    @Override // org.joda.time.d
    public int d(long j11, long j12) {
        return k0.v(e(j11, j12));
    }

    @Override // org.joda.time.d
    public final DurationFieldType f() {
        return this.iType;
    }

    @Override // org.joda.time.d
    public final boolean i() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.iType.f() + ']';
    }
}
