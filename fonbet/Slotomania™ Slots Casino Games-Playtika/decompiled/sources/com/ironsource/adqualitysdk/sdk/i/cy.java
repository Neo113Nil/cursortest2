package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class cy extends cw {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m7370(List<Object> list) {
        kj.m8412((JSONObject) m7365(list, 0, JSONObject.class), (JSONObject) m7365(list, 1, JSONObject.class), list.size() > 2 ? ((Boolean) m7365(list, 2, Boolean.class)).booleanValue() : true);
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m7372(List<Object> list) {
        return kj.m8418((JSONObject) m7365(list, 0, JSONObject.class), list.size() > 1 ? ((Boolean) m7365(list, 1, Boolean.class)).booleanValue() : true);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m7369(cl clVar) {
        return clVar.m7212();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m7371(cl clVar, List<Object> list) {
        clVar.m7207((JSONObject) m7365(list, 0, JSONObject.class));
        return null;
    }
}
