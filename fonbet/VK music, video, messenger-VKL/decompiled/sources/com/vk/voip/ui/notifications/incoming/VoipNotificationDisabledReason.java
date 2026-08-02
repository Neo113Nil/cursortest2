package com.vk.voip.ui.notifications.incoming;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipNotificationDisabledReason.kt */
/* loaded from: classes7.dex */
public final class VoipNotificationDisabledReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipNotificationDisabledReason[] $VALUES;
    public static final VoipNotificationDisabledReason CHANNEL_DISABLED;
    public static final VoipNotificationDisabledReason DO_NOT_DISTURB_MODE;
    public static final VoipNotificationDisabledReason NOTIFICATIONS_DISABLED;
    public static final VoipNotificationDisabledReason NOTIFICATIONS_PAUSED;

    static {
        VoipNotificationDisabledReason voipNotificationDisabledReason = new VoipNotificationDisabledReason("NOTIFICATIONS_DISABLED", 0);
        NOTIFICATIONS_DISABLED = voipNotificationDisabledReason;
        VoipNotificationDisabledReason voipNotificationDisabledReason2 = new VoipNotificationDisabledReason("CHANNEL_DISABLED", 1);
        CHANNEL_DISABLED = voipNotificationDisabledReason2;
        VoipNotificationDisabledReason voipNotificationDisabledReason3 = new VoipNotificationDisabledReason("NOTIFICATIONS_PAUSED", 2);
        NOTIFICATIONS_PAUSED = voipNotificationDisabledReason3;
        VoipNotificationDisabledReason voipNotificationDisabledReason4 = new VoipNotificationDisabledReason("DO_NOT_DISTURB_MODE", 3);
        DO_NOT_DISTURB_MODE = voipNotificationDisabledReason4;
        VoipNotificationDisabledReason[] voipNotificationDisabledReasonArr = {voipNotificationDisabledReason, voipNotificationDisabledReason2, voipNotificationDisabledReason3, voipNotificationDisabledReason4};
        $VALUES = voipNotificationDisabledReasonArr;
        $ENTRIES = new asp(voipNotificationDisabledReasonArr);
    }

    public VoipNotificationDisabledReason() {
        throw null;
    }

    public static VoipNotificationDisabledReason valueOf(String str) {
        return (VoipNotificationDisabledReason) Enum.valueOf(VoipNotificationDisabledReason.class, str);
    }

    public static VoipNotificationDisabledReason[] values() {
        return (VoipNotificationDisabledReason[]) $VALUES.clone();
    }
}
