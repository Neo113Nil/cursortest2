package org.joda.time;

/* loaded from: classes10.dex */
public interface j extends Comparable<j> {
    a getChronology();

    DateTimeFieldType getFieldType(int i11);

    int getValue(int i11);

    int s0(DateTimeFieldType dateTimeFieldType);

    int size();

    boolean y(DateTimeFieldType dateTimeFieldType);
}
