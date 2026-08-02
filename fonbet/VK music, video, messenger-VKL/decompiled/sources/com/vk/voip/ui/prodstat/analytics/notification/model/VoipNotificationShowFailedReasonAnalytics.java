package com.vk.voip.ui.prodstat.analytics.notification.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipNotificationShowFailedReasonAnalytics.kt */
/* loaded from: classes7.dex */
public final class VoipNotificationShowFailedReasonAnalytics {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipNotificationShowFailedReasonAnalytics[] $VALUES;
    public static final VoipNotificationShowFailedReasonAnalytics CHANNEL_DISABLED;
    public static final VoipNotificationShowFailedReasonAnalytics DO_NOT_DISTURB_MODE;
    public static final VoipNotificationShowFailedReasonAnalytics NOTIFICATIONS_DISABLED;
    public static final VoipNotificationShowFailedReasonAnalytics NOTIFICATIONS_PAUSED;
    private final String reason;

    static {
        VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics = new VoipNotificationShowFailedReasonAnalytics("NOTIFICATIONS_DISABLED", 0, "notifications_disabled");
        NOTIFICATIONS_DISABLED = voipNotificationShowFailedReasonAnalytics;
        VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics2 = new VoipNotificationShowFailedReasonAnalytics("CHANNEL_DISABLED", 1, "channel_disabled");
        CHANNEL_DISABLED = voipNotificationShowFailedReasonAnalytics2;
        VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics3 = new VoipNotificationShowFailedReasonAnalytics("NOTIFICATIONS_PAUSED", 2, "notifications_paused");
        NOTIFICATIONS_PAUSED = voipNotificationShowFailedReasonAnalytics3;
        VoipNotificationShowFailedReasonAnalytics voipNotificationShowFailedReasonAnalytics4 = new VoipNotificationShowFailedReasonAnalytics("DO_NOT_DISTURB_MODE", 3, "do_not_disturb_mode");
        DO_NOT_DISTURB_MODE = voipNotificationShowFailedReasonAnalytics4;
        VoipNotificationShowFailedReasonAnalytics[] voipNotificationShowFailedReasonAnalyticsArr = {voipNotificationShowFailedReasonAnalytics, voipNotificationShowFailedReasonAnalytics2, voipNotificationShowFailedReasonAnalytics3, voipNotificationShowFailedReasonAnalytics4};
        $VALUES = voipNotificationShowFailedReasonAnalyticsArr;
        $ENTRIES = new asp(voipNotificationShowFailedReasonAnalyticsArr);
    }

    public VoipNotificationShowFailedReasonAnalytics(String str, int i, String str2) {
        this.reason = str2;
    }

    public static VoipNotificationShowFailedReasonAnalytics valueOf(String str) {
        return (VoipNotificationShowFailedReasonAnalytics) Enum.valueOf(VoipNotificationShowFailedReasonAnalytics.class, str);
    }

    public static VoipNotificationShowFailedReasonAnalytics[] values() {
        return (VoipNotificationShowFailedReasonAnalytics[]) $VALUES.clone();
    }

    public final String h() {
        return this.reason;
    }
}
