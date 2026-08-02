package com.vk.ecomm.cart.impl.common.ui.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Shimmer.kt */
/* loaded from: classes18.dex */
public final class TextHeight {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextHeight[] $VALUES;
    public static final TextHeight LARGE;
    public static final TextHeight MEDIUM;
    public static final TextHeight SMALL;
    private final float height;

    static {
        TextHeight textHeight = new TextHeight("SMALL", 0, 8);
        SMALL = textHeight;
        TextHeight textHeight2 = new TextHeight("MEDIUM", 1, 12);
        MEDIUM = textHeight2;
        TextHeight textHeight3 = new TextHeight("LARGE", 2, 16);
        LARGE = textHeight3;
        TextHeight[] textHeightArr = {textHeight, textHeight2, textHeight3};
        $VALUES = textHeightArr;
        $ENTRIES = new asp(textHeightArr);
    }

    public TextHeight(String str, int i, float f) {
        this.height = f;
    }

    public static TextHeight valueOf(String str) {
        return (TextHeight) Enum.valueOf(TextHeight.class, str);
    }

    public static TextHeight[] values() {
        return (TextHeight[]) $VALUES.clone();
    }

    public final float h() {
        return this.height;
    }
}
