package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSpinnerDefault.kt */
/* loaded from: classes17.dex */
public final class SpinnerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SpinnerState[] $VALUES;
    public static final SpinnerState Custom;
    public static final SpinnerState Done;
    public static final SpinnerState Error;
    public static final SpinnerState Loading;

    static {
        SpinnerState spinnerState = new SpinnerState("Error", 0);
        Error = spinnerState;
        SpinnerState spinnerState2 = new SpinnerState("Loading", 1);
        Loading = spinnerState2;
        SpinnerState spinnerState3 = new SpinnerState("Done", 2);
        Done = spinnerState3;
        SpinnerState spinnerState4 = new SpinnerState("Custom", 3);
        Custom = spinnerState4;
        SpinnerState[] spinnerStateArr = {spinnerState, spinnerState2, spinnerState3, spinnerState4};
        $VALUES = spinnerStateArr;
        $ENTRIES = new asp(spinnerStateArr);
    }

    public SpinnerState() {
        throw null;
    }

    public static zrp<SpinnerState> h() {
        return $ENTRIES;
    }

    public static SpinnerState valueOf(String str) {
        return (SpinnerState) Enum.valueOf(SpinnerState.class, str);
    }

    public static SpinnerState[] values() {
        return (SpinnerState[]) $VALUES.clone();
    }
}
