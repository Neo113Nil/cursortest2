package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes4.dex */
class F5 {
    static final String a = "ironbeast";
    static final String b = "outcome";
    static final int c = 4;
    static final int d = 3;
    static final int e = 2;
    static final int f = 0;

    F5() {
    }

    static AbstractC2390e a(String str, int i) {
        if (a.equals(str)) {
            return new C2437ga(i);
        }
        if (b.equals(str)) {
            return new Tc(i);
        }
        if (i == 2) {
            return new C2437ga(i);
        }
        if (i == 3) {
            return new Tc(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
