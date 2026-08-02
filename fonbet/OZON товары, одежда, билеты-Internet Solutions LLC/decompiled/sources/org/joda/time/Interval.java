package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;

/* loaded from: classes10.dex */
public final class Interval extends BaseInterval implements Serializable {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval() {
    }

    public Interval(DateTime dateTime, DateTime dateTime2) {
        super(dateTime, dateTime2);
    }
}
