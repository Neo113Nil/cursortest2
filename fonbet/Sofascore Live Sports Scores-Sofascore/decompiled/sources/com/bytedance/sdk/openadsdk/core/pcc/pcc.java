package com.bytedance.sdk.openadsdk.core.pcc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import defpackage.ea4;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static String pcc;
    private static Boolean sf;

    public static String pcc(Context context) {
        String str = pcc;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                pcc = null;
            } else if (TextUtils.isEmpty(str2) || pcc(context, intent) || !arrayList.contains(str2)) {
                pcc = (String) arrayList.get(0);
            } else {
                pcc = str2;
            }
        } catch (Throwable th) {
            lo.gm("CustomTabsHelper", th.getMessage());
        }
        return pcc;
    }

    public static int sf(Context context) {
        return !TextUtils.isEmpty(pcc(context)) ? 1 : 0;
    }

    private static boolean pcc(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
        }
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int pcc() {
        Boolean bool = sf;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void pcc(Context context, String str, ea4 ea4Var, Uri uri) {
        ea4Var.a.setPackage(str);
        ea4Var.a(context, uri);
    }
}
