package com.vk.core.compose.component.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public final class Banner$Notification$Appearance {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Banner$Notification$Appearance[] $VALUES;
    public static final Banner$Notification$Appearance Negative;
    public static final Banner$Notification$Appearance Neutral;
    public static final Banner$Notification$Appearance Positive;
    public static final Banner$Notification$Appearance Warning;

    static {
        Banner$Notification$Appearance banner$Notification$Appearance = new Banner$Notification$Appearance("Neutral", 0);
        Neutral = banner$Notification$Appearance;
        Banner$Notification$Appearance banner$Notification$Appearance2 = new Banner$Notification$Appearance("Warning", 1);
        Warning = banner$Notification$Appearance2;
        Banner$Notification$Appearance banner$Notification$Appearance3 = new Banner$Notification$Appearance("Negative", 2);
        Negative = banner$Notification$Appearance3;
        Banner$Notification$Appearance banner$Notification$Appearance4 = new Banner$Notification$Appearance("Positive", 3);
        Positive = banner$Notification$Appearance4;
        Banner$Notification$Appearance[] banner$Notification$AppearanceArr = {banner$Notification$Appearance, banner$Notification$Appearance2, banner$Notification$Appearance3, banner$Notification$Appearance4};
        $VALUES = banner$Notification$AppearanceArr;
        $ENTRIES = new asp(banner$Notification$AppearanceArr);
    }

    public Banner$Notification$Appearance() {
        throw null;
    }

    public static zrp<Banner$Notification$Appearance> h() {
        return $ENTRIES;
    }

    public static Banner$Notification$Appearance valueOf(String str) {
        return (Banner$Notification$Appearance) Enum.valueOf(Banner$Notification$Appearance.class, str);
    }

    public static Banner$Notification$Appearance[] values() {
        return (Banner$Notification$Appearance[]) $VALUES.clone();
    }
}
