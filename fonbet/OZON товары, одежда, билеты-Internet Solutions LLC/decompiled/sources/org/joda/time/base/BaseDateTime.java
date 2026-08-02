package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public abstract class BaseDateTime extends a implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile org.joda.time.a iChronology;
    private volatile long iMillis;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDateTime() {
        this(System.currentTimeMillis(), ISOChronology.g0());
        int i11 = org.joda.time.c.f79052b;
    }

    private void e() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.W();
        }
    }

    protected void f(org.joda.time.a aVar) {
        int i11 = org.joda.time.c.f79052b;
        if (aVar == null) {
            aVar = ISOChronology.g0();
        }
        this.iChronology = aVar;
    }

    protected void g(long j11) {
        this.iMillis = j11;
    }

    @Override // org.joda.time.h
    public final org.joda.time.a getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.h
    public final long getMillis() {
        return this.iMillis;
    }

    public BaseDateTime(long j11, DateTimeZone dateTimeZone) {
        this(j11, ISOChronology.h0(dateTimeZone));
    }

    public BaseDateTime(long j11, org.joda.time.a aVar) {
        int i11 = org.joda.time.c.f79052b;
        this.iChronology = aVar == null ? ISOChronology.g0() : aVar;
        this.iMillis = j11;
        e();
    }

    public BaseDateTime(String str) {
        Lf.g b11 = Lf.d.a().b(str);
        org.joda.time.a W11 = b11.W(str);
        int i11 = org.joda.time.c.f79052b;
        this.iChronology = W11;
        this.iMillis = b11.X(str, null);
        e();
    }

    public BaseDateTime(BuddhistChronology buddhistChronology) {
        int i11 = org.joda.time.c.f79052b;
        this.iChronology = buddhistChronology;
        this.iMillis = this.iChronology.s(1);
        e();
    }
}
