package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public final class Instant extends org.joda.time.base.c implements Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    static {
        new Instant(0L);
    }

    public Instant() {
        int i11 = c.f79052b;
        this.iMillis = System.currentTimeMillis();
    }

    @FromString
    public static Instant e(String str) {
        return org.joda.time.format.i.d().d(str).toInstant();
    }

    @Override // org.joda.time.h
    public final a getChronology() {
        return ISOChronology.i0();
    }

    @Override // org.joda.time.h
    public final long getMillis() {
        return this.iMillis;
    }

    @Override // org.joda.time.base.c, org.joda.time.h
    public final Instant toInstant() {
        return this;
    }

    public Instant(long j11) {
        this.iMillis = j11;
    }

    public Instant(Object obj) {
        this.iMillis = Lf.d.a().b(obj).X(obj, ISOChronology.i0());
    }
}
