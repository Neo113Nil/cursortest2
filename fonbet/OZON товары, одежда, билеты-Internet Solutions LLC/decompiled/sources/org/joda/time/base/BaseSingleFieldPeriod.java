package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.k;

/* loaded from: classes10.dex */
public abstract class BaseSingleFieldPeriod implements k, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    protected BaseSingleFieldPeriod(int i11) {
        this.iPeriod = i11;
    }

    protected static int m(DateTime dateTime, DateTime dateTime2, DurationFieldType durationFieldType) {
        if (dateTime == null || dateTime2 == null) {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        int i11 = org.joda.time.c.f79052b;
        org.joda.time.a chronology = dateTime.getChronology();
        if (chronology == null) {
            chronology = ISOChronology.g0();
        }
        return durationFieldType.e(chronology).d(dateTime2.getMillis(), dateTime.getMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        BaseSingleFieldPeriod baseSingleFieldPeriod2 = baseSingleFieldPeriod;
        if (baseSingleFieldPeriod2.getClass() == getClass()) {
            int i11 = baseSingleFieldPeriod2.iPeriod;
            int i12 = this.iPeriod;
            if (i12 > i11) {
                return 1;
            }
            return i12 < i11 ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod2.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.getPeriodType() == getPeriodType() && kVar.getValue(0) == this.iPeriod) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.k
    public final int get(DurationFieldType durationFieldType) {
        if (durationFieldType == p()) {
            return this.iPeriod;
        }
        return 0;
    }

    @Override // org.joda.time.k
    public final DurationFieldType getFieldType(int i11) {
        if (i11 == 0) {
            return p();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i11));
    }

    @Override // org.joda.time.k
    public abstract PeriodType getPeriodType();

    @Override // org.joda.time.k
    public final int getValue(int i11) {
        if (i11 == 0) {
            return this.iPeriod;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i11));
    }

    public final int hashCode() {
        return p().hashCode() + ((459 + this.iPeriod) * 27);
    }

    public int n() {
        return u();
    }

    public abstract DurationFieldType p();

    public int s() {
        return u();
    }

    @Override // org.joda.time.k
    public final int size() {
        return 1;
    }

    protected final int u() {
        return this.iPeriod;
    }
}
