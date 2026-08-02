package com.vk.stat.model.builders.aggregate;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AggregateEventKey.kt */
/* loaded from: classes11.dex */
public final class AggregateEventKey {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AggregateEventKey[] $VALUES;
    public static final AggregateEventKey APP_COLD_START_PERFORMANCE_TIMES;
    public static final AggregateEventKey BITMAP_ERRORS;
    public static final AggregateEventKey BOTTOM_NAV_CLICK_WAIT;
    public static final AggregateEventKey CLIP_REPOST;
    public static final AggregateEventKey COMMUNITY_SCREEN_NETWORK_ERROR;
    public static final AggregateEventKey CORE_CONTENT_PROVIDER_MEASURE;
    public static final AggregateEventKey CORE_SINGLE_PREF_MIGRATION;
    public static final AggregateEventKey DYN_LIB_EVENT;
    public static final AggregateEventKey FEED_INITIAL_MODE;
    public static final AggregateEventKey FEED_MODE_CHANGE;
    public static final AggregateEventKey FEED_MODE_SETTING_CHANGED;
    public static final AggregateEventKey FEED_NETWORK_QUALITY;
    public static final AggregateEventKey INSTALLED_DYN_LIBS;
    public static final AggregateEventKey NETWORK_TRAFFIC;
    public static final AggregateEventKey PERFORMANCE_CLASS;
    public static final AggregateEventKey PERFORMANCE_SCORE;
    public static final AggregateEventKey PROBLEM_WITH_SYSTEM_LOAD;
    public static final AggregateEventKey SMB_EMPTY_CART_OPTIMIZE;
    public static final AggregateEventKey SUBSTITUTION_SERVICE_STUCK;
    public static final AggregateEventKey TECH_SCORE;
    private final String eventName;

    static {
        AggregateEventKey aggregateEventKey = new AggregateEventKey("PERFORMANCE_SCORE", 0, "performance_score");
        PERFORMANCE_SCORE = aggregateEventKey;
        AggregateEventKey aggregateEventKey2 = new AggregateEventKey("PERFORMANCE_CLASS", 1, "performance_class");
        PERFORMANCE_CLASS = aggregateEventKey2;
        AggregateEventKey aggregateEventKey3 = new AggregateEventKey("SMB_EMPTY_CART_OPTIMIZE", 2, "smb_empty_cart_optimize");
        SMB_EMPTY_CART_OPTIMIZE = aggregateEventKey3;
        AggregateEventKey aggregateEventKey4 = new AggregateEventKey("CORE_CONTENT_PROVIDER_MEASURE", 3, "core_content_provider_measure");
        CORE_CONTENT_PROVIDER_MEASURE = aggregateEventKey4;
        AggregateEventKey aggregateEventKey5 = new AggregateEventKey("FEED_NETWORK_QUALITY", 4, "feed_network_quality");
        FEED_NETWORK_QUALITY = aggregateEventKey5;
        AggregateEventKey aggregateEventKey6 = new AggregateEventKey("NETWORK_TRAFFIC", 5, "network_traffic");
        NETWORK_TRAFFIC = aggregateEventKey6;
        AggregateEventKey aggregateEventKey7 = new AggregateEventKey("PROBLEM_WITH_SYSTEM_LOAD", 6, "problem_with_system_load");
        PROBLEM_WITH_SYSTEM_LOAD = aggregateEventKey7;
        AggregateEventKey aggregateEventKey8 = new AggregateEventKey("TECH_SCORE", 7, "tech_score");
        TECH_SCORE = aggregateEventKey8;
        AggregateEventKey aggregateEventKey9 = new AggregateEventKey("FEED_MODE_SETTING_CHANGED", 8, "feed_mode_setting_changed");
        FEED_MODE_SETTING_CHANGED = aggregateEventKey9;
        AggregateEventKey aggregateEventKey10 = new AggregateEventKey("FEED_INITIAL_MODE", 9, "feed_initial_mode");
        FEED_INITIAL_MODE = aggregateEventKey10;
        AggregateEventKey aggregateEventKey11 = new AggregateEventKey("FEED_MODE_CHANGE", 10, "feed_mode_change");
        FEED_MODE_CHANGE = aggregateEventKey11;
        AggregateEventKey aggregateEventKey12 = new AggregateEventKey("CORE_SINGLE_PREF_MIGRATION", 11, "core_single_pref_migration");
        CORE_SINGLE_PREF_MIGRATION = aggregateEventKey12;
        AggregateEventKey aggregateEventKey13 = new AggregateEventKey("DYN_LIB_EVENT", 12, "dyn_lib_event");
        DYN_LIB_EVENT = aggregateEventKey13;
        AggregateEventKey aggregateEventKey14 = new AggregateEventKey("INSTALLED_DYN_LIBS", 13, "installed_dyn_libs");
        INSTALLED_DYN_LIBS = aggregateEventKey14;
        AggregateEventKey aggregateEventKey15 = new AggregateEventKey("APP_COLD_START_PERFORMANCE_TIMES", 14, "app_cold_start_performance_times");
        APP_COLD_START_PERFORMANCE_TIMES = aggregateEventKey15;
        AggregateEventKey aggregateEventKey16 = new AggregateEventKey("BOTTOM_NAV_CLICK_WAIT", 15, "bottom_nav_click_wait");
        BOTTOM_NAV_CLICK_WAIT = aggregateEventKey16;
        AggregateEventKey aggregateEventKey17 = new AggregateEventKey("BITMAP_ERRORS", 16, "bitmap_errors");
        BITMAP_ERRORS = aggregateEventKey17;
        AggregateEventKey aggregateEventKey18 = new AggregateEventKey("CLIP_REPOST", 17, "clip_repost");
        CLIP_REPOST = aggregateEventKey18;
        AggregateEventKey aggregateEventKey19 = new AggregateEventKey("SUBSTITUTION_SERVICE_STUCK", 18, "substitution_service_stuck");
        SUBSTITUTION_SERVICE_STUCK = aggregateEventKey19;
        AggregateEventKey aggregateEventKey20 = new AggregateEventKey("COMMUNITY_SCREEN_NETWORK_ERROR", 19, "community_screen_network_error");
        COMMUNITY_SCREEN_NETWORK_ERROR = aggregateEventKey20;
        AggregateEventKey[] aggregateEventKeyArr = {aggregateEventKey, aggregateEventKey2, aggregateEventKey3, aggregateEventKey4, aggregateEventKey5, aggregateEventKey6, aggregateEventKey7, aggregateEventKey8, aggregateEventKey9, aggregateEventKey10, aggregateEventKey11, aggregateEventKey12, aggregateEventKey13, aggregateEventKey14, aggregateEventKey15, aggregateEventKey16, aggregateEventKey17, aggregateEventKey18, aggregateEventKey19, aggregateEventKey20};
        $VALUES = aggregateEventKeyArr;
        $ENTRIES = new asp(aggregateEventKeyArr);
    }

    public AggregateEventKey(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static AggregateEventKey valueOf(String str) {
        return (AggregateEventKey) Enum.valueOf(AggregateEventKey.class, str);
    }

    public static AggregateEventKey[] values() {
        return (AggregateEventKey[]) $VALUES.clone();
    }

    public final String h() {
        return this.eventName;
    }
}
