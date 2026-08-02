package com.vk.onboardingpromo.impl.domain.objects;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoSlideShowTypeDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoSlideShowTypeDo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingPromoSlideShowTypeDo[] $VALUES;
    public static final OnboardingPromoSlideShowTypeDo ALL;
    public static final OnboardingPromoSlideShowTypeDo LAST;
    private final String value;

    static {
        OnboardingPromoSlideShowTypeDo onboardingPromoSlideShowTypeDo = new OnboardingPromoSlideShowTypeDo("ALL", 0, "all");
        ALL = onboardingPromoSlideShowTypeDo;
        OnboardingPromoSlideShowTypeDo onboardingPromoSlideShowTypeDo2 = new OnboardingPromoSlideShowTypeDo("LAST", 1, "last");
        LAST = onboardingPromoSlideShowTypeDo2;
        OnboardingPromoSlideShowTypeDo[] onboardingPromoSlideShowTypeDoArr = {onboardingPromoSlideShowTypeDo, onboardingPromoSlideShowTypeDo2};
        $VALUES = onboardingPromoSlideShowTypeDoArr;
        $ENTRIES = new asp(onboardingPromoSlideShowTypeDoArr);
    }

    public OnboardingPromoSlideShowTypeDo(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingPromoSlideShowTypeDo valueOf(String str) {
        return (OnboardingPromoSlideShowTypeDo) Enum.valueOf(OnboardingPromoSlideShowTypeDo.class, str);
    }

    public static OnboardingPromoSlideShowTypeDo[] values() {
        return (OnboardingPromoSlideShowTypeDo[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
