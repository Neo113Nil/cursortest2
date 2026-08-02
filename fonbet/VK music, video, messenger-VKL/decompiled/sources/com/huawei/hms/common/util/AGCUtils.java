package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptionsBuilder;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(Context context, String str) {
        String str2;
        InputStream inputStream = null;
        try {
            try {
                try {
                    AGConnectOptionsBuilder aGConnectOptionsBuilder = new AGConnectOptionsBuilder();
                    inputStream = context.getResources().getAssets().open("agconnect-services.json");
                    aGConnectOptionsBuilder.setInputStream(inputStream);
                    str2 = aGConnectOptionsBuilder.build(context).getString(str);
                } catch (IOException e) {
                    e.toString();
                    str2 = "";
                    IOUtils.closeQuietly(inputStream);
                    if (!TextUtils.isEmpty(str2)) {
                    }
                }
            } catch (NullPointerException e2) {
                e2.toString();
                str2 = "";
                IOUtils.closeQuietly(inputStream);
                if (!TextUtils.isEmpty(str2)) {
                }
            }
            IOUtils.closeQuietly(inputStream);
            return !TextUtils.isEmpty(str2) ? str2 : "";
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    private static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.cpid")) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("cpid=") ? valueOf.substring(5) : valueOf;
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return "";
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (c(context)) {
            str = a(context, "client/app_id");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            str = null;
        }
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            str = aGConnectInstance.getOptions().getString("client/app_id");
        } catch (NullPointerException unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a = a(context);
        return !TextUtils.isEmpty(a) ? a : a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        try {
            AGConnectInstance aGConnectInstance = AGConnectInstance.getInstance();
            if (aGConnectInstance.getContext() != context) {
                aGConnectInstance = AGConnectInstance.buildInstance(new AGConnectOptionsBuilder().build(context));
            }
            str = aGConnectInstance.getOptions().getString("client/cp_id");
        } catch (NullPointerException unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b = b(context);
        return !TextUtils.isEmpty(b) ? b : a(context, "client/cp_id");
    }

    private static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.appid")) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return "";
    }
}
