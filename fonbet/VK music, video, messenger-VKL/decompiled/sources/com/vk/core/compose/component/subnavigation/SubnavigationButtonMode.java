package com.vk.core.compose.component.subnavigation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSubnavigationButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class SubnavigationButtonMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubnavigationButtonMode[] $VALUES;
    public static final SubnavigationButtonMode Outline;
    public static final SubnavigationButtonMode Primary;
    public static final SubnavigationButtonMode Secondary;
    public static final SubnavigationButtonMode Tertiary;

    static {
        SubnavigationButtonMode subnavigationButtonMode = new SubnavigationButtonMode("Primary", 0);
        Primary = subnavigationButtonMode;
        SubnavigationButtonMode subnavigationButtonMode2 = new SubnavigationButtonMode("Secondary", 1);
        Secondary = subnavigationButtonMode2;
        SubnavigationButtonMode subnavigationButtonMode3 = new SubnavigationButtonMode("Outline", 2);
        Outline = subnavigationButtonMode3;
        SubnavigationButtonMode subnavigationButtonMode4 = new SubnavigationButtonMode("Tertiary", 3);
        Tertiary = subnavigationButtonMode4;
        SubnavigationButtonMode[] subnavigationButtonModeArr = {subnavigationButtonMode, subnavigationButtonMode2, subnavigationButtonMode3, subnavigationButtonMode4};
        $VALUES = subnavigationButtonModeArr;
        $ENTRIES = new asp(subnavigationButtonModeArr);
    }

    public SubnavigationButtonMode() {
        throw null;
    }

    public static zrp<SubnavigationButtonMode> h() {
        return $ENTRIES;
    }

    public static SubnavigationButtonMode valueOf(String str) {
        return (SubnavigationButtonMode) Enum.valueOf(SubnavigationButtonMode.class, str);
    }

    public static SubnavigationButtonMode[] values() {
        return (SubnavigationButtonMode[]) $VALUES.clone();
    }
}
