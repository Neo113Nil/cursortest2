package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.cw3;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r {
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final com.facebook.appevents.k b;
    public final String c;

    public r(Context context, String str) {
        PackageInfo packageInfo;
        this.a = str;
        this.b = new com.facebook.appevents.k(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Bundle bundle, String str) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            bundle.getString("0_auth_logger_id");
            bundle.getString("2_result");
            bundle.getString("3_method");
            bundle.getString("6_extras");
            com.facebook.w wVar = com.facebook.w.a;
            com.facebook.appevents.k kVar = this.b;
            kVar.getClass();
            if (k0.c()) {
                kVar.a.g(bundle, str);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final void b(String str, String str2) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            Bundle t = f1.t("");
            t.putString("2_result", "error");
            t.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            t.putString("3_method", str2);
            a(t, str);
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
