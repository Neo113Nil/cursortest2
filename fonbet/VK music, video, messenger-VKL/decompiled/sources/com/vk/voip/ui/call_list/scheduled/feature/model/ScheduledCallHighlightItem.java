package com.vk.voip.ui.call_list.scheduled.feature.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduledCallHighlightItem.kt */
/* loaded from: classes7.dex */
public final class ScheduledCallHighlightItem {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ScheduledCallHighlightItem[] $VALUES;
    public static final ScheduledCallHighlightItem NAME;

    static {
        ScheduledCallHighlightItem scheduledCallHighlightItem = new ScheduledCallHighlightItem("NAME", 0);
        NAME = scheduledCallHighlightItem;
        ScheduledCallHighlightItem[] scheduledCallHighlightItemArr = {scheduledCallHighlightItem};
        $VALUES = scheduledCallHighlightItemArr;
        $ENTRIES = new asp(scheduledCallHighlightItemArr);
    }

    public ScheduledCallHighlightItem() {
        throw null;
    }

    public static ScheduledCallHighlightItem valueOf(String str) {
        return (ScheduledCallHighlightItem) Enum.valueOf(ScheduledCallHighlightItem.class, str);
    }

    public static ScheduledCallHighlightItem[] values() {
        return (ScheduledCallHighlightItem[]) $VALUES.clone();
    }
}
