package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.infer.annotation.Nullsafe;
import com.ironsource.U3;
import defpackage.c15;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;
    public static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Context context, JSONObject jSONObject, String str) {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", U3.d);
    }

    public static void reportDexLoadingIssue(Context context, String str, double d) {
        AtomicBoolean atomicBoolean = a;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new c15(context, str).start();
    }
}
