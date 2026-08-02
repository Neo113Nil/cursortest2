package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3643o5 {
    public static String a;

    public static final String a(Context context) {
        F5.a.getClass();
        if (!F5.w()) {
            return null;
        }
        if (context == null || a != null) {
            return a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            queryIntentActivities.getClass();
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String str2 = resolveInfo.activityInfo.packageName;
                    str2.getClass();
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                a = null;
            } else if (arrayList.size() == 1) {
                a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && CollectionsKt.R(arrayList, str)) {
                a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            queryIntentActivities.getClass();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
