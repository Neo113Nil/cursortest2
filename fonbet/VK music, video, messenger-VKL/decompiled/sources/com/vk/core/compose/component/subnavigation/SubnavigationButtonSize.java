package com.vk.core.compose.component.subnavigation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSubnavigationButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class SubnavigationButtonSize {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubnavigationButtonSize[] $VALUES;
    public static final SubnavigationButtonSize Large;
    public static final SubnavigationButtonSize Medium;
    public static final SubnavigationButtonSize Small;

    static {
        SubnavigationButtonSize subnavigationButtonSize = new SubnavigationButtonSize("Small", 0);
        Small = subnavigationButtonSize;
        SubnavigationButtonSize subnavigationButtonSize2 = new SubnavigationButtonSize("Medium", 1);
        Medium = subnavigationButtonSize2;
        SubnavigationButtonSize subnavigationButtonSize3 = new SubnavigationButtonSize("Large", 2);
        Large = subnavigationButtonSize3;
        SubnavigationButtonSize[] subnavigationButtonSizeArr = {subnavigationButtonSize, subnavigationButtonSize2, subnavigationButtonSize3};
        $VALUES = subnavigationButtonSizeArr;
        $ENTRIES = new asp(subnavigationButtonSizeArr);
    }

    public SubnavigationButtonSize() {
        throw null;
    }

    public static zrp<SubnavigationButtonSize> h() {
        return $ENTRIES;
    }

    public static SubnavigationButtonSize valueOf(String str) {
        return (SubnavigationButtonSize) Enum.valueOf(SubnavigationButtonSize.class, str);
    }

    public static SubnavigationButtonSize[] values() {
        return (SubnavigationButtonSize[]) $VALUES.clone();
    }
}
