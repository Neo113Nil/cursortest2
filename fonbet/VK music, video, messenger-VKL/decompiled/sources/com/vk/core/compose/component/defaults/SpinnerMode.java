package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSpinnerDefault.kt */
/* loaded from: classes17.dex */
public final class SpinnerMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpinnerMode[] $VALUES;
    public static final SpinnerMode Overlay;
    public static final SpinnerMode Shadow;

    static {
        SpinnerMode spinnerMode = new SpinnerMode("Shadow", 0);
        Shadow = spinnerMode;
        SpinnerMode spinnerMode2 = new SpinnerMode("Overlay", 1);
        Overlay = spinnerMode2;
        SpinnerMode[] spinnerModeArr = {spinnerMode, spinnerMode2};
        $VALUES = spinnerModeArr;
        $ENTRIES = new asp(spinnerModeArr);
    }

    public SpinnerMode() {
        throw null;
    }

    public static zrp<SpinnerMode> h() {
        return $ENTRIES;
    }

    public static SpinnerMode valueOf(String str) {
        return (SpinnerMode) Enum.valueOf(SpinnerMode.class, str);
    }

    public static SpinnerMode[] values() {
        return (SpinnerMode[]) $VALUES.clone();
    }
}
