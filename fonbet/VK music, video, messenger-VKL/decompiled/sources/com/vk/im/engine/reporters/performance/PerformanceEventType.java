package com.vk.im.engine.reporters.performance;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PerformanceEventType.kt */
/* loaded from: classes2.dex */
public final class PerformanceEventType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PerformanceEventType[] $VALUES;
    public static final PerformanceEventType CHANNEL_LIST_OPEN_TO_RENDER;
    public static final PerformanceEventType CHANNEL_OPEN_TO_RENDER;
    public static final PerformanceEventType CHANNEL_POST_ROUND_TRIP;
    public static final PerformanceEventType CHANNEL_STUB_ATTACH_UPDATE;
    public static final PerformanceEventType CHAT_LIST_OPEN_TO_RENDER;
    public static final PerformanceEventType CHAT_OPEN_TO_RENDER;
    public static final PerformanceEventType GROUP_CHAT_LIST_OPEN_TO_RENDER;
    public static final PerformanceEventType GROUP_CHAT_OPEN_TO_RENDER;
    public static final PerformanceEventType IM_ITEM_LIST_OPEN_TO_RENDER;
    public static final PerformanceEventType LITE_SYNC;
    public static final PerformanceEventType LONG_POLL_EXPIRED;
    public static final PerformanceEventType LONG_POLL_HISTORY;
    public static final PerformanceEventType MESSAGES_EMPTY_HISTORY_MERGE;
    public static final PerformanceEventType MESSAGES_HISTORY_MERGE;
    public static final PerformanceEventType SYNC_MANAGER_STOP_AWAITING;
    private final String key;

    static {
        PerformanceEventType performanceEventType = new PerformanceEventType("CHAT_OPEN_TO_RENDER", 0, "chat_open_to_render");
        CHAT_OPEN_TO_RENDER = performanceEventType;
        PerformanceEventType performanceEventType2 = new PerformanceEventType("GROUP_CHAT_OPEN_TO_RENDER", 1, "group_chat_open_to_render");
        GROUP_CHAT_OPEN_TO_RENDER = performanceEventType2;
        PerformanceEventType performanceEventType3 = new PerformanceEventType("CHANNEL_OPEN_TO_RENDER", 2, "channel_open_to_render");
        CHANNEL_OPEN_TO_RENDER = performanceEventType3;
        PerformanceEventType performanceEventType4 = new PerformanceEventType("CHAT_LIST_OPEN_TO_RENDER", 3, "chat_list_open_to_render");
        CHAT_LIST_OPEN_TO_RENDER = performanceEventType4;
        PerformanceEventType performanceEventType5 = new PerformanceEventType("GROUP_CHAT_LIST_OPEN_TO_RENDER", 4, "group_chat_list_open_to_render");
        GROUP_CHAT_LIST_OPEN_TO_RENDER = performanceEventType5;
        PerformanceEventType performanceEventType6 = new PerformanceEventType("CHANNEL_LIST_OPEN_TO_RENDER", 5, "channel_list_open_to_render");
        CHANNEL_LIST_OPEN_TO_RENDER = performanceEventType6;
        PerformanceEventType performanceEventType7 = new PerformanceEventType("LONG_POLL_EXPIRED", 6, "long_poll_expired");
        LONG_POLL_EXPIRED = performanceEventType7;
        PerformanceEventType performanceEventType8 = new PerformanceEventType("LONG_POLL_HISTORY", 7, "long_poll_history");
        LONG_POLL_HISTORY = performanceEventType8;
        PerformanceEventType performanceEventType9 = new PerformanceEventType("LITE_SYNC", 8, "lite_sync");
        LITE_SYNC = performanceEventType9;
        PerformanceEventType performanceEventType10 = new PerformanceEventType("MESSAGES_HISTORY_MERGE", 9, "messages_history_merge");
        MESSAGES_HISTORY_MERGE = performanceEventType10;
        PerformanceEventType performanceEventType11 = new PerformanceEventType("MESSAGES_EMPTY_HISTORY_MERGE", 10, "messages_empty_history_merge");
        MESSAGES_EMPTY_HISTORY_MERGE = performanceEventType11;
        PerformanceEventType performanceEventType12 = new PerformanceEventType("SYNC_MANAGER_STOP_AWAITING", 11, "sync_manager_stop_awaiting");
        SYNC_MANAGER_STOP_AWAITING = performanceEventType12;
        PerformanceEventType performanceEventType13 = new PerformanceEventType("CHANNEL_POST_ROUND_TRIP", 12, "channel_post_round_trip");
        CHANNEL_POST_ROUND_TRIP = performanceEventType13;
        PerformanceEventType performanceEventType14 = new PerformanceEventType("CHANNEL_STUB_ATTACH_UPDATE", 13, "channel_stub_attach_update");
        CHANNEL_STUB_ATTACH_UPDATE = performanceEventType14;
        PerformanceEventType performanceEventType15 = new PerformanceEventType("IM_ITEM_LIST_OPEN_TO_RENDER", 14, "im_item_list_open_to_render");
        IM_ITEM_LIST_OPEN_TO_RENDER = performanceEventType15;
        PerformanceEventType[] performanceEventTypeArr = {performanceEventType, performanceEventType2, performanceEventType3, performanceEventType4, performanceEventType5, performanceEventType6, performanceEventType7, performanceEventType8, performanceEventType9, performanceEventType10, performanceEventType11, performanceEventType12, performanceEventType13, performanceEventType14, performanceEventType15};
        $VALUES = performanceEventTypeArr;
        $ENTRIES = new asp(performanceEventTypeArr);
    }

    public PerformanceEventType(String str, int i, String str2) {
        this.key = str2;
    }

    public static PerformanceEventType valueOf(String str) {
        return (PerformanceEventType) Enum.valueOf(PerformanceEventType.class, str);
    }

    public static PerformanceEventType[] values() {
        return (PerformanceEventType[]) $VALUES.clone();
    }

    public final String h() {
        return this.key;
    }
}
