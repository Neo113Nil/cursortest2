package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import xsna.iq;

/* loaded from: classes13.dex */
class F5 {
    static final String a = "ironbeast";
    static final String b = "outcome";
    static final int c = 4;
    static final int d = 3;
    static final int e = 2;
    static final int f = 0;

    public static AbstractC4286e a(String str, int i) {
        if (a.equals(str)) {
            return new C4351ha(i);
        }
        if (b.equals(str)) {
            return new Uc(i);
        }
        if (i == 2) {
            return new C4351ha(i);
        }
        if (i == 3) {
            return new Uc(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, iq.a(i, "EventsFormatterFactory failed to instantiate a formatter (type: ", str, ", adUnit: ", ")"), 2);
        return null;
    }
}
