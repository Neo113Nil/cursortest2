package com.vk.ads.easypromote.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EasyPromoteState.kt */
/* loaded from: classes14.dex */
public final class DurationOption {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DurationOption[] $VALUES;
    public static final DurationOption CUSTOM;
    public static final DurationOption DAYS_10;
    public static final DurationOption DAYS_5;
    public static final DurationOption DAYS_7;
    private final int value;

    static {
        DurationOption durationOption = new DurationOption("DAYS_5", 0, 5);
        DAYS_5 = durationOption;
        DurationOption durationOption2 = new DurationOption("DAYS_7", 1, 7);
        DAYS_7 = durationOption2;
        DurationOption durationOption3 = new DurationOption("DAYS_10", 2, 10);
        DAYS_10 = durationOption3;
        DurationOption durationOption4 = new DurationOption("CUSTOM", 3, -1);
        CUSTOM = durationOption4;
        DurationOption[] durationOptionArr = {durationOption, durationOption2, durationOption3, durationOption4};
        $VALUES = durationOptionArr;
        $ENTRIES = new asp(durationOptionArr);
    }

    public DurationOption(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<DurationOption> h() {
        return $ENTRIES;
    }

    public static DurationOption valueOf(String str) {
        return (DurationOption) Enum.valueOf(DurationOption.class, str);
    }

    public static DurationOption[] values() {
        return (DurationOption[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
