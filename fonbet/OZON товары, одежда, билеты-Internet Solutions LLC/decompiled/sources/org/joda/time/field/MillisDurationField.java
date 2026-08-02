package org.joda.time.field;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public final class MillisDurationField extends org.joda.time.d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final MillisDurationField f79212a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return f79212a;
    }

    @Override // org.joda.time.d
    public final long a(int i11, long j11) {
        return k0.s(j11, i11);
    }

    @Override // org.joda.time.d
    public final long b(long j11, long j12) {
        return k0.s(j11, j12);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.joda.time.d dVar) {
        long g10 = dVar.g();
        if (1 == g10) {
            return 0;
        }
        return 1 < g10 ? -1 : 1;
    }

    @Override // org.joda.time.d
    public final int d(long j11, long j12) {
        return k0.v(k0.u(j11, j12));
    }

    @Override // org.joda.time.d
    public final long e(long j11, long j12) {
        return k0.u(j11, j12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MillisDurationField)) {
            return false;
        }
        ((MillisDurationField) obj).getClass();
        return true;
    }

    @Override // org.joda.time.d
    public final DurationFieldType f() {
        return DurationFieldType.i();
    }

    @Override // org.joda.time.d
    public final long g() {
        return 1L;
    }

    @Override // org.joda.time.d
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return (int) 1;
    }

    @Override // org.joda.time.d
    public final boolean i() {
        return true;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
