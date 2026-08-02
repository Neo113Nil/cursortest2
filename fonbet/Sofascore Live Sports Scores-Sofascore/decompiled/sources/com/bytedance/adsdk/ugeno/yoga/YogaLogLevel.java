package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@com.bytedance.adsdk.ugeno.yoga.pcc.pcc
/* loaded from: classes2.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int qf;

    YogaLogLevel(int i) {
        this.qf = i;
    }

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        a70.p("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }
}
