package com.vk.voip.ui.call_list.scheduled.feature.model;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduledVideoMuteOption.kt */
/* loaded from: classes7.dex */
public final class ScheduledVideoMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScheduledVideoMuteOption[] $VALUES;
    public static final ScheduledVideoMuteOption DisabledOnJoin;
    public static final ScheduledVideoMuteOption DisabledPermanent;
    public static final ScheduledVideoMuteOption Enabled;

    static {
        ScheduledVideoMuteOption scheduledVideoMuteOption = new ScheduledVideoMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = scheduledVideoMuteOption;
        ScheduledVideoMuteOption scheduledVideoMuteOption2 = new ScheduledVideoMuteOption("DisabledOnJoin", 1);
        DisabledOnJoin = scheduledVideoMuteOption2;
        ScheduledVideoMuteOption scheduledVideoMuteOption3 = new ScheduledVideoMuteOption("DisabledPermanent", 2);
        DisabledPermanent = scheduledVideoMuteOption3;
        ScheduledVideoMuteOption[] scheduledVideoMuteOptionArr = {scheduledVideoMuteOption, scheduledVideoMuteOption2, scheduledVideoMuteOption3};
        $VALUES = scheduledVideoMuteOptionArr;
        $ENTRIES = new asp(scheduledVideoMuteOptionArr);
    }

    public ScheduledVideoMuteOption() {
        throw null;
    }

    public static ScheduledVideoMuteOption valueOf(String str) {
        return (ScheduledVideoMuteOption) Enum.valueOf(ScheduledVideoMuteOption.class, str);
    }

    public static ScheduledVideoMuteOption[] values() {
        return (ScheduledVideoMuteOption[]) $VALUES.clone();
    }
}
