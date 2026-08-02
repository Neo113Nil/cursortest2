package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.U3;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import defpackage.tub;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mf {
    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String jSONObject5 = new JSONObject(tub.h(new Pair(Ta.o, U3.d), new Pair("appKey", str), new Pair("sdkVersion", str2), new Pair("bundleId", str3), new Pair("appName", str4), new Pair(U3.j.W, str5), new Pair("initResponse", jSONObject), new Pair("isRvManual", Boolean.valueOf(z)), new Pair("generalProperties", jSONObject2), new Pair("adaptersVersion", jSONObject3), new Pair("metaData", jSONObject4), new Pair("gdprConsent", bool), new Pair("coppa", bool2))).toString();
        jSONObject5.getClass();
        return jSONObject5;
    }

    @Nullable
    public final String b(@NotNull Context context) {
        context.getClass();
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Uf.a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull JSONObject jSONObject, @NotNull String str2, @NotNull String str3, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z) {
        context.getClass();
        str.getClass();
        jSONObject.getClass();
        str2.getClass();
        str3.getClass();
        Uf uf = Uf.a;
        a(context, a(str, str2, uf.c(context), uf.a(context), uf.b(context), bool, bool2, jSONObject, z, uf.b(), uf.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", str3);
        context.startActivity(intent);
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.getClass();
        edit.putString("dataString", str);
        edit.apply();
    }
}
