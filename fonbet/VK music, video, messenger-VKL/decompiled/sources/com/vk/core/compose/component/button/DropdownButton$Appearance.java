package com.vk.core.compose.component.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DropdownButton.kt */
/* loaded from: classes17.dex */
public final class DropdownButton$Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DropdownButton$Appearance[] $VALUES;
    public static final DropdownButton$Appearance Accent;
    public static final DropdownButton$Appearance Neutral;

    static {
        DropdownButton$Appearance dropdownButton$Appearance = new DropdownButton$Appearance("Accent", 0);
        Accent = dropdownButton$Appearance;
        DropdownButton$Appearance dropdownButton$Appearance2 = new DropdownButton$Appearance("Neutral", 1);
        Neutral = dropdownButton$Appearance2;
        DropdownButton$Appearance[] dropdownButton$AppearanceArr = {dropdownButton$Appearance, dropdownButton$Appearance2};
        $VALUES = dropdownButton$AppearanceArr;
        $ENTRIES = new asp(dropdownButton$AppearanceArr);
    }

    public DropdownButton$Appearance() {
        throw null;
    }

    public static zrp<DropdownButton$Appearance> h() {
        return $ENTRIES;
    }

    public static DropdownButton$Appearance valueOf(String str) {
        return (DropdownButton$Appearance) Enum.valueOf(DropdownButton$Appearance.class, str);
    }

    public static DropdownButton$Appearance[] values() {
        return (DropdownButton$Appearance[]) $VALUES.clone();
    }
}
