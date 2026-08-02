package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum gbb {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int oo;

    gbb(int i) {
        this.oo = i;
    }

    public static gbb pcc(String str) {
        str.getClass();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                a70.p("Unknown enum value: ".concat(str));
                return null;
        }
    }

    public static gbb pcc(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        a70.p("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    public int pcc() {
        return this.oo;
    }
}
