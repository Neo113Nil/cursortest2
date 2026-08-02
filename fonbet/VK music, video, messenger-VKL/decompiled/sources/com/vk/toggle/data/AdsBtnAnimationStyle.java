package com.vk.toggle.data;

import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsButtonConfig.kt */
/* loaded from: classes6.dex */
public final class AdsBtnAnimationStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsBtnAnimationStyle[] $VALUES;
    public static final AdsBtnAnimationStyle BUTTON_COLOR;
    public static final AdsBtnAnimationStyle BUTTON_LIGHT;
    public static final AdsBtnAnimationStyle CHEVRON_MOVE;
    public static final a Companion;
    private final String animationStyle;

    /* compiled from: AdsButtonConfig.kt */
    public static final class a {
        public static AdsBtnAnimationStyle a(String str) {
            for (AdsBtnAnimationStyle adsBtnAnimationStyle : AdsBtnAnimationStyle.values()) {
                if (epx.f(adsBtnAnimationStyle.h(), str.toLowerCase(Locale.ROOT))) {
                    return adsBtnAnimationStyle;
                }
            }
            return null;
        }
    }

    static {
        AdsBtnAnimationStyle adsBtnAnimationStyle = new AdsBtnAnimationStyle("BUTTON_COLOR", 0, "button_color");
        BUTTON_COLOR = adsBtnAnimationStyle;
        AdsBtnAnimationStyle adsBtnAnimationStyle2 = new AdsBtnAnimationStyle("CHEVRON_MOVE", 1, "chevron_move");
        CHEVRON_MOVE = adsBtnAnimationStyle2;
        AdsBtnAnimationStyle adsBtnAnimationStyle3 = new AdsBtnAnimationStyle("BUTTON_LIGHT", 2, "button_light");
        BUTTON_LIGHT = adsBtnAnimationStyle3;
        AdsBtnAnimationStyle[] adsBtnAnimationStyleArr = {adsBtnAnimationStyle, adsBtnAnimationStyle2, adsBtnAnimationStyle3};
        $VALUES = adsBtnAnimationStyleArr;
        $ENTRIES = new asp(adsBtnAnimationStyleArr);
        Companion = new a();
    }

    public AdsBtnAnimationStyle(String str, int i, String str2) {
        this.animationStyle = str2;
    }

    public static AdsBtnAnimationStyle valueOf(String str) {
        return (AdsBtnAnimationStyle) Enum.valueOf(AdsBtnAnimationStyle.class, str);
    }

    public static AdsBtnAnimationStyle[] values() {
        return (AdsBtnAnimationStyle[]) $VALUES.clone();
    }

    public final String h() {
        return this.animationStyle;
    }
}
