package com.ironsource;

/* loaded from: classes13.dex */
public enum Nd {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");

    private final String a;

    Nd(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }
}
