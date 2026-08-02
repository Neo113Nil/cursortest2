package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkDiagonalUserStackDefaults.kt */
/* loaded from: classes17.dex */
public final class DiagonalUserStackSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiagonalUserStackSize[] $VALUES;
    public static final DiagonalUserStackSize ExtraLarge;
    public static final DiagonalUserStackSize Large;
    public static final DiagonalUserStackSize Medium;
    public static final DiagonalUserStackSize Small;

    static {
        DiagonalUserStackSize diagonalUserStackSize = new DiagonalUserStackSize("Small", 0);
        Small = diagonalUserStackSize;
        DiagonalUserStackSize diagonalUserStackSize2 = new DiagonalUserStackSize("Medium", 1);
        Medium = diagonalUserStackSize2;
        DiagonalUserStackSize diagonalUserStackSize3 = new DiagonalUserStackSize("Large", 2);
        Large = diagonalUserStackSize3;
        DiagonalUserStackSize diagonalUserStackSize4 = new DiagonalUserStackSize("ExtraLarge", 3);
        ExtraLarge = diagonalUserStackSize4;
        DiagonalUserStackSize[] diagonalUserStackSizeArr = {diagonalUserStackSize, diagonalUserStackSize2, diagonalUserStackSize3, diagonalUserStackSize4};
        $VALUES = diagonalUserStackSizeArr;
        $ENTRIES = new asp(diagonalUserStackSizeArr);
    }

    public DiagonalUserStackSize() {
        throw null;
    }

    public static zrp<DiagonalUserStackSize> h() {
        return $ENTRIES;
    }

    public static DiagonalUserStackSize valueOf(String str) {
        return (DiagonalUserStackSize) Enum.valueOf(DiagonalUserStackSize.class, str);
    }

    public static DiagonalUserStackSize[] values() {
        return (DiagonalUserStackSize[]) $VALUES.clone();
    }
}
