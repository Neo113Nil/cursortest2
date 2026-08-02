package com.vk.core.compose.component.cell.skeleton;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class TextType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextType[] $VALUES;
    public static final TextType ExtraSubtitle;
    public static final TextType Subtitle;
    public static final TextType Title;

    static {
        TextType textType = new TextType("Title", 0);
        Title = textType;
        TextType textType2 = new TextType("Subtitle", 1);
        Subtitle = textType2;
        TextType textType3 = new TextType("ExtraSubtitle", 2);
        ExtraSubtitle = textType3;
        TextType[] textTypeArr = {textType, textType2, textType3};
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
