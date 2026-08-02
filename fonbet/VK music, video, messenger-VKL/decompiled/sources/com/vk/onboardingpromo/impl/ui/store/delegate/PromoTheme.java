package com.vk.onboardingpromo.impl.ui.store.delegate;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoMediaDelegate.kt */
/* loaded from: classes4.dex */
public final class PromoTheme {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PromoTheme[] $VALUES;
    public static final PromoTheme DARK;
    public static final PromoTheme LIGHT;
    private final String value;

    static {
        PromoTheme promoTheme = new PromoTheme("LIGHT", 0, "light");
        LIGHT = promoTheme;
        PromoTheme promoTheme2 = new PromoTheme("DARK", 1, "dark");
        DARK = promoTheme2;
        PromoTheme[] promoThemeArr = {promoTheme, promoTheme2};
        $VALUES = promoThemeArr;
        $ENTRIES = new asp(promoThemeArr);
    }

    public PromoTheme(String str, int i, String str2) {
        this.value = str2;
    }

    public static PromoTheme valueOf(String str) {
        return (PromoTheme) Enum.valueOf(PromoTheme.class, str);
    }

    public static PromoTheme[] values() {
        return (PromoTheme[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
