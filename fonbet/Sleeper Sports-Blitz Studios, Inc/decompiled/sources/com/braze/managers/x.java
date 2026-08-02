package com.braze.managers;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.pm.PackageInfoCompat;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import expo.modules.notifications.service.NotificationsService;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class x implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f613a;
    public final BrazeConfigurationProvider b;
    public final String c;
    public final com.braze.storage.w0 d;
    public PackageInfo e;

    public x(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f613a = context;
        this.b = configurationProvider;
        PackageInfo j = j();
        this.c = j != null ? j.versionName : null;
        this.d = new com.braze.storage.w0(context);
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }

    public static final String e() {
        return "Failed to read notifications enabled state from NotificationManagerCompat.";
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final com.braze.models.outgoing.h b() {
        BrazeConfigurationProvider configurationProvider = this.b;
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String h = h();
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
        return new com.braze.models.outgoing.h(configurationProvider, valueOf, h, str, str2, locale2, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public final String c() {
        PackageInfo j = j();
        if (j == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.x$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.a();
                }
            }, 7, (Object) null);
            return null;
        }
        return (Build.VERSION.SDK_INT >= 28 ? j.getLongVersionCode() : PackageInfoCompat.getLongVersionCode(j)) + ".0.0.0";
    }

    public final boolean f() {
        boolean isBackgroundRestricted;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f613a.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            isBackgroundRestricted = ((ActivityManager) systemService).isBackgroundRestricted();
            return isBackgroundRestricted;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.x$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.g();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.f613a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return StringsKt.trim((CharSequence) networkOperatorName).toString();
            }
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.x$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.i();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageArchiveInfo;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo2 = this.e;
        if (packageInfo2 != null) {
            return packageInfo2;
        }
        final String packageName = this.f613a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.f613a.getPackageManager();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
            } else {
                packageInfo = this.f613a.getPackageManager().getPackageInfo(packageName, 0);
            }
            this.e = packageInfo;
            return packageInfo;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.x$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.a(packageName);
                }
            }, 4, (Object) null);
            ApplicationInfo applicationInfo = this.f613a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager2 = this.f613a.getPackageManager();
                String str = applicationInfo.sourceDir;
                of = PackageManager.PackageInfoFlags.of(0L);
                packageArchiveInfo = packageManager2.getPackageArchiveInfo(str, of);
            } else {
                packageArchiveInfo = this.f613a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            }
            this.e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a(String str) {
        return "Unable to inspect package [" + str + "]";
    }

    public final boolean d() {
        Object systemService = this.f613a.getSystemService(NotificationsService.NOTIFICATION_KEY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }
}
