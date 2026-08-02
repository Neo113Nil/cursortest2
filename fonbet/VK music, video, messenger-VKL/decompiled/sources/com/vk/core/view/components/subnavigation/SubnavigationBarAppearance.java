package com.vk.core.view.components.subnavigation;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubnavigationBarAppearance.kt */
/* loaded from: classes17.dex */
public final class SubnavigationBarAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubnavigationBarAppearance[] $VALUES;
    public static final SubnavigationBarAppearance Accent;
    public static final SubnavigationBarAppearance Neutral;

    static {
        SubnavigationBarAppearance subnavigationBarAppearance = new SubnavigationBarAppearance("Neutral", 0);
        Neutral = subnavigationBarAppearance;
        SubnavigationBarAppearance subnavigationBarAppearance2 = new SubnavigationBarAppearance("Accent", 1);
        Accent = subnavigationBarAppearance2;
        SubnavigationBarAppearance[] subnavigationBarAppearanceArr = {subnavigationBarAppearance, subnavigationBarAppearance2};
        $VALUES = subnavigationBarAppearanceArr;
        $ENTRIES = new asp(subnavigationBarAppearanceArr);
    }

    public SubnavigationBarAppearance() {
        throw null;
    }

    public static SubnavigationBarAppearance valueOf(String str) {
        return (SubnavigationBarAppearance) Enum.valueOf(SubnavigationBarAppearance.class, str);
    }

    public static SubnavigationBarAppearance[] values() {
        return (SubnavigationBarAppearance[]) $VALUES.clone();
    }
}
