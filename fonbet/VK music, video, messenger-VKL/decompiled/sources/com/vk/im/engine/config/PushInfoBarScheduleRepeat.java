package com.vk.im.engine.config;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PushInfoBarSchedule.kt */
/* loaded from: classes.dex */
public final class PushInfoBarScheduleRepeat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PushInfoBarScheduleRepeat[] $VALUES;
    public static final PushInfoBarScheduleRepeat CYCLE;
    public static final PushInfoBarScheduleRepeat REPEAT_LAST;
    public static final PushInfoBarScheduleRepeat STOP;

    static {
        PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat = new PushInfoBarScheduleRepeat("STOP", 0);
        STOP = pushInfoBarScheduleRepeat;
        PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat2 = new PushInfoBarScheduleRepeat("REPEAT_LAST", 1);
        REPEAT_LAST = pushInfoBarScheduleRepeat2;
        PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat3 = new PushInfoBarScheduleRepeat("CYCLE", 2);
        CYCLE = pushInfoBarScheduleRepeat3;
        PushInfoBarScheduleRepeat[] pushInfoBarScheduleRepeatArr = {pushInfoBarScheduleRepeat, pushInfoBarScheduleRepeat2, pushInfoBarScheduleRepeat3};
        $VALUES = pushInfoBarScheduleRepeatArr;
        $ENTRIES = new asp(pushInfoBarScheduleRepeatArr);
    }

    public PushInfoBarScheduleRepeat() {
        throw null;
    }

    public static PushInfoBarScheduleRepeat valueOf(String str) {
        return (PushInfoBarScheduleRepeat) Enum.valueOf(PushInfoBarScheduleRepeat.class, str);
    }

    public static PushInfoBarScheduleRepeat[] values() {
        return (PushInfoBarScheduleRepeat[]) $VALUES.clone();
    }
}
