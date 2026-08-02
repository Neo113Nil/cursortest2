package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1cSDK {
    public static boolean AFKeystoreWrapper(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String AFLogger(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, e.getMessage() != null ? e.getMessage() : "Failed to retrieve version name", e);
            return "";
        }
    }

    public static Map<String, String> S_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j = packageInfo.firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j)));
                    }
                } catch (Exception e) {
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Could not fetch app install time", e);
                }
                if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
                    map.put("af_status", "Non-organic");
                }
                if (map.containsKey("agency")) {
                    map.remove("media_source");
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (!map.containsKey(next)) {
                next.getClass();
                switch (next) {
                    case "af_prt":
                        str = "agency";
                        break;
                    case "c":
                        str = MBInterstitialActivity.INTENT_CAMAPIGN;
                        break;
                }
                map.put(str, queryParameter);
            }
            str = next;
            map.put(str, queryParameter);
        }
    }

    @Nullable
    public static Application T_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Application or Activity Context should be used", new IllegalStateException());
            return null;
        }
    }

    public static boolean d(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (GoogleApiAvailability.e.b(context, GoogleApiAvailabilityLight.a) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    public static Pair<Long, String> registerClient(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    public static long unregisterClient(Context context, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode() : r2.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, e.getMessage() != null ? e.getMessage() : "Failed to retrieve version code", e);
            return 0L;
        }
    }

    public static boolean unregisterClient(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
