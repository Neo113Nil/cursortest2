package com.vk.dto.clips.upload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsEditorEntry.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorEntry {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsEditorEntry[] $VALUES;
    public static final ClipsEditorEntry CAMERA_BACK;
    public static final ClipsEditorEntry CAMERA_FRONT;
    public static final ClipsEditorEntry GALLERY;
    public static final ClipsEditorEntry MULTI;

    static {
        ClipsEditorEntry clipsEditorEntry = new ClipsEditorEntry("CAMERA_FRONT", 0);
        CAMERA_FRONT = clipsEditorEntry;
        ClipsEditorEntry clipsEditorEntry2 = new ClipsEditorEntry("CAMERA_BACK", 1);
        CAMERA_BACK = clipsEditorEntry2;
        ClipsEditorEntry clipsEditorEntry3 = new ClipsEditorEntry("GALLERY", 2);
        GALLERY = clipsEditorEntry3;
        ClipsEditorEntry clipsEditorEntry4 = new ClipsEditorEntry("MULTI", 3);
        MULTI = clipsEditorEntry4;
        ClipsEditorEntry[] clipsEditorEntryArr = {clipsEditorEntry, clipsEditorEntry2, clipsEditorEntry3, clipsEditorEntry4};
        $VALUES = clipsEditorEntryArr;
        $ENTRIES = new asp(clipsEditorEntryArr);
    }

    public ClipsEditorEntry() {
        throw null;
    }

    public static ClipsEditorEntry valueOf(String str) {
        return (ClipsEditorEntry) Enum.valueOf(ClipsEditorEntry.class, str);
    }

    public static ClipsEditorEntry[] values() {
        return (ClipsEditorEntry[]) $VALUES.clone();
    }
}
