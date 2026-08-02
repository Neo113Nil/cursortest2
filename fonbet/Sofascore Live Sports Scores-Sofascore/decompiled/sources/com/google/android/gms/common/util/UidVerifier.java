package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean a(int i, Context context) {
        if (b(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier a = GoogleSignatureVerifier.a(context);
                if (packageInfo != null && (GoogleSignatureVerifier.c(packageInfo, false) || (GoogleSignatureVerifier.c(packageInfo, true) && GooglePlayServicesUtilLight.c(a.a)))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean b(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) Wrappers.a(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
