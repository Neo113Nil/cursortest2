package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.ironsource.Q3;
import com.ironsource.U3;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.fn0;
import defpackage.gdi;
import defpackage.lm5;
import defpackage.tub;
import defpackage.wx4;
import defpackage.wzb;
import defpackage.yso;
import defpackage.z88;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0012J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010\u0012J\r\u0010-\u001a\u00020#¢\u0006\u0004\b-\u0010%J\r\u0010.\u001a\u00020#¢\u0006\u0004\b.\u0010%J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u001c¢\u0006\u0004\b2\u0010\u001eJ\r\u00103\u001a\u00020\u001c¢\u0006\u0004\b3\u0010\u001eJ\u000f\u00105\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0007¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0010H\u0007¢\u0006\u0004\b8\u0010\u0012J\u000f\u00109\u001a\u00020#H\u0007¢\u0006\u0004\b9\u0010%J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0002¢\u0006\u0004\b=\u0010\u000fJ\u000f\u0010>\u001a\u00020\rH\u0002¢\u0006\u0004\b>\u0010\u000fJ\u000f\u0010?\u001a\u00020\u001cH\u0002¢\u0006\u0004\b?\u0010\u001eJ\u000f\u0010@\u001a\u00020#H\u0002¢\u0006\u0004\b@\u0010%J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0010H\u0003¢\u0006\u0004\bD\u0010\u0012J\u000f\u0010E\u001a\u00020#H\u0002¢\u0006\u0004\bE\u0010%J\u000f\u0010F\u001a\u00020\rH\u0002¢\u0006\u0004\bF\u0010\u000fJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010\u0012J\u000f\u0010I\u001a\u00020\u0010H\u0002¢\u0006\u0004\bI\u0010\u0012J\u000f\u0010J\u001a\u00020#H\u0002¢\u0006\u0004\bJ\u0010%J\u000f\u0010K\u001a\u00020#H\u0002¢\u0006\u0004\bK\u0010%J\u0017\u0010L\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010\u0016J\u0019\u0010N\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bP\u0010OJ\u000f\u0010Q\u001a\u00020\u0014H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0010H\u0002¢\u0006\u0004\bS\u0010\u0012J\u0017\u0010V\u001a\u00020\u001c2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020#H\u0002¢\u0006\u0004\bX\u0010%J\u000f\u0010Y\u001a\u00020#H\u0002¢\u0006\u0004\bY\u0010%J\u000f\u0010Z\u001a\u00020#H\u0002¢\u0006\u0004\bZ\u0010%J\u000f\u0010[\u001a\u00020\u001cH\u0002¢\u0006\u0004\b[\u0010\u001eJ\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010\u001eJ\u000f\u0010]\u001a\u00020#H\u0002¢\u0006\u0004\b]\u0010%J\u000f\u0010^\u001a\u00020#H\u0002¢\u0006\u0004\b^\u0010%J\u000f\u0010_\u001a\u00020#H\u0002¢\u0006\u0004\b_\u0010%J\u000f\u0010`\u001a\u00020\u001cH\u0002¢\u0006\u0004\b`\u0010\u001eJ\u0011\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bb\u0010cJ\u0011\u0010e\u001a\u0004\u0018\u00010dH\u0002¢\u0006\u0004\be\u0010fJ\u0011\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020#H\u0002¢\u0006\u0004\bj\u0010%J\u000f\u0010k\u001a\u00020#H\u0003¢\u0006\u0004\bk\u0010%J\u000f\u0010l\u001a\u00020#H\u0002¢\u0006\u0004\bl\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010pR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010qR&\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020#0 0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR \u0010|\u001a\b\u0012\u0004\u0012\u00020{0z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidDynamicDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "fetch", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "", "getNetworkCountryISO", "()Ljava/lang/String;", "", "getRingerMode", "()I", "streamType", "", "getStreamMaxVolume", "(I)D", "getScreenBrightness", "Ljava/io/File;", "getCachedExternalFilesDir$unity_ads_defaultRelease", "()Ljava/io/File;", "getCachedExternalFilesDir", "", "getTotalMemory", "()J", "getFreeMemory", "", "getProcessInfo", "()Ljava/util/Map;", "", "hasInternet", "()Z", "getOrientation", "getConnectionTypeStr", "getCurrentUiTheme", "", "getLocaleList", "()Ljava/util/List;", "getChargingType", "getStayOnWhilePluggedIn", "getIsSdCardPresent", "Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getNetworkCapabilityTransports", "()Lgatewayprotocol/v1/NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports;", "getJvmFreeMemory", "getJvmTotalMemory", "", "getFontScale", "()F", "getAnimatorScale", "getAccessibilityDisplayDaltonizer", "getDisplayInversionEnabled", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "fetchAndroidDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android;", "getLanguage", "getTimeZone", "getTimeZoneOffset", "isUsingWifi", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getConnectionType", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$ConnectionType;", "getNetworkType", "getNetworkMetered", "getNetworkOperator", "getNetworkOperatorName", "getScreenWidth", "getScreenHeight", "isActiveNetworkConnected", "isWiredHeadsetOn", "getStreamVolume", U3.i.b, "getFreeSpace", "(Ljava/io/File;)J", "getUsableSpace", "getBatteryLevel", "()D", "getBatteryStatus", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "infoType", "getMemoryInfo", "(Lcom/unity3d/services/core/device/Device$MemoryInfoType;)J", "isAdbEnabled", "adbStatus", "isUSBConnected", "getUptime", "getElapsedRealtime", U3.j.M, "isLimitOpenAdTrackingEnabled", "isAppActive", "getEventTimeStamp", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "hasInternetConnection", "hasInternetConnectionM", "getAirplaneMode", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcom/unity3d/ads/core/log/Logger;", "Lf1d;", "reportedWarning", "Lf1d;", "cachedExternalFilesDir", "Ljava/io/File;", "", "externalFilesDirLock", "Ljava/lang/Object;", "Lz88;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "volumeSettingsChange", "Lz88;", "getVolumeSettingsChange", "()Lz88;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {

    @NotNull
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";

    @NotNull
    public static final String DIRECTORY_MODE_READ = "r";

    @NotNull
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";

    @NotNull
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";

    @NotNull
    public static final String KEY_STAT_CONTENT = "stat";

    @NotNull
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER = "accessibility_display_daltonizer";

    @NotNull
    public static final String SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED = "accessibility_display_daltonizer_enabled";

    @NotNull
    public static final String SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED = "accessibility_display_inversion_enabled";

    @NotNull
    public static final String USB_EXTRA_CONNECTED = "connected";

    @Nullable
    private volatile File cachedExternalFilesDir;

    @NotNull
    private final Context context;

    @NotNull
    private final Object externalFilesDirLock;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final Logger logger;

    @NotNull
    private final f1d reportedWarning;

    @NotNull
    private final z88 volumeSettingsChange;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(@NotNull Context context, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull Logger logger) {
        context.getClass();
        lifecycleDataSource.getClass();
        logger.getClass();
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.logger = logger;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.reportedWarning = gdi.a(lm5Var);
        this.externalFilesDirLock = new Object();
        this.volumeSettingsChange = yso.q(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null));
    }

    private final boolean adbStatus() {
        Boolean bool;
        try {
            boolean z = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e) {
            this.logger.error("Problems fetching adb enabled status", e);
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        newBuilder.getClass();
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setNetworkConnected(isActiveNetworkConnected());
        _create.setNetworkType(getNetworkType());
        _create.setNetworkMetered(getNetworkMetered());
        _create.setTelephonyManagerNetworkType(getNetworkType());
        _create.setAdbEnabled(isAdbEnabled());
        _create.setUsbConnected(isUSBConnected());
        _create.setVolume(getStreamVolume(3));
        _create.setMaxVolume(getStreamMaxVolume(3));
        _create.setDeviceElapsedRealtime(getElapsedRealtime());
        _create.setDeviceUpTime(getUptime());
        _create.setAirplaneMode(getAirplaneMode());
        _create.setChargingType(getChargingType());
        _create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        _create.setSdCardPresent(getIsSdCardPresent());
        _create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        _create.setJvmFreeMemory(getJvmFreeMemory());
        _create.setJvmTotalMemory(getJvmTotalMemory());
        _create.setFontScale(getFontScale());
        _create.setAnimatorScale(getAnimatorScale());
        _create.setAccessibilityDisplayDaltonizer(getAccessibilityDisplayDaltonizer());
        _create.setDisplayInversionEnabled(getDisplayInversionEnabled());
        return _create._build();
    }

    private final boolean getAirplaneMode() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching airplane mode status", th);
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        if (fn0.f("android.intent.action.BATTERY_CHANGED", this.context, null) == null) {
            return -1.0d;
        }
        return r4.getIntExtra("level", 0) / r4.getIntExtra("scale", 0);
    }

    private final int getBatteryStatus() {
        Intent f = fn0.f("android.intent.action.BATTERY_CHANGED", this.context, null);
        if (f != null) {
            return f.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        return isUsingWifi() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI : isActiveNetworkConnected() ? DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR : DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    @wx4
    private final long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return wzb.b(file.getFreeSpace() / 1024);
    }

    private final String getLanguage() {
        String locale = Locale.getDefault().toString();
        locale.getClass();
        return locale;
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) {
        int i = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, "r");
        String str = null;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                str = randomAccessFile.readLine();
            } finally {
            }
        }
        Unit unit = Unit.a;
        randomAccessFile.close();
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && connectivityManager.isActiveNetworkMetered();
    }

    private final String getNetworkOperator() {
        String networkOperator;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkOperator = telephonyManager.getNetworkOperator()) == null) ? "" : networkOperator;
    }

    private final String getNetworkOperatorName() {
        String networkOperatorName;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? "" : networkOperatorName;
    }

    @wx4
    private final int getNetworkType() {
        fdi fdiVar;
        Object value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (SecurityException unused) {
                if (!Intrinsics.c(((Map) ((fdi) this.reportedWarning).getValue()).get("getNetworkType"), Boolean.TRUE)) {
                    f1d f1dVar = this.reportedWarning;
                    do {
                        fdiVar = (fdi) f1dVar;
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, tub.l((Map) value, new Pair("getNetworkType", Boolean.TRUE))));
                    this.logger.info("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamVolume(streamType) : -2;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            displayName.getClass();
            return displayName;
        } catch (AssertionError e) {
            Logger.DefaultImpls.error$default(this.logger, "Could not read timeZone information: " + e.getMessage(), null, 2, null);
            return "";
        }
    }

    private final long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return wzb.b(file.getUsableSpace() / 1024);
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    private final boolean hasInternetConnectionM() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = getConnectivityManager();
        return connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    private final boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent f = fn0.f(INTENT_USB_STATE, this.context, null);
        if (f != null) {
            return f.getBooleanExtra(USB_EXTRA_CONNECTED, false);
        }
        return false;
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && activeNetworkInfo.isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.INSTANCE;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        newBuilder.getClass();
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setLanguage(getLanguage());
        _create.setNetworkOperator(getNetworkOperator());
        _create.setNetworkOperatorName(getNetworkOperatorName());
        _create.setFreeDiskSpace(getUsableSpace(getCachedExternalFilesDir$unity_ads_defaultRelease()));
        _create.setFreeRamMemory(getFreeMemory());
        _create.setWiredHeadset(isWiredHeadsetOn());
        _create.setTimeZone(getTimeZone());
        _create.setTimeZoneOffset(getTimeZoneOffset());
        _create.setLimitedTracking(isLimitAdTrackingEnabled());
        _create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        _create.setBatteryLevel(getBatteryLevel());
        _create.setBatteryStatus(getBatteryStatus());
        _create.setConnectionType(getConnectionType());
        _create.setAndroid(fetchAndroidDynamicDeviceInfo());
        _create.setAppActive(isAppActive());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        return _create._build();
    }

    public final int getAccessibilityDisplayDaltonizer() {
        try {
            Integer valueOf = Integer.valueOf(Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED, 0));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER, -1);
            }
            return -1;
        } catch (Throwable th) {
            this.logger.error("Problems fetching accessibility display daltonizer", th);
            return -1;
        }
    }

    public final float getAnimatorScale() {
        try {
            return Settings.Global.getFloat(this.context.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Throwable th) {
            this.logger.error("Problems fetching animator scale", th);
            return 1.0f;
        }
    }

    @Nullable
    public final File getCachedExternalFilesDir$unity_ads_defaultRelease() {
        File file;
        File file2 = this.cachedExternalFilesDir;
        if (file2 != null) {
            return file2;
        }
        synchronized (this.externalFilesDirLock) {
            file = this.cachedExternalFilesDir;
            if (file == null) {
                file = this.context.getExternalFilesDir(null);
                if (file != null) {
                    this.cachedExternalFilesDir = file;
                } else {
                    file = null;
                }
            }
        }
        return file;
    }

    public final int getChargingType() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public String getConnectionTypeStr() {
        int i = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        return i != 1 ? i != 2 ? "none" : Q3.g : Q3.b;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final boolean getDisplayInversionEnabled() {
        try {
            return Settings.Secure.getInt(this.context.getContentResolver(), SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED, 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching display inversion enabled status", th);
            return false;
        }
    }

    public final float getFontScale() {
        return this.context.getResources().getConfiguration().fontScale;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return Intrinsics.c(Environment.getExternalStorageState(), "mounted");
    }

    public final long getJvmFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public final long getJvmTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public List<String> getLocaleList() {
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        locales.getClass();
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i).toString());
        }
        return arrayList;
    }

    @NotNull
    public final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        Network activeNetwork;
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.Builder newBuilder = NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder();
        if (Build.VERSION.SDK_INT < 31) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build = newBuilder.build();
            build.getClass();
            return build;
        }
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build2 = newBuilder.build();
            build2.getClass();
            return build2;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build3 = newBuilder.build();
            build3.getClass();
            return build3;
        }
        newBuilder.setWifi(networkCapabilities.hasTransport(1));
        newBuilder.setCellular(networkCapabilities.hasTransport(0));
        newBuilder.setVpn(networkCapabilities.hasTransport(4));
        newBuilder.setEthernet(networkCapabilities.hasTransport(3));
        newBuilder.setWifiAware(networkCapabilities.hasTransport(5));
        newBuilder.setLowpan(networkCapabilities.hasTransport(6));
        newBuilder.setBluetooth(networkCapabilities.hasTransport(2));
        NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports build4 = newBuilder.build();
        build4.getClass();
        return build4;
    }

    @NotNull
    public final String getNetworkCountryISO() {
        String networkCountryIso;
        TelephonyManager telephonyManager = getTelephonyManager();
        return (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? "" : networkCountryIso;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public String getOrientation() {
        return getScreenHeight() > getScreenWidth() ? U3.i.D : U3.i.C;
    }

    @NotNull
    public final Map<String, String> getProcessInfo() {
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, "r");
        try {
            hashMap.put(KEY_STAT_CONTENT, randomAccessFile.readLine());
            Unit unit = Unit.a;
            randomAccessFile.close();
            return hashMap;
        } finally {
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            return Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Throwable th) {
            this.logger.error("Problems fetching stay on while plugged in status", th);
            return false;
        }
    }

    public final double getStreamMaxVolume(int streamType) {
        return getAudioManager() != null ? r0.getStreamMaxVolume(streamType) : -2;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    @NotNull
    public z88 getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        return hasInternetConnectionM();
    }
}
