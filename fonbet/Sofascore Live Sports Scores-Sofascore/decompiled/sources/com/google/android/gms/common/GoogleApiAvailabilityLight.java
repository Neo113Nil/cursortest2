package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.me4;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleApiAvailabilityLight {
    public static final int a;
    public static final GoogleApiAvailabilityLight b;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        a = 12451000;
        b = new GoogleApiAvailabilityLight();
    }

    @KeepForSdk
    public GoogleApiAvailabilityLight() {
    }

    public Intent a(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.c(context)) {
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
                sb.append(Wrappers.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|4|(4:8|25|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(1:42)|43|(13:45|(1:47)(1:106)|48|(4:98|99|(1:101)(1:104)|102)(1:50)|51|52|(1:54)(1:96)|55|56|(1:58)(2:(2:68|(1:70))|(4:76|(1:78)(1:94)|(1:80)|(1:82)(4:83|(2:89|90)|85|(1:87)(1:88)))(1:75))|59|(1:(1:62)(1:63))|(1:65)(1:66)))|107|(0)(0)|48|(0)(0)|51|52|(0)(0)|55|56|(0)(0)|59|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0196, code lost:
    
        java.lang.String.valueOf(r2).concat(" requires Google Play services, but they are missing.");
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i) {
        boolean z;
        int i2;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        try {
            context.getResources().getString(com.sofascore.results.R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !GooglePlayServicesUtilLight.d.get()) {
            synchronized (com.google.android.gms.common.internal.zzae.a) {
                try {
                    if (!com.google.android.gms.common.internal.zzae.b) {
                        com.google.android.gms.common.internal.zzae.b = true;
                        try {
                            bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            com.google.android.gms.common.internal.zzae.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i3 = com.google.android.gms.common.internal.zzae.c;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 12451000) {
                int i4 = a;
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 104 + String.valueOf(i3).length() + 194);
                me4.r(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i4, " but found ", i3);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (!DeviceProperties.c(context)) {
            Boolean bool = DeviceProperties.d;
            if (bool == null) {
                bool = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                DeviceProperties.d = bool;
            }
            if (!bool.booleanValue()) {
                z = true;
                Preconditions.b(i < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i2 = 9;
                if (z) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                GoogleSignatureVerifier.a(context);
                if (GoogleSignatureVerifier.c(packageInfo2, true)) {
                    String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
                } else {
                    if (z) {
                        Preconditions.i(packageInfo);
                        if (!GoogleSignatureVerifier.c(packageInfo, true)) {
                            String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                        }
                    }
                    if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i5 = packageInfo2.versionCode;
                        if ((i5 == -1 ? -1 : i5 / 1000) < (i != -1 ? i / 1000 : -1)) {
                            new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i5).length());
                            i2 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                    i2 = 1;
                                    if (i2 != 18 ? i2 == 1 ? GooglePlayServicesUtilLight.d(context) : false : true) {
                                    }
                                }
                            }
                            i2 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                    }
                }
                if (i2 != 18 ? i2 == 1 ? GooglePlayServicesUtilLight.d(context) : false : true) {
                    return 18;
                }
                return i2;
            }
        }
        z = false;
        Preconditions.b(i < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i2 = 9;
        if (z) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        GoogleSignatureVerifier.a(context);
        if (GoogleSignatureVerifier.c(packageInfo2, true)) {
        }
        if (i2 != 18 ? i2 == 1 ? GooglePlayServicesUtilLight.d(context) : false : true) {
        }
    }
}
