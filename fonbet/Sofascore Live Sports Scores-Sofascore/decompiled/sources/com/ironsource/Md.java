package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum Md {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    @NotNull
    private final String a;

    Md(String str) {
        this.a = str;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
