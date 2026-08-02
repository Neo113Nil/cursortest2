package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class D5 {
    static final String a = "ironbeast";
    static final String b = "outcome";
    static final int c = 4;
    static final int d = 3;
    static final int e = 2;
    static final int f = 0;

    public static AbstractC4045e a(String str, int i) {
        if (a.equals(str)) {
            return new C4092ga(i);
        }
        if (b.equals(str)) {
            return new Tc(i);
        }
        if (i == 2) {
            return new C4092ga(i);
        }
        if (i == 3) {
            return new Tc(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, vxd.k(i, "EventsFormatterFactory failed to instantiate a formatter (type: ", str, ", adUnit: ", ")"), 2);
        return null;
    }
}
