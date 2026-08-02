package com.vk.core.compose.component.image.badge;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BadgeAlignment.kt */
/* loaded from: classes17.dex */
public final class BadgeAlignment {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BadgeAlignment[] $VALUES;
    public static final BadgeAlignment BottomLeft;
    public static final BadgeAlignment BottomRight;
    public static final BadgeAlignment TopLeft;
    public static final BadgeAlignment TopRight;

    static {
        BadgeAlignment badgeAlignment = new BadgeAlignment("TopLeft", 0);
        TopLeft = badgeAlignment;
        BadgeAlignment badgeAlignment2 = new BadgeAlignment("TopRight", 1);
        TopRight = badgeAlignment2;
        BadgeAlignment badgeAlignment3 = new BadgeAlignment("BottomLeft", 2);
        BottomLeft = badgeAlignment3;
        BadgeAlignment badgeAlignment4 = new BadgeAlignment("BottomRight", 3);
        BottomRight = badgeAlignment4;
        BadgeAlignment[] badgeAlignmentArr = {badgeAlignment, badgeAlignment2, badgeAlignment3, badgeAlignment4};
        $VALUES = badgeAlignmentArr;
        $ENTRIES = new asp(badgeAlignmentArr);
    }

    public BadgeAlignment() {
        throw null;
    }

    public static zrp<BadgeAlignment> h() {
        return $ENTRIES;
    }

    public static BadgeAlignment valueOf(String str) {
        return (BadgeAlignment) Enum.valueOf(BadgeAlignment.class, str);
    }

    public static BadgeAlignment[] values() {
        return (BadgeAlignment[]) $VALUES.clone();
    }
}
