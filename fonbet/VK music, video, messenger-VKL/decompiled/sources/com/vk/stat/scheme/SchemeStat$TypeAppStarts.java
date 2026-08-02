package com.vk.stat.scheme;

import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeAppStarts implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("app_first_feed_data_cache_time")
    private final String appFirstFeedDataCacheTime;

    @pmi0("app_first_feed_data_time")
    private final String appFirstFeedDataTime;

    @pmi0("app_first_feed_loader_end_time")
    private final String appFirstFeedLoaderEndTime;

    @pmi0("app_first_feed_loader_start_time")
    private final String appFirstFeedLoaderStartTime;

    @pmi0("app_first_longpoll_connection")
    private final String appFirstLongpollConnection;

    @pmi0("app_first_screen_time")
    private final String appFirstScreenTime;

    @pmi0("app_ftr_discover")
    private final Integer appFtrDiscover;

    @pmi0("app_ftr_feed")
    private final Integer appFtrFeed;

    @pmi0("app_ftr_feed_video")
    private final Integer appFtrFeedVideo;

    @pmi0("app_ftr_friends")
    private final Integer appFtrFriends;

    @pmi0("app_ftr_msg")
    private final Integer appFtrMsg;

    @pmi0("app_ftr_msgs")
    private final Integer appFtrMsgs;

    @pmi0("app_init_time")
    private final String appInitTime;

    @pmi0("app_language")
    private final String appLanguage;

    @pmi0("app_load_warm_times")
    private final List<Integer> appLoadWarmTimes;

    @pmi0("app_loading_time")
    private final String appLoadingTime;

    @pmi0("are_contacts_imported")
    private final Boolean areContactsImported;

    @pmi0("are_contacts_synced")
    private final Boolean areContactsSynced;

    @pmi0("are_pushes_enabled")
    private final Boolean arePushesEnabled;

    @pmi0("battery")
    private final Integer battery;

    @pmi0("bluetooth_device")
    private final String bluetoothDevice;

    @pmi0("brightness")
    private final Integer brightness;

    @pmi0("build_number")
    private final Integer buildNumber;

    @pmi0("camera_photo_permission")
    private final String cameraPhotoPermission;

    @pmi0("camera_video_permission")
    private final String cameraVideoPermission;

    @pmi0("companion_id")
    private final String companionId;

    @pmi0("device_ads_id")
    private final String deviceAdsId;

    @pmi0("device_ads_id_type")
    private final DeviceAdsIdType deviceAdsIdType;

    @pmi0("device_brand")
    private final String deviceBrand;

    @pmi0("device_id")
    private final String deviceId;

    @pmi0(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL)
    private final String deviceModel;

    @pmi0("disk_usage_bundle")
    private final Integer diskUsageBundle;

    @pmi0("disk_usage_private")
    private final Integer diskUsagePrivate;

    @pmi0("disk_usage_public")
    private final Integer diskUsagePublic;

    @pmi0("free_space")
    private final Integer freeSpace;

    @pmi0("frontal_camera_resolution")
    private final Integer frontalCameraResolution;

    @pmi0("geo_lat")
    private final Float geoLat;

    @pmi0("geo_lon")
    private final Float geoLon;

    @pmi0("geo_state")
    private final String geoState;

    @pmi0("has_app_anr")
    private final Boolean hasAppAnr;

    @pmi0("installation_store")
    private final String installationStore;

    @pmi0("is_battery_saving_mode")
    private final Boolean isBatterySavingMode;

    @pmi0("is_bluetooth")
    private final Boolean isBluetooth;

    @pmi0("is_charging")
    private final Boolean isCharging;

    @pmi0("is_geo_enabled")
    private final Boolean isGeoEnabled;

    @pmi0("is_redesign")
    private final Boolean isRedesign;

    @pmi0("is_roaming")
    private final Boolean isRoaming;

    @pmi0(CommonUrlParts.ROOT_STATUS)
    private final Boolean isRooted;

    @pmi0("is_rtl")
    private final Boolean isRtl;

    @pmi0("is_tablet")
    private final Boolean isTablet;

    @pmi0("is_talk_back_enabled")
    private final Boolean isTalkBackEnabled;

    @pmi0("is_traffic_saver")
    private final Boolean isTrafficSaver;

    @pmi0("is_usb_charging")
    private final Boolean isUsbCharging;

    @pmi0("is_vpn")
    private final Boolean isVpn;

    @pmi0("is_watch_paired")
    private final Boolean isWatchPaired;

    @pmi0("is_wifi")
    private final Boolean isWifi;

    @pmi0("memory_usage")
    private final Integer memoryUsage;

    @pmi0("microphone_permission")
    private final String microphonePermission;

    @pmi0("net_background_traffic")
    private final String netBackgroundTraffic;

    @pmi0("net_error_count")
    private final Integer netErrorCount;

    @pmi0("net_load_api_count")
    private final Integer netLoadApiCount;

    @pmi0("net_usage")
    private final String netUsage;

    @pmi0("net_usage_start")
    private final String netUsageStart;

    @pmi0("network_operators")
    private final List<String> networkOperators;

    @pmi0("network_proxy_ip")
    private final String networkProxyIp;

    @pmi0(O6.F)
    private final String os;

    @pmi0("os_country")
    private final String osCountry;

    @pmi0("os_language")
    private final String osLanguage;

    @pmi0("os_version")
    private final String osVersion;

    @pmi0("preferred_system_content_size")
    private final PreferredSystemContentSize preferredSystemContentSize;

    @pmi0("previous_start_time")
    private final String previousStartTime;

    @pmi0("push_type")
    private final String pushType;

    @pmi0("rear_camera_resolution")
    private final Integer rearCameraResolution;

    @pmi0("restart_time")
    private final String restartTime;

    @pmi0("screen_h")
    private final Integer screenH;

    @pmi0("screen_w")
    private final Integer screenW;

    @pmi0("start_duration")
    private final Integer startDuration;

    @pmi0("start_method")
    private final StartMethod startMethod;

    @pmi0("start_time")
    private final String startTime;

    @pmi0("start_type")
    private final StartType startType;

    @pmi0("store_region")
    private final StoreRegion storeRegion;

    @pmi0("system_theme")
    private final SystemTheme systemTheme;

    @pmi0("theme")
    private final String theme;

    @pmi0("volume")
    private final Integer volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class DeviceAdsIdType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeviceAdsIdType[] $VALUES;

        @pmi0(O6.X0)
        public static final DeviceAdsIdType GAID;

        @pmi0("idfa")
        public static final DeviceAdsIdType IDFA;

        @pmi0(CommonUrlParts.HUAWEI_OAID)
        public static final DeviceAdsIdType OAID;

        static {
            DeviceAdsIdType deviceAdsIdType = new DeviceAdsIdType("IDFA", 0);
            IDFA = deviceAdsIdType;
            DeviceAdsIdType deviceAdsIdType2 = new DeviceAdsIdType(IronSourceConstants.TYPE_GAID, 1);
            GAID = deviceAdsIdType2;
            DeviceAdsIdType deviceAdsIdType3 = new DeviceAdsIdType("OAID", 2);
            OAID = deviceAdsIdType3;
            DeviceAdsIdType[] deviceAdsIdTypeArr = {deviceAdsIdType, deviceAdsIdType2, deviceAdsIdType3};
            $VALUES = deviceAdsIdTypeArr;
            $ENTRIES = new asp(deviceAdsIdTypeArr);
        }

        private DeviceAdsIdType(String str, int i) {
        }

        public static DeviceAdsIdType valueOf(String str) {
            return (DeviceAdsIdType) Enum.valueOf(DeviceAdsIdType.class, str);
        }

        public static DeviceAdsIdType[] values() {
            return (DeviceAdsIdType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class PreferredSystemContentSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreferredSystemContentSize[] $VALUES;

        @pmi0("huge")
        public static final PreferredSystemContentSize HUGE;

        @pmi0("large")
        public static final PreferredSystemContentSize LARGE;

        @pmi0("medium")
        public static final PreferredSystemContentSize MEDIUM;

        @pmi0("small")
        public static final PreferredSystemContentSize SMALL;

        static {
            PreferredSystemContentSize preferredSystemContentSize = new PreferredSystemContentSize("SMALL", 0);
            SMALL = preferredSystemContentSize;
            PreferredSystemContentSize preferredSystemContentSize2 = new PreferredSystemContentSize("MEDIUM", 1);
            MEDIUM = preferredSystemContentSize2;
            PreferredSystemContentSize preferredSystemContentSize3 = new PreferredSystemContentSize("LARGE", 2);
            LARGE = preferredSystemContentSize3;
            PreferredSystemContentSize preferredSystemContentSize4 = new PreferredSystemContentSize("HUGE", 3);
            HUGE = preferredSystemContentSize4;
            PreferredSystemContentSize[] preferredSystemContentSizeArr = {preferredSystemContentSize, preferredSystemContentSize2, preferredSystemContentSize3, preferredSystemContentSize4};
            $VALUES = preferredSystemContentSizeArr;
            $ENTRIES = new asp(preferredSystemContentSizeArr);
        }

        private PreferredSystemContentSize(String str, int i) {
        }

        public static PreferredSystemContentSize valueOf(String str) {
            return (PreferredSystemContentSize) Enum.valueOf(PreferredSystemContentSize.class, str);
        }

        public static PreferredSystemContentSize[] values() {
            return (PreferredSystemContentSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class StartMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StartMethod[] $VALUES;

        @pmi0("companion")
        public static final StartMethod COMPANION;

        @pmi0("deeplink")
        public static final StartMethod DEEPLINK;

        @pmi0("push")
        public static final StartMethod PUSH;

        @pmi0("sharing")
        public static final StartMethod SHARING;

        @pmi0("springboard")
        public static final StartMethod SPRINGBOARD;

        static {
            StartMethod startMethod = new StartMethod("SPRINGBOARD", 0);
            SPRINGBOARD = startMethod;
            StartMethod startMethod2 = new StartMethod("PUSH", 1);
            PUSH = startMethod2;
            StartMethod startMethod3 = new StartMethod("COMPANION", 2);
            COMPANION = startMethod3;
            StartMethod startMethod4 = new StartMethod("DEEPLINK", 3);
            DEEPLINK = startMethod4;
            StartMethod startMethod5 = new StartMethod("SHARING", 4);
            SHARING = startMethod5;
            StartMethod[] startMethodArr = {startMethod, startMethod2, startMethod3, startMethod4, startMethod5};
            $VALUES = startMethodArr;
            $ENTRIES = new asp(startMethodArr);
        }

        private StartMethod(String str, int i) {
        }

        public static StartMethod valueOf(String str) {
            return (StartMethod) Enum.valueOf(StartMethod.class, str);
        }

        public static StartMethod[] values() {
            return (StartMethod[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class StartType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StartType[] $VALUES;

        @pmi0("cold")
        public static final StartType COLD;

        @pmi0("daily")
        public static final StartType DAILY;

        static {
            StartType startType = new StartType("COLD", 0);
            COLD = startType;
            StartType startType2 = new StartType("DAILY", 1);
            DAILY = startType2;
            StartType[] startTypeArr = {startType, startType2};
            $VALUES = startTypeArr;
            $ENTRIES = new asp(startTypeArr);
        }

        private StartType(String str, int i) {
        }

        public static StartType valueOf(String str) {
            return (StartType) Enum.valueOf(StartType.class, str);
        }

        public static StartType[] values() {
            return (StartType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class StoreRegion {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoreRegion[] $VALUES;

        @pmi0("by")
        public static final StoreRegion BY;

        @pmi0("kz")
        public static final StoreRegion KZ;

        @pmi0("ru")
        public static final StoreRegion RU;

        @pmi0("unknown")
        public static final StoreRegion UNKNOWN;

        static {
            StoreRegion storeRegion = new StoreRegion(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = storeRegion;
            StoreRegion storeRegion2 = new StoreRegion("RU", 1);
            RU = storeRegion2;
            StoreRegion storeRegion3 = new StoreRegion("BY", 2);
            BY = storeRegion3;
            StoreRegion storeRegion4 = new StoreRegion("KZ", 3);
            KZ = storeRegion4;
            StoreRegion[] storeRegionArr = {storeRegion, storeRegion2, storeRegion3, storeRegion4};
            $VALUES = storeRegionArr;
            $ENTRIES = new asp(storeRegionArr);
        }

        private StoreRegion(String str, int i) {
        }

        public static StoreRegion valueOf(String str) {
            return (StoreRegion) Enum.valueOf(StoreRegion.class, str);
        }

        public static StoreRegion[] values() {
            return (StoreRegion[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class SystemTheme {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SystemTheme[] $VALUES;

        @pmi0("dark")
        public static final SystemTheme DARK;

        @pmi0("light")
        public static final SystemTheme LIGHT;

        static {
            SystemTheme systemTheme = new SystemTheme("DARK", 0);
            DARK = systemTheme;
            SystemTheme systemTheme2 = new SystemTheme("LIGHT", 1);
            LIGHT = systemTheme2;
            SystemTheme[] systemThemeArr = {systemTheme, systemTheme2};
            $VALUES = systemThemeArr;
            $ENTRIES = new asp(systemThemeArr);
        }

        private SystemTheme(String str, int i) {
        }

        public static SystemTheme valueOf(String str) {
            return (SystemTheme) Enum.valueOf(SystemTheme.class, str);
        }

        public static SystemTheme[] values() {
            return (SystemTheme[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeAppStarts() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
    }

    public static SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts, String str, StartType startType, StartMethod startMethod, String str2, String str3, String str4, String str5, String str6, DeviceAdsIdType deviceAdsIdType, String str7, Integer num, Integer num2, String str8, String str9, String str10, Boolean bool, Integer num3, String str11, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str12, SystemTheme systemTheme, String str13, Float f, Float f2, Integer num4, Boolean bool6, List list, Boolean bool7, Boolean bool8, Boolean bool9, Integer num5, Integer num6, Boolean bool10, Boolean bool11, Boolean bool12, Integer num7, Integer num8, Boolean bool13, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool14, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str23, String str24, Integer num19, String str25, Integer num20, Boolean bool15, String str26, String str27, String str28, Boolean bool16, Boolean bool17, StoreRegion storeRegion, int i, int i2, int i3) {
        String str29 = Build.MODEL;
        Boolean bool18 = Boolean.TRUE;
        String str30 = (i & 1) != 0 ? schemeStat$TypeAppStarts.startTime : str;
        StartType startType2 = (i & 2) != 0 ? schemeStat$TypeAppStarts.startType : startType;
        StartMethod startMethod2 = (i & 4) != 0 ? schemeStat$TypeAppStarts.startMethod : startMethod;
        String str31 = (i & 8) != 0 ? schemeStat$TypeAppStarts.pushType : str2;
        String str32 = (i & 16) != 0 ? schemeStat$TypeAppStarts.companionId : str3;
        String str33 = (i & 32) != 0 ? schemeStat$TypeAppStarts.previousStartTime : str4;
        String str34 = schemeStat$TypeAppStarts.restartTime;
        String str35 = (i & 128) != 0 ? schemeStat$TypeAppStarts.deviceId : str5;
        String str36 = (i & 256) != 0 ? schemeStat$TypeAppStarts.deviceAdsId : str6;
        DeviceAdsIdType deviceAdsIdType2 = (i & 512) != 0 ? schemeStat$TypeAppStarts.deviceAdsIdType : deviceAdsIdType;
        String str37 = (i & 1024) != 0 ? schemeStat$TypeAppStarts.deviceBrand : str7;
        if ((i & 2048) != 0) {
            str29 = schemeStat$TypeAppStarts.deviceModel;
        }
        String str38 = str29;
        Integer num21 = (i & 4096) != 0 ? schemeStat$TypeAppStarts.screenW : num;
        Integer num22 = (i & 8192) != 0 ? schemeStat$TypeAppStarts.screenH : num2;
        String str39 = (i & 16384) != 0 ? schemeStat$TypeAppStarts.os : "android";
        String str40 = (i & 32768) != 0 ? schemeStat$TypeAppStarts.osVersion : str8;
        String str41 = (i & 65536) != 0 ? schemeStat$TypeAppStarts.osLanguage : str9;
        String str42 = (i & 131072) != 0 ? schemeStat$TypeAppStarts.osCountry : str10;
        Boolean bool19 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? schemeStat$TypeAppStarts.isRooted : bool;
        Integer num23 = (i & 524288) != 0 ? schemeStat$TypeAppStarts.buildNumber : num3;
        String str43 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? schemeStat$TypeAppStarts.appLanguage : str11;
        Boolean bool20 = (2097152 & i) != 0 ? schemeStat$TypeAppStarts.arePushesEnabled : bool2;
        Boolean bool21 = (i & 4194304) != 0 ? schemeStat$TypeAppStarts.areContactsImported : bool3;
        Boolean bool22 = (i & 8388608) != 0 ? schemeStat$TypeAppStarts.areContactsSynced : bool4;
        Boolean bool23 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? schemeStat$TypeAppStarts.isGeoEnabled : bool5;
        String str44 = (i & 33554432) != 0 ? schemeStat$TypeAppStarts.theme : str12;
        SystemTheme systemTheme2 = (i & 67108864) != 0 ? schemeStat$TypeAppStarts.systemTheme : systemTheme;
        String str45 = (i & 134217728) != 0 ? schemeStat$TypeAppStarts.geoState : str13;
        Float f3 = (i & 268435456) != 0 ? schemeStat$TypeAppStarts.geoLat : f;
        Float f4 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? schemeStat$TypeAppStarts.geoLon : f2;
        Integer num24 = (i & 1073741824) != 0 ? schemeStat$TypeAppStarts.brightness : num4;
        Boolean bool24 = (i & Integer.MIN_VALUE) != 0 ? schemeStat$TypeAppStarts.isWifi : bool6;
        List list2 = (i2 & 1) != 0 ? schemeStat$TypeAppStarts.networkOperators : list;
        Boolean bool25 = (i2 & 2) != 0 ? schemeStat$TypeAppStarts.isRoaming : bool7;
        Boolean bool26 = (i2 & 4) != 0 ? schemeStat$TypeAppStarts.isTrafficSaver : bool8;
        Boolean bool27 = (i2 & 8) != 0 ? schemeStat$TypeAppStarts.isBluetooth : bool9;
        String str46 = schemeStat$TypeAppStarts.bluetoothDevice;
        Integer num25 = (i2 & 32) != 0 ? schemeStat$TypeAppStarts.volume : num5;
        Integer num26 = (i2 & 64) != 0 ? schemeStat$TypeAppStarts.battery : num6;
        Boolean bool28 = (i2 & 128) != 0 ? schemeStat$TypeAppStarts.isBatterySavingMode : bool10;
        Boolean bool29 = (i2 & 256) != 0 ? schemeStat$TypeAppStarts.isCharging : bool11;
        Boolean bool30 = (i2 & 512) != 0 ? schemeStat$TypeAppStarts.isUsbCharging : bool12;
        Integer num27 = (i2 & 1024) != 0 ? schemeStat$TypeAppStarts.frontalCameraResolution : num7;
        Integer num28 = (i2 & 2048) != 0 ? schemeStat$TypeAppStarts.rearCameraResolution : num8;
        Boolean bool31 = schemeStat$TypeAppStarts.isWatchPaired;
        if ((i2 & 8192) != 0) {
            bool18 = schemeStat$TypeAppStarts.isRedesign;
        }
        Boolean bool32 = bool18;
        Boolean bool33 = (i2 & 16384) != 0 ? schemeStat$TypeAppStarts.isTalkBackEnabled : bool13;
        Integer num29 = (i2 & 32768) != 0 ? schemeStat$TypeAppStarts.freeSpace : num9;
        Integer num30 = schemeStat$TypeAppStarts.startDuration;
        Integer num31 = (i2 & 131072) != 0 ? schemeStat$TypeAppStarts.memoryUsage : num10;
        Integer num32 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? schemeStat$TypeAppStarts.diskUsagePublic : num11;
        Integer num33 = (i2 & 524288) != 0 ? schemeStat$TypeAppStarts.diskUsagePrivate : num12;
        Boolean bool34 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? schemeStat$TypeAppStarts.isRtl : bool14;
        String str47 = schemeStat$TypeAppStarts.cameraPhotoPermission;
        String str48 = (i2 & 4194304) != 0 ? schemeStat$TypeAppStarts.cameraVideoPermission : str14;
        String str49 = (i2 & 8388608) != 0 ? schemeStat$TypeAppStarts.microphonePermission : str15;
        String str50 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? schemeStat$TypeAppStarts.appLoadingTime : str16;
        String str51 = (i2 & 33554432) != 0 ? schemeStat$TypeAppStarts.appInitTime : str17;
        String str52 = (i2 & 67108864) != 0 ? schemeStat$TypeAppStarts.appFirstScreenTime : str18;
        String str53 = (i2 & 134217728) != 0 ? schemeStat$TypeAppStarts.appFirstFeedDataTime : str19;
        String str54 = (i2 & 268435456) != 0 ? schemeStat$TypeAppStarts.appFirstFeedDataCacheTime : str20;
        String str55 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? schemeStat$TypeAppStarts.appFirstFeedLoaderStartTime : str21;
        String str56 = (i2 & 1073741824) != 0 ? schemeStat$TypeAppStarts.appFirstFeedLoaderEndTime : str22;
        List<Integer> list3 = schemeStat$TypeAppStarts.appLoadWarmTimes;
        Integer num34 = (i3 & 1) != 0 ? schemeStat$TypeAppStarts.appFtrFeed : num13;
        Integer num35 = (i3 & 2) != 0 ? schemeStat$TypeAppStarts.appFtrDiscover : num14;
        Integer num36 = (i3 & 4) != 0 ? schemeStat$TypeAppStarts.appFtrMsg : num15;
        Integer num37 = (i3 & 8) != 0 ? schemeStat$TypeAppStarts.appFtrMsgs : num16;
        Integer num38 = (i3 & 16) != 0 ? schemeStat$TypeAppStarts.appFtrFriends : num17;
        Integer num39 = (i3 & 32) != 0 ? schemeStat$TypeAppStarts.appFtrFeedVideo : num18;
        Integer num40 = schemeStat$TypeAppStarts.diskUsageBundle;
        String str57 = (i3 & 128) != 0 ? schemeStat$TypeAppStarts.netUsageStart : str23;
        String str58 = (i3 & 256) != 0 ? schemeStat$TypeAppStarts.netUsage : str24;
        Integer num41 = (i3 & 512) != 0 ? schemeStat$TypeAppStarts.netLoadApiCount : num19;
        String str59 = (i3 & 1024) != 0 ? schemeStat$TypeAppStarts.netBackgroundTraffic : str25;
        Integer num42 = (i3 & 2048) != 0 ? schemeStat$TypeAppStarts.netErrorCount : num20;
        Boolean bool35 = (i3 & 4096) != 0 ? schemeStat$TypeAppStarts.hasAppAnr : bool15;
        String str60 = (i3 & 8192) != 0 ? schemeStat$TypeAppStarts.appFirstLongpollConnection : str26;
        PreferredSystemContentSize preferredSystemContentSize = schemeStat$TypeAppStarts.preferredSystemContentSize;
        String str61 = (i3 & 32768) != 0 ? schemeStat$TypeAppStarts.installationStore : str27;
        String str62 = (i3 & 65536) != 0 ? schemeStat$TypeAppStarts.networkProxyIp : str28;
        Boolean bool36 = (i3 & 131072) != 0 ? schemeStat$TypeAppStarts.isVpn : bool16;
        Boolean bool37 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? schemeStat$TypeAppStarts.isTablet : bool17;
        StoreRegion storeRegion2 = (i3 & 524288) != 0 ? schemeStat$TypeAppStarts.storeRegion : storeRegion;
        schemeStat$TypeAppStarts.getClass();
        return new SchemeStat$TypeAppStarts(str30, startType2, startMethod2, str31, str32, str33, str34, str35, str36, deviceAdsIdType2, str37, str38, num21, num22, str39, str40, str41, str42, bool19, num23, str43, bool20, bool21, bool22, bool23, str44, systemTheme2, str45, f3, f4, num24, bool24, list2, bool25, bool26, bool27, str46, num25, num26, bool28, bool29, bool30, num27, num28, bool31, bool32, bool33, num29, num30, num31, num32, num33, bool34, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, list3, num34, num35, num36, num37, num38, num39, num40, str57, str58, num41, str59, num42, bool35, str60, preferredSystemContentSize, str61, str62, bool36, bool37, storeRegion2);
    }

    public final String A() {
        return this.companionId;
    }

    public final Boolean A0() {
        return this.isTablet;
    }

    public final String B() {
        return this.deviceAdsId;
    }

    public final Boolean B0() {
        return this.isTalkBackEnabled;
    }

    public final DeviceAdsIdType C() {
        return this.deviceAdsIdType;
    }

    public final Boolean C0() {
        return this.isTrafficSaver;
    }

    public final String D() {
        return this.deviceBrand;
    }

    public final Boolean D0() {
        return this.isUsbCharging;
    }

    public final String E() {
        return this.deviceId;
    }

    public final Boolean E0() {
        return this.isVpn;
    }

    public final String F() {
        return this.deviceModel;
    }

    public final Boolean F0() {
        return this.isWatchPaired;
    }

    public final Integer G() {
        return this.diskUsageBundle;
    }

    public final Boolean G0() {
        return this.isWifi;
    }

    public final Integer H() {
        return this.diskUsagePrivate;
    }

    public final Integer I() {
        return this.diskUsagePublic;
    }

    public final Integer J() {
        return this.freeSpace;
    }

    public final Integer K() {
        return this.frontalCameraResolution;
    }

    public final Float L() {
        return this.geoLat;
    }

    public final Float M() {
        return this.geoLon;
    }

    public final String N() {
        return this.geoState;
    }

    public final Boolean O() {
        return this.hasAppAnr;
    }

    public final String P() {
        return this.installationStore;
    }

    public final Integer Q() {
        return this.memoryUsage;
    }

    public final String R() {
        return this.microphonePermission;
    }

    public final String S() {
        return this.netBackgroundTraffic;
    }

    public final Integer T() {
        return this.netErrorCount;
    }

    public final Integer U() {
        return this.netLoadApiCount;
    }

    public final String V() {
        return this.netUsage;
    }

    public final String W() {
        return this.netUsageStart;
    }

    public final List<String> X() {
        return this.networkOperators;
    }

    public final String Y() {
        return this.networkProxyIp;
    }

    public final String Z() {
        return this.os;
    }

    public final String a0() {
        return this.osCountry;
    }

    public final String b() {
        return this.appFirstFeedDataCacheTime;
    }

    public final String b0() {
        return this.osLanguage;
    }

    public final String c() {
        return this.appFirstFeedDataTime;
    }

    public final String c0() {
        return this.osVersion;
    }

    public final String d() {
        return this.appFirstFeedLoaderEndTime;
    }

    public final PreferredSystemContentSize d0() {
        return this.preferredSystemContentSize;
    }

    public final String e() {
        return this.appFirstFeedLoaderStartTime;
    }

    public final String e0() {
        return this.previousStartTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAppStarts)) {
            return false;
        }
        SchemeStat$TypeAppStarts schemeStat$TypeAppStarts = (SchemeStat$TypeAppStarts) obj;
        return epx.f(this.startTime, schemeStat$TypeAppStarts.startTime) && this.startType == schemeStat$TypeAppStarts.startType && this.startMethod == schemeStat$TypeAppStarts.startMethod && epx.f(this.pushType, schemeStat$TypeAppStarts.pushType) && epx.f(this.companionId, schemeStat$TypeAppStarts.companionId) && epx.f(this.previousStartTime, schemeStat$TypeAppStarts.previousStartTime) && epx.f(this.restartTime, schemeStat$TypeAppStarts.restartTime) && epx.f(this.deviceId, schemeStat$TypeAppStarts.deviceId) && epx.f(this.deviceAdsId, schemeStat$TypeAppStarts.deviceAdsId) && this.deviceAdsIdType == schemeStat$TypeAppStarts.deviceAdsIdType && epx.f(this.deviceBrand, schemeStat$TypeAppStarts.deviceBrand) && epx.f(this.deviceModel, schemeStat$TypeAppStarts.deviceModel) && epx.f(this.screenW, schemeStat$TypeAppStarts.screenW) && epx.f(this.screenH, schemeStat$TypeAppStarts.screenH) && epx.f(this.os, schemeStat$TypeAppStarts.os) && epx.f(this.osVersion, schemeStat$TypeAppStarts.osVersion) && epx.f(this.osLanguage, schemeStat$TypeAppStarts.osLanguage) && epx.f(this.osCountry, schemeStat$TypeAppStarts.osCountry) && epx.f(this.isRooted, schemeStat$TypeAppStarts.isRooted) && epx.f(this.buildNumber, schemeStat$TypeAppStarts.buildNumber) && epx.f(this.appLanguage, schemeStat$TypeAppStarts.appLanguage) && epx.f(this.arePushesEnabled, schemeStat$TypeAppStarts.arePushesEnabled) && epx.f(this.areContactsImported, schemeStat$TypeAppStarts.areContactsImported) && epx.f(this.areContactsSynced, schemeStat$TypeAppStarts.areContactsSynced) && epx.f(this.isGeoEnabled, schemeStat$TypeAppStarts.isGeoEnabled) && epx.f(this.theme, schemeStat$TypeAppStarts.theme) && this.systemTheme == schemeStat$TypeAppStarts.systemTheme && epx.f(this.geoState, schemeStat$TypeAppStarts.geoState) && epx.f(this.geoLat, schemeStat$TypeAppStarts.geoLat) && epx.f(this.geoLon, schemeStat$TypeAppStarts.geoLon) && epx.f(this.brightness, schemeStat$TypeAppStarts.brightness) && epx.f(this.isWifi, schemeStat$TypeAppStarts.isWifi) && epx.f(this.networkOperators, schemeStat$TypeAppStarts.networkOperators) && epx.f(this.isRoaming, schemeStat$TypeAppStarts.isRoaming) && epx.f(this.isTrafficSaver, schemeStat$TypeAppStarts.isTrafficSaver) && epx.f(this.isBluetooth, schemeStat$TypeAppStarts.isBluetooth) && epx.f(this.bluetoothDevice, schemeStat$TypeAppStarts.bluetoothDevice) && epx.f(this.volume, schemeStat$TypeAppStarts.volume) && epx.f(this.battery, schemeStat$TypeAppStarts.battery) && epx.f(this.isBatterySavingMode, schemeStat$TypeAppStarts.isBatterySavingMode) && epx.f(this.isCharging, schemeStat$TypeAppStarts.isCharging) && epx.f(this.isUsbCharging, schemeStat$TypeAppStarts.isUsbCharging) && epx.f(this.frontalCameraResolution, schemeStat$TypeAppStarts.frontalCameraResolution) && epx.f(this.rearCameraResolution, schemeStat$TypeAppStarts.rearCameraResolution) && epx.f(this.isWatchPaired, schemeStat$TypeAppStarts.isWatchPaired) && epx.f(this.isRedesign, schemeStat$TypeAppStarts.isRedesign) && epx.f(this.isTalkBackEnabled, schemeStat$TypeAppStarts.isTalkBackEnabled) && epx.f(this.freeSpace, schemeStat$TypeAppStarts.freeSpace) && epx.f(this.startDuration, schemeStat$TypeAppStarts.startDuration) && epx.f(this.memoryUsage, schemeStat$TypeAppStarts.memoryUsage) && epx.f(this.diskUsagePublic, schemeStat$TypeAppStarts.diskUsagePublic) && epx.f(this.diskUsagePrivate, schemeStat$TypeAppStarts.diskUsagePrivate) && epx.f(this.isRtl, schemeStat$TypeAppStarts.isRtl) && epx.f(this.cameraPhotoPermission, schemeStat$TypeAppStarts.cameraPhotoPermission) && epx.f(this.cameraVideoPermission, schemeStat$TypeAppStarts.cameraVideoPermission) && epx.f(this.microphonePermission, schemeStat$TypeAppStarts.microphonePermission) && epx.f(this.appLoadingTime, schemeStat$TypeAppStarts.appLoadingTime) && epx.f(this.appInitTime, schemeStat$TypeAppStarts.appInitTime) && epx.f(this.appFirstScreenTime, schemeStat$TypeAppStarts.appFirstScreenTime) && epx.f(this.appFirstFeedDataTime, schemeStat$TypeAppStarts.appFirstFeedDataTime) && epx.f(this.appFirstFeedDataCacheTime, schemeStat$TypeAppStarts.appFirstFeedDataCacheTime) && epx.f(this.appFirstFeedLoaderStartTime, schemeStat$TypeAppStarts.appFirstFeedLoaderStartTime) && epx.f(this.appFirstFeedLoaderEndTime, schemeStat$TypeAppStarts.appFirstFeedLoaderEndTime) && epx.f(this.appLoadWarmTimes, schemeStat$TypeAppStarts.appLoadWarmTimes) && epx.f(this.appFtrFeed, schemeStat$TypeAppStarts.appFtrFeed) && epx.f(this.appFtrDiscover, schemeStat$TypeAppStarts.appFtrDiscover) && epx.f(this.appFtrMsg, schemeStat$TypeAppStarts.appFtrMsg) && epx.f(this.appFtrMsgs, schemeStat$TypeAppStarts.appFtrMsgs) && epx.f(this.appFtrFriends, schemeStat$TypeAppStarts.appFtrFriends) && epx.f(this.appFtrFeedVideo, schemeStat$TypeAppStarts.appFtrFeedVideo) && epx.f(this.diskUsageBundle, schemeStat$TypeAppStarts.diskUsageBundle) && epx.f(this.netUsageStart, schemeStat$TypeAppStarts.netUsageStart) && epx.f(this.netUsage, schemeStat$TypeAppStarts.netUsage) && epx.f(this.netLoadApiCount, schemeStat$TypeAppStarts.netLoadApiCount) && epx.f(this.netBackgroundTraffic, schemeStat$TypeAppStarts.netBackgroundTraffic) && epx.f(this.netErrorCount, schemeStat$TypeAppStarts.netErrorCount) && epx.f(this.hasAppAnr, schemeStat$TypeAppStarts.hasAppAnr) && epx.f(this.appFirstLongpollConnection, schemeStat$TypeAppStarts.appFirstLongpollConnection) && this.preferredSystemContentSize == schemeStat$TypeAppStarts.preferredSystemContentSize && epx.f(this.installationStore, schemeStat$TypeAppStarts.installationStore) && epx.f(this.networkProxyIp, schemeStat$TypeAppStarts.networkProxyIp) && epx.f(this.isVpn, schemeStat$TypeAppStarts.isVpn) && epx.f(this.isTablet, schemeStat$TypeAppStarts.isTablet) && this.storeRegion == schemeStat$TypeAppStarts.storeRegion;
    }

    public final String f() {
        return this.appFirstLongpollConnection;
    }

    public final String f0() {
        return this.pushType;
    }

    public final String g() {
        return this.appFirstScreenTime;
    }

    public final Integer g0() {
        return this.rearCameraResolution;
    }

    public final Integer h() {
        return this.appFtrDiscover;
    }

    public final String h0() {
        return this.restartTime;
    }

    public final int hashCode() {
        String str = this.startTime;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StartType startType = this.startType;
        int hashCode2 = (hashCode + (startType == null ? 0 : startType.hashCode())) * 31;
        StartMethod startMethod = this.startMethod;
        int hashCode3 = (hashCode2 + (startMethod == null ? 0 : startMethod.hashCode())) * 31;
        String str2 = this.pushType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companionId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.previousStartTime;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.restartTime;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceAdsId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DeviceAdsIdType deviceAdsIdType = this.deviceAdsIdType;
        int hashCode10 = (hashCode9 + (deviceAdsIdType == null ? 0 : deviceAdsIdType.hashCode())) * 31;
        String str8 = this.deviceBrand;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deviceModel;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.screenW;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.screenH;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.os;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.osVersion;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.osLanguage;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.osCountry;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isRooted;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.buildNumber;
        int hashCode20 = (hashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str14 = this.appLanguage;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool2 = this.arePushesEnabled;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.areContactsImported;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.areContactsSynced;
        int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGeoEnabled;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str15 = this.theme;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        SystemTheme systemTheme = this.systemTheme;
        int hashCode27 = (hashCode26 + (systemTheme == null ? 0 : systemTheme.hashCode())) * 31;
        String str16 = this.geoState;
        int hashCode28 = (hashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Float f = this.geoLat;
        int hashCode29 = (hashCode28 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.geoLon;
        int hashCode30 = (hashCode29 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.brightness;
        int hashCode31 = (hashCode30 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.isWifi;
        int hashCode32 = (hashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<String> list = this.networkOperators;
        int hashCode33 = (hashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool7 = this.isRoaming;
        int hashCode34 = (hashCode33 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isTrafficSaver;
        int hashCode35 = (hashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isBluetooth;
        int hashCode36 = (hashCode35 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str17 = this.bluetoothDevice;
        int hashCode37 = (hashCode36 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num5 = this.volume;
        int hashCode38 = (hashCode37 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.battery;
        int hashCode39 = (hashCode38 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool10 = this.isBatterySavingMode;
        int hashCode40 = (hashCode39 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isCharging;
        int hashCode41 = (hashCode40 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isUsbCharging;
        int hashCode42 = (hashCode41 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Integer num7 = this.frontalCameraResolution;
        int hashCode43 = (hashCode42 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.rearCameraResolution;
        int hashCode44 = (hashCode43 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool13 = this.isWatchPaired;
        int hashCode45 = (hashCode44 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.isRedesign;
        int hashCode46 = (hashCode45 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.isTalkBackEnabled;
        int hashCode47 = (hashCode46 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Integer num9 = this.freeSpace;
        int hashCode48 = (hashCode47 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.startDuration;
        int hashCode49 = (hashCode48 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.memoryUsage;
        int hashCode50 = (hashCode49 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.diskUsagePublic;
        int hashCode51 = (hashCode50 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.diskUsagePrivate;
        int hashCode52 = (hashCode51 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Boolean bool16 = this.isRtl;
        int hashCode53 = (hashCode52 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str18 = this.cameraPhotoPermission;
        int hashCode54 = (hashCode53 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.cameraVideoPermission;
        int hashCode55 = (hashCode54 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.microphonePermission;
        int hashCode56 = (hashCode55 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.appLoadingTime;
        int hashCode57 = (hashCode56 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.appInitTime;
        int hashCode58 = (hashCode57 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.appFirstScreenTime;
        int hashCode59 = (hashCode58 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.appFirstFeedDataTime;
        int hashCode60 = (hashCode59 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.appFirstFeedDataCacheTime;
        int hashCode61 = (hashCode60 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.appFirstFeedLoaderStartTime;
        int hashCode62 = (hashCode61 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.appFirstFeedLoaderEndTime;
        int hashCode63 = (hashCode62 + (str27 == null ? 0 : str27.hashCode())) * 31;
        List<Integer> list2 = this.appLoadWarmTimes;
        int hashCode64 = (hashCode63 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num14 = this.appFtrFeed;
        int hashCode65 = (hashCode64 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.appFtrDiscover;
        int hashCode66 = (hashCode65 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.appFtrMsg;
        int hashCode67 = (hashCode66 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.appFtrMsgs;
        int hashCode68 = (hashCode67 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.appFtrFriends;
        int hashCode69 = (hashCode68 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.appFtrFeedVideo;
        int hashCode70 = (hashCode69 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.diskUsageBundle;
        int hashCode71 = (hashCode70 + (num20 == null ? 0 : num20.hashCode())) * 31;
        String str28 = this.netUsageStart;
        int hashCode72 = (hashCode71 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.netUsage;
        int hashCode73 = (hashCode72 + (str29 == null ? 0 : str29.hashCode())) * 31;
        Integer num21 = this.netLoadApiCount;
        int hashCode74 = (hashCode73 + (num21 == null ? 0 : num21.hashCode())) * 31;
        String str30 = this.netBackgroundTraffic;
        int hashCode75 = (hashCode74 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Integer num22 = this.netErrorCount;
        int hashCode76 = (hashCode75 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Boolean bool17 = this.hasAppAnr;
        int hashCode77 = (hashCode76 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        String str31 = this.appFirstLongpollConnection;
        int hashCode78 = (hashCode77 + (str31 == null ? 0 : str31.hashCode())) * 31;
        PreferredSystemContentSize preferredSystemContentSize = this.preferredSystemContentSize;
        int hashCode79 = (hashCode78 + (preferredSystemContentSize == null ? 0 : preferredSystemContentSize.hashCode())) * 31;
        String str32 = this.installationStore;
        int hashCode80 = (hashCode79 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.networkProxyIp;
        int hashCode81 = (hashCode80 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Boolean bool18 = this.isVpn;
        int hashCode82 = (hashCode81 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.isTablet;
        int hashCode83 = (hashCode82 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        StoreRegion storeRegion = this.storeRegion;
        return hashCode83 + (storeRegion != null ? storeRegion.hashCode() : 0);
    }

    public final Integer i() {
        return this.appFtrFeed;
    }

    public final Integer i0() {
        return this.screenH;
    }

    public final Integer j() {
        return this.appFtrFeedVideo;
    }

    public final Integer j0() {
        return this.screenW;
    }

    public final Integer k() {
        return this.appFtrFriends;
    }

    public final Integer k0() {
        return this.startDuration;
    }

    public final Integer l() {
        return this.appFtrMsg;
    }

    public final StartMethod l0() {
        return this.startMethod;
    }

    public final Integer m() {
        return this.appFtrMsgs;
    }

    public final String m0() {
        return this.startTime;
    }

    public final String n() {
        return this.appInitTime;
    }

    public final StartType n0() {
        return this.startType;
    }

    public final String o() {
        return this.appLanguage;
    }

    public final StoreRegion o0() {
        return this.storeRegion;
    }

    public final List<Integer> p() {
        return this.appLoadWarmTimes;
    }

    public final SystemTheme p0() {
        return this.systemTheme;
    }

    public final String q() {
        return this.appLoadingTime;
    }

    public final String q0() {
        return this.theme;
    }

    public final Boolean r() {
        return this.areContactsImported;
    }

    public final Integer r0() {
        return this.volume;
    }

    public final Boolean s() {
        return this.areContactsSynced;
    }

    public final Boolean s0() {
        return this.isBatterySavingMode;
    }

    public final Boolean t() {
        return this.arePushesEnabled;
    }

    public final Boolean t0() {
        return this.isBluetooth;
    }

    public final String toString() {
        return "TypeAppStarts(startTime=" + this.startTime + ", startType=" + this.startType + ", startMethod=" + this.startMethod + ", pushType=" + this.pushType + ", companionId=" + this.companionId + ", previousStartTime=" + this.previousStartTime + ", restartTime=" + this.restartTime + ", deviceId=" + this.deviceId + ", deviceAdsId=" + this.deviceAdsId + ", deviceAdsIdType=" + this.deviceAdsIdType + ", deviceBrand=" + this.deviceBrand + ", deviceModel=" + this.deviceModel + ", screenW=" + this.screenW + ", screenH=" + this.screenH + ", os=" + this.os + ", osVersion=" + this.osVersion + ", osLanguage=" + this.osLanguage + ", osCountry=" + this.osCountry + ", isRooted=" + this.isRooted + ", buildNumber=" + this.buildNumber + ", appLanguage=" + this.appLanguage + ", arePushesEnabled=" + this.arePushesEnabled + ", areContactsImported=" + this.areContactsImported + ", areContactsSynced=" + this.areContactsSynced + ", isGeoEnabled=" + this.isGeoEnabled + ", theme=" + this.theme + ", systemTheme=" + this.systemTheme + ", geoState=" + this.geoState + ", geoLat=" + this.geoLat + ", geoLon=" + this.geoLon + ", brightness=" + this.brightness + ", isWifi=" + this.isWifi + ", networkOperators=" + this.networkOperators + ", isRoaming=" + this.isRoaming + ", isTrafficSaver=" + this.isTrafficSaver + ", isBluetooth=" + this.isBluetooth + ", bluetoothDevice=" + this.bluetoothDevice + ", volume=" + this.volume + ", battery=" + this.battery + ", isBatterySavingMode=" + this.isBatterySavingMode + ", isCharging=" + this.isCharging + ", isUsbCharging=" + this.isUsbCharging + ", frontalCameraResolution=" + this.frontalCameraResolution + ", rearCameraResolution=" + this.rearCameraResolution + ", isWatchPaired=" + this.isWatchPaired + ", isRedesign=" + this.isRedesign + ", isTalkBackEnabled=" + this.isTalkBackEnabled + ", freeSpace=" + this.freeSpace + ", startDuration=" + this.startDuration + ", memoryUsage=" + this.memoryUsage + ", diskUsagePublic=" + this.diskUsagePublic + ", diskUsagePrivate=" + this.diskUsagePrivate + ", isRtl=" + this.isRtl + ", cameraPhotoPermission=" + this.cameraPhotoPermission + ", cameraVideoPermission=" + this.cameraVideoPermission + ", microphonePermission=" + this.microphonePermission + ", appLoadingTime=" + this.appLoadingTime + ", appInitTime=" + this.appInitTime + ", appFirstScreenTime=" + this.appFirstScreenTime + ", appFirstFeedDataTime=" + this.appFirstFeedDataTime + ", appFirstFeedDataCacheTime=" + this.appFirstFeedDataCacheTime + ", appFirstFeedLoaderStartTime=" + this.appFirstFeedLoaderStartTime + ", appFirstFeedLoaderEndTime=" + this.appFirstFeedLoaderEndTime + ", appLoadWarmTimes=" + this.appLoadWarmTimes + ", appFtrFeed=" + this.appFtrFeed + ", appFtrDiscover=" + this.appFtrDiscover + ", appFtrMsg=" + this.appFtrMsg + ", appFtrMsgs=" + this.appFtrMsgs + ", appFtrFriends=" + this.appFtrFriends + ", appFtrFeedVideo=" + this.appFtrFeedVideo + ", diskUsageBundle=" + this.diskUsageBundle + ", netUsageStart=" + this.netUsageStart + ", netUsage=" + this.netUsage + ", netLoadApiCount=" + this.netLoadApiCount + ", netBackgroundTraffic=" + this.netBackgroundTraffic + ", netErrorCount=" + this.netErrorCount + ", hasAppAnr=" + this.hasAppAnr + ", appFirstLongpollConnection=" + this.appFirstLongpollConnection + ", preferredSystemContentSize=" + this.preferredSystemContentSize + ", installationStore=" + this.installationStore + ", networkProxyIp=" + this.networkProxyIp + ", isVpn=" + this.isVpn + ", isTablet=" + this.isTablet + ", storeRegion=" + this.storeRegion + ')';
    }

    public final Integer u() {
        return this.battery;
    }

    public final Boolean u0() {
        return this.isCharging;
    }

    public final String v() {
        return this.bluetoothDevice;
    }

    public final Boolean v0() {
        return this.isGeoEnabled;
    }

    public final Integer w() {
        return this.brightness;
    }

    public final Boolean w0() {
        return this.isRedesign;
    }

    public final Integer x() {
        return this.buildNumber;
    }

    public final Boolean x0() {
        return this.isRoaming;
    }

    public final String y() {
        return this.cameraPhotoPermission;
    }

    public final Boolean y0() {
        return this.isRooted;
    }

    public final String z() {
        return this.cameraVideoPermission;
    }

    public final Boolean z0() {
        return this.isRtl;
    }

    public SchemeStat$TypeAppStarts(String str, StartType startType, StartMethod startMethod, String str2, String str3, String str4, String str5, String str6, String str7, DeviceAdsIdType deviceAdsIdType, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, Boolean bool, Integer num3, String str14, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str15, SystemTheme systemTheme, String str16, Float f, Float f2, Integer num4, Boolean bool6, List<String> list, Boolean bool7, Boolean bool8, Boolean bool9, String str17, Integer num5, Integer num6, Boolean bool10, Boolean bool11, Boolean bool12, Integer num7, Integer num8, Boolean bool13, Boolean bool14, Boolean bool15, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Boolean bool16, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List<Integer> list2, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, String str28, String str29, Integer num21, String str30, Integer num22, Boolean bool17, String str31, PreferredSystemContentSize preferredSystemContentSize, String str32, String str33, Boolean bool18, Boolean bool19, StoreRegion storeRegion) {
        this.startTime = str;
        this.startType = startType;
        this.startMethod = startMethod;
        this.pushType = str2;
        this.companionId = str3;
        this.previousStartTime = str4;
        this.restartTime = str5;
        this.deviceId = str6;
        this.deviceAdsId = str7;
        this.deviceAdsIdType = deviceAdsIdType;
        this.deviceBrand = str8;
        this.deviceModel = str9;
        this.screenW = num;
        this.screenH = num2;
        this.os = str10;
        this.osVersion = str11;
        this.osLanguage = str12;
        this.osCountry = str13;
        this.isRooted = bool;
        this.buildNumber = num3;
        this.appLanguage = str14;
        this.arePushesEnabled = bool2;
        this.areContactsImported = bool3;
        this.areContactsSynced = bool4;
        this.isGeoEnabled = bool5;
        this.theme = str15;
        this.systemTheme = systemTheme;
        this.geoState = str16;
        this.geoLat = f;
        this.geoLon = f2;
        this.brightness = num4;
        this.isWifi = bool6;
        this.networkOperators = list;
        this.isRoaming = bool7;
        this.isTrafficSaver = bool8;
        this.isBluetooth = bool9;
        this.bluetoothDevice = str17;
        this.volume = num5;
        this.battery = num6;
        this.isBatterySavingMode = bool10;
        this.isCharging = bool11;
        this.isUsbCharging = bool12;
        this.frontalCameraResolution = num7;
        this.rearCameraResolution = num8;
        this.isWatchPaired = bool13;
        this.isRedesign = bool14;
        this.isTalkBackEnabled = bool15;
        this.freeSpace = num9;
        this.startDuration = num10;
        this.memoryUsage = num11;
        this.diskUsagePublic = num12;
        this.diskUsagePrivate = num13;
        this.isRtl = bool16;
        this.cameraPhotoPermission = str18;
        this.cameraVideoPermission = str19;
        this.microphonePermission = str20;
        this.appLoadingTime = str21;
        this.appInitTime = str22;
        this.appFirstScreenTime = str23;
        this.appFirstFeedDataTime = str24;
        this.appFirstFeedDataCacheTime = str25;
        this.appFirstFeedLoaderStartTime = str26;
        this.appFirstFeedLoaderEndTime = str27;
        this.appLoadWarmTimes = list2;
        this.appFtrFeed = num14;
        this.appFtrDiscover = num15;
        this.appFtrMsg = num16;
        this.appFtrMsgs = num17;
        this.appFtrFriends = num18;
        this.appFtrFeedVideo = num19;
        this.diskUsageBundle = num20;
        this.netUsageStart = str28;
        this.netUsage = str29;
        this.netLoadApiCount = num21;
        this.netBackgroundTraffic = str30;
        this.netErrorCount = num22;
        this.hasAppAnr = bool17;
        this.appFirstLongpollConnection = str31;
        this.preferredSystemContentSize = preferredSystemContentSize;
        this.installationStore = str32;
        this.networkProxyIp = str33;
        this.isVpn = bool18;
        this.isTablet = bool19;
        this.storeRegion = storeRegion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SchemeStat$TypeAppStarts(String str, StartType startType, StartMethod startMethod, String str2, String str3, String str4, String str5, String str6, String str7, DeviceAdsIdType deviceAdsIdType, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, Boolean bool, Integer num3, String str14, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str15, SystemTheme systemTheme, String str16, Float f, Float f2, Integer num4, Boolean bool6, List list, Boolean bool7, Boolean bool8, Boolean bool9, String str17, Integer num5, Integer num6, Boolean bool10, Boolean bool11, Boolean bool12, Integer num7, Integer num8, Boolean bool13, Boolean bool14, Boolean bool15, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Boolean bool16, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List list2, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, String str28, String str29, Integer num21, String str30, Integer num22, Boolean bool17, String str31, PreferredSystemContentSize preferredSystemContentSize, String str32, String str33, Boolean bool18, Boolean bool19, StoreRegion storeRegion, int i, int i2, int i3, zcl zclVar) {
        this(r68, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r69, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : bool7, (i2 & 4) != 0 ? null : bool8, (i2 & 8) != 0 ? null : bool9, (i2 & 16) != 0 ? null : str17, (i2 & 32) != 0 ? null : num5, (i2 & 64) != 0 ? null : num6, (i2 & 128) != 0 ? null : bool10, (i2 & 256) != 0 ? null : bool11, (i2 & 512) != 0 ? null : bool12, (i2 & 1024) != 0 ? null : num7, (i2 & 2048) != 0 ? null : num8, (i2 & 4096) != 0 ? null : bool13, (i2 & 8192) != 0 ? null : bool14, (i2 & 16384) != 0 ? null : bool15, (i2 & 32768) != 0 ? null : num9, (i2 & 65536) != 0 ? null : num10, (i2 & 131072) != 0 ? null : num11, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num12, (i2 & 524288) != 0 ? null : num13, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool16, (i2 & 2097152) != 0 ? null : str18, (i2 & 4194304) != 0 ? null : str19, (i2 & 8388608) != 0 ? null : str20, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str21, (i2 & 33554432) != 0 ? null : str22, (i2 & 67108864) != 0 ? null : str23, (i2 & 134217728) != 0 ? null : str24, (i2 & 268435456) != 0 ? null : str25, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str26, (i2 & 1073741824) != 0 ? null : str27, (i2 & Integer.MIN_VALUE) != 0 ? null : list2, (i3 & 1) != 0 ? null : num14, (i3 & 2) != 0 ? null : num15, (i3 & 4) != 0 ? null : num16, (i3 & 8) != 0 ? null : num17, (i3 & 16) != 0 ? null : num18, (i3 & 32) != 0 ? null : num19, (i3 & 64) != 0 ? null : num20, (i3 & 128) != 0 ? null : str28, (i3 & 256) != 0 ? null : str29, (i3 & 512) != 0 ? null : num21, (i3 & 1024) != 0 ? null : str30, (i3 & 2048) != 0 ? null : num22, (i3 & 4096) != 0 ? null : bool17, (i3 & 8192) != 0 ? null : str31, (i3 & 16384) != 0 ? null : preferredSystemContentSize, (i3 & 32768) != 0 ? null : str32, (i3 & 65536) != 0 ? null : str33, (i3 & 131072) != 0 ? null : bool18, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool19, (i3 & 524288) != 0 ? null : storeRegion);
        String str34 = (i & 1) != 0 ? null : str;
        StartType startType2 = (i & 2) != 0 ? null : startType;
        StartMethod startMethod2 = (i & 4) != 0 ? null : startMethod;
        String str35 = (i & 8) != 0 ? null : str2;
        String str36 = (i & 16) != 0 ? null : str3;
        String str37 = (i & 32) != 0 ? null : str4;
        String str38 = (i & 64) != 0 ? null : str5;
        String str39 = (i & 128) != 0 ? null : str6;
        String str40 = (i & 256) != 0 ? null : str7;
        DeviceAdsIdType deviceAdsIdType2 = (i & 512) != 0 ? null : deviceAdsIdType;
        String str41 = (i & 1024) != 0 ? null : str8;
        String str42 = (i & 2048) != 0 ? null : str9;
        Integer num23 = (i & 4096) != 0 ? null : num;
        String str43 = str34;
        Integer num24 = (i & 8192) != 0 ? null : num2;
        String str44 = (i & 16384) != 0 ? null : str10;
        String str45 = (i & 32768) != 0 ? null : str11;
        String str46 = (i & 65536) != 0 ? null : str12;
        String str47 = (i & 131072) != 0 ? null : str13;
        Boolean bool20 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool;
        Integer num25 = (i & 524288) != 0 ? null : num3;
        String str48 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str14;
        Boolean bool21 = (i & 2097152) != 0 ? null : bool2;
        Boolean bool22 = (i & 4194304) != 0 ? null : bool3;
        Boolean bool23 = (i & 8388608) != 0 ? null : bool4;
        Boolean bool24 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool5;
        String str49 = (i & 33554432) != 0 ? null : str15;
        SystemTheme systemTheme2 = (i & 67108864) != 0 ? null : systemTheme;
        String str50 = (i & 134217728) != 0 ? null : str16;
        Float f3 = (i & 268435456) != 0 ? null : f;
        Float f4 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : f2;
        Integer num26 = (i & 1073741824) != 0 ? null : num4;
        Boolean bool25 = (i & Integer.MIN_VALUE) != 0 ? null : bool6;
    }
}
