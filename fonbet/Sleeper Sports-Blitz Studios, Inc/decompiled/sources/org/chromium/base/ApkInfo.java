package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import internal.org.chromium.build.BuildConfig;
import internal.org.chromium.build.NullUtil;
import internal.org.jni_zero.JNINamespace;
import org.chromium.base.version_info.VersionInfo;

@JNINamespace("base::android::apk_info")
/* loaded from: classes10.dex */
public final class ApkInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object CREATION_LOCK = new Object();
    private static final String TAG = "ApkInfo";
    private static PackageInfo sBrowserPackageInfo;
    private static String sHostSigningCertSha256;
    private static boolean sInitialized;
    private static volatile ApkInfo sInstance;
    private final ApplicationInfo mBrowserApplicationInfo;
    private final IApkInfo mIApkInfo;

    interface Natives {
        void fillFields(String hostPackageName, String hostVersionCode, String hostPackageLabel, String packageVersionCode, String packageVersionName, String packageName, String resourcesVersion, String installerPackageName, boolean isDebugApp, int targetSdkVersion);
    }

    private static void nativeReadyForFields() {
        sendToNative(getInstance().mIApkInfo);
    }

    public static void sendToNative(IApkInfo info) {
        ApkInfoJni.get().fillFields(info.hostPackageName, info.hostVersionCode, info.hostPackageLabel, info.packageVersionCode, info.packageVersionName, info.packageName, info.resourcesVersion, info.installerPackageName, info.isDebugApp, info.targetSdkVersion);
    }

    public static IApkInfo getAidlInfo() {
        return getInstance().mIApkInfo;
    }

    public static String getHostPackageName() {
        return getInstance().mIApkInfo.hostPackageName;
    }

    public static String getHostVersionCode() {
        return getInstance().mIApkInfo.hostVersionCode;
    }

    public static String getHostPackageLabel() {
        return getInstance().mIApkInfo.hostPackageLabel;
    }

    public static String getPackageName() {
        return getInstance().mIApkInfo.packageName;
    }

    public static String getPackageVersionCode() {
        return getInstance().mIApkInfo.packageVersionCode;
    }

    public static String getPackageVersionName() {
        return getInstance().mIApkInfo.packageVersionName;
    }

    public static String getInstallerPackageName() {
        return getInstance().mIApkInfo.installerPackageName;
    }

    public static String getResourcesVersion() {
        return getInstance().mIApkInfo.resourcesVersion;
    }

    public static boolean isDebugApp() {
        return getInstance().mIApkInfo.isDebugApp;
    }

    public static boolean isDebugAndroidOrApp() {
        return AndroidInfo.isDebugAndroid() || isDebugApp();
    }

    public static boolean targetAtLeastB() {
        return ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 36;
    }

    public static boolean isInitializedForTesting() {
        return sInitialized;
    }

    public static ApkInfo getInstance() {
        if (BuildConfig.IS_FOR_TEST) {
            return new ApkInfo();
        }
        if (sInstance == null) {
            synchronized (CREATION_LOCK) {
                if (sInstance == null) {
                    sInstance = new ApkInfo();
                }
            }
        }
        return sInstance;
    }

    public ApplicationInfo getBrowserApplicationInfo() {
        return this.mBrowserApplicationInfo;
    }

    public static void setBrowserPackageInfo(PackageInfo packageInfo) {
        sBrowserPackageInfo = packageInfo;
    }

    private static String nullToEmpty(CharSequence seq) {
        return seq == null ? "" : seq.toString();
    }

    private ApkInfo() {
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String[] packagesForUid;
        String str7;
        sInitialized = true;
        IApkInfo iApkInfo = new IApkInfo();
        this.mIApkInfo = iApkInfo;
        Context applicationContext = ContextUtils.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        PackageManager packageManager = applicationContext.getPackageManager();
        iApkInfo.packageVersionCode = String.valueOf(BuildConfig.VERSION_CODE);
        if (CommandLine.isInitialized()) {
            CommandLine commandLine = CommandLine.getInstance();
            str = commandLine.getSwitchValue(BaseSwitches.HOST_PACKAGE_NAME);
            str2 = commandLine.getSwitchValue(BaseSwitches.HOST_PACKAGE_LABEL);
            str3 = commandLine.getSwitchValue(BaseSwitches.PACKAGE_NAME);
            str4 = commandLine.getSwitchValue(BaseSwitches.PACKAGE_VERSION_NAME);
            String switchValue = commandLine.getSwitchValue(BaseSwitches.HOST_VERSION_CODE);
            l = switchValue != null ? Long.valueOf(Long.parseLong(switchValue)) : null;
        } else {
            l = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        boolean z = (str == null || str2 == null || l == null || str3 == null || str4 == null) ? false : true;
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        iApkInfo.isDebugApp = (applicationInfo.flags & 2) != 0;
        if (z) {
            iApkInfo.hostPackageName = (String) NullUtil.assumeNonNull(str);
            iApkInfo.hostPackageLabel = (String) NullUtil.assumeNonNull(str2);
            iApkInfo.hostVersionCode = String.valueOf(NullUtil.assumeNonNull(l));
            iApkInfo.packageVersionName = (String) NullUtil.assumeNonNull(str4);
            iApkInfo.packageName = (String) NullUtil.assumeNonNull(str3);
        } else {
            if (!ContextUtils.isSdkSandboxProcess() || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
                str5 = packageName;
                str6 = str5;
            } else {
                str5 = packagesForUid[0];
                str6 = packageName + ":" + str5;
            }
            iApkInfo.hostPackageName = str6;
            iApkInfo.hostPackageLabel = nullToEmpty(packageManager.getApplicationLabel(applicationInfo));
            if (sBrowserPackageInfo != null) {
                iApkInfo.hostVersionCode = String.valueOf(PackageUtils.packageVersionCode((PackageInfo) NullUtil.assumeNonNull(PackageUtils.getPackageInfo(str5, 0))));
                iApkInfo.packageName = sBrowserPackageInfo.packageName;
                iApkInfo.packageVersionName = nullToEmpty(sBrowserPackageInfo.versionName);
                applicationInfo = sBrowserPackageInfo.applicationInfo;
                sBrowserPackageInfo = null;
            } else {
                iApkInfo.packageName = packageName;
                iApkInfo.hostVersionCode = String.valueOf(BuildConfig.VERSION_CODE);
                iApkInfo.packageVersionName = VersionInfo.getProductVersion();
            }
            packageName = str5;
        }
        this.mBrowserApplicationInfo = applicationInfo;
        iApkInfo.installerPackageName = nullToEmpty(packageManager.getInstallerPackageName(packageName));
        if (BuildConfig.R_STRING_PRODUCT_VERSION == 0) {
            str7 = "Not Enabled";
        } else {
            try {
                str7 = ContextUtils.getApplicationContext().getString(BuildConfig.R_STRING_PRODUCT_VERSION);
            } catch (Exception unused) {
                str7 = "Not found";
            }
        }
        this.mIApkInfo.resourcesVersion = str7;
        this.mIApkInfo.targetSdkVersion = applicationInfo.targetSdkVersion;
    }

    public static String getHostSigningCertSha256() {
        String str;
        synchronized (CREATION_LOCK) {
            str = sHostSigningCertSha256;
            if (str == null) {
                str = PackageUtils.computeCertSignatureSha256ForPackage(getHostPackageName());
                if (str == null) {
                    str = "";
                }
                sHostSigningCertSha256 = str;
            }
        }
        return str;
    }
}
