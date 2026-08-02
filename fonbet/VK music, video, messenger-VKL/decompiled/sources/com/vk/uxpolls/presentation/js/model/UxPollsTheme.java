package com.vk.uxpolls.presentation.js.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UxPollsTheme.kt */
/* loaded from: classes6.dex */
public final class UxPollsTheme {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UxPollsTheme[] $VALUES;
    public static final UxPollsTheme DARK;
    public static final UxPollsTheme LIGHT;
    private final String theme;

    static {
        UxPollsTheme uxPollsTheme = new UxPollsTheme("LIGHT", 0, "vkcom_light");
        LIGHT = uxPollsTheme;
        UxPollsTheme uxPollsTheme2 = new UxPollsTheme("DARK", 1, "vkcom_dark");
        DARK = uxPollsTheme2;
        UxPollsTheme[] uxPollsThemeArr = {uxPollsTheme, uxPollsTheme2};
        $VALUES = uxPollsThemeArr;
        $ENTRIES = new asp(uxPollsThemeArr);
    }

    public UxPollsTheme(String str, int i, String str2) {
        this.theme = str2;
    }

    public static UxPollsTheme valueOf(String str) {
        return (UxPollsTheme) Enum.valueOf(UxPollsTheme.class, str);
    }

    public static UxPollsTheme[] values() {
        return (UxPollsTheme[]) $VALUES.clone();
    }

    public final String h() {
        return this.theme;
    }
}
