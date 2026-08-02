package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
public abstract class BaseInterval extends d implements Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile org.joda.time.a iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    protected BaseInterval() {
        int i11 = org.joda.time.c.f79052b;
        this.iChronology = ISOChronology.g0();
        this.iStartMillis = 0L;
        this.iEndMillis = 0L;
    }

    @Override // org.joda.time.i
    public final long a() {
        return this.iStartMillis;
    }

    @Override // org.joda.time.i
    public final long b() {
        return this.iEndMillis;
    }

    @Override // org.joda.time.i
    public final org.joda.time.a getChronology() {
        return this.iChronology;
    }

    protected BaseInterval(DateTime dateTime, DateTime dateTime2) {
        int i11 = org.joda.time.c.f79052b;
        org.joda.time.a chronology = dateTime.getChronology();
        this.iChronology = chronology == null ? ISOChronology.g0() : chronology;
        this.iStartMillis = dateTime.getMillis();
        this.iEndMillis = org.joda.time.c.c(dateTime2);
        if (this.iEndMillis < this.iStartMillis) {
            throw new IllegalArgumentException("The end instant must be greater than the start instant");
        }
    }
}
