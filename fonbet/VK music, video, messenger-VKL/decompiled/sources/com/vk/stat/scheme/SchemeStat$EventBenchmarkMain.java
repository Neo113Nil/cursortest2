package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$EventBenchmarkMain {

    @pmi0("id")
    private final int id;

    @pmi0("timestamp")
    private final String timestamp;

    @pmi0("type")
    private final Type type;

    @pmi0("type_accessibility_item")
    private final MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem typeAccessibilityItem;

    @pmi0("type_app_loading_api")
    private final SchemeStat$TypeAppLoadingApi typeAppLoadingApi;

    @pmi0("type_app_starts")
    private final SchemeStat$TypeAppStarts typeAppStarts;

    @pmi0("type_audio_input_lag_item")
    private final CommonAudioStat$TypeAudioInputLagItem typeAudioInputLagItem;

    @pmi0("type_audio_message_transcript_loading_item")
    private final SchemeStat$TypeAudioMessageTranscriptLoadingItem typeAudioMessageTranscriptLoadingItem;

    @pmi0("type_feed_loading_timeline")
    private final MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline typeFeedLoadingTimeline;

    @pmi0("type_im_messaging_performance_metric")
    private final MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric typeImMessagingPerformanceMetric;

    @pmi0("type_im_messaging_recognition")
    private final MobileOfficialAppsImStat$TypeImMessagingRecognition typeImMessagingRecognition;

    @pmi0("type_im_remote_event_processing_item")
    private final MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem typeImRemoteEventProcessingItem;

    @pmi0("type_install_referrer")
    private final SchemeStat$TypeInstallReferrer typeInstallReferrer;

    @pmi0("type_marusia_performance_item")
    private final MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem typeMarusiaPerformanceItem;

    @pmi0("type_mini_app_start")
    private final SchemeStat$TypeMiniAppStart typeMiniAppStart;

    @pmi0("type_mini_apps_performance")
    private final MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance typeMiniAppsPerformance;

    @pmi0("type_network_audio_item")
    private final SchemeStat$TypeNetworkAudioItem typeNetworkAudioItem;

    @pmi0("type_network_audio_stall_item")
    private final CommonAudioStat$TypeNetworkAudioStallItem typeNetworkAudioStallItem;

    @pmi0("type_network_common")
    private final SchemeStat$TypeNetworkCommon typeNetworkCommon;

    @pmi0("type_network_images_item")
    private final SchemeStat$TypeNetworkImagesItem typeNetworkImagesItem;

    @pmi0("type_open_with_url")
    private final SchemeStat$TypeOpenWithUrl typeOpenWithUrl;

    @pmi0("type_perf_power_consumption")
    private final SchemeStat$TypePerfPowerConsumption typePerfPowerConsumption;

    @pmi0("type_posting_timeline")
    private final MobileOfficialAppsFeedStat$TypePostingTimeline typePostingTimeline;

    @pmi0("type_push_notification_delivery_rate_item")
    private final MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem typePushNotificationDeliveryRateItem;

    @pmi0("type_story_video_item")
    private final MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem typeStoryVideoItem;

    @pmi0("type_super_app_widget_loading")
    private final SchemeStat$TypeSuperAppWidgetLoading typeSuperAppWidgetLoading;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_accessibility_item")
        public static final Type TYPE_ACCESSIBILITY_ITEM;

        @pmi0("type_app_loading_api")
        public static final Type TYPE_APP_LOADING_API;

        @pmi0("type_app_starts")
        public static final Type TYPE_APP_STARTS;

        @pmi0("type_audio_input_lag_item")
        public static final Type TYPE_AUDIO_INPUT_LAG_ITEM;

        @pmi0("type_audio_message_transcript_loading_item")
        public static final Type TYPE_AUDIO_MESSAGE_TRANSCRIPT_LOADING_ITEM;

        @pmi0("type_feed_loading_timeline")
        public static final Type TYPE_FEED_LOADING_TIMELINE;

        @pmi0("type_im_messaging_performance_metric")
        public static final Type TYPE_IM_MESSAGING_PERFORMANCE_METRIC;

        @pmi0("type_im_messaging_recognition")
        public static final Type TYPE_IM_MESSAGING_RECOGNITION;

        @pmi0("type_im_remote_event_processing_item")
        public static final Type TYPE_IM_REMOTE_EVENT_PROCESSING_ITEM;

        @pmi0("type_install_referrer")
        public static final Type TYPE_INSTALL_REFERRER;

        @pmi0("type_marusia_performance_item")
        public static final Type TYPE_MARUSIA_PERFORMANCE_ITEM;

        @pmi0("type_mini_apps_performance")
        public static final Type TYPE_MINI_APPS_PERFORMANCE;

        @pmi0("type_mini_app_start")
        public static final Type TYPE_MINI_APP_START;

        @pmi0("type_network_audio_item")
        public static final Type TYPE_NETWORK_AUDIO_ITEM;

        @pmi0("type_network_audio_stall_item")
        public static final Type TYPE_NETWORK_AUDIO_STALL_ITEM;

        @pmi0("type_network_common")
        public static final Type TYPE_NETWORK_COMMON;

        @pmi0("type_network_images_item")
        public static final Type TYPE_NETWORK_IMAGES_ITEM;

        @pmi0("type_open_with_url")
        public static final Type TYPE_OPEN_WITH_URL;

        @pmi0("type_perf_power_consumption")
        public static final Type TYPE_PERF_POWER_CONSUMPTION;

        @pmi0("type_posting_timeline")
        public static final Type TYPE_POSTING_TIMELINE;

        @pmi0("type_push_notification_delivery_rate_item")
        public static final Type TYPE_PUSH_NOTIFICATION_DELIVERY_RATE_ITEM;

        @pmi0("type_story_video_item")
        public static final Type TYPE_STORY_VIDEO_ITEM;

        @pmi0("type_super_app_widget_loading")
        public static final Type TYPE_SUPER_APP_WIDGET_LOADING;

        static {
            Type type = new Type("TYPE_NETWORK_COMMON", 0);
            TYPE_NETWORK_COMMON = type;
            Type type2 = new Type("TYPE_NETWORK_IMAGES_ITEM", 1);
            TYPE_NETWORK_IMAGES_ITEM = type2;
            Type type3 = new Type("TYPE_NETWORK_AUDIO_ITEM", 2);
            TYPE_NETWORK_AUDIO_ITEM = type3;
            Type type4 = new Type("TYPE_NETWORK_AUDIO_STALL_ITEM", 3);
            TYPE_NETWORK_AUDIO_STALL_ITEM = type4;
            Type type5 = new Type("TYPE_AUDIO_INPUT_LAG_ITEM", 4);
            TYPE_AUDIO_INPUT_LAG_ITEM = type5;
            Type type6 = new Type("TYPE_APP_STARTS", 5);
            TYPE_APP_STARTS = type6;
            Type type7 = new Type("TYPE_MINI_APPS_PERFORMANCE", 6);
            TYPE_MINI_APPS_PERFORMANCE = type7;
            Type type8 = new Type("TYPE_MINI_APP_START", 7);
            TYPE_MINI_APP_START = type8;
            Type type9 = new Type("TYPE_PERF_POWER_CONSUMPTION", 8);
            TYPE_PERF_POWER_CONSUMPTION = type9;
            Type type10 = new Type("TYPE_AUDIO_MESSAGE_TRANSCRIPT_LOADING_ITEM", 9);
            TYPE_AUDIO_MESSAGE_TRANSCRIPT_LOADING_ITEM = type10;
            Type type11 = new Type("TYPE_SUPER_APP_WIDGET_LOADING", 10);
            TYPE_SUPER_APP_WIDGET_LOADING = type11;
            Type type12 = new Type("TYPE_OPEN_WITH_URL", 11);
            TYPE_OPEN_WITH_URL = type12;
            Type type13 = new Type("TYPE_INSTALL_REFERRER", 12);
            TYPE_INSTALL_REFERRER = type13;
            Type type14 = new Type("TYPE_APP_LOADING_API", 13);
            TYPE_APP_LOADING_API = type14;
            Type type15 = new Type("TYPE_IM_REMOTE_EVENT_PROCESSING_ITEM", 14);
            TYPE_IM_REMOTE_EVENT_PROCESSING_ITEM = type15;
            Type type16 = new Type("TYPE_FEED_LOADING_TIMELINE", 15);
            TYPE_FEED_LOADING_TIMELINE = type16;
            Type type17 = new Type("TYPE_POSTING_TIMELINE", 16);
            TYPE_POSTING_TIMELINE = type17;
            Type type18 = new Type("TYPE_ACCESSIBILITY_ITEM", 17);
            TYPE_ACCESSIBILITY_ITEM = type18;
            Type type19 = new Type("TYPE_STORY_VIDEO_ITEM", 18);
            TYPE_STORY_VIDEO_ITEM = type19;
            Type type20 = new Type("TYPE_IM_MESSAGING_RECOGNITION", 19);
            TYPE_IM_MESSAGING_RECOGNITION = type20;
            Type type21 = new Type("TYPE_IM_MESSAGING_PERFORMANCE_METRIC", 20);
            TYPE_IM_MESSAGING_PERFORMANCE_METRIC = type21;
            Type type22 = new Type("TYPE_MARUSIA_PERFORMANCE_ITEM", 21);
            TYPE_MARUSIA_PERFORMANCE_ITEM = type22;
            Type type23 = new Type("TYPE_PUSH_NOTIFICATION_DELIVERY_RATE_ITEM", 22);
            TYPE_PUSH_NOTIFICATION_DELIVERY_RATE_ITEM = type23;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class a {
        public static SchemeStat$EventBenchmarkMain a(int i, String str, b bVar) {
            if (bVar instanceof SchemeStat$TypeNetworkCommon) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_NETWORK_COMMON, (SchemeStat$TypeNetworkCommon) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108848, null);
            }
            if (bVar instanceof SchemeStat$TypeNetworkImagesItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_NETWORK_IMAGES_ITEM, null, (SchemeStat$TypeNetworkImagesItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108840, null);
            }
            if (bVar instanceof SchemeStat$TypeNetworkAudioItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_NETWORK_AUDIO_ITEM, null, null, (SchemeStat$TypeNetworkAudioItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108824, null);
            }
            if (bVar instanceof CommonAudioStat$TypeNetworkAudioStallItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_NETWORK_AUDIO_STALL_ITEM, null, null, null, (CommonAudioStat$TypeNetworkAudioStallItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108792, null);
            }
            if (bVar instanceof CommonAudioStat$TypeAudioInputLagItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_AUDIO_INPUT_LAG_ITEM, null, null, null, null, (CommonAudioStat$TypeAudioInputLagItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108728, null);
            }
            if (bVar instanceof SchemeStat$TypeAppStarts) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_APP_STARTS, null, null, null, null, null, (SchemeStat$TypeAppStarts) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108600, null);
            }
            if (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_MINI_APPS_PERFORMANCE, null, null, null, null, null, null, (MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108344, null);
            }
            if (bVar instanceof SchemeStat$TypeMiniAppStart) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_MINI_APP_START, null, null, null, null, null, null, null, (SchemeStat$TypeMiniAppStart) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67107832, null);
            }
            if (bVar instanceof SchemeStat$TypePerfPowerConsumption) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_PERF_POWER_CONSUMPTION, null, null, null, null, null, null, null, null, (SchemeStat$TypePerfPowerConsumption) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67106808, null);
            }
            if (bVar instanceof SchemeStat$TypeAudioMessageTranscriptLoadingItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_AUDIO_MESSAGE_TRANSCRIPT_LOADING_ITEM, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAudioMessageTranscriptLoadingItem) bVar, null, null, null, null, null, null, null, null, null, null, null, null, null, 67104760, null);
            }
            if (bVar instanceof SchemeStat$TypeSuperAppWidgetLoading) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_SUPER_APP_WIDGET_LOADING, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeSuperAppWidgetLoading) bVar, null, null, null, null, null, null, null, null, null, null, null, null, 67100664, null);
            }
            if (bVar instanceof SchemeStat$TypeOpenWithUrl) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_OPEN_WITH_URL, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeOpenWithUrl) bVar, null, null, null, null, null, null, null, null, null, null, null, 67092472, null);
            }
            if (bVar instanceof SchemeStat$TypeInstallReferrer) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_INSTALL_REFERRER, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeInstallReferrer) bVar, null, null, null, null, null, null, null, null, null, null, 67076088, null);
            }
            if (bVar instanceof SchemeStat$TypeAppLoadingApi) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_APP_LOADING_API, null, null, null, null, null, null, null, null, null, null, null, null, null, (SchemeStat$TypeAppLoadingApi) bVar, null, null, null, null, null, null, null, null, null, 67043320, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_IM_REMOTE_EVENT_PROCESSING_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem) bVar, null, null, null, null, null, null, null, null, 66977784, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_FEED_LOADING_TIMELINE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline) bVar, null, null, null, null, null, null, null, 66846712, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$TypePostingTimeline) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_POSTING_TIMELINE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$TypePostingTimeline) bVar, null, null, null, null, null, null, 66584568, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_ACCESSIBILITY_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem) bVar, null, null, null, null, null, 66060280, null);
            }
            if (bVar instanceof MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_STORY_VIDEO_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem) bVar, null, null, null, null, 65011704, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImMessagingRecognition) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_IM_MESSAGING_RECOGNITION, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImMessagingRecognition) bVar, null, null, null, 62914552, null);
            }
            if (bVar instanceof MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_IM_MESSAGING_PERFORMANCE_METRIC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric) bVar, null, null, 58720248, null);
            }
            if (bVar instanceof MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem) {
                return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_MARUSIA_PERFORMANCE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem) bVar, null, 50331640, null);
            }
            if (!(bVar instanceof MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeNetworkCommon, TypeNetworkImagesItem, TypeNetworkAudioItem, TypeNetworkAudioStallItem, TypeAudioInputLagItem, TypeAppStarts, TypeMiniAppsPerformance, TypeMiniAppStart, TypePerfPowerConsumption, TypeAudioMessageTranscriptLoadingItem, TypeSuperAppWidgetLoading, TypeOpenWithUrl, TypeInstallReferrer, TypeAppLoadingApi, TypeImRemoteEventProcessingItem, TypeFeedLoadingTimeline, TypePostingTimeline, TypeAccessibilityItem, TypeStoryVideoItem, TypeImMessagingRecognition, TypeImMessagingPerformanceMetric, TypeMarusiaPerformanceItem, TypePushNotificationDeliveryRateItem)");
            }
            return new SchemeStat$EventBenchmarkMain(i, str, Type.TYPE_PUSH_NOTIFICATION_DELIVERY_RATE_ITEM, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem) bVar, 33554424, null);
        }
    }

    /* compiled from: SchemeStat.kt */
    public interface b {
    }

    private SchemeStat$EventBenchmarkMain(int i, String str, Type type, SchemeStat$TypeNetworkCommon schemeStat$TypeNetworkCommon, SchemeStat$TypeNetworkImagesItem schemeStat$TypeNetworkImagesItem, SchemeStat$TypeNetworkAudioItem schemeStat$TypeNetworkAudioItem, CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem, CommonAudioStat$TypeAudioInputLagItem commonAudioStat$TypeAudioInputLagItem, SchemeStat$TypeAppStarts schemeStat$TypeAppStarts, MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance, SchemeStat$TypeMiniAppStart schemeStat$TypeMiniAppStart, SchemeStat$TypePerfPowerConsumption schemeStat$TypePerfPowerConsumption, SchemeStat$TypeAudioMessageTranscriptLoadingItem schemeStat$TypeAudioMessageTranscriptLoadingItem, SchemeStat$TypeSuperAppWidgetLoading schemeStat$TypeSuperAppWidgetLoading, SchemeStat$TypeOpenWithUrl schemeStat$TypeOpenWithUrl, SchemeStat$TypeInstallReferrer schemeStat$TypeInstallReferrer, SchemeStat$TypeAppLoadingApi schemeStat$TypeAppLoadingApi, MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem, MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline, MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline, MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem, MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition, MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric, MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem, MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem) {
        this.id = i;
        this.timestamp = str;
        this.type = type;
        this.typeNetworkCommon = schemeStat$TypeNetworkCommon;
        this.typeNetworkImagesItem = schemeStat$TypeNetworkImagesItem;
        this.typeNetworkAudioItem = schemeStat$TypeNetworkAudioItem;
        this.typeNetworkAudioStallItem = commonAudioStat$TypeNetworkAudioStallItem;
        this.typeAudioInputLagItem = commonAudioStat$TypeAudioInputLagItem;
        this.typeAppStarts = schemeStat$TypeAppStarts;
        this.typeMiniAppsPerformance = mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance;
        this.typeMiniAppStart = schemeStat$TypeMiniAppStart;
        this.typePerfPowerConsumption = schemeStat$TypePerfPowerConsumption;
        this.typeAudioMessageTranscriptLoadingItem = schemeStat$TypeAudioMessageTranscriptLoadingItem;
        this.typeSuperAppWidgetLoading = schemeStat$TypeSuperAppWidgetLoading;
        this.typeOpenWithUrl = schemeStat$TypeOpenWithUrl;
        this.typeInstallReferrer = schemeStat$TypeInstallReferrer;
        this.typeAppLoadingApi = schemeStat$TypeAppLoadingApi;
        this.typeImRemoteEventProcessingItem = mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem;
        this.typeFeedLoadingTimeline = mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline;
        this.typePostingTimeline = mobileOfficialAppsFeedStat$TypePostingTimeline;
        this.typeAccessibilityItem = mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem;
        this.typeStoryVideoItem = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        this.typeImMessagingRecognition = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        this.typeImMessagingPerformanceMetric = mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric;
        this.typeMarusiaPerformanceItem = mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem;
        this.typePushNotificationDeliveryRateItem = mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem;
    }

    public final int a() {
        return this.id;
    }

    public final String b() {
        return this.timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$EventBenchmarkMain)) {
            return false;
        }
        SchemeStat$EventBenchmarkMain schemeStat$EventBenchmarkMain = (SchemeStat$EventBenchmarkMain) obj;
        return this.id == schemeStat$EventBenchmarkMain.id && epx.f(this.timestamp, schemeStat$EventBenchmarkMain.timestamp) && this.type == schemeStat$EventBenchmarkMain.type && epx.f(this.typeNetworkCommon, schemeStat$EventBenchmarkMain.typeNetworkCommon) && epx.f(this.typeNetworkImagesItem, schemeStat$EventBenchmarkMain.typeNetworkImagesItem) && epx.f(this.typeNetworkAudioItem, schemeStat$EventBenchmarkMain.typeNetworkAudioItem) && epx.f(this.typeNetworkAudioStallItem, schemeStat$EventBenchmarkMain.typeNetworkAudioStallItem) && epx.f(this.typeAudioInputLagItem, schemeStat$EventBenchmarkMain.typeAudioInputLagItem) && epx.f(this.typeAppStarts, schemeStat$EventBenchmarkMain.typeAppStarts) && epx.f(this.typeMiniAppsPerformance, schemeStat$EventBenchmarkMain.typeMiniAppsPerformance) && epx.f(this.typeMiniAppStart, schemeStat$EventBenchmarkMain.typeMiniAppStart) && epx.f(this.typePerfPowerConsumption, schemeStat$EventBenchmarkMain.typePerfPowerConsumption) && epx.f(this.typeAudioMessageTranscriptLoadingItem, schemeStat$EventBenchmarkMain.typeAudioMessageTranscriptLoadingItem) && epx.f(this.typeSuperAppWidgetLoading, schemeStat$EventBenchmarkMain.typeSuperAppWidgetLoading) && epx.f(this.typeOpenWithUrl, schemeStat$EventBenchmarkMain.typeOpenWithUrl) && epx.f(this.typeInstallReferrer, schemeStat$EventBenchmarkMain.typeInstallReferrer) && epx.f(this.typeAppLoadingApi, schemeStat$EventBenchmarkMain.typeAppLoadingApi) && epx.f(this.typeImRemoteEventProcessingItem, schemeStat$EventBenchmarkMain.typeImRemoteEventProcessingItem) && epx.f(this.typeFeedLoadingTimeline, schemeStat$EventBenchmarkMain.typeFeedLoadingTimeline) && epx.f(this.typePostingTimeline, schemeStat$EventBenchmarkMain.typePostingTimeline) && epx.f(this.typeAccessibilityItem, schemeStat$EventBenchmarkMain.typeAccessibilityItem) && epx.f(this.typeStoryVideoItem, schemeStat$EventBenchmarkMain.typeStoryVideoItem) && epx.f(this.typeImMessagingRecognition, schemeStat$EventBenchmarkMain.typeImMessagingRecognition) && epx.f(this.typeImMessagingPerformanceMetric, schemeStat$EventBenchmarkMain.typeImMessagingPerformanceMetric) && epx.f(this.typeMarusiaPerformanceItem, schemeStat$EventBenchmarkMain.typeMarusiaPerformanceItem) && epx.f(this.typePushNotificationDeliveryRateItem, schemeStat$EventBenchmarkMain.typePushNotificationDeliveryRateItem);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.timestamp)) * 31;
        SchemeStat$TypeNetworkCommon schemeStat$TypeNetworkCommon = this.typeNetworkCommon;
        int hashCode2 = (hashCode + (schemeStat$TypeNetworkCommon == null ? 0 : schemeStat$TypeNetworkCommon.hashCode())) * 31;
        SchemeStat$TypeNetworkImagesItem schemeStat$TypeNetworkImagesItem = this.typeNetworkImagesItem;
        int hashCode3 = (hashCode2 + (schemeStat$TypeNetworkImagesItem == null ? 0 : schemeStat$TypeNetworkImagesItem.hashCode())) * 31;
        SchemeStat$TypeNetworkAudioItem schemeStat$TypeNetworkAudioItem = this.typeNetworkAudioItem;
        int hashCode4 = (hashCode3 + (schemeStat$TypeNetworkAudioItem == null ? 0 : schemeStat$TypeNetworkAudioItem.hashCode())) * 31;
        CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem = this.typeNetworkAudioStallItem;
        int hashCode5 = (hashCode4 + (commonAudioStat$TypeNetworkAudioStallItem == null ? 0 : commonAudioStat$TypeNetworkAudioStallItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioInputLagItem commonAudioStat$TypeAudioInputLagItem = this.typeAudioInputLagItem;
        int hashCode6 = (hashCode5 + (commonAudioStat$TypeAudioInputLagItem == null ? 0 : commonAudioStat$TypeAudioInputLagItem.hashCode())) * 31;
        SchemeStat$TypeAppStarts schemeStat$TypeAppStarts = this.typeAppStarts;
        int hashCode7 = (hashCode6 + (schemeStat$TypeAppStarts == null ? 0 : schemeStat$TypeAppStarts.hashCode())) * 31;
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance = this.typeMiniAppsPerformance;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance == null ? 0 : mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance.hashCode())) * 31;
        SchemeStat$TypeMiniAppStart schemeStat$TypeMiniAppStart = this.typeMiniAppStart;
        int hashCode9 = (hashCode8 + (schemeStat$TypeMiniAppStart == null ? 0 : schemeStat$TypeMiniAppStart.hashCode())) * 31;
        SchemeStat$TypePerfPowerConsumption schemeStat$TypePerfPowerConsumption = this.typePerfPowerConsumption;
        int hashCode10 = (hashCode9 + (schemeStat$TypePerfPowerConsumption == null ? 0 : schemeStat$TypePerfPowerConsumption.hashCode())) * 31;
        SchemeStat$TypeAudioMessageTranscriptLoadingItem schemeStat$TypeAudioMessageTranscriptLoadingItem = this.typeAudioMessageTranscriptLoadingItem;
        int hashCode11 = (hashCode10 + (schemeStat$TypeAudioMessageTranscriptLoadingItem == null ? 0 : schemeStat$TypeAudioMessageTranscriptLoadingItem.hashCode())) * 31;
        SchemeStat$TypeSuperAppWidgetLoading schemeStat$TypeSuperAppWidgetLoading = this.typeSuperAppWidgetLoading;
        int hashCode12 = (hashCode11 + (schemeStat$TypeSuperAppWidgetLoading == null ? 0 : schemeStat$TypeSuperAppWidgetLoading.hashCode())) * 31;
        SchemeStat$TypeOpenWithUrl schemeStat$TypeOpenWithUrl = this.typeOpenWithUrl;
        int hashCode13 = (hashCode12 + (schemeStat$TypeOpenWithUrl == null ? 0 : schemeStat$TypeOpenWithUrl.hashCode())) * 31;
        SchemeStat$TypeInstallReferrer schemeStat$TypeInstallReferrer = this.typeInstallReferrer;
        int hashCode14 = (hashCode13 + (schemeStat$TypeInstallReferrer == null ? 0 : schemeStat$TypeInstallReferrer.hashCode())) * 31;
        SchemeStat$TypeAppLoadingApi schemeStat$TypeAppLoadingApi = this.typeAppLoadingApi;
        int hashCode15 = (hashCode14 + (schemeStat$TypeAppLoadingApi == null ? 0 : schemeStat$TypeAppLoadingApi.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem = this.typeImRemoteEventProcessingItem;
        int hashCode16 = (hashCode15 + (mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem == null ? 0 : mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline = this.typeFeedLoadingTimeline;
        int hashCode17 = (hashCode16 + (mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline.hashCode())) * 31;
        MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline = this.typePostingTimeline;
        int hashCode18 = (hashCode17 + (mobileOfficialAppsFeedStat$TypePostingTimeline == null ? 0 : mobileOfficialAppsFeedStat$TypePostingTimeline.hashCode())) * 31;
        MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem = this.typeAccessibilityItem;
        int hashCode19 = (hashCode18 + (mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem == null ? 0 : mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem.hashCode())) * 31;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = this.typeStoryVideoItem;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem == null ? 0 : mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = this.typeImMessagingRecognition;
        int hashCode21 = (hashCode20 + (mobileOfficialAppsImStat$TypeImMessagingRecognition == null ? 0 : mobileOfficialAppsImStat$TypeImMessagingRecognition.hashCode())) * 31;
        MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric = this.typeImMessagingPerformanceMetric;
        int hashCode22 = (hashCode21 + (mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric == null ? 0 : mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem = this.typeMarusiaPerformanceItem;
        int hashCode23 = (hashCode22 + (mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem == null ? 0 : mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem.hashCode())) * 31;
        MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem = this.typePushNotificationDeliveryRateItem;
        return hashCode23 + (mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem != null ? mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem.hashCode() : 0);
    }

    public final String toString() {
        return "EventBenchmarkMain(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", typeNetworkCommon=" + this.typeNetworkCommon + ", typeNetworkImagesItem=" + this.typeNetworkImagesItem + ", typeNetworkAudioItem=" + this.typeNetworkAudioItem + ", typeNetworkAudioStallItem=" + this.typeNetworkAudioStallItem + ", typeAudioInputLagItem=" + this.typeAudioInputLagItem + ", typeAppStarts=" + this.typeAppStarts + ", typeMiniAppsPerformance=" + this.typeMiniAppsPerformance + ", typeMiniAppStart=" + this.typeMiniAppStart + ", typePerfPowerConsumption=" + this.typePerfPowerConsumption + ", typeAudioMessageTranscriptLoadingItem=" + this.typeAudioMessageTranscriptLoadingItem + ", typeSuperAppWidgetLoading=" + this.typeSuperAppWidgetLoading + ", typeOpenWithUrl=" + this.typeOpenWithUrl + ", typeInstallReferrer=" + this.typeInstallReferrer + ", typeAppLoadingApi=" + this.typeAppLoadingApi + ", typeImRemoteEventProcessingItem=" + this.typeImRemoteEventProcessingItem + ", typeFeedLoadingTimeline=" + this.typeFeedLoadingTimeline + ", typePostingTimeline=" + this.typePostingTimeline + ", typeAccessibilityItem=" + this.typeAccessibilityItem + ", typeStoryVideoItem=" + this.typeStoryVideoItem + ", typeImMessagingRecognition=" + this.typeImMessagingRecognition + ", typeImMessagingPerformanceMetric=" + this.typeImMessagingPerformanceMetric + ", typeMarusiaPerformanceItem=" + this.typeMarusiaPerformanceItem + ", typePushNotificationDeliveryRateItem=" + this.typePushNotificationDeliveryRateItem + ')';
    }

    public /* synthetic */ SchemeStat$EventBenchmarkMain(int i, String str, Type type, SchemeStat$TypeNetworkCommon schemeStat$TypeNetworkCommon, SchemeStat$TypeNetworkImagesItem schemeStat$TypeNetworkImagesItem, SchemeStat$TypeNetworkAudioItem schemeStat$TypeNetworkAudioItem, CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem, CommonAudioStat$TypeAudioInputLagItem commonAudioStat$TypeAudioInputLagItem, SchemeStat$TypeAppStarts schemeStat$TypeAppStarts, MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance, SchemeStat$TypeMiniAppStart schemeStat$TypeMiniAppStart, SchemeStat$TypePerfPowerConsumption schemeStat$TypePerfPowerConsumption, SchemeStat$TypeAudioMessageTranscriptLoadingItem schemeStat$TypeAudioMessageTranscriptLoadingItem, SchemeStat$TypeSuperAppWidgetLoading schemeStat$TypeSuperAppWidgetLoading, SchemeStat$TypeOpenWithUrl schemeStat$TypeOpenWithUrl, SchemeStat$TypeInstallReferrer schemeStat$TypeInstallReferrer, SchemeStat$TypeAppLoadingApi schemeStat$TypeAppLoadingApi, MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem, MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline, MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline, MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem, MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition, MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric, MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem, MobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem, int i2, zcl zclVar) {
        this(i, str, type, (i2 & 8) != 0 ? null : schemeStat$TypeNetworkCommon, (i2 & 16) != 0 ? null : schemeStat$TypeNetworkImagesItem, (i2 & 32) != 0 ? null : schemeStat$TypeNetworkAudioItem, (i2 & 64) != 0 ? null : commonAudioStat$TypeNetworkAudioStallItem, (i2 & 128) != 0 ? null : commonAudioStat$TypeAudioInputLagItem, (i2 & 256) != 0 ? null : schemeStat$TypeAppStarts, (i2 & 512) != 0 ? null : mobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance, (i2 & 1024) != 0 ? null : schemeStat$TypeMiniAppStart, (i2 & 2048) != 0 ? null : schemeStat$TypePerfPowerConsumption, (i2 & 4096) != 0 ? null : schemeStat$TypeAudioMessageTranscriptLoadingItem, (i2 & 8192) != 0 ? null : schemeStat$TypeSuperAppWidgetLoading, (i2 & 16384) != 0 ? null : schemeStat$TypeOpenWithUrl, (32768 & i2) != 0 ? null : schemeStat$TypeInstallReferrer, (65536 & i2) != 0 ? null : schemeStat$TypeAppLoadingApi, (131072 & i2) != 0 ? null : mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem, (262144 & i2) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline, (524288 & i2) != 0 ? null : mobileOfficialAppsFeedStat$TypePostingTimeline, (1048576 & i2) != 0 ? null : mobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem, (2097152 & i2) != 0 ? null : mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem, (4194304 & i2) != 0 ? null : mobileOfficialAppsImStat$TypeImMessagingRecognition, (8388608 & i2) != 0 ? null : mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric, (16777216 & i2) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem, (i2 & 33554432) != 0 ? null : mobileOfficialAppsCorePushesStat$TypePushNotificationDeliveryRateItem);
    }
}
