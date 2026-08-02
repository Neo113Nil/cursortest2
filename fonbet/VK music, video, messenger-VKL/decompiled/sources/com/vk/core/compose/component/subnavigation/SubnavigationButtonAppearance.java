package com.vk.core.compose.component.subnavigation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkSubnavigationButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class SubnavigationButtonAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubnavigationButtonAppearance[] $VALUES;
    public static final SubnavigationButtonAppearance Accent;
    public static final SubnavigationButtonAppearance Inherit;
    public static final SubnavigationButtonAppearance Neutral;

    static {
        SubnavigationButtonAppearance subnavigationButtonAppearance = new SubnavigationButtonAppearance("Inherit", 0);
        Inherit = subnavigationButtonAppearance;
        SubnavigationButtonAppearance subnavigationButtonAppearance2 = new SubnavigationButtonAppearance("Neutral", 1);
        Neutral = subnavigationButtonAppearance2;
        SubnavigationButtonAppearance subnavigationButtonAppearance3 = new SubnavigationButtonAppearance("Accent", 2);
        Accent = subnavigationButtonAppearance3;
        SubnavigationButtonAppearance[] subnavigationButtonAppearanceArr = {subnavigationButtonAppearance, subnavigationButtonAppearance2, subnavigationButtonAppearance3};
        $VALUES = subnavigationButtonAppearanceArr;
        $ENTRIES = new asp(subnavigationButtonAppearanceArr);
    }

    public SubnavigationButtonAppearance() {
        throw null;
    }

    public static zrp<SubnavigationButtonAppearance> h() {
        return $ENTRIES;
    }

    public static SubnavigationButtonAppearance valueOf(String str) {
        return (SubnavigationButtonAppearance) Enum.valueOf(SubnavigationButtonAppearance.class, str);
    }

    public static SubnavigationButtonAppearance[] values() {
        return (SubnavigationButtonAppearance[]) $VALUES.clone();
    }
}
