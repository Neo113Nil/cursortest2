package c6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.sports.insider.R;
import g6.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.w0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3659a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f3660b;

    static {
        AtomicBoolean atomicBoolean = g.f3661a;
        f3659a = 12451000;
        f3660b = new d();
    }

    public Intent a(Context context, int i5, String str) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && q6.b.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f3659a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(s6.c.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(13:50|(1:52)(1:112)|53|(4:104|105|(1:107)(1:110)|108)(1:55)|56|57|(1:59)(1:102)|60|61|(1:63)(2:(2:73|(1:75))|(4:81|(1:83)(1:100)|(1:85)|(1:87)(4:88|(2:94|95)|90|(1:92)(1:93)))(1:80))|64|(1:(1:67)(1:68))|(1:70)(1:71)))|113|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|(0)(0)|64|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0205, code lost:
    
        io.sentry.android.core.w0.m("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i5) {
        boolean z5;
        int i10;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        AtomicBoolean atomicBoolean = g.f3661a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            w0.d("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.f3664d.get()) {
            synchronized (v.f9872a) {
                try {
                    if (!v.f9873b) {
                        v.f9873b = true;
                        try {
                            bundle = s6.c.a(context).a(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e7) {
                            w0.o("MetadataValueReader", "This should never happen.", e7);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            v.f9874c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i11 = v.f9874c;
            if (i11 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i11 != 12451000) {
                int i12 = f3659a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 104 + String.valueOf(i11).length() + 194);
                sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb2.append(i12);
                sb2.append(" but found ");
                sb2.append(i11);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        if (!q6.b.g(context)) {
            if (q6.b.f22044e == null) {
                q6.b.f22044e = Boolean.valueOf(q6.b.e() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!q6.b.f22044e.booleanValue()) {
                z5 = true;
                v.b(i5 < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i10 = 9;
                if (z5) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        w0.m("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                h.a(context);
                if (h.c(packageInfo2, true)) {
                    w0.m("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z5) {
                        v.h(packageInfo);
                        if (!h.c(packageInfo, true)) {
                            w0.m("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z5 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i13 = packageInfo2.versionCode;
                        if ((i13 == -1 ? -1 : i13 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) < (i5 != -1 ? i5 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : -1)) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i5).length() + 11 + String.valueOf(i13).length());
                            sb3.append("Google Play services out of date for ");
                            sb3.append(packageName);
                            sb3.append(".  Requires ");
                            sb3.append(i5);
                            sb3.append(" but found ");
                            sb3.append(i13);
                            w0.m("GooglePlayServicesUtil", sb3.toString());
                            i10 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e9) {
                                    w0.o("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e9);
                                    i10 = 1;
                                    if (i10 != 18 ? i10 == 1 ? g.b(context) : false : true) {
                                    }
                                }
                            }
                            i10 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        w0.m("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                }
                if (i10 != 18 ? i10 == 1 ? g.b(context) : false : true) {
                    return 18;
                }
                return i10;
            }
        }
        z5 = false;
        v.b(i5 < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i10 = 9;
        if (z5) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        h.a(context);
        if (h.c(packageInfo2, true)) {
        }
        if (i10 != 18 ? i10 == 1 ? g.b(context) : false : true) {
        }
    }
}
