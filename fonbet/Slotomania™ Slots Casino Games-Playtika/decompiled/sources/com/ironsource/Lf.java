package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.X3;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Lf {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
        p0.startActivity(p1);
    }

    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        Tf tf = Tf.a;
        a(context, a(appKey, sdkVersion, tf.c(context), tf.a(context), tf.b(context), bool, initResponse, z, tf.b(), tf.c(), a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(com.google.android.exoplayer2.C.ENCODING_PCM_32BIT);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context).getString("dataString", "");
    }

    private final JSONObject a() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, List<String>> entry : Tf.a.d().entrySet()) {
            jsonObjectInit.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jsonObjectInit;
    }

    private final String a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String jSONObject5 = new JSONObject(MapsKt.mapOf(TuplesKt.to(Va.o, X3.d), TuplesKt.to("appKey", str), TuplesKt.to("sdkVersion", str2), TuplesKt.to("bundleId", str3), TuplesKt.to("appName", str4), TuplesKt.to(X3.j.W, str5), TuplesKt.to("initResponse", jSONObject), TuplesKt.to("isRvManual", Boolean.valueOf(z)), TuplesKt.to("generalProperties", jSONObject2), TuplesKt.to("adaptersVersion", jSONObject3), TuplesKt.to(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.d, jSONObject4), TuplesKt.to("gdprConsent", bool))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "JSONObject(\n            …ent))\n        .toString()");
        return jSONObject5;
    }

    private final SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final void a(Context context, String str) {
        SharedPreferences.Editor edit = a(context).edit();
        Intrinsics.checkNotNullExpressionValue(edit, "getTestSuitePrefs(context).edit()");
        edit.putString("dataString", str);
        edit.apply();
    }
}
