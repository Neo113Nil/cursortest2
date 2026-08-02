package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4255c4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4273d4 c4273d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c4273d4.b(), a(c4273d4.c()), b(c4273d4));
    }

    private static String b(C4273d4 c4273d4) {
        return (c4273d4.d() == null || c4273d4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c4273d4.d(), c4273d4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
