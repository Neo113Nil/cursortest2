package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.utils.Logger;
import xsna.e43;
import xsna.fau;
import xsna.xzx0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public class a {
    public static final int a;
    public static final a b;

    static {
        AtomicBoolean atomicBoolean = fau.a;
        a = 12451000;
        b = new a();
    }

    public static int a(@NonNull Context context) {
        AtomicBoolean atomicBoolean = fau.a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static void d(@NonNull Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        AtomicBoolean atomicBoolean = fau.a;
        a aVar = b;
        int c = aVar.c(context, 11925000);
        if (c != 0) {
            Intent b2 = aVar.b(context, c, Logger.METHOD_E);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(c);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (b2 != null) {
                throw new GooglePlayServicesRepairableException(c, "Google Play Services not available", b2);
            }
            throw new GooglePlayServicesNotAvailableException(c);
        }
    }

    @Nullable
    public Intent b(@Nullable Context context, int i, @Nullable String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && e43.j(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(xzx0.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int c(@NonNull Context context, int i) {
        int b2 = fau.b(context, i);
        if (b2 != 18 ? b2 == 1 ? fau.c(context) : false : true) {
            return 18;
        }
        return b2;
    }

    public int isGooglePlayServicesAvailable(@NonNull Context context) {
        return c(context, a);
    }
}
