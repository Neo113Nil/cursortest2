package com.vk.core.compose.component.defaults;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeparatorDefaults.kt */
/* loaded from: classes17.dex */
public final class SeparatorAppearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SeparatorAppearance[] $VALUES;
    public static final SeparatorAppearance Primary;
    public static final SeparatorAppearance PrimaryAlpha;
    public static final SeparatorAppearance Secondary;

    static {
        SeparatorAppearance separatorAppearance = new SeparatorAppearance("PrimaryAlpha", 0);
        PrimaryAlpha = separatorAppearance;
        SeparatorAppearance separatorAppearance2 = new SeparatorAppearance("Primary", 1);
        Primary = separatorAppearance2;
        SeparatorAppearance separatorAppearance3 = new SeparatorAppearance("Secondary", 2);
        Secondary = separatorAppearance3;
        SeparatorAppearance[] separatorAppearanceArr = {separatorAppearance, separatorAppearance2, separatorAppearance3};
        $VALUES = separatorAppearanceArr;
        $ENTRIES = new asp(separatorAppearanceArr);
    }

    public SeparatorAppearance() {
        throw null;
    }

    public static zrp<SeparatorAppearance> h() {
        return $ENTRIES;
    }

    public static SeparatorAppearance valueOf(String str) {
        return (SeparatorAppearance) Enum.valueOf(SeparatorAppearance.class, str);
    }

    public static SeparatorAppearance[] values() {
        return (SeparatorAppearance[]) $VALUES.clone();
    }
}
