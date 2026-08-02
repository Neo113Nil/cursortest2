package com.fyber.inneractive.sdk.config.enums;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum Skip {
    DEFAULT(-1),
    _0(0),
    _10(10),
    _15(15),
    _5(5);

    private static final Map<Integer, Skip> CONSTANTS = new HashMap();
    private final Integer value;

    static {
        for (Skip skip : values()) {
            CONSTANTS.put(skip.value, skip);
        }
    }

    Skip(Integer num) {
        this.value = num;
    }

    public static Skip fromValue(Integer num) {
        if (num == null) {
            return null;
        }
        return CONSTANTS.get(num);
    }

    public Integer value() {
        return this.value;
    }
}
