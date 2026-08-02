package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class eb {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, String> f1917 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m7685(String str) {
        String str2 = f1917.get(str);
        if (str2 != null) {
            return str2;
        }
        f1917.put(str, str);
        return str;
    }
}
