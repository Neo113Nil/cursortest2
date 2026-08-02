package com.vk.superapp.vksteps;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsSyncReason.kt */
/* loaded from: classes6.dex */
public final class VkStepsSyncReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsSyncReason[] $VALUES;
    public static final VkStepsSyncReason APP_START;
    public static final VkStepsSyncReason BACKGROUND_SYNC;
    public static final VkStepsSyncReason BRIDGE_EVENT;
    public static final VkStepsSyncReason BRIDGE_EVENT_STAT;
    public static final VkStepsSyncReason WIDGET_UPDATE;
    private final String analyticsValue;

    static {
        VkStepsSyncReason vkStepsSyncReason = new VkStepsSyncReason("BRIDGE_EVENT", 0, "bridge_event_get");
        BRIDGE_EVENT = vkStepsSyncReason;
        VkStepsSyncReason vkStepsSyncReason2 = new VkStepsSyncReason("BRIDGE_EVENT_STAT", 1, "bridge_event_stat");
        BRIDGE_EVENT_STAT = vkStepsSyncReason2;
        VkStepsSyncReason vkStepsSyncReason3 = new VkStepsSyncReason("BACKGROUND_SYNC", 2, "background_sync");
        BACKGROUND_SYNC = vkStepsSyncReason3;
        VkStepsSyncReason vkStepsSyncReason4 = new VkStepsSyncReason("WIDGET_UPDATE", 3, "widget_update");
        WIDGET_UPDATE = vkStepsSyncReason4;
        VkStepsSyncReason vkStepsSyncReason5 = new VkStepsSyncReason("APP_START", 4, "app_start");
        APP_START = vkStepsSyncReason5;
        VkStepsSyncReason[] vkStepsSyncReasonArr = {vkStepsSyncReason, vkStepsSyncReason2, vkStepsSyncReason3, vkStepsSyncReason4, vkStepsSyncReason5};
        $VALUES = vkStepsSyncReasonArr;
        $ENTRIES = new asp(vkStepsSyncReasonArr);
    }

    public VkStepsSyncReason(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static VkStepsSyncReason valueOf(String str) {
        return (VkStepsSyncReason) Enum.valueOf(VkStepsSyncReason.class, str);
    }

    public static VkStepsSyncReason[] values() {
        return (VkStepsSyncReason[]) $VALUES.clone();
    }

    public final String h() {
        return this.analyticsValue;
    }
}
