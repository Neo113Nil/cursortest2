package com.vk.core.compose.component.banner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Banner.kt */
/* loaded from: classes17.dex */
public final class Banner$VerticalAlignment {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Banner$VerticalAlignment[] $VALUES;
    public static final Banner$VerticalAlignment Center;
    public static final Banner$VerticalAlignment Top;

    static {
        Banner$VerticalAlignment banner$VerticalAlignment = new Banner$VerticalAlignment("Top", 0);
        Top = banner$VerticalAlignment;
        Banner$VerticalAlignment banner$VerticalAlignment2 = new Banner$VerticalAlignment("Center", 1);
        Center = banner$VerticalAlignment2;
        Banner$VerticalAlignment[] banner$VerticalAlignmentArr = {banner$VerticalAlignment, banner$VerticalAlignment2};
        $VALUES = banner$VerticalAlignmentArr;
        $ENTRIES = new asp(banner$VerticalAlignmentArr);
    }

    public Banner$VerticalAlignment() {
        throw null;
    }

    public static Banner$VerticalAlignment valueOf(String str) {
        return (Banner$VerticalAlignment) Enum.valueOf(Banner$VerticalAlignment.class, str);
    }

    public static Banner$VerticalAlignment[] values() {
        return (Banner$VerticalAlignment[]) $VALUES.clone();
    }
}
