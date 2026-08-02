package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Z3 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C3953a4 c3953a4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c3953a4.b(), a(c3953a4.c()), b(c3953a4));
    }

    private static String b(C3953a4 c3953a4) {
        return (c3953a4.d() == null || c3953a4.a() == null) ? "" : String.format(", '%1$s', '%2$s'", c3953a4.d(), c3953a4.a());
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
