package com.vk.design.demo.presentation.screens.authorheader;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorHeaderState.kt */
/* loaded from: classes18.dex */
public final class SubtitleType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubtitleType[] $VALUES;
    public static final SubtitleType Custom;
    public static final SubtitleType None;
    public static final SubtitleType Promo;

    static {
        SubtitleType subtitleType = new SubtitleType("None", 0);
        None = subtitleType;
        SubtitleType subtitleType2 = new SubtitleType("Promo", 1);
        Promo = subtitleType2;
        SubtitleType subtitleType3 = new SubtitleType("Custom", 2);
        Custom = subtitleType3;
        SubtitleType[] subtitleTypeArr = {subtitleType, subtitleType2, subtitleType3};
        $VALUES = subtitleTypeArr;
        $ENTRIES = new asp(subtitleTypeArr);
    }

    public SubtitleType() {
        throw null;
    }

    public static SubtitleType valueOf(String str) {
        return (SubtitleType) Enum.valueOf(SubtitleType.class, str);
    }

    public static SubtitleType[] values() {
        return (SubtitleType[]) $VALUES.clone();
    }
}
