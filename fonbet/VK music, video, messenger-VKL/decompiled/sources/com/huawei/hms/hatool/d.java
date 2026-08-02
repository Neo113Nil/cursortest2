package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.preference.Preference;
import java.util.Map;
import xsna.xe9;
import xsna.y57;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes13.dex */
public class d {
    public static long a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getLong(str2, j) : j;
    }

    private static SharedPreferences b(Context context, String str) {
        return Preference.h(context, 0, c(context, str));
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n = a1.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n)) {
            return y57.a("hms_", str, BundleUtil.UNDERLINE_TAG, packageName);
        }
        StringBuilder a = xe9.a("hms_", str, BundleUtil.UNDERLINE_TAG, packageName, BundleUtil.UNDERLINE_TAG);
        a.append(n);
        return a.toString();
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getString(str2, str3) : str3;
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static void a(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            v.f("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            v.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            if (strArr.length == 0) {
                edit.clear();
                edit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (b.contains(str2)) {
                    edit.remove(str2);
                    edit.commit();
                }
            }
        }
    }
}
