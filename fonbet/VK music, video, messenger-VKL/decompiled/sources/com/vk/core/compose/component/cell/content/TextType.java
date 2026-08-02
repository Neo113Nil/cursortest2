package com.vk.core.compose.component.cell.content;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SexyMiddleTextImpl.kt */
/* loaded from: classes17.dex */
public final class TextType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextType[] $VALUES;
    public static final TextType Description;
    public static final TextType ExtraSubtitle;
    public static final TextType Overtitle;
    public static final TextType Subtitle;
    public static final TextType Title;

    static {
        TextType textType = new TextType("Overtitle", 0);
        Overtitle = textType;
        TextType textType2 = new TextType("Title", 1);
        Title = textType2;
        TextType textType3 = new TextType("Subtitle", 2);
        Subtitle = textType3;
        TextType textType4 = new TextType("ExtraSubtitle", 3);
        ExtraSubtitle = textType4;
        TextType textType5 = new TextType("Description", 4);
        Description = textType5;
        TextType[] textTypeArr = {textType, textType2, textType3, textType4, textType5};
        $VALUES = textTypeArr;
        $ENTRIES = new asp(textTypeArr);
    }

    public TextType() {
        throw null;
    }

    public static TextType valueOf(String str) {
        return (TextType) Enum.valueOf(TextType.class, str);
    }

    public static TextType[] values() {
        return (TextType[]) $VALUES.clone();
    }
}
