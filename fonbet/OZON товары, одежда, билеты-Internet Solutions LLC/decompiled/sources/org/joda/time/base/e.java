package org.joda.time.base;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.j;

/* loaded from: classes10.dex */
public abstract class e implements j, Comparable<j> {
    protected e() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        if (this != jVar) {
            if (size() != jVar.size()) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
            int size = size();
            for (int i11 = 0; i11 < size; i11++) {
                if (getFieldType(i11) != jVar.getFieldType(i11)) {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            int size2 = size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (getValue(i12) > jVar.getValue(i12)) {
                    return 1;
                }
                if (getValue(i12) < jVar.getValue(i12)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public final org.joda.time.b b(int i11) {
        return d(i11, getChronology());
    }

    protected abstract org.joda.time.b d(int i11, org.joda.time.a aVar);

    public final boolean e(LocalDate localDate) {
        if (localDate != null) {
            return compareTo(localDate) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (size() == jVar.size()) {
                int size = size();
                for (0; i11 < size; i11 + 1) {
                    i11 = (getValue(i11) == jVar.getValue(i11) && getFieldType(i11) == jVar.getFieldType(i11)) ? i11 + 1 : 0;
                }
                return k0.o(getChronology(), jVar.getChronology());
            }
        }
        return false;
    }

    public final String f(org.joda.time.format.b bVar) {
        return bVar == null ? toString() : bVar.h(this);
    }

    @Override // org.joda.time.j
    public final DateTimeFieldType getFieldType(int i11) {
        return d(i11, getChronology()).C();
    }

    public int hashCode() {
        int size = size();
        int i11 = 157;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = getFieldType(i12).hashCode() + ((getValue(i12) + (i11 * 23)) * 23);
        }
        return getChronology().hashCode() + i11;
    }
}
