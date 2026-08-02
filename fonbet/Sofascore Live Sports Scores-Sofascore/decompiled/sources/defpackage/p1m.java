package defpackage;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.blaze.blazesdk.analytics.enums.ConnectionType;
import com.blaze.blazesdk.analytics.enums.DeviceType;
import com.blaze.blazesdk.external_modules.BlazeExternalModulesBinder;
import com.blaze.blazesdk.external_modules.flutter.BlazeFlutterSDKHelperInterface;
import com.blaze.blazesdk.external_modules.react_native.BlazeReactSDKHelperInterface;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class p1m {
    public static final String a = fc6.C();
    public static final String b = "1.17.1";
    public static String c = "";
    public static String d = "";
    public static String e = "";

    public static String a() {
        NetworkCapabilities networkCapabilities;
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        if (application$blazesdk_release != null) {
            Object systemService = application$blazesdk_release.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                } catch (Exception e2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e2, null);
                    networkCapabilities = null;
                }
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(0)) {
                        return ConnectionType.CELLULAR.getValue();
                    }
                    if (networkCapabilities.hasTransport(1)) {
                        return ConnectionType.WIRELESS.getValue();
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return ConnectionType.WIRED.getValue();
                    }
                }
            }
        }
        return null;
    }

    public static void b(Application application) {
        PackageManager packageManager = application.getPackageManager();
        packageManager.getClass();
        String packageName = application.getPackageName();
        packageName.getClass();
        PackageInfo packageInfoCompat$default = evl.getPackageInfoCompat$default(packageManager, packageName, 0, 2, null);
        if (packageInfoCompat$default != null) {
            ApplicationInfo applicationInfo = packageInfoCompat$default.applicationInfo;
            if (applicationInfo != null) {
                String str = applicationInfo.packageName;
                str.getClass();
                c = str;
            }
            String str2 = packageInfoCompat$default.versionName;
            if (str2 != null) {
                d = str2;
            }
        }
        e = (cnb.i(application) ? DeviceType.TABLET : DeviceType.PHONE).getValue();
    }

    public static String c() {
        BlazeExternalModulesBinder blazeExternalModulesBinder = BlazeExternalModulesBinder.INSTANCE;
        String str = blazeExternalModulesBinder.getReactNativeSDKHelper() != null ? "Android-RTN" : U3.d;
        return blazeExternalModulesBinder.getFlutterSDKHelper() != null ? str.concat("-Flutter") : str;
    }

    public static String d() {
        String flutterSDKVersion;
        String reactNativeSDKVersion;
        BlazeExternalModulesBinder blazeExternalModulesBinder = BlazeExternalModulesBinder.INSTANCE;
        BlazeReactSDKHelperInterface reactNativeSDKHelper = blazeExternalModulesBinder.getReactNativeSDKHelper();
        String str = b;
        if (reactNativeSDKHelper != null && (reactNativeSDKVersion = reactNativeSDKHelper.getReactNativeSDKVersion()) != null) {
            str = str + ';' + reactNativeSDKVersion;
        }
        BlazeFlutterSDKHelperInterface flutterSDKHelper = blazeExternalModulesBinder.getFlutterSDKHelper();
        if (flutterSDKHelper == null || (flutterSDKVersion = flutterSDKHelper.getFlutterSDKVersion()) == null) {
            return str;
        }
        return str + ';' + flutterSDKVersion;
    }
}
