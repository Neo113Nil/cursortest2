package com.vk.camera.editor.stories.impl.base;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseCameraEditorContract.kt */
/* loaded from: classes16.dex */
public final class BaseCameraEditorContract$ScreenState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseCameraEditorContract$ScreenState[] $VALUES;
    public static final BaseCameraEditorContract$ScreenState ADD_TEXT;
    public static final BaseCameraEditorContract$ScreenState BACKGROUND;
    public static final BaseCameraEditorContract$ScreenState DRAWING;
    public static final BaseCameraEditorContract$ScreenState EDITOR_MAIN_SCREEN;
    public static final BaseCameraEditorContract$ScreenState STICKERS_SELECTION;
    public static final BaseCameraEditorContract$ScreenState VERTICALIZATION;

    static {
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = new BaseCameraEditorContract$ScreenState("EDITOR_MAIN_SCREEN", 0);
        EDITOR_MAIN_SCREEN = baseCameraEditorContract$ScreenState;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState2 = new BaseCameraEditorContract$ScreenState("DRAWING", 1);
        DRAWING = baseCameraEditorContract$ScreenState2;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState3 = new BaseCameraEditorContract$ScreenState("STICKERS_SELECTION", 2);
        STICKERS_SELECTION = baseCameraEditorContract$ScreenState3;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState4 = new BaseCameraEditorContract$ScreenState("ADD_TEXT", 3);
        ADD_TEXT = baseCameraEditorContract$ScreenState4;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState5 = new BaseCameraEditorContract$ScreenState("BACKGROUND", 4);
        BACKGROUND = baseCameraEditorContract$ScreenState5;
        BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState6 = new BaseCameraEditorContract$ScreenState("VERTICALIZATION", 5);
        VERTICALIZATION = baseCameraEditorContract$ScreenState6;
        BaseCameraEditorContract$ScreenState[] baseCameraEditorContract$ScreenStateArr = {baseCameraEditorContract$ScreenState, baseCameraEditorContract$ScreenState2, baseCameraEditorContract$ScreenState3, baseCameraEditorContract$ScreenState4, baseCameraEditorContract$ScreenState5, baseCameraEditorContract$ScreenState6};
        $VALUES = baseCameraEditorContract$ScreenStateArr;
        $ENTRIES = new asp(baseCameraEditorContract$ScreenStateArr);
    }

    public BaseCameraEditorContract$ScreenState() {
        throw null;
    }

    public static BaseCameraEditorContract$ScreenState valueOf(String str) {
        return (BaseCameraEditorContract$ScreenState) Enum.valueOf(BaseCameraEditorContract$ScreenState.class, str);
    }

    public static BaseCameraEditorContract$ScreenState[] values() {
        return (BaseCameraEditorContract$ScreenState[]) $VALUES.clone();
    }
}
