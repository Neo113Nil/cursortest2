package com.vk.dto.stickers.images;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageTheme.kt */
/* loaded from: classes18.dex */
public final class ThemeType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final a Companion;
    public static final ThemeType DARK;
    public static final ThemeType LIGHT;
    private static final Map<String, ThemeType> map;
    private final String value;

    /* compiled from: ImageTheme.kt */
    public static final class a {
    }

    static {
        ThemeType themeType = new ThemeType("LIGHT", 0, "light");
        LIGHT = themeType;
        ThemeType themeType2 = new ThemeType("DARK", 1, "dark");
        DARK = themeType2;
        ThemeType[] themeTypeArr = {themeType, themeType2};
        $VALUES = themeTypeArr;
        $ENTRIES = new asp(themeTypeArr);
        Companion = new a();
        ThemeType[] values = values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (ThemeType themeType3 : values) {
            linkedHashMap.put(themeType3.value, themeType3);
        }
        map = linkedHashMap;
    }

    public ThemeType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }
}
