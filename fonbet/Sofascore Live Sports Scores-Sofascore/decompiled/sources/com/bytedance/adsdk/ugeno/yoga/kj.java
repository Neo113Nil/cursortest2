package com.bytedance.adsdk.ugeno.yoga;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum kj {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int oo;

    kj(int i) {
        this.oo = i;
    }

    public static kj pcc(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        a70.p("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }
}
