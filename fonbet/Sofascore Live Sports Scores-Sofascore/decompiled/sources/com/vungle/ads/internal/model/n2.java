package com.vungle.ads.internal.model;

import defpackage.sub;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum n2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);

    public static final LinkedHashMap b;
    public final int a;

    static {
        n2[] values = values();
        int c2 = sub.c(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2 < 16 ? 16 : c2);
        for (n2 n2Var : values) {
            linkedHashMap.put(Integer.valueOf(n2Var.a), n2Var);
        }
        b = linkedHashMap;
    }

    n2(int i) {
        this.a = i;
    }
}
