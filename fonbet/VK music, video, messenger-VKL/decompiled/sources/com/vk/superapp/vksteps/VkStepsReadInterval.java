package com.vk.superapp.vksteps;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkStepsReadInterval.kt */
/* loaded from: classes6.dex */
public final class VkStepsReadInterval {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkStepsReadInterval[] $VALUES;
    public static final a Companion;
    public static final VkStepsReadInterval DAY;
    public static final VkStepsReadInterval HOUR;
    public static final VkStepsReadInterval MONTH;
    public static final VkStepsReadInterval WEEK;
    public static final VkStepsReadInterval YEAR;
    private final ChronoUnit chronoUnitEquivalent;
    private final TimeUnit googleFitBacketUnit;

    /* compiled from: VkStepsReadInterval.kt */
    public static final class a {
    }

    static {
        VkStepsReadInterval vkStepsReadInterval = new VkStepsReadInterval("HOUR", 0, ChronoUnit.HOURS, TimeUnit.HOURS);
        HOUR = vkStepsReadInterval;
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        TimeUnit timeUnit = TimeUnit.DAYS;
        VkStepsReadInterval vkStepsReadInterval2 = new VkStepsReadInterval("DAY", 1, chronoUnit, timeUnit);
        DAY = vkStepsReadInterval2;
        VkStepsReadInterval vkStepsReadInterval3 = new VkStepsReadInterval("WEEK", 2, ChronoUnit.WEEKS, timeUnit);
        WEEK = vkStepsReadInterval3;
        VkStepsReadInterval vkStepsReadInterval4 = new VkStepsReadInterval("MONTH", 3, ChronoUnit.MONTHS, timeUnit);
        MONTH = vkStepsReadInterval4;
        VkStepsReadInterval vkStepsReadInterval5 = new VkStepsReadInterval("YEAR", 4, ChronoUnit.YEARS, timeUnit);
        YEAR = vkStepsReadInterval5;
        VkStepsReadInterval[] vkStepsReadIntervalArr = {vkStepsReadInterval, vkStepsReadInterval2, vkStepsReadInterval3, vkStepsReadInterval4, vkStepsReadInterval5};
        $VALUES = vkStepsReadIntervalArr;
        $ENTRIES = new asp(vkStepsReadIntervalArr);
        Companion = new a();
    }

    public VkStepsReadInterval(String str, int i, ChronoUnit chronoUnit, TimeUnit timeUnit) {
        this.chronoUnitEquivalent = chronoUnit;
        this.googleFitBacketUnit = timeUnit;
    }

    public static VkStepsReadInterval valueOf(String str) {
        return (VkStepsReadInterval) Enum.valueOf(VkStepsReadInterval.class, str);
    }

    public static VkStepsReadInterval[] values() {
        return (VkStepsReadInterval[]) $VALUES.clone();
    }

    public final ChronoUnit h() {
        return this.chronoUnitEquivalent;
    }
}
