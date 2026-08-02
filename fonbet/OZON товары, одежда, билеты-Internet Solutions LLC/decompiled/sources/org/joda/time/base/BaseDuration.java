package org.joda.time.base;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.DateTime;

/* loaded from: classes10.dex */
public abstract class BaseDuration extends b implements Serializable {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long iMillis;

    protected BaseDuration(long j11) {
        this.iMillis = j11;
    }

    @Override // org.joda.time.g
    public final long getMillis() {
        return this.iMillis;
    }

    protected BaseDuration(DateTime dateTime, org.joda.time.f fVar) {
        if (dateTime == fVar) {
            this.iMillis = 0L;
            return;
        }
        int i11 = org.joda.time.c.f79052b;
        this.iMillis = k0.u(org.joda.time.c.c(fVar), dateTime.getMillis());
    }
}
