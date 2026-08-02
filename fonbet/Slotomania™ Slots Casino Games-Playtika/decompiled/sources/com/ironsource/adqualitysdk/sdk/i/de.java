package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class de extends cw {
    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int m7464(List<Object> list) {
        return kn.m8470((String) m7365(list, 0, String.class), (String) m7365(list, 1, String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m7465(List<Object> list) {
        return id.m7937().m7939().m8051(m7365(list, 0, Object.class), (List<String>) m7365(list, 1, List.class), ((Integer) m7365(list, 2, Integer.class)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m7466(List<Object> list) {
        String str = (String) m7365(list, 0, String.class);
        if (list.get(1) instanceof String) {
            return kn.m8480(str, (String) m7365(list, 1, String.class));
        }
        return kn.m8475(str, new JSONArray((Collection) m7365(list, 1, List.class)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m7468(List<Object> list) {
        String str = (String) m7365(list, 0, String.class);
        boolean booleanValue = list.size() > 2 ? ((Boolean) m7365(list, 2, Boolean.class)).booleanValue() : true;
        if (list.get(1) instanceof String) {
            return kn.m8479(str, (String) m7365(list, 1, String.class), booleanValue);
        }
        return kn.m8474(str, new JSONArray((Collection) m7365(list, 1, List.class)), booleanValue);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m7467(List<Object> list) {
        return kn.m8476((String) m7365(list, 0, String.class));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static String m7463(List<Object> list) {
        return kn.m8478((String) m7365(list, 0, String.class));
    }
}
