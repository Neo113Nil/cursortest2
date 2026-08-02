package com.vk.newsfeed.posting.impl.presentation.model;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class Onboarding {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Onboarding[] $VALUES;
    public static final Onboarding NONE;
    public static final Onboarding SUBTITLE;
    public static final Onboarding TITLE;

    static {
        Onboarding onboarding = new Onboarding("NONE", 0);
        NONE = onboarding;
        Onboarding onboarding2 = new Onboarding(NativeAdContent.ViewTag.AD_TITLE, 1);
        TITLE = onboarding2;
        Onboarding onboarding3 = new Onboarding("SUBTITLE", 2);
        SUBTITLE = onboarding3;
        Onboarding[] onboardingArr = {onboarding, onboarding2, onboarding3};
        $VALUES = onboardingArr;
        $ENTRIES = new asp(onboardingArr);
    }

    public Onboarding() {
        throw null;
    }

    public static Onboarding valueOf(String str) {
        return (Onboarding) Enum.valueOf(Onboarding.class, str);
    }

    public static Onboarding[] values() {
        return (Onboarding[]) $VALUES.clone();
    }
}
