package com.vk.core.compose.component.input;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkTextFieldContainer.kt */
/* loaded from: classes17.dex */
public final class DropdownSide {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DropdownSide[] $VALUES;
    public static final DropdownSide Above;
    public static final DropdownSide Bottom;

    static {
        DropdownSide dropdownSide = new DropdownSide("Bottom", 0);
        Bottom = dropdownSide;
        DropdownSide dropdownSide2 = new DropdownSide("Above", 1);
        Above = dropdownSide2;
        DropdownSide[] dropdownSideArr = {dropdownSide, dropdownSide2};
        $VALUES = dropdownSideArr;
        $ENTRIES = new asp(dropdownSideArr);
    }

    public DropdownSide() {
        throw null;
    }

    public static DropdownSide valueOf(String str) {
        return (DropdownSide) Enum.valueOf(DropdownSide.class, str);
    }

    public static DropdownSide[] values() {
        return (DropdownSide[]) $VALUES.clone();
    }
}
