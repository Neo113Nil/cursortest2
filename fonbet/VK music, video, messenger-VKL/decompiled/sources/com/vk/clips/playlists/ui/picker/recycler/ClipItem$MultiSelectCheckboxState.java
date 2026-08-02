package com.vk.clips.playlists.ui.picker.recycler;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipItem.kt */
/* loaded from: classes16.dex */
public final class ClipItem$MultiSelectCheckboxState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipItem$MultiSelectCheckboxState[] $VALUES;
    public static final ClipItem$MultiSelectCheckboxState CHECKED;
    public static final ClipItem$MultiSelectCheckboxState HIDDEN;
    public static final ClipItem$MultiSelectCheckboxState UNCHECKED;

    static {
        ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState = new ClipItem$MultiSelectCheckboxState("HIDDEN", 0);
        HIDDEN = clipItem$MultiSelectCheckboxState;
        ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState2 = new ClipItem$MultiSelectCheckboxState("CHECKED", 1);
        CHECKED = clipItem$MultiSelectCheckboxState2;
        ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState3 = new ClipItem$MultiSelectCheckboxState("UNCHECKED", 2);
        UNCHECKED = clipItem$MultiSelectCheckboxState3;
        ClipItem$MultiSelectCheckboxState[] clipItem$MultiSelectCheckboxStateArr = {clipItem$MultiSelectCheckboxState, clipItem$MultiSelectCheckboxState2, clipItem$MultiSelectCheckboxState3};
        $VALUES = clipItem$MultiSelectCheckboxStateArr;
        $ENTRIES = new asp(clipItem$MultiSelectCheckboxStateArr);
    }

    public ClipItem$MultiSelectCheckboxState() {
        throw null;
    }

    public static ClipItem$MultiSelectCheckboxState valueOf(String str) {
        return (ClipItem$MultiSelectCheckboxState) Enum.valueOf(ClipItem$MultiSelectCheckboxState.class, str);
    }

    public static ClipItem$MultiSelectCheckboxState[] values() {
        return (ClipItem$MultiSelectCheckboxState[]) $VALUES.clone();
    }
}
