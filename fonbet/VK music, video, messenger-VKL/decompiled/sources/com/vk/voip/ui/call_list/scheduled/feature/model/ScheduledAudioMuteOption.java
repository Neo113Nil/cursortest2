package com.vk.voip.ui.call_list.scheduled.feature.model;

import org.webrtc.PeerConnectionFactory;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduledAudioMuteOption.kt */
/* loaded from: classes7.dex */
public final class ScheduledAudioMuteOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScheduledAudioMuteOption[] $VALUES;
    public static final ScheduledAudioMuteOption Enabled;
    public static final ScheduledAudioMuteOption MutedOnJoin;
    public static final ScheduledAudioMuteOption MutedPermanent;

    static {
        ScheduledAudioMuteOption scheduledAudioMuteOption = new ScheduledAudioMuteOption(PeerConnectionFactory.TRIAL_ENABLED, 0);
        Enabled = scheduledAudioMuteOption;
        ScheduledAudioMuteOption scheduledAudioMuteOption2 = new ScheduledAudioMuteOption("MutedOnJoin", 1);
        MutedOnJoin = scheduledAudioMuteOption2;
        ScheduledAudioMuteOption scheduledAudioMuteOption3 = new ScheduledAudioMuteOption("MutedPermanent", 2);
        MutedPermanent = scheduledAudioMuteOption3;
        ScheduledAudioMuteOption[] scheduledAudioMuteOptionArr = {scheduledAudioMuteOption, scheduledAudioMuteOption2, scheduledAudioMuteOption3};
        $VALUES = scheduledAudioMuteOptionArr;
        $ENTRIES = new asp(scheduledAudioMuteOptionArr);
    }

    public ScheduledAudioMuteOption() {
        throw null;
    }

    public static ScheduledAudioMuteOption valueOf(String str) {
        return (ScheduledAudioMuteOption) Enum.valueOf(ScheduledAudioMuteOption.class, str);
    }

    public static ScheduledAudioMuteOption[] values() {
        return (ScheduledAudioMuteOption[]) $VALUES.clone();
    }
}
