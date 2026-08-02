package com.vk.core.compose.component.datetime;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTemporalPicker.kt */
/* loaded from: classes17.dex */
public final class EditingMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EditingMode[] $VALUES;
    public static final EditingMode Keyboard;
    public static final EditingMode Picker;

    static {
        EditingMode editingMode = new EditingMode("Keyboard", 0);
        Keyboard = editingMode;
        EditingMode editingMode2 = new EditingMode("Picker", 1);
        Picker = editingMode2;
        EditingMode[] editingModeArr = {editingMode, editingMode2};
        $VALUES = editingModeArr;
        $ENTRIES = new asp(editingModeArr);
    }

    public EditingMode() {
        throw null;
    }

    public static zrp<EditingMode> h() {
        return $ENTRIES;
    }

    public static EditingMode valueOf(String str) {
        return (EditingMode) Enum.valueOf(EditingMode.class, str);
    }

    public static EditingMode[] values() {
        return (EditingMode[]) $VALUES.clone();
    }
}
