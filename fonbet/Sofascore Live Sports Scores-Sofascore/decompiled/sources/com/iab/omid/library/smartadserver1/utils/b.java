package com.iab.omid.library.smartadserver1.utils;

import android.os.Build;
import com.ironsource.L6;
import com.ironsource.U3;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return U3.d;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, L6.F, b());
        return jSONObject;
    }
}
