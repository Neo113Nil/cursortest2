package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static Map<String, Boolean> a = new HashMap();

    public static boolean a(String str) {
        if (a.containsKey(str)) {
            return a.get(str).booleanValue();
        }
        return false;
    }

    public static void b(String str) {
        a.remove(str);
    }

    public static void a(String str, boolean z) {
        a.put(str, Boolean.valueOf(z));
    }
}
