package org.chromium.base;

import android.os.Build;
import android.text.TextUtils;
import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android::android_info")
/* loaded from: classes10.dex */
public final class AndroidInfo {
    private static final String TAG = "AndroidInfo";

    interface Natives {
        void fillFields(String brand, String device, String buildId, String manufacturer, String model, String type, String board, String androidBuildFingerprint, String versionIncremental, String hardware, String codename, String socManufacturer, String supportedAbis, int sdkInt, boolean isDebugAndroid, String securityPatch);
    }

    private static void nativeReadyForFields() {
        sendToNative(getAidlInfo());
    }

    public static void sendToNative(IAndroidInfo info) {
        AndroidInfoJni.get().fillFields(info.brand, info.device, info.androidBuildId, info.manufacturer, info.model, info.buildType, info.board, info.androidBuildFp, info.versionIncremental, info.hardware, info.codename, info.socManufacturer, info.abiName, info.sdkInt, info.isDebugAndroid, info.securityPatch);
    }

    public static IAndroidInfo getAidlInfo() {
        IAndroidInfo iAndroidInfo = new IAndroidInfo();
        iAndroidInfo.abiName = getAndroidSupportedAbis();
        iAndroidInfo.androidBuildFp = getAndroidBuildFingerprint();
        iAndroidInfo.androidBuildId = Build.ID;
        iAndroidInfo.board = Build.BOARD;
        iAndroidInfo.brand = Build.BRAND;
        iAndroidInfo.buildType = Build.TYPE;
        iAndroidInfo.codename = Build.VERSION.CODENAME;
        iAndroidInfo.device = Build.DEVICE;
        iAndroidInfo.hardware = Build.HARDWARE;
        iAndroidInfo.isDebugAndroid = isDebugAndroid();
        iAndroidInfo.manufacturer = Build.MANUFACTURER;
        iAndroidInfo.model = Build.MODEL;
        iAndroidInfo.sdkInt = Build.VERSION.SDK_INT;
        iAndroidInfo.securityPatch = Build.VERSION.SECURITY_PATCH;
        iAndroidInfo.socManufacturer = Build.VERSION.SDK_INT >= 31 ? Build.SOC_MANUFACTURER : "";
        iAndroidInfo.versionIncremental = Build.VERSION.INCREMENTAL;
        return iAndroidInfo;
    }

    public static String getAndroidBuildFingerprint() {
        return Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
    }

    public static String getAndroidSupportedAbis() {
        return TextUtils.join(", ", Build.SUPPORTED_ABIS);
    }

    private AndroidInfo() {
    }

    public static boolean isDebugAndroid() {
        return "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
    }
}
