package com.bytedance.sdk.openadsdk.tz;

import com.ironsource.Q3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum oo {
    TYPE_2G("2g"),
    TYPE_3G(Q3.a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(Q3.b),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String kj;

    oo(String str) {
        this.kj = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.kj;
    }
}
