package com.vk.clips.favorites.impl.ui.folders.content.recycler;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsFavoriteFolderContentListItem.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState[] $VALUES;
    public static final ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState CHECKED;
    public static final ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState HIDDEN;
    public static final ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState UNCHECKED;

    static {
        ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState = new ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState("HIDDEN", 0);
        HIDDEN = clipsFavoriteFolderContentListItem$MultiSelectCheckboxState;
        ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState2 = new ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState("CHECKED", 1);
        CHECKED = clipsFavoriteFolderContentListItem$MultiSelectCheckboxState2;
        ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState clipsFavoriteFolderContentListItem$MultiSelectCheckboxState3 = new ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState("UNCHECKED", 2);
        UNCHECKED = clipsFavoriteFolderContentListItem$MultiSelectCheckboxState3;
        ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState[] clipsFavoriteFolderContentListItem$MultiSelectCheckboxStateArr = {clipsFavoriteFolderContentListItem$MultiSelectCheckboxState, clipsFavoriteFolderContentListItem$MultiSelectCheckboxState2, clipsFavoriteFolderContentListItem$MultiSelectCheckboxState3};
        $VALUES = clipsFavoriteFolderContentListItem$MultiSelectCheckboxStateArr;
        $ENTRIES = new asp(clipsFavoriteFolderContentListItem$MultiSelectCheckboxStateArr);
    }

    public ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState() {
        throw null;
    }

    public static ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState valueOf(String str) {
        return (ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState) Enum.valueOf(ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState.class, str);
    }

    public static ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState[] values() {
        return (ClipsFavoriteFolderContentListItem$MultiSelectCheckboxState[]) $VALUES.clone();
    }
}
