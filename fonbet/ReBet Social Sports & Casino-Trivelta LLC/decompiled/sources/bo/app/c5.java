package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m0.AbstractC5487a;

/* loaded from: classes.dex */
public final class c5 implements g9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25315a;

    /* renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f25316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25317c;

    /* renamed from: d, reason: collision with root package name */
    public final b5 f25318d;

    /* renamed from: e, reason: collision with root package name */
    public PackageInfo f25319e;

    public c5(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f25315a = context;
        this.f25316b = configurationProvider;
        PackageInfo j10 = j();
        this.f25317c = j10 != null ? j10.versionName : null;
        this.f25318d = new b5(context);
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final x4 b() {
        BrazeConfigurationProvider configurationProvider = this.f25316b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String h10 = h();
        String str = Build.BRAND;
        if (str == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String locale2 = locale.toString();
        Intrinsics.checkNotNullExpressionValue(locale2, "toString(...)");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
        return new x4(configurationProvider, valueOf, h10, str, str2, locale2, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.f25318d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.f25318d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public final String c() {
        PackageInfo j10 = j();
        if (j10 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c5.a();
                }
            }, 7, (Object) null);
            return null;
        }
        return (Build.VERSION.SDK_INT >= 28 ? j10.getLongVersionCode() : AbstractC5487a.a(j10)) + ".0.0.0";
    }

    public final boolean d() {
        Object systemService = this.f25315a.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        boolean isBackgroundRestricted;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f25315a.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            isBackgroundRestricted = ((ActivityManager) systemService).isBackgroundRestricted();
            return isBackgroundRestricted;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c5.g();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.f25315a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return StringsKt.trim((CharSequence) networkOperatorName).toString();
            }
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c5.i();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageArchiveInfo;
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of3;
        PackageInfo packageInfo2 = this.f25319e;
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        final String packageName = this.f25315a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f25315a.getPackageManager();
                of3 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of3);
            } else {
                packageInfo = this.f25315a.getPackageManager().getPackageInfo(packageName, 0);
            }
            this.f25319e = packageInfo;
            return packageInfo;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c5.a(packageName);
                }
            }, 4, (Object) null);
            ApplicationInfo applicationInfo = this.f25315a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager2 = this.f25315a.getPackageManager();
                String str = applicationInfo.sourceDir;
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageArchiveInfo = packageManager2.getPackageArchiveInfo(str, of2);
            } else {
                packageArchiveInfo = this.f25315a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            }
            this.f25319e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a(String str) {
        return "Unable to inspect package [" + str + "]";
    }
}
