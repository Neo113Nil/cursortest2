package com.vk.voip.ui.call_list.scheduled.feature.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduledCallRecurrence.kt */
/* loaded from: classes7.dex */
public final class ScheduledCallRecurrence {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScheduledCallRecurrence[] $VALUES;
    public static final ScheduledCallRecurrence DAILY;
    public static final ScheduledCallRecurrence MONTHLY;
    public static final ScheduledCallRecurrence NEVER;
    public static final ScheduledCallRecurrence WEEKDAYS;
    public static final ScheduledCallRecurrence WEEKEND;
    public static final ScheduledCallRecurrence WEEKLY;
    public static final ScheduledCallRecurrence YEARLY;

    static {
        ScheduledCallRecurrence scheduledCallRecurrence = new ScheduledCallRecurrence("NEVER", 0);
        NEVER = scheduledCallRecurrence;
        ScheduledCallRecurrence scheduledCallRecurrence2 = new ScheduledCallRecurrence("DAILY", 1);
        DAILY = scheduledCallRecurrence2;
        ScheduledCallRecurrence scheduledCallRecurrence3 = new ScheduledCallRecurrence("MONTHLY", 2);
        MONTHLY = scheduledCallRecurrence3;
        ScheduledCallRecurrence scheduledCallRecurrence4 = new ScheduledCallRecurrence("WEEKLY", 3);
        WEEKLY = scheduledCallRecurrence4;
        ScheduledCallRecurrence scheduledCallRecurrence5 = new ScheduledCallRecurrence("YEARLY", 4);
        YEARLY = scheduledCallRecurrence5;
        ScheduledCallRecurrence scheduledCallRecurrence6 = new ScheduledCallRecurrence("WEEKDAYS", 5);
        WEEKDAYS = scheduledCallRecurrence6;
        ScheduledCallRecurrence scheduledCallRecurrence7 = new ScheduledCallRecurrence("WEEKEND", 6);
        WEEKEND = scheduledCallRecurrence7;
        ScheduledCallRecurrence[] scheduledCallRecurrenceArr = {scheduledCallRecurrence, scheduledCallRecurrence2, scheduledCallRecurrence3, scheduledCallRecurrence4, scheduledCallRecurrence5, scheduledCallRecurrence6, scheduledCallRecurrence7};
        $VALUES = scheduledCallRecurrenceArr;
        $ENTRIES = new asp(scheduledCallRecurrenceArr);
    }

    public ScheduledCallRecurrence() {
        throw null;
    }

    public static ScheduledCallRecurrence valueOf(String str) {
        return (ScheduledCallRecurrence) Enum.valueOf(ScheduledCallRecurrence.class, str);
    }

    public static ScheduledCallRecurrence[] values() {
        return (ScheduledCallRecurrence[]) $VALUES.clone();
    }
}
