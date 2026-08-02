package io.branch.referral;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import io.branch.referral.Defines;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes9.dex */
abstract class SystemObserver {
    static final String BLANK = "bnc_no_value";
    private static final String UUID_EMPTY = "00000000-0000-0000-0000-000000000000";
    private String AIDInitializationSessionID_;
    private String GAIDString_ = null;
    private int LATVal_ = 0;

    interface AdsParamsFetchEvents {
        void onAdsParamsFetchFinished();
    }

    SystemObserver() {
    }

    static UniqueId getUniqueID(Context context, boolean z) {
        return new UniqueId(context, z);
    }

    static String getPackageName(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception e) {
                PrefHelper.LogException("Error obtaining PackageName", e);
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0020 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String getAppVersion(Context context) {
        String str;
        if (context != null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                PrefHelper.LogException("Error obtaining AppVersion", e);
            }
            return !TextUtils.isEmpty(str) ? "bnc_no_value" : str;
        }
        str = "";
        if (!TextUtils.isEmpty(str)) {
        }
    }

    static long getFirstInstallTime(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception e) {
            PrefHelper.LogException("Error obtaining FirstInstallTime", e);
            return 0L;
        }
    }

    static boolean isPackageInstalled(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()) == null) {
                    return false;
                }
                return !packageManager.queryIntentActivities(r3, 65536).isEmpty();
            } catch (Exception e) {
                PrefHelper.LogException("Error obtaining PackageInfo", e);
            }
        }
        return false;
    }

    static long getLastUpdateTime(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception e) {
            PrefHelper.LogException("Error obtaining LastUpdateTime", e);
            return 0L;
        }
    }

    static String getPhoneBrand() {
        return Build.MANUFACTURER;
    }

    static String getPhoneModel() {
        return Build.MODEL;
    }

    static String getISO2CountryCode() {
        return Locale.getDefault().getCountry();
    }

    static String getISO2LanguageCode() {
        return Locale.getDefault().getLanguage();
    }

    private static boolean isFireOSDevice() {
        return getPhoneBrand().equalsIgnoreCase("amazon");
    }

    static String getOS(Context context) {
        if (isFireOSDevice()) {
            return context == null ? getPhoneModel().contains("AFT") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE";
        }
        return "Android";
    }

    static int getAPILevel() {
        return Build.VERSION.SDK_INT;
    }

    static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    static String getCPUType() {
        return System.getProperty("os.arch");
    }

    static String getDeviceBuildId() {
        return Build.DISPLAY;
    }

    static String getLocale() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    static String getConnectionType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        return "mobile";
    }

    static String getCarrier(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return null;
        }
        return networkOperatorName;
    }

    static DisplayMetrics getScreenDisplay(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    static boolean getWifiConnected(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager != null ? connectivityManager.getNetworkInfo(1) : null;
            if (networkInfo != null && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    boolean prefetchAdsParams(Context context, AdsParamsFetchEvents adsParamsFetchEvents) {
        this.AIDInitializationSessionID_ = PrefHelper.getInstance(context).getSessionID();
        if (!isFireOSDevice()) {
            new GAdsPrefetchTask(context, adsParamsFetchEvents).executeTask(new Void[0]);
            return true;
        }
        if (context != null) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                setLAT(Settings.Secure.getInt(contentResolver, "limit_ad_tracking"));
                setGAID(Settings.Secure.getString(contentResolver, "advertising_id"));
                if (TextUtils.isEmpty(this.GAIDString_) || this.GAIDString_.equals("00000000-0000-0000-0000-000000000000") || this.LATVal_ == 1) {
                    setGAID(null);
                }
                if (adsParamsFetchEvents != null) {
                    adsParamsFetchEvents.onAdsParamsFetchFinished();
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return false;
    }

    static String getLocalIPAddress() {
        String str = "";
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                str = hostAddress;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    static String getUIMode(Context context) {
        UiModeManager uiModeManager;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception unused) {
                return "UI_MODE_TYPE_UNDEFINED";
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager != null) {
            switch (uiModeManager.getCurrentModeType()) {
                case 1:
                    return "UI_MODE_TYPE_NORMAL";
                case 2:
                    return "UI_MODE_TYPE_DESK";
                case 3:
                    return "UI_MODE_TYPE_CAR";
                case 4:
                    return "UI_MODE_TYPE_TELEVISION";
                case 5:
                    return "UI_MODE_TYPE_APPLIANCE";
                case 6:
                    return "UI_MODE_TYPE_WATCH";
                default:
                    return "UI_MODE_TYPE_UNDEFINED";
            }
        }
        return "UI_MODE_TYPE_UNDEFINED";
    }

    static class UniqueId {
        private boolean isRealId;
        private String uniqueId;

        UniqueId(Context context, boolean z) {
            this.isRealId = !z;
            this.uniqueId = "bnc_no_value";
            String string = (context == null || z || Branch.isSimulatingInstalls()) ? null : Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = UUID.randomUUID().toString();
                this.isRealId = false;
            }
            this.uniqueId = string;
        }

        String getId() {
            return this.uniqueId;
        }

        boolean isReal() {
            return this.isRealId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UniqueId uniqueId = (UniqueId) obj;
            return this.uniqueId.equals(uniqueId.uniqueId) && this.isRealId == uniqueId.isRealId;
        }

        public int hashCode() {
            int i = ((this.isRealId ? 1 : 0) + 1) * 31;
            String str = this.uniqueId;
            return i + (str == null ? 0 : str.hashCode());
        }
    }

    String getAID() {
        return this.GAIDString_;
    }

    int getLATVal() {
        return this.LATVal_;
    }

    void setGAID(String str) {
        this.GAIDString_ = str;
    }

    void setLAT(int i) {
        this.LATVal_ = i;
    }

    static String getImei(Context context) {
        String secondaryRequestMetaData = PrefHelper.getInstance(context).getSecondaryRequestMetaData(Defines.ModuleNameKeys.imei.getKey());
        if (TextUtils.isEmpty(secondaryRequestMetaData)) {
            return null;
        }
        return secondaryRequestMetaData;
    }

    String getAIDInitializationSessionID() {
        return this.AIDInitializationSessionID_;
    }
}
