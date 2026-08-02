package com.vk.voip.ui.call_list.scheduled;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduledScreenSharingMuteOption.kt */
/* loaded from: classes7.dex */
public final class ScheduledScreenSharingMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScheduledScreenSharingMuteOption[] $VALUES;
    public static final ScheduledScreenSharingMuteOption DisabledOnJoin;
    public static final ScheduledScreenSharingMuteOption DisabledPermanent;
    public static final ScheduledScreenSharingMuteOption Enabled;

    static {
        ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = new ScheduledScreenSharingMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = scheduledScreenSharingMuteOption;
        ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption2 = new ScheduledScreenSharingMuteOption("DisabledOnJoin", 1);
        DisabledOnJoin = scheduledScreenSharingMuteOption2;
        ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption3 = new ScheduledScreenSharingMuteOption("DisabledPermanent", 2);
        DisabledPermanent = scheduledScreenSharingMuteOption3;
        ScheduledScreenSharingMuteOption[] scheduledScreenSharingMuteOptionArr = {scheduledScreenSharingMuteOption, scheduledScreenSharingMuteOption2, scheduledScreenSharingMuteOption3};
        $VALUES = scheduledScreenSharingMuteOptionArr;
        $ENTRIES = new asp(scheduledScreenSharingMuteOptionArr);
    }

    public ScheduledScreenSharingMuteOption() {
        throw null;
    }

    public static ScheduledScreenSharingMuteOption valueOf(String str) {
        return (ScheduledScreenSharingMuteOption) Enum.valueOf(ScheduledScreenSharingMuteOption.class, str);
    }

    public static ScheduledScreenSharingMuteOption[] values() {
        return (ScheduledScreenSharingMuteOption[]) $VALUES.clone();
    }
}
