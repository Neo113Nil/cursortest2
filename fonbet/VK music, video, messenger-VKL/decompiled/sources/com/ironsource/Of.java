package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.vk.core.preference.Preference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.pn00;

/* loaded from: classes13.dex */
public final class Of {
    public final void a(Context context, String str, JSONObject jSONObject, String str2, String str3, Boolean bool, boolean z) {
        Wf wf = Wf.a;
        a(context, a(str, str2, wf.c(context), wf.a(context), wf.b(context), bool, jSONObject, z, wf.b(), wf.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", str3);
        context.startActivity(intent);
    }

    public final String b(Context context) {
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : Wf.a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        return new JSONObject(pn00.k(new Pair(Wa.o, X3.d), new Pair("appKey", str), new Pair("sdkVersion", str2), new Pair("bundleId", str3), new Pair("appName", str4), new Pair("appVersion", str5), new Pair("initResponse", jSONObject), new Pair("isRvManual", Boolean.valueOf(z)), new Pair("generalProperties", jSONObject2), new Pair("adaptersVersion", jSONObject3), new Pair("metaData", jSONObject4), new Pair("gdprConsent", bool))).toString();
    }

    private final SharedPreferences a(Context context) {
        return Preference.h(context, 0, "com.unity3d.ad-mediation.testSuite");
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString("dataString", str);
        edit.apply();
    }
}
