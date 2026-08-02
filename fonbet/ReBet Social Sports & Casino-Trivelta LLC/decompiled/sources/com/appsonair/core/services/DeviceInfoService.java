package com.appsonair.core.services;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.DisplayMetrics;
import com.appsonair.core.BuildConfig;
import com.twilio.voice.EventKeys;
import io.sentry.F3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002FGB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0006H\u0002J\u0010\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0006H\u0002J\u001c\u0010\u0019\u001a\u00020\u00182\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010:J\b\u0010;\u001a\u000202H\u0003J\b\u0010<\u001a\u000202H\u0003J\b\u0010=\u001a\u000202H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0003J\b\u0010B\u001a\u000202H\u0002J\u0014\u0010C\u001a\u0004\u0018\u00010\n2\b\u0010D\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010E\u001a\u00020$H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0016\u0010\u001d\u001a\n \u0012*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u0016\u0010 \u001a\n \u0012*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010%R\u0014\u0010&\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0014\u0010(\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000eR\u0016\u0010*\u001a\n \u0012*\u0004\u0018\u00010+0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0012*\u0004\u0018\u00010-0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n \u0012*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/appsonair/core/services/DeviceInfoService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appMemoryUsage", "", "getAppMemoryUsage", "()J", "appName", "", "appsOnAirCoreVersion", "batteryLevel", "getBatteryLevel", "()Ljava/lang/String;", "buildVersionNumber", "", "bundleIdentifier", "kotlin.jvm.PlatformType", "deviceBatteryStatus", "getDeviceBatteryStatus", "deviceFirstInstallTime", "getDeviceFirstInstallTime", "deviceInfo", "Lorg/json/JSONObject;", "getDeviceInfo", "()Lorg/json/JSONObject;", "deviceMemory", "getDeviceMemory", "deviceModel", "deviceOrientation", "getDeviceOrientation", "deviceOsVersion", "deviceScreenSize", "deviceTotalStorage", "isRunningOnEmulator", "", "()Z", "networkState", "getNetworkState", "networkType", "getNetworkType", "pInfo", "Landroid/content/pm/PackageInfo;", "pm", "Landroid/content/pm/PackageManager;", "releaseVersion", "screenSize", "getScreenSize", "storage", "Lcom/appsonair/core/services/DeviceInfoService$StorageInfo;", "totalStorage", "usedStorage", "versionName", "formatSamsungStorageSize", "bytes", "formatStandardStorageSize", "additionalInfo", "", "getDeviceStorageDetails", "getSamsungDeviceStorageDetails", "getSamsungStorageDetailsUsingStatFs", "getSamsungStorageUuid", "Ljava/util/UUID;", "sm", "Landroid/os/storage/StorageManager;", "getStandardDeviceStorageDetails", "getVersionName", "version", "isSamsungDevice", "Companion", "StorageInfo", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceInfoService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile DeviceInfoService instance;

    @NotNull
    private final String appName;

    @NotNull
    private final String appsOnAirCoreVersion;
    private final int buildVersionNumber;
    private final String bundleIdentifier;

    @NotNull
    private final Context context;
    private final String deviceModel;
    private final String deviceOsVersion;

    @NotNull
    private final String deviceScreenSize;

    @NotNull
    private final String deviceTotalStorage;
    private final PackageInfo pInfo;
    private final PackageManager pm;

    @Nullable
    private final String releaseVersion;

    @NotNull
    private final StorageInfo storage;

    @NotNull
    private final String totalStorage;

    @NotNull
    private final String usedStorage;
    private final String versionName;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/appsonair/core/services/DeviceInfoService$Companion;", "", "()V", "instance", "Lcom/appsonair/core/services/DeviceInfoService;", "getInstance", "context", "Landroid/content/Context;", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceInfoService getInstance(@NotNull Context context) {
            DeviceInfoService deviceInfoService;
            Intrinsics.checkNotNullParameter(context, "context");
            DeviceInfoService deviceInfoService2 = DeviceInfoService.instance;
            if (deviceInfoService2 != null) {
                return deviceInfoService2;
            }
            synchronized (this) {
                deviceInfoService = DeviceInfoService.instance;
                if (deviceInfoService == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    deviceInfoService = new DeviceInfoService(applicationContext, null);
                    DeviceInfoService.instance = deviceInfoService;
                }
            }
            return deviceInfoService;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/appsonair/core/services/DeviceInfoService$StorageInfo;", "", "total", "", "used", "available", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvailable", "()Ljava/lang/String;", "getTotal", "getUsed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "appsonairCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class StorageInfo {

        @NotNull
        private final String available;

        @NotNull
        private final String total;

        @NotNull
        private final String used;

        public StorageInfo(@NotNull String total, @NotNull String used, @NotNull String available) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(used, "used");
            Intrinsics.checkNotNullParameter(available, "available");
            this.total = total;
            this.used = used;
            this.available = available;
        }

        public static /* synthetic */ StorageInfo copy$default(StorageInfo storageInfo, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = storageInfo.total;
            }
            if ((i10 & 2) != 0) {
                str2 = storageInfo.used;
            }
            if ((i10 & 4) != 0) {
                str3 = storageInfo.available;
            }
            return storageInfo.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTotal() {
            return this.total;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUsed() {
            return this.used;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAvailable() {
            return this.available;
        }

        @NotNull
        public final StorageInfo copy(@NotNull String total, @NotNull String used, @NotNull String available) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(used, "used");
            Intrinsics.checkNotNullParameter(available, "available");
            return new StorageInfo(total, used, available);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StorageInfo)) {
                return false;
            }
            StorageInfo storageInfo = (StorageInfo) other;
            return Intrinsics.areEqual(this.total, storageInfo.total) && Intrinsics.areEqual(this.used, storageInfo.used) && Intrinsics.areEqual(this.available, storageInfo.available);
        }

        @NotNull
        public final String getAvailable() {
            return this.available;
        }

        @NotNull
        public final String getTotal() {
            return this.total;
        }

        @NotNull
        public final String getUsed() {
            return this.used;
        }

        public int hashCode() {
            return (((this.total.hashCode() * 31) + this.used.hashCode()) * 31) + this.available.hashCode();
        }

        @NotNull
        public String toString() {
            return "StorageInfo(total=" + this.total + ", used=" + this.used + ", available=" + this.available + ')';
        }
    }

    public /* synthetic */ DeviceInfoService(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String formatSamsungStorageSize(long bytes) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        if (bytes >= 1073741824) {
            return decimalFormat.format(bytes / 1.073741824E9d) + " GB";
        }
        if (bytes >= F3.MAX_EVENT_SIZE_BYTES) {
            return decimalFormat.format(bytes / 1048576.0d) + " MB";
        }
        if (bytes >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return decimalFormat.format(bytes / 1024.0d) + " KB";
        }
        return bytes + " B";
    }

    private final String formatStandardStorageSize(long bytes) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        if (bytes >= 1000000000) {
            return decimalFormat.format(bytes / 1.0E9d) + " GB";
        }
        if (bytes >= 1000000) {
            return decimalFormat.format(bytes / 1000000.0d) + " MB";
        }
        if (bytes >= 1000) {
            return decimalFormat.format(bytes / 1000.0d) + " KB";
        }
        return bytes + " B";
    }

    private final long getAppMemoryUsage() {
        Intrinsics.checkNotNull(this.context.getSystemService("activity"), "null cannot be cast to non-null type android.app.ActivityManager");
        return ((ActivityManager) r0).getMemoryClass() * F3.MAX_EVENT_SIZE_BYTES;
    }

    private final String getBatteryLevel() {
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        int intProperty = batteryManager != null ? batteryManager.getIntProperty(4) : -1;
        if (intProperty < 0) {
            return "Unavailable";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(intProperty);
        sb2.append('%');
        return sb2.toString();
    }

    private final String getDeviceBatteryStatus() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra != 1 ? intExtra != 2 ? (intExtra == 3 || intExtra == 4) ? "Not Charging" : intExtra != 5 ? "Unknown power state" : "Fully Charged" : "Charging" : "Battery state is unknown";
    }

    private final String getDeviceFirstInstallTime() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of2;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.context.getPackageManager();
                String packageName = this.context.getPackageName();
                of2 = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of2);
            } else {
                packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            String format = simpleDateFormat.format(new Date(packageInfo.firstInstallTime));
            Intrinsics.checkNotNullExpressionValue(format, "{\n            val pkgInf…stInstallTime))\n        }");
            return format;
        } catch (Exception unused) {
            return "Unavailable";
        }
    }

    private final long getDeviceMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = this.context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private final String getDeviceOrientation() {
        int i10 = this.context.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? "Undefined" : "Landscape" : "Portrait";
    }

    @SuppressLint({"ServiceCast"})
    private final StorageInfo getDeviceStorageDetails() {
        return isSamsungDevice() ? getSamsungDeviceStorageDetails() : getStandardDeviceStorageDetails();
    }

    private final String getNetworkState() {
        Object systemService = this.context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return (networkCapabilities == null || !networkCapabilities.hasTransport(1)) ? (networkCapabilities == null || !networkCapabilities.hasTransport(0)) ? "No Connection" : "Mobile Data" : "Wi-Fi";
    }

    private final String getNetworkType() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? "No Connection" : networkCapabilities.hasTransport(1) ? "Wi-Fi" : networkCapabilities.hasTransport(0) ? networkCapabilities.getLinkDownstreamBandwidthKbps() >= 50000 ? "5G" : networkCapabilities.getLinkDownstreamBandwidthKbps() >= 10000 ? "4G" : networkCapabilities.getLinkDownstreamBandwidthKbps() >= 1000 ? "3G" : "2G" : "Unknown";
    }

    @SuppressLint({"ServiceCast"})
    private final StorageInfo getSamsungDeviceStorageDetails() {
        long totalBytes;
        long freeBytes;
        if (Build.VERSION.SDK_INT < 26) {
            return getSamsungStorageDetailsUsingStatFs();
        }
        try {
            Object systemService = this.context.getSystemService("storagestats");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
            StorageStatsManager a10 = a.a(systemService);
            Object systemService2 = this.context.getSystemService("storage");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
            UUID samsungStorageUuid = getSamsungStorageUuid((StorageManager) systemService2);
            totalBytes = a10.getTotalBytes(samsungStorageUuid);
            freeBytes = a10.getFreeBytes(samsungStorageUuid);
            return new StorageInfo(formatSamsungStorageSize(totalBytes), formatSamsungStorageSize(totalBytes - freeBytes), formatSamsungStorageSize(freeBytes));
        } catch (Exception unused) {
            return getSamsungStorageDetailsUsingStatFs();
        }
    }

    private final StorageInfo getSamsungStorageDetailsUsingStatFs() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBytes = statFs.getAvailableBytes();
            return new StorageInfo(formatSamsungStorageSize(totalBytes), formatSamsungStorageSize(totalBytes - availableBytes), formatSamsungStorageSize(availableBytes));
        } catch (Exception unused) {
            return new StorageInfo("0 GB", "0 GB", "0 GB");
        }
    }

    private final UUID getSamsungStorageUuid(StorageManager sm) {
        UUID uuid;
        Object obj;
        String uuid2;
        UUID uuid3;
        try {
            try {
                String uuid4 = sm.getPrimaryStorageVolume().getUuid();
                if (uuid4 == null || (uuid3 = UUID.fromString(uuid4)) == null) {
                    uuid3 = StorageManager.UUID_DEFAULT;
                }
                Intrinsics.checkNotNullExpressionValue(uuid3, "{\n        sm.primaryStor…anager.UUID_DEFAULT\n    }");
                return uuid3;
            } catch (Exception unused) {
                List<StorageVolume> storageVolumes = sm.getStorageVolumes();
                Intrinsics.checkNotNullExpressionValue(storageVolumes, "sm.storageVolumes");
                Iterator<T> it = storageVolumes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    StorageVolume storageVolume = (StorageVolume) obj;
                    if (storageVolume.isPrimary() && !storageVolume.isRemovable()) {
                        break;
                    }
                }
                StorageVolume storageVolume2 = (StorageVolume) obj;
                if (storageVolume2 == null || (uuid2 = storageVolume2.getUuid()) == null || (uuid = UUID.fromString(uuid2)) == null) {
                    uuid = StorageManager.UUID_DEFAULT;
                }
                Intrinsics.checkNotNullExpressionValue(uuid, "{\n        try {\n        …ager.UUID_DEFAULT }\n    }");
                return uuid;
            }
        } catch (Exception unused2) {
            uuid = StorageManager.UUID_DEFAULT;
            Intrinsics.checkNotNullExpressionValue(uuid, "{\n        try {\n        …ager.UUID_DEFAULT }\n    }");
            return uuid;
        }
    }

    private final String getScreenSize() {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('x');
        sb2.append(i11);
        return sb2.toString();
    }

    private final StorageInfo getStandardDeviceStorageDetails() {
        UUID uuid;
        long totalBytes;
        long freeBytes;
        if (Build.VERSION.SDK_INT < 26) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes2 = statFs.getTotalBytes();
            long availableBytes = statFs.getAvailableBytes();
            return new StorageInfo(formatStandardStorageSize(totalBytes2), formatStandardStorageSize(totalBytes2 - availableBytes), formatStandardStorageSize(availableBytes));
        }
        Object systemService = this.context.getSystemService("storagestats");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager a10 = a.a(systemService);
        Object systemService2 = this.context.getSystemService("storage");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        String uuid2 = ((StorageManager) systemService2).getPrimaryStorageVolume().getUuid();
        if (uuid2 == null || (uuid = UUID.fromString(uuid2)) == null) {
            uuid = StorageManager.UUID_DEFAULT;
        }
        totalBytes = a10.getTotalBytes(uuid);
        freeBytes = a10.getFreeBytes(uuid);
        return new StorageInfo(formatStandardStorageSize(totalBytes), formatStandardStorageSize(totalBytes - freeBytes), formatStandardStorageSize(freeBytes));
    }

    private final String getVersionName(String version) {
        List emptyList;
        if (version == null || !StringsKt.contains$default((CharSequence) version, (CharSequence) "+", false, 2, (Object) null)) {
            return version;
        }
        List<String> split = new Regex("\\+").split(version, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        return ((String[]) emptyList.toArray(new String[0]))[0];
    }

    private final boolean isRunningOnEmulator() {
        String str = Build.FINGERPRINT;
        String str2 = Build.MODEL;
        String str3 = Build.PRODUCT;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.BRAND;
        String str6 = Build.DEVICE;
        String str7 = Build.HARDWARE;
        List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{"google_sdk", "sdk", "sdk_gphone64_x86_64", "vbox86p", "emulator", "simulator", "goldfish", "ranchu", "generic", "miniSim", "genymotion"});
        if ((listOf instanceof Collection) && listOf.isEmpty()) {
            return false;
        }
        for (String str8 : listOf) {
            if (StringsKt.equals(str3, str8, true) || StringsKt.equals(str2, str8, true) || StringsKt.equals(str6, str8, true) || StringsKt.equals(str5, str8, true) || StringsKt.equals(str4, str8, true) || StringsKt.equals(str, str8, true) || StringsKt.equals(str7, str8, true)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isSamsungDevice() {
        return StringsKt.equals(Build.MANUFACTURER, "samsung", true);
    }

    @NotNull
    public final JSONObject getDeviceInfo() {
        return getDeviceInfo(null);
    }

    private DeviceInfoService(Context context) {
        PackageInfo packageInfo;
        int i10;
        long longVersionCode;
        PackageManager.PackageInfoFlags of2;
        this.context = context;
        PackageManager packageManager = context.getPackageManager();
        this.pm = packageManager;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            String packageName = context.getPackageName();
            of2 = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        }
        this.pInfo = packageInfo;
        if (i11 >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            i10 = (int) longVersionCode;
        } else {
            i10 = packageInfo.versionCode;
        }
        this.buildVersionNumber = i10;
        String str = packageInfo.versionName;
        this.versionName = str;
        this.appsOnAirCoreVersion = BuildConfig.VERSION_NAME;
        this.releaseVersion = getVersionName(str);
        this.bundleIdentifier = context.getPackageName();
        this.appName = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        this.deviceModel = Build.MODEL;
        StorageInfo deviceStorageDetails = getDeviceStorageDetails();
        this.storage = deviceStorageDetails;
        String total = deviceStorageDetails.getTotal();
        this.totalStorage = total;
        this.usedStorage = deviceStorageDetails.getUsed();
        this.deviceTotalStorage = total;
        this.deviceOsVersion = Build.VERSION.RELEASE;
        this.deviceScreenSize = getScreenSize();
    }

    @NotNull
    public final JSONObject getDeviceInfo(@Nullable Map<String, ? extends Object> additionalInfo) {
        String valueOf;
        String valueOf2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (MANUFACTURER.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = MANUFACTURER.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                valueOf2 = CharsKt.titlecase(charAt, locale);
            } else {
                valueOf2 = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf2);
            String substring = MANUFACTURER.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            MANUFACTURER = sb2.toString();
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (BRAND.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char charAt2 = BRAND.charAt(0);
            if (Character.isLowerCase(charAt2)) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                valueOf = CharsKt.titlecase(charAt2, locale2);
            } else {
                valueOf = String.valueOf(charAt2);
            }
            sb3.append((Object) valueOf);
            String substring2 = BRAND.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(substring2);
            BRAND = sb3.toString();
        }
        if (additionalInfo != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : additionalInfo.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return jSONObject3;
            }
        }
        jSONObject2.put("releaseVersionNumber", this.releaseVersion);
        jSONObject2.put("buildVersionNumber", this.buildVersionNumber);
        jSONObject2.put("appsOnAirCoreVersion", this.appsOnAirCoreVersion);
        jSONObject2.put("bundleIdentifier", this.bundleIdentifier);
        jSONObject2.put("appName", this.appName);
        jSONObject.put("deviceTotalStorage", this.deviceTotalStorage);
        jSONObject.put("deviceModel", this.deviceModel);
        jSONObject.put("deviceOsVersion", this.deviceOsVersion);
        jSONObject.put("deviceScreenSize", this.deviceScreenSize);
        jSONObject.put("deviceUsedStorage", this.usedStorage);
        jSONObject.put("deviceMemory", formatStandardStorageSize(getDeviceMemory()));
        jSONObject.put("appMemoryUsage", formatStandardStorageSize(getAppMemoryUsage()));
        jSONObject.put("deviceOrientation", getDeviceOrientation());
        jSONObject.put("deviceRegionCode", Locale.getDefault().getCountry());
        jSONObject.put("deviceBatteryLevel", getBatteryLevel());
        jSONObject.put("deviceRegionName", Locale.getDefault().getDisplayCountry());
        jSONObject.put("timezone", TimeZone.getDefault().getID());
        jSONObject.put("networkState", getNetworkState());
        jSONObject.put("brand", BRAND);
        jSONObject.put("manufacturer", MANUFACTURER);
        jSONObject.put("firstInstallTime", getDeviceFirstInstallTime());
        jSONObject.put("batteryStatus", getDeviceBatteryStatus());
        jSONObject.put("isSimulator", isRunningOnEmulator());
        jSONObject.put("networkType", getNetworkType());
        jSONObject.put(EventKeys.PLATFORM, "Android");
        jSONObject3.put("deviceInfo", jSONObject);
        jSONObject3.put("appInfo", jSONObject2);
        return jSONObject3;
    }
}
