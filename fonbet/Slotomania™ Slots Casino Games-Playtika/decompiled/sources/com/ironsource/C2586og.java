package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2586og {
    public static void a(Context context, String str) throws Exception {
        a(context, str, null);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
        p0.startActivity(p1);
    }

    public static void a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("url is null");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }
}
