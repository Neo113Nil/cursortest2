package com.vk.im.ui.components.common;

import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.xuo0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DndPeriodAndSound.kt */
/* loaded from: classes2.dex */
public final class DndPeriodAndSound {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DndPeriodAndSound[] $VALUES;
    public static final DndPeriodAndSound DAY;
    public static final DndPeriodAndSound DISABLED_SOUND;
    public static final DndPeriodAndSound ENABLE_SOUND;
    public static final DndPeriodAndSound FOREVER;
    public static final DndPeriodAndSound HOUR;
    public static final DndPeriodAndSound HOURS_8;
    public static final DndPeriodAndSound NEVER;
    public static final DndPeriodAndSound WEEK;
    private final long duration;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        DndPeriodAndSound dndPeriodAndSound = new DndPeriodAndSound("HOUR", 0, timeUnit.toMillis(1L));
        HOUR = dndPeriodAndSound;
        DndPeriodAndSound dndPeriodAndSound2 = new DndPeriodAndSound("HOURS_8", 1, timeUnit.toMillis(8L));
        HOURS_8 = dndPeriodAndSound2;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        DndPeriodAndSound dndPeriodAndSound3 = new DndPeriodAndSound("DAY", 2, timeUnit2.toMillis(1L));
        DAY = dndPeriodAndSound3;
        DndPeriodAndSound dndPeriodAndSound4 = new DndPeriodAndSound("WEEK", 3, timeUnit2.toMillis(7L));
        WEEK = dndPeriodAndSound4;
        DndPeriodAndSound dndPeriodAndSound5 = new DndPeriodAndSound("FOREVER", 4, -1L);
        FOREVER = dndPeriodAndSound5;
        DndPeriodAndSound dndPeriodAndSound6 = new DndPeriodAndSound("DISABLED_SOUND", 5, 0L);
        DISABLED_SOUND = dndPeriodAndSound6;
        DndPeriodAndSound dndPeriodAndSound7 = new DndPeriodAndSound("ENABLE_SOUND", 6, 0L);
        ENABLE_SOUND = dndPeriodAndSound7;
        DndPeriodAndSound dndPeriodAndSound8 = new DndPeriodAndSound("NEVER", 7, 0L);
        NEVER = dndPeriodAndSound8;
        DndPeriodAndSound[] dndPeriodAndSoundArr = {dndPeriodAndSound, dndPeriodAndSound2, dndPeriodAndSound3, dndPeriodAndSound4, dndPeriodAndSound5, dndPeriodAndSound6, dndPeriodAndSound7, dndPeriodAndSound8};
        $VALUES = dndPeriodAndSoundArr;
        $ENTRIES = new asp(dndPeriodAndSoundArr);
    }

    public DndPeriodAndSound(String str, int i, long j) {
        this.duration = j;
    }

    public static DndPeriodAndSound valueOf(String str) {
        return (DndPeriodAndSound) Enum.valueOf(DndPeriodAndSound.class, str);
    }

    public static DndPeriodAndSound[] values() {
        return (DndPeriodAndSound[]) $VALUES.clone();
    }

    public final long h() {
        if (this == FOREVER || this == NEVER || this == DISABLED_SOUND || this == ENABLE_SOUND) {
            return this.duration;
        }
        long j = this.duration;
        xuo0.a.getClass();
        return xuo0.a() + j;
    }
}
