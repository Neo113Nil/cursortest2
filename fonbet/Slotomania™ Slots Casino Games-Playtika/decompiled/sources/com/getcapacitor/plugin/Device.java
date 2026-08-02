package com.getcapacitor.plugin;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.ironsource.X3;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device;
import java.util.Locale;

@NativePlugin
/* loaded from: classes8.dex */
public class Device extends Plugin {
    @PluginMethod
    public void getInfo(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("memUsed", getMemUsed());
        jSObject.put("diskFree", getDiskFree());
        jSObject.put("diskTotal", getDiskTotal());
        jSObject.put("model", Build.MODEL);
        jSObject.put("operatingSystem", "android");
        jSObject.put("osVersion", Build.VERSION.RELEASE);
        jSObject.put(X3.j.W, getAppVersion());
        jSObject.put("appBuild", getAppBuild());
        jSObject.put("appId", getAppBundleId());
        jSObject.put("appName", getAppName());
        jSObject.put("platform", getPlatform());
        jSObject.put(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        jSObject.put(DebugImage.JsonKeys.UUID, getUuid());
        jSObject.put("isVirtual", isVirtual());
        pluginCall.success(jSObject);
    }

    @PluginMethod
    public void getBatteryInfo(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put(X3.j.Y, getBatteryLevel());
        jSObject.put(X3.j.k0, isCharging());
        pluginCall.success(jSObject);
    }

    @PluginMethod
    public void getLanguageCode(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("value", Locale.getDefault().getLanguage());
        pluginCall.success(jSObject);
    }

    private long getMemUsed() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    private long getDiskFree() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    private long getDiskTotal() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }

    private String getAppVersion() {
        try {
            return getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getAppBuild() {
        try {
            return Integer.toString(getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getAppBundleId() {
        try {
            return getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    private String getAppName() {
        try {
            ApplicationInfo applicationInfo = getContext().getApplicationInfo();
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : getContext().getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    private String getPlatform() {
        return "android";
    }

    private String getUuid() {
        return Settings.Secure.getString(this.bridge.getContext().getContentResolver(), "android_id");
    }

    private float getBatteryLevel() {
        int i;
        Intent batteryStatus = getBatteryStatus();
        int i2 = -1;
        if (batteryStatus != null) {
            int intExtra = batteryStatus.getIntExtra("level", -1);
            i = batteryStatus.getIntExtra("scale", -1);
            i2 = intExtra;
        } else {
            i = -1;
        }
        return i2 / i;
    }

    private boolean isCharging() {
        Intent batteryStatus = getBatteryStatus();
        if (batteryStatus == null) {
            return false;
        }
        int intExtra = batteryStatus.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private Intent getBatteryStatus() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (Build.VERSION.SDK_INT > 33) {
            return getContext().registerReceiver(null, intentFilter, 4);
        }
        return getContext().registerReceiver(null, intentFilter);
    }

    private boolean isVirtual() {
        return Build.FINGERPRINT.contains("generic") || Build.PRODUCT.contains("sdk");
    }
}
