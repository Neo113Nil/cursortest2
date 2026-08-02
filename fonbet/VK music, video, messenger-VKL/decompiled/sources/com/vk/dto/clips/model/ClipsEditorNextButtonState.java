package com.vk.dto.clips.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsEditorNextButtonState.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorNextButtonState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsEditorNextButtonState[] $VALUES;
    public static final ClipsEditorNextButtonState Next;
    public static final ClipsEditorNextButtonState Ready;

    static {
        ClipsEditorNextButtonState clipsEditorNextButtonState = new ClipsEditorNextButtonState("Ready", 0);
        Ready = clipsEditorNextButtonState;
        ClipsEditorNextButtonState clipsEditorNextButtonState2 = new ClipsEditorNextButtonState("Next", 1);
        Next = clipsEditorNextButtonState2;
        ClipsEditorNextButtonState[] clipsEditorNextButtonStateArr = {clipsEditorNextButtonState, clipsEditorNextButtonState2};
        $VALUES = clipsEditorNextButtonStateArr;
        $ENTRIES = new asp(clipsEditorNextButtonStateArr);
    }

    public ClipsEditorNextButtonState() {
        throw null;
    }

    public static ClipsEditorNextButtonState valueOf(String str) {
        return (ClipsEditorNextButtonState) Enum.valueOf(ClipsEditorNextButtonState.class, str);
    }

    public static ClipsEditorNextButtonState[] values() {
        return (ClipsEditorNextButtonState[]) $VALUES.clone();
    }
}
