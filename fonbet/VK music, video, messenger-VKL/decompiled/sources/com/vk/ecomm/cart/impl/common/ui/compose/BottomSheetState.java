package com.vk.ecomm.cart.impl.common.ui.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetLayout.kt */
/* loaded from: classes18.dex */
public final class BottomSheetState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BottomSheetState[] $VALUES;
    public static final BottomSheetState Collapsed;
    public static final BottomSheetState Expanded;

    static {
        BottomSheetState bottomSheetState = new BottomSheetState("Collapsed", 0);
        Collapsed = bottomSheetState;
        BottomSheetState bottomSheetState2 = new BottomSheetState("Expanded", 1);
        Expanded = bottomSheetState2;
        BottomSheetState[] bottomSheetStateArr = {bottomSheetState, bottomSheetState2};
        $VALUES = bottomSheetStateArr;
        $ENTRIES = new asp(bottomSheetStateArr);
    }

    public BottomSheetState() {
        throw null;
    }

    public static BottomSheetState valueOf(String str) {
        return (BottomSheetState) Enum.valueOf(BottomSheetState.class, str);
    }

    public static BottomSheetState[] values() {
        return (BottomSheetState[]) $VALUES.clone();
    }
}
