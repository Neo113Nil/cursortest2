package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.facebook.soloader.MinElf;
import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NativeLibraries;
import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android::device_info")
/* loaded from: classes10.dex */
public final class DeviceInfo {
    private static final Object CREATION_LOCK = new Object();
    public static final int LARGE_DISPLAY_MIN_SCREEN_WIDTH_600_DP = 600;
    private static final String TAG = "DeviceInfo";
    private static String sGmsVersionCodeForTesting;
    private static boolean sInitialized;
    private static DeviceInfo sInstance;
    private static Boolean sIsAutomotiveForTesting;
    private static Boolean sIsRetailDemoModeForTesting;
    private static boolean sIsXrForTesting;
    private final IDeviceInfo mIDeviceInfo;
    private Boolean mIsRetailDemoMode;

    interface Natives {
        void fillFields(String gmsVersionCode, boolean isTV, boolean isAutomotive, boolean isFoldable, boolean isDesktop, int vulkanDeqpLevel, boolean isXr, boolean wasLaunchedOnLargeDisplay);
    }

    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIDeviceInfo);
    }

    public static void sendToNative(IDeviceInfo info) {
        DeviceInfoJni.get().fillFields(info.gmsVersionCode, info.isTv, info.isAutomotive, info.isFoldable, info.isDesktop, info.vulkanDeqpLevel, sIsXrForTesting ? true : info.isXr, info.wasLaunchedOnLargeDisplay);
    }

    public static IDeviceInfo getAidlInfo() {
        return getInstance().mIDeviceInfo;
    }

    public static String getGmsVersionCode() {
        return getInstance().mIDeviceInfo.gmsVersionCode;
    }

    public static void setGmsVersionCodeForTest(String gmsVersionCode) {
        sGmsVersionCodeForTesting = gmsVersionCode;
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.DeviceInfo$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DeviceInfo.sGmsVersionCodeForTesting = null;
            }
        });
    }

    public static void setIsAutomotiveForTesting(boolean isAutomotive) {
        sIsAutomotiveForTesting = Boolean.valueOf(isAutomotive);
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.DeviceInfo$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DeviceInfo.sIsAutomotiveForTesting = null;
            }
        });
    }

    public static boolean isTV() {
        return getInstance().mIDeviceInfo.isTv;
    }

    public static boolean isAutomotive() {
        return getInstance().mIDeviceInfo.isAutomotive;
    }

    public static boolean isFoldable() {
        return getInstance().mIDeviceInfo.isFoldable;
    }

    public static boolean isDesktop() {
        return getInstance().mIDeviceInfo.isDesktop;
    }

    public static int getVulkanDeqpLevel() {
        return getInstance().mIDeviceInfo.vulkanDeqpLevel;
    }

    public static boolean isXr() {
        return getInstance().mIDeviceInfo.isXr;
    }

    public static boolean isRetailDemoMode() {
        Boolean bool = sIsRetailDemoModeForTesting;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (BuildConfig.IS_FOR_TEST) {
            return false;
        }
        DeviceInfo deviceInfo = getInstance();
        Boolean bool2 = deviceInfo.mIsRetailDemoMode;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        boolean z = Settings.Global.getInt(ContextUtils.getApplicationContext().getContentResolver(), "device_demo_mode", 0) != 0;
        deviceInfo.mIsRetailDemoMode = Boolean.valueOf(z);
        return z;
    }

    public static boolean isInitializedForTesting() {
        return sInitialized;
    }

    public static void setIsXrForTesting() {
        sIsXrForTesting = true;
    }

    public static void resetIsXrForTesting() {
        sIsXrForTesting = false;
    }

    public static void setIsRetailDemoModeForTesting(boolean value) {
        sIsRetailDemoModeForTesting = Boolean.valueOf(value);
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.DeviceInfo$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceInfo.sIsRetailDemoModeForTesting = null;
            }
        });
    }

    private static DeviceInfo getInstance() {
        DeviceInfo deviceInfo;
        if (BuildConfig.IS_FOR_TEST) {
            return new DeviceInfo();
        }
        synchronized (CREATION_LOCK) {
            if (sInstance == null) {
                sInstance = new DeviceInfo();
            }
            deviceInfo = sInstance;
        }
        return deviceInfo;
    }

    public static long packageVersionCode(PackageInfo pi) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = pi.getLongVersionCode();
            return longVersionCode;
        }
        return pi.versionCode;
    }

    public static String getArch() {
        boolean is64Bit = Process.is64Bit();
        if (NativeLibraries.sCpuFamily == 1) {
            return is64Bit ? "arm64" : "arm";
        }
        if (NativeLibraries.sCpuFamily == 3) {
            return is64Bit ? MinElf.ISA.X86_64 : MinElf.ISA.X86;
        }
        return "";
    }

    private static int getDeviceWidthInDp() {
        return (int) (r0.widthPixels / ContextUtils.getApplicationContext().getResources().getDisplayMetrics().density);
    }

    private DeviceInfo() {
        String str;
        boolean z;
        int i;
        FeatureInfo[] systemAvailableFeatures;
        IDeviceInfo iDeviceInfo = new IDeviceInfo();
        this.mIDeviceInfo = iDeviceInfo;
        sInitialized = true;
        PackageInfo packageInfo = PackageUtils.getPackageInfo("com.google.android.gms", 0);
        if (packageInfo != null) {
            str = String.valueOf(packageVersionCode(packageInfo));
        } else {
            str = "gms versionCode not available.";
        }
        iDeviceInfo.gmsVersionCode = str;
        String str2 = sGmsVersionCodeForTesting;
        if (str2 != null) {
            iDeviceInfo.gmsVersionCode = str2;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        UiModeManager uiModeManager = (UiModeManager) applicationContext.getSystemService("uimode");
        iDeviceInfo.isTv = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            z = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            Log.e("DeviceInfo", "Unable to query for Automotive system feature", (Throwable) e);
            z = false;
        }
        this.mIDeviceInfo.isAutomotive = z;
        Boolean bool = sIsAutomotiveForTesting;
        if (bool != null) {
            this.mIDeviceInfo.isAutomotive = bool.booleanValue();
        }
        this.mIDeviceInfo.isDesktop = (BuildConfig.IS_DESKTOP_ANDROID && packageManager.hasSystemFeature("android.hardware.type.pc")) || CommandLine.getInstance().hasSwitch(BaseSwitches.FORCE_DESKTOP_ANDROID);
        IDeviceInfo iDeviceInfo2 = this.mIDeviceInfo;
        iDeviceInfo2.isFoldable = !iDeviceInfo2.isDesktop && Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        if (Build.VERSION.SDK_INT >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i = featureInfo.version;
                    break;
                }
            }
        }
        i = 0;
        this.mIDeviceInfo.vulkanDeqpLevel = i;
        this.mIDeviceInfo.wasLaunchedOnLargeDisplay = getDeviceWidthInDp() >= 600;
        this.mIDeviceInfo.isXr = packageManager.hasSystemFeature(PackageManagerUtils.XR_OPENXR_FEATURE_NAME);
    }
}
