package com.vk.onboardingpromo.impl.ui.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoCtaClickTypeVs {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingPromoCtaClickTypeVs[] $VALUES;
    public static final OnboardingPromoCtaClickTypeVs CLOSE;
    public static final OnboardingPromoCtaClickTypeVs CUSTOM;
    public static final OnboardingPromoCtaClickTypeVs LINK;
    private final String value;

    static {
        OnboardingPromoCtaClickTypeVs onboardingPromoCtaClickTypeVs = new OnboardingPromoCtaClickTypeVs("LINK", 0, "link");
        LINK = onboardingPromoCtaClickTypeVs;
        OnboardingPromoCtaClickTypeVs onboardingPromoCtaClickTypeVs2 = new OnboardingPromoCtaClickTypeVs("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = onboardingPromoCtaClickTypeVs2;
        OnboardingPromoCtaClickTypeVs onboardingPromoCtaClickTypeVs3 = new OnboardingPromoCtaClickTypeVs("CUSTOM", 2, "custom");
        CUSTOM = onboardingPromoCtaClickTypeVs3;
        OnboardingPromoCtaClickTypeVs[] onboardingPromoCtaClickTypeVsArr = {onboardingPromoCtaClickTypeVs, onboardingPromoCtaClickTypeVs2, onboardingPromoCtaClickTypeVs3};
        $VALUES = onboardingPromoCtaClickTypeVsArr;
        $ENTRIES = new asp(onboardingPromoCtaClickTypeVsArr);
    }

    public OnboardingPromoCtaClickTypeVs(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingPromoCtaClickTypeVs valueOf(String str) {
        return (OnboardingPromoCtaClickTypeVs) Enum.valueOf(OnboardingPromoCtaClickTypeVs.class, str);
    }

    public static OnboardingPromoCtaClickTypeVs[] values() {
        return (OnboardingPromoCtaClickTypeVs[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
