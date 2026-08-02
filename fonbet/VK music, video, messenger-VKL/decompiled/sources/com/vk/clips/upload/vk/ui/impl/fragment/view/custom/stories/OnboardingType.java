package com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes17.dex */
public final class OnboardingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingType[] $VALUES;
    public static final OnboardingType NONE;
    public static final OnboardingType SUBTITLE;
    public static final OnboardingType TITLE;

    static {
        OnboardingType onboardingType = new OnboardingType("NONE", 0);
        NONE = onboardingType;
        OnboardingType onboardingType2 = new OnboardingType(NativeAdContent.ViewTag.AD_TITLE, 1);
        TITLE = onboardingType2;
        OnboardingType onboardingType3 = new OnboardingType("SUBTITLE", 2);
        SUBTITLE = onboardingType3;
        OnboardingType[] onboardingTypeArr = {onboardingType, onboardingType2, onboardingType3};
        $VALUES = onboardingTypeArr;
        $ENTRIES = new asp(onboardingTypeArr);
    }

    public OnboardingType() {
        throw null;
    }

    public static OnboardingType valueOf(String str) {
        return (OnboardingType) Enum.valueOf(OnboardingType.class, str);
    }

    public static OnboardingType[] values() {
        return (OnboardingType[]) $VALUES.clone();
    }
}
