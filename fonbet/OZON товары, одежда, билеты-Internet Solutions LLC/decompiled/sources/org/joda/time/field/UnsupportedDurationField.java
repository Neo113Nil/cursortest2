package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public final class UnsupportedDurationField extends org.joda.time.d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<DurationFieldType, UnsupportedDurationField> f79216a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static synchronized UnsupportedDurationField l(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        synchronized (UnsupportedDurationField.class) {
            try {
                HashMap<DurationFieldType, UnsupportedDurationField> hashMap = f79216a;
                if (hashMap == null) {
                    f79216a = new HashMap<>(7);
                    unsupportedDurationField = null;
                } else {
                    unsupportedDurationField = hashMap.get(durationFieldType);
                }
                if (unsupportedDurationField == null) {
                    unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                    f79216a.put(durationFieldType, unsupportedDurationField);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unsupportedDurationField;
    }

    private UnsupportedOperationException m() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    private Object readResolve() {
        return l(this.iType);
    }

    @Override // org.joda.time.d
    public final long a(int i11, long j11) {
        throw m();
    }

    @Override // org.joda.time.d
    public final long b(long j11, long j12) {
        throw m();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(org.joda.time.d dVar) {
        return 0;
    }

    @Override // org.joda.time.d
    public final int d(long j11, long j12) {
        throw m();
    }

    @Override // org.joda.time.d
    public final long e(long j11, long j12) {
        throw m();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        return unsupportedDurationField.iType.f() == null ? this.iType.f() == null : unsupportedDurationField.iType.f().equals(this.iType.f());
    }

    @Override // org.joda.time.d
    public final DurationFieldType f() {
        return this.iType;
    }

    @Override // org.joda.time.d
    public final long g() {
        return 0L;
    }

    @Override // org.joda.time.d
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.iType.f().hashCode();
    }

    @Override // org.joda.time.d
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "UnsupportedDurationField[" + this.iType.f() + ']';
    }
}
