package com.vk.games.presentation.utils;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HapticHelper.kt */
/* loaded from: classes17.dex */
public final class HapticHelper {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HapticHelper[] $VALUES;
    public static final HapticHelper LIGHT;
    public static final HapticHelper RIGID;
    public static final HapticHelper SUCCESS;
    private final int value;

    static {
        HapticHelper hapticHelper = new HapticHelper("SUCCESS", 0, 16);
        SUCCESS = hapticHelper;
        HapticHelper hapticHelper2 = new HapticHelper("RIGID", 1, 0);
        RIGID = hapticHelper2;
        HapticHelper hapticHelper3 = new HapticHelper("LIGHT", 2, 27);
        LIGHT = hapticHelper3;
        HapticHelper[] hapticHelperArr = {hapticHelper, hapticHelper2, hapticHelper3};
        $VALUES = hapticHelperArr;
        $ENTRIES = new asp(hapticHelperArr);
    }

    public HapticHelper(String str, int i, int i2) {
        this.value = i2;
    }

    public static HapticHelper valueOf(String str) {
        return (HapticHelper) Enum.valueOf(HapticHelper.class, str);
    }

    public static HapticHelper[] values() {
        return (HapticHelper[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
