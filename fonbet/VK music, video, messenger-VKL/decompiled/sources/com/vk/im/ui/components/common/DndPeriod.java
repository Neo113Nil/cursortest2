package com.vk.im.ui.components.common;

import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.xuo0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DndPeriod.kt */
/* loaded from: classes2.dex */
public final class DndPeriod {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DndPeriod[] $VALUES;
    public static final DndPeriod DAY;
    public static final DndPeriod FOREVER;
    public static final DndPeriod HOUR;
    public static final DndPeriod HOURS_8;
    public static final DndPeriod NEVER;
    public static final DndPeriod WEEK;
    private final long duration;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        DndPeriod dndPeriod = new DndPeriod("HOUR", 0, timeUnit.toMillis(1L));
        HOUR = dndPeriod;
        DndPeriod dndPeriod2 = new DndPeriod("HOURS_8", 1, timeUnit.toMillis(8L));
        HOURS_8 = dndPeriod2;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        DndPeriod dndPeriod3 = new DndPeriod("DAY", 2, timeUnit2.toMillis(1L));
        DAY = dndPeriod3;
        DndPeriod dndPeriod4 = new DndPeriod("WEEK", 3, timeUnit2.toMillis(7L));
        WEEK = dndPeriod4;
        DndPeriod dndPeriod5 = new DndPeriod("FOREVER", 4, -1L);
        FOREVER = dndPeriod5;
        DndPeriod dndPeriod6 = new DndPeriod("NEVER", 5, 0L);
        NEVER = dndPeriod6;
        DndPeriod[] dndPeriodArr = {dndPeriod, dndPeriod2, dndPeriod3, dndPeriod4, dndPeriod5, dndPeriod6};
        $VALUES = dndPeriodArr;
        $ENTRIES = new asp(dndPeriodArr);
    }

    public DndPeriod(String str, int i, long j) {
        this.duration = j;
    }

    public static DndPeriod valueOf(String str) {
        return (DndPeriod) Enum.valueOf(DndPeriod.class, str);
    }

    public static DndPeriod[] values() {
        return (DndPeriod[]) $VALUES.clone();
    }

    public final long h() {
        if (this == FOREVER || this == NEVER) {
            return this.duration;
        }
        long j = this.duration;
        xuo0.a.getClass();
        return xuo0.a() + j;
    }

    public final long i() {
        return this.duration;
    }
}
