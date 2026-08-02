package com.vk.push.core.feature;

import com.vk.push.core.feature.Feature;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: CommonFeatures.kt */
/* loaded from: classes.dex */
public final class CommonFeaturesKt {
    public static final Feature.IntFeature a = new Feature.IntFeature("vkcm_sdk_omicron_update_time_interval_hours", 1);
    public static final Feature.StringFeature b = new Feature.StringFeature("vkcm_sdk_analytics_events_black_list", "");
    public static final Feature.IntFeature c = new Feature.IntFeature("vkcm_sdk_omicron_push_count_threshold", 500);
    public static final Feature.IntFeature d = new Feature.IntFeature("vkcm_sdk_omicron_sending_push_count_interval_hours", 12);
    public static final Feature.StringFeature e = new Feature.StringFeature("vkcm_sdk_non_fatal_events_black_list", "");
    public static final Feature.IntFeature f = new Feature.IntFeature("vkcm_sdk_analytics_active_check_interval_minutes", PublisherConfiguration.DEFAULT_MAX_RES);
    public static final Feature.StringFeature g = new Feature.StringFeature("vkcm_sdk_websocket_active_check_config", "");
    public static final Feature.StringFeature h = new Feature.StringFeature("vkcm_sdk_service_active_check_config", "");
    public static final Feature.StringFeature i = new Feature.StringFeature("vkcm_sdk_external_master_host_analytics_config", "");
    public static final Feature.IntFeature j = new Feature.IntFeature("vkcm_sdk_push_token_ttl_no_host_minutes", 2880);
    public static final Feature.BooleanFeature k = new Feature.BooleanFeature("vkcm_sdk_is_wake_lock_enabled", false);

    public static final Feature.IntFeature getAnalyticsActiveCheckIntervalMinutes() {
        return f;
    }

    public static final Feature.StringFeature getAnalyticsEventsBlackList() {
        return b;
    }

    public static final Feature.StringFeature getExternalMasterHostAnalyticsConfig() {
        return i;
    }

    public static final Feature.StringFeature getNonFatalEventsBlackList() {
        return e;
    }

    public static final Feature.IntFeature getPushCountThreshold() {
        return c;
    }

    public static final Feature.IntFeature getPushTokenTtlWithoutHostMinutes() {
        return j;
    }

    public static final Feature.IntFeature getSendingPushCountAnalyticsIntervalHours() {
        return d;
    }

    public static final Feature.StringFeature getServiceActiveCheckConfig() {
        return h;
    }

    public static final Feature.IntFeature getUpdateTimeInterval() {
        return a;
    }

    public static final Feature.StringFeature getWebsocketActiveCheckConfig() {
        return g;
    }

    public static final Feature.BooleanFeature isWakeLocksEnabled() {
        return k;
    }
}
