package com.vk.core.view.components.cell.button;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Appearance[] $VALUES;
    public static final Appearance Accent;
    public static final Appearance Negative;
    public static final Appearance Neutral;

    static {
        Appearance appearance = new Appearance("Accent", 0);
        Accent = appearance;
        Appearance appearance2 = new Appearance("Negative", 1);
        Negative = appearance2;
        Appearance appearance3 = new Appearance("Neutral", 2);
        Neutral = appearance3;
        Appearance[] appearanceArr = {appearance, appearance2, appearance3};
        $VALUES = appearanceArr;
        $ENTRIES = new asp(appearanceArr);
    }

    public Appearance() {
        throw null;
    }

    public static zrp<Appearance> h() {
        return $ENTRIES;
    }

    public static Appearance valueOf(String str) {
        return (Appearance) Enum.valueOf(Appearance.class, str);
    }

    public static Appearance[] values() {
        return (Appearance[]) $VALUES.clone();
    }
}
