package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum hc {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int oo;

    hc(int i) {
        this.oo = i;
    }

    public static hc pcc(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                a70.p("Unknown enum value: ".concat(str));
                return null;
        }
    }

    public static hc pcc(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        a70.p("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    public int pcc() {
        return this.oo;
    }
}
