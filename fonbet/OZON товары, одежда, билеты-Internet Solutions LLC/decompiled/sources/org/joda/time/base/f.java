package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.k;

/* loaded from: classes6.dex */
public abstract class f implements k {
    protected f() {
    }

    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (size() == kVar.size()) {
                int size = size();
                for (0; i11 < size; i11 + 1) {
                    i11 = (getValue(i11) == kVar.getValue(i11) && getFieldType(i11) == kVar.getFieldType(i11)) ? i11 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.k
    public final int get(DurationFieldType durationFieldType) {
        int f7 = getPeriodType().f(durationFieldType);
        if (f7 == -1) {
            return 0;
        }
        return getValue(f7);
    }

    @Override // org.joda.time.k
    public final DurationFieldType getFieldType(int i11) {
        return getPeriodType().b(i11);
    }

    public final int hashCode() {
        int size = size();
        int i11 = 17;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = getFieldType(i12).hashCode() + ((getValue(i12) + (i11 * 27)) * 27);
        }
        return i11;
    }

    public final int[] m() {
        int size = size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((BasePeriod) this).getValue(i11);
        }
        return iArr;
    }

    @Override // org.joda.time.k
    public final int size() {
        return getPeriodType().i();
    }

    @ToString
    public final String toString() {
        return b7.d.e().e(this);
    }
}
