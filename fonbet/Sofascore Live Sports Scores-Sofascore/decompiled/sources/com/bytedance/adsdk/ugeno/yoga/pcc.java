package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum pcc {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7),
    SPACE_EVENLY(8);

    private final int ork;

    pcc(int i) {
        this.ork = i;
    }

    public static pcc pcc(String str) {
        str.getClass();
        switch (str) {
            case "stretch":
                return STRETCH;
            case "baseline":
                return BASELINE;
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "auto":
                return AUTO;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                a70.p("Unknown enum value: ".concat(str));
                return null;
        }
    }

    public static pcc pcc(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            case 8:
                return SPACE_EVENLY;
            default:
                a70.p("Unknown enum value: ".concat(String.valueOf(i)));
                return null;
        }
    }

    public int pcc() {
        return this.ork;
    }
}
