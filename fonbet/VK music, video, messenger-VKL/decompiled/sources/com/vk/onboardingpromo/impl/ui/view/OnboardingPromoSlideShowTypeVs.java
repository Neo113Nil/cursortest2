package com.vk.onboardingpromo.impl.ui.view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoSlideShowTypeVs {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingPromoSlideShowTypeVs[] $VALUES;
    public static final OnboardingPromoSlideShowTypeVs ALL;
    public static final OnboardingPromoSlideShowTypeVs LAST;
    private final String value;

    static {
        OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs = new OnboardingPromoSlideShowTypeVs("ALL", 0, "all");
        ALL = onboardingPromoSlideShowTypeVs;
        OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs2 = new OnboardingPromoSlideShowTypeVs("LAST", 1, "last");
        LAST = onboardingPromoSlideShowTypeVs2;
        OnboardingPromoSlideShowTypeVs[] onboardingPromoSlideShowTypeVsArr = {onboardingPromoSlideShowTypeVs, onboardingPromoSlideShowTypeVs2};
        $VALUES = onboardingPromoSlideShowTypeVsArr;
        $ENTRIES = new asp(onboardingPromoSlideShowTypeVsArr);
    }

    public OnboardingPromoSlideShowTypeVs(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingPromoSlideShowTypeVs valueOf(String str) {
        return (OnboardingPromoSlideShowTypeVs) Enum.valueOf(OnboardingPromoSlideShowTypeVs.class, str);
    }

    public static OnboardingPromoSlideShowTypeVs[] values() {
        return (OnboardingPromoSlideShowTypeVs[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
