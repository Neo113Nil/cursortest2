package com.vk.catalog2.common.ui.core.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogProcessEditorCmd.kt */
/* loaded from: classes16.dex */
public final class EditorMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EditorMode[] $VALUES;
    public static final EditorMode ENTER_EDITOR_MODE;
    public static final EditorMode EXIT_EDITOR_MODE;
    public static final EditorMode EXIT_EDITOR_MODE_DISCARD;

    static {
        EditorMode editorMode = new EditorMode("ENTER_EDITOR_MODE", 0);
        ENTER_EDITOR_MODE = editorMode;
        EditorMode editorMode2 = new EditorMode("EXIT_EDITOR_MODE", 1);
        EXIT_EDITOR_MODE = editorMode2;
        EditorMode editorMode3 = new EditorMode("EXIT_EDITOR_MODE_DISCARD", 2);
        EXIT_EDITOR_MODE_DISCARD = editorMode3;
        EditorMode[] editorModeArr = {editorMode, editorMode2, editorMode3};
        $VALUES = editorModeArr;
        $ENTRIES = new asp(editorModeArr);
    }

    public EditorMode() {
        throw null;
    }

    public static EditorMode valueOf(String str) {
        return (EditorMode) Enum.valueOf(EditorMode.class, str);
    }

    public static EditorMode[] values() {
        return (EditorMode[]) $VALUES.clone();
    }
}
