package com.facebook.internal;

import java.util.EnumSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum g0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("None"),
    c("Enabled"),
    d("RequireConfirm");

    public static final EnumSet b;
    public final long a;

    static {
        EnumSet allOf = EnumSet.allOf(g0.class);
        allOf.getClass();
        b = allOf;
    }

    g0(String str) {
        this.a = r2;
    }
}
