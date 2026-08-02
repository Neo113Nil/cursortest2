package com.vk.voip.ui.scheduled.creation.feature.models;

import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipScheduledCallDuration.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallDuration {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipScheduledCallDuration[] $VALUES;
    public static final VoipScheduledCallDuration DAY;
    public static final VoipScheduledCallDuration HOUR;
    public static final VoipScheduledCallDuration HOURS_2;
    public static final VoipScheduledCallDuration HOURS_4;
    public static final VoipScheduledCallDuration MINUTES_30;
    public static final VoipScheduledCallDuration MINUTES_45;
    private final long durationInMs;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        VoipScheduledCallDuration voipScheduledCallDuration = new VoipScheduledCallDuration("DAY", 0, timeUnit.toMillis(timeUnit2.toMinutes(23L) + 59));
        DAY = voipScheduledCallDuration;
        VoipScheduledCallDuration voipScheduledCallDuration2 = new VoipScheduledCallDuration("MINUTES_30", 1, timeUnit.toMillis(30L));
        MINUTES_30 = voipScheduledCallDuration2;
        VoipScheduledCallDuration voipScheduledCallDuration3 = new VoipScheduledCallDuration("MINUTES_45", 2, timeUnit.toMillis(45L));
        MINUTES_45 = voipScheduledCallDuration3;
        VoipScheduledCallDuration voipScheduledCallDuration4 = new VoipScheduledCallDuration("HOUR", 3, timeUnit2.toMillis(1L));
        HOUR = voipScheduledCallDuration4;
        VoipScheduledCallDuration voipScheduledCallDuration5 = new VoipScheduledCallDuration("HOURS_2", 4, timeUnit2.toMillis(2L));
        HOURS_2 = voipScheduledCallDuration5;
        VoipScheduledCallDuration voipScheduledCallDuration6 = new VoipScheduledCallDuration("HOURS_4", 5, timeUnit2.toMillis(4L));
        HOURS_4 = voipScheduledCallDuration6;
        VoipScheduledCallDuration[] voipScheduledCallDurationArr = {voipScheduledCallDuration, voipScheduledCallDuration2, voipScheduledCallDuration3, voipScheduledCallDuration4, voipScheduledCallDuration5, voipScheduledCallDuration6};
        $VALUES = voipScheduledCallDurationArr;
        $ENTRIES = new asp(voipScheduledCallDurationArr);
    }

    public VoipScheduledCallDuration(String str, int i, long j) {
        this.durationInMs = j;
    }

    public static VoipScheduledCallDuration valueOf(String str) {
        return (VoipScheduledCallDuration) Enum.valueOf(VoipScheduledCallDuration.class, str);
    }

    public static VoipScheduledCallDuration[] values() {
        return (VoipScheduledCallDuration[]) $VALUES.clone();
    }

    public final long h() {
        return this.durationInMs;
    }
}
