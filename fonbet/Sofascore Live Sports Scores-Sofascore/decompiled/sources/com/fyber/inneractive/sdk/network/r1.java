package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum r1 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");

    private final String tableName;

    r1(String str) {
        this.tableName = str;
    }

    public final String a() {
        return this.tableName;
    }
}
