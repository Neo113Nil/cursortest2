package com.vk.design.demo.presentation.components;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportedThemesTopBar.kt */
/* loaded from: classes18.dex */
public final class ThemeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final ThemeType LEGO;
    public static final ThemeType MILKSHAKE;

    static {
        ThemeType themeType = new ThemeType("LEGO", 0);
        LEGO = themeType;
        ThemeType themeType2 = new ThemeType("MILKSHAKE", 1);
        MILKSHAKE = themeType2;
        ThemeType[] themeTypeArr = {themeType, themeType2};
        $VALUES = themeTypeArr;
        $ENTRIES = new asp(themeTypeArr);
    }

    public ThemeType() {
        throw null;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }
}
