package org.chromium.base.version_info;

/* loaded from: classes10.dex */
public class VersionInfo {
    public static int getBuildVersion() {
        return VersionConstants.PRODUCT_BUILD_VERSION;
    }

    public static int getProductMajorVersion() {
        return 143;
    }

    public static boolean isBetaBuild() {
        return false;
    }

    public static boolean isCanaryBuild() {
        return false;
    }

    public static boolean isDevBuild() {
        return false;
    }

    public static boolean isLocalBuild() {
        return true;
    }

    public static boolean isOfficialBuild() {
        return true;
    }

    public static boolean isStableBuild() {
        return false;
    }

    public static String getChannelString() {
        return "default";
    }

    public static String getProductVersion() {
        return VersionConstants.PRODUCT_VERSION;
    }
}
