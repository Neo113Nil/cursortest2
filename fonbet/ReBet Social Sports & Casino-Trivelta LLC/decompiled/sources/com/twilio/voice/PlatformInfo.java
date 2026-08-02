package com.twilio.voice;

import android.os.Build;

/* loaded from: classes4.dex */
final class PlatformInfo {
    private static final String PLATFORM_NAME = "Android";
    private String platformVersion = Build.VERSION.RELEASE;
    private String hwDeviceManufacturer = Build.MANUFACTURER;
    private String hwDeviceModel = Build.MODEL;
    private String sdkVersion = Voice.getVersion();
    private String hwDeviceArch = System.getProperty("os.arch");

    public String getHwDeviceArch() {
        return this.hwDeviceArch;
    }

    public String getHwDeviceManufacturer() {
        return this.hwDeviceManufacturer;
    }

    public String getHwDeviceModel() {
        return this.hwDeviceModel;
    }

    public String getPlatformName() {
        return PLATFORM_NAME;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }
}
