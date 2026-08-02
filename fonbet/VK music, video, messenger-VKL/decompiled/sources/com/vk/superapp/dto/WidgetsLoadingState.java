package com.vk.superapp.dto;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetsLoadingState.kt */
/* loaded from: classes6.dex */
public final class WidgetsLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WidgetsLoadingState[] $VALUES;
    public static final WidgetsLoadingState CACHE;
    public static final WidgetsLoadingState NETWORK;
    public static final WidgetsLoadingState SKELETON;

    static {
        WidgetsLoadingState widgetsLoadingState = new WidgetsLoadingState("SKELETON", 0);
        SKELETON = widgetsLoadingState;
        WidgetsLoadingState widgetsLoadingState2 = new WidgetsLoadingState("CACHE", 1);
        CACHE = widgetsLoadingState2;
        WidgetsLoadingState widgetsLoadingState3 = new WidgetsLoadingState("NETWORK", 2);
        NETWORK = widgetsLoadingState3;
        WidgetsLoadingState[] widgetsLoadingStateArr = {widgetsLoadingState, widgetsLoadingState2, widgetsLoadingState3};
        $VALUES = widgetsLoadingStateArr;
        $ENTRIES = new asp(widgetsLoadingStateArr);
    }

    public WidgetsLoadingState() {
        throw null;
    }

    public static WidgetsLoadingState valueOf(String str) {
        return (WidgetsLoadingState) Enum.valueOf(WidgetsLoadingState.class, str);
    }

    public static WidgetsLoadingState[] values() {
        return (WidgetsLoadingState[]) $VALUES.clone();
    }
}
