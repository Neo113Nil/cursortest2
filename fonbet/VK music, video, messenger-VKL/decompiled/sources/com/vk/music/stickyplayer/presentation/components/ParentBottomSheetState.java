package com.vk.music.stickyplayer.presentation.components;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParentBottomSheetState.kt */
/* loaded from: classes3.dex */
public final class ParentBottomSheetState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ParentBottomSheetState[] $VALUES;
    public static final ParentBottomSheetState COLLAPSED;
    public static final ParentBottomSheetState EXPANDED;
    public static final ParentBottomSheetState HIDDEN;

    static {
        ParentBottomSheetState parentBottomSheetState = new ParentBottomSheetState("COLLAPSED", 0);
        COLLAPSED = parentBottomSheetState;
        ParentBottomSheetState parentBottomSheetState2 = new ParentBottomSheetState("EXPANDED", 1);
        EXPANDED = parentBottomSheetState2;
        ParentBottomSheetState parentBottomSheetState3 = new ParentBottomSheetState("HIDDEN", 2);
        HIDDEN = parentBottomSheetState3;
        ParentBottomSheetState[] parentBottomSheetStateArr = {parentBottomSheetState, parentBottomSheetState2, parentBottomSheetState3};
        $VALUES = parentBottomSheetStateArr;
        $ENTRIES = new asp(parentBottomSheetStateArr);
    }

    public ParentBottomSheetState() {
        throw null;
    }

    public static ParentBottomSheetState valueOf(String str) {
        return (ParentBottomSheetState) Enum.valueOf(ParentBottomSheetState.class, str);
    }

    public static ParentBottomSheetState[] values() {
        return (ParentBottomSheetState[]) $VALUES.clone();
    }
}
