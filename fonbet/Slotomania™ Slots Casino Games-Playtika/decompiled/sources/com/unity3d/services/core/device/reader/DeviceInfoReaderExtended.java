package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.ironsource.X3;
import com.safedk.android.utils.j;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class DeviceInfoReaderExtended implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderExtended(IDeviceInfoReader iDeviceInfoReader) {
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("bundleId", ClientProperties.getAppName());
        deviceInfoData.put("encrypted", Boolean.valueOf(ClientProperties.isAppDebuggable()));
        deviceInfoData.put(OperatingSystem.JsonKeys.ROOTED, Boolean.valueOf(Device.isRooted()));
        deviceInfoData.put("osVersion", Device.getOsVersion());
        deviceInfoData.put("deviceModel", Device.getModel());
        deviceInfoData.put(Device.JsonKeys.LANGUAGE, Locale.getDefault().toString());
        deviceInfoData.put("connectionType", com.unity3d.services.core.device.Device.getConnectionType());
        deviceInfoData.put("screenHeight", Integer.valueOf(com.unity3d.services.core.device.Device.getScreenHeight()));
        deviceInfoData.put("screenWidth", Integer.valueOf(com.unity3d.services.core.device.Device.getScreenWidth()));
        deviceInfoData.put("deviceMake", com.unity3d.services.core.device.Device.getManufacturer());
        deviceInfoData.put("screenDensity", Integer.valueOf(com.unity3d.services.core.device.Device.getScreenDensity()));
        deviceInfoData.put("screenSize", Integer.valueOf(com.unity3d.services.core.device.Device.getScreenLayout()));
        deviceInfoData.put("limitAdTracking", Boolean.valueOf(com.unity3d.services.core.device.Device.isLimitAdTrackingEnabled()));
        deviceInfoData.put("networkOperator", com.unity3d.services.core.device.Device.getNetworkOperator());
        deviceInfoData.put("volume", Integer.valueOf(com.unity3d.services.core.device.Device.getStreamVolume(1)));
        deviceInfoData.put("deviceFreeSpace", Long.valueOf(com.unity3d.services.core.device.Device.getFreeSpace(ClientProperties.getApplicationContext().getCacheDir())));
        deviceInfoData.put("apiLevel", String.valueOf(com.unity3d.services.core.device.Device.getApiLevel()));
        deviceInfoData.put("networkType", Integer.valueOf(com.unity3d.services.core.device.Device.getNetworkType()));
        deviceInfoData.put("bundleVersion", ClientProperties.getAppVersion());
        try {
            deviceInfoData.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        } catch (AssertionError e) {
            DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
        }
        deviceInfoData.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        try {
            deviceInfoData.put("webviewUa", WebSettings.getDefaultUserAgent(ClientProperties.getApplicationContext()));
        } catch (Exception e2) {
            DeviceLog.exception("Error getting webview user agent", e2);
        }
        deviceInfoData.put("networkOperatorName", com.unity3d.services.core.device.Device.getNetworkOperatorName());
        deviceInfoData.put("wiredHeadset", Boolean.valueOf(com.unity3d.services.core.device.Device.isWiredHeadsetOn()));
        deviceInfoData.put(j.h, Integer.valueOf(SdkProperties.getVersionCode()));
        deviceInfoData.put("stores", AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        deviceInfoData.put("appStartTime", Long.valueOf(SdkProperties.getInitializationTimeEpoch() / 1000));
        deviceInfoData.put("sdkVersionName", SdkProperties.getVersionName());
        deviceInfoData.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        deviceInfoData.put("cpuCount", Long.valueOf(com.unity3d.services.core.device.Device.getCPUCount()));
        deviceInfoData.put("usbConnected", Boolean.valueOf(com.unity3d.services.core.device.Device.isUSBConnected()));
        deviceInfoData.put("apkDeveloperSigningCertificateHash", com.unity3d.services.core.device.Device.getCertificateFingerprint());
        deviceInfoData.put("deviceUpTime", Long.valueOf(com.unity3d.services.core.device.Device.getUptime()));
        deviceInfoData.put("deviceElapsedRealtime", Long.valueOf(com.unity3d.services.core.device.Device.getElapsedRealtime()));
        deviceInfoData.put("adbEnabled", com.unity3d.services.core.device.Device.isAdbEnabled());
        deviceInfoData.put("androidFingerprint", com.unity3d.services.core.device.Device.getFingerprint());
        deviceInfoData.put("batteryStatus", Integer.valueOf(com.unity3d.services.core.device.Device.getBatteryStatus()));
        deviceInfoData.put(X3.j.Y, Float.valueOf(com.unity3d.services.core.device.Device.getBatteryLevel()));
        deviceInfoData.put("networkMetered", Boolean.valueOf(com.unity3d.services.core.device.Device.getNetworkMetered()));
        deviceInfoData.put("test", Boolean.valueOf(SdkProperties.isTestMode()));
        deviceInfoData.put("callType", InitRequestType.TOKEN.getCallType());
        return deviceInfoData;
    }
}
