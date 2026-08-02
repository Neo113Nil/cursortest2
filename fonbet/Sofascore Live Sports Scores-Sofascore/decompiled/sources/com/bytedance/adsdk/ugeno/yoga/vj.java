package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum vj {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int vj;

    vj(int i) {
        this.vj = i;
    }

    public static vj pcc(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                a70.p("Unknown enum value: ".concat(str));
                return null;
        }
    }

    public static vj pcc(int i) {
        if (i == 0) {
            return COLUMN;
        }
        if (i == 1) {
            return COLUMN_REVERSE;
        }
        if (i == 2) {
            return ROW;
        }
        if (i == 3) {
            return ROW_REVERSE;
        }
        a70.p("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    public int pcc() {
        return this.vj;
    }
}
