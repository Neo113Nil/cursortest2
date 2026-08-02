package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2359c4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C2377d4 c2377d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c2377d4.b(), a(c2377d4.c()), b(c2377d4));
    }

    private static String b(C2377d4 c2377d4) {
        return (c2377d4.d() == null || c2377d4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c2377d4.d(), c2377d4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
