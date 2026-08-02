package com.vk.core.ui.adapter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecyclerViewState.kt */
/* loaded from: classes17.dex */
public final class RecyclerViewState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecyclerViewState[] $VALUES;
    public static final RecyclerViewState CANT_SCROLL;
    public static final RecyclerViewState CAN_SCROLL_BOTH;
    public static final RecyclerViewState CAN_SCROLL_BOTTOM;
    public static final RecyclerViewState CAN_SCROLL_TOP;

    static {
        RecyclerViewState recyclerViewState = new RecyclerViewState("CAN_SCROLL_TOP", 0);
        CAN_SCROLL_TOP = recyclerViewState;
        RecyclerViewState recyclerViewState2 = new RecyclerViewState("CAN_SCROLL_BOTTOM", 1);
        CAN_SCROLL_BOTTOM = recyclerViewState2;
        RecyclerViewState recyclerViewState3 = new RecyclerViewState("CAN_SCROLL_BOTH", 2);
        CAN_SCROLL_BOTH = recyclerViewState3;
        RecyclerViewState recyclerViewState4 = new RecyclerViewState("CANT_SCROLL", 3);
        CANT_SCROLL = recyclerViewState4;
        RecyclerViewState[] recyclerViewStateArr = {recyclerViewState, recyclerViewState2, recyclerViewState3, recyclerViewState4};
        $VALUES = recyclerViewStateArr;
        $ENTRIES = new asp(recyclerViewStateArr);
    }

    public RecyclerViewState() {
        throw null;
    }

    public static RecyclerViewState valueOf(String str) {
        return (RecyclerViewState) Enum.valueOf(RecyclerViewState.class, str);
    }

    public static RecyclerViewState[] values() {
        return (RecyclerViewState[]) $VALUES.clone();
    }
}
