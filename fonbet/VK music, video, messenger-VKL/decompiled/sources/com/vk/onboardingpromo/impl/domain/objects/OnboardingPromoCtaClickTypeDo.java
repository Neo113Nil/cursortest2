package com.vk.onboardingpromo.impl.domain.objects;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingPromoCtaClickTypeDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoCtaClickTypeDo {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingPromoCtaClickTypeDo[] $VALUES;
    public static final OnboardingPromoCtaClickTypeDo CLOSE;
    public static final OnboardingPromoCtaClickTypeDo CUSTOM;
    public static final OnboardingPromoCtaClickTypeDo LINK;
    private final String value;

    static {
        OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo = new OnboardingPromoCtaClickTypeDo("LINK", 0, "link");
        LINK = onboardingPromoCtaClickTypeDo;
        OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo2 = new OnboardingPromoCtaClickTypeDo("CLOSE", 1, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        CLOSE = onboardingPromoCtaClickTypeDo2;
        OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo3 = new OnboardingPromoCtaClickTypeDo("CUSTOM", 2, "custom");
        CUSTOM = onboardingPromoCtaClickTypeDo3;
        OnboardingPromoCtaClickTypeDo[] onboardingPromoCtaClickTypeDoArr = {onboardingPromoCtaClickTypeDo, onboardingPromoCtaClickTypeDo2, onboardingPromoCtaClickTypeDo3};
        $VALUES = onboardingPromoCtaClickTypeDoArr;
        $ENTRIES = new asp(onboardingPromoCtaClickTypeDoArr);
    }

    public OnboardingPromoCtaClickTypeDo(String str, int i, String str2) {
        this.value = str2;
    }

    public static OnboardingPromoCtaClickTypeDo valueOf(String str) {
        return (OnboardingPromoCtaClickTypeDo) Enum.valueOf(OnboardingPromoCtaClickTypeDo.class, str);
    }

    public static OnboardingPromoCtaClickTypeDo[] values() {
        return (OnboardingPromoCtaClickTypeDo[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
