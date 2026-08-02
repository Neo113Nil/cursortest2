package com.vk.toggle.data;

import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsButtonConfig.kt */
/* loaded from: classes6.dex */
public final class AdsBtnStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsBtnStyle[] $VALUES;
    public static final a Companion;
    public static final AdsBtnStyle LONG;
    public static final AdsBtnStyle SHORT;
    private final String buttonStyle;

    /* compiled from: AdsButtonConfig.kt */
    public static final class a {
        public static AdsBtnStyle a(String str) {
            for (AdsBtnStyle adsBtnStyle : AdsBtnStyle.values()) {
                if (epx.f(adsBtnStyle.h(), str.toLowerCase(Locale.ROOT))) {
                    return adsBtnStyle;
                }
            }
            return null;
        }
    }

    static {
        AdsBtnStyle adsBtnStyle = new AdsBtnStyle("SHORT", 0, "short");
        SHORT = adsBtnStyle;
        AdsBtnStyle adsBtnStyle2 = new AdsBtnStyle("LONG", 1, "long");
        LONG = adsBtnStyle2;
        AdsBtnStyle[] adsBtnStyleArr = {adsBtnStyle, adsBtnStyle2};
        $VALUES = adsBtnStyleArr;
        $ENTRIES = new asp(adsBtnStyleArr);
        Companion = new a();
    }

    public AdsBtnStyle(String str, int i, String str2) {
        this.buttonStyle = str2;
    }

    public static AdsBtnStyle valueOf(String str) {
        return (AdsBtnStyle) Enum.valueOf(AdsBtnStyle.class, str);
    }

    public static AdsBtnStyle[] values() {
        return (AdsBtnStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.buttonStyle;
    }
}
