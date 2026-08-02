package com.vk.libvideo.api.onboarding;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingRepository.kt */
/* loaded from: classes2.dex */
public final class Onboarding {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Onboarding[] $VALUES;
    public static final Onboarding ActivatePushOnComment;
    public static final Onboarding ActivatePushOnPlayList;
    public static final Onboarding KidsModeFullscreen;
    public static final Onboarding NewUser;
    public static final Onboarding PromoCampaign;
    public static final Onboarding TwoStep;

    static {
        Onboarding onboarding = new Onboarding("TwoStep", 0);
        TwoStep = onboarding;
        Onboarding onboarding2 = new Onboarding("NewUser", 1);
        NewUser = onboarding2;
        Onboarding onboarding3 = new Onboarding("KidsModeFullscreen", 2);
        KidsModeFullscreen = onboarding3;
        Onboarding onboarding4 = new Onboarding("ActivatePushOnPlayList", 3);
        ActivatePushOnPlayList = onboarding4;
        Onboarding onboarding5 = new Onboarding("ActivatePushOnComment", 4);
        ActivatePushOnComment = onboarding5;
        Onboarding onboarding6 = new Onboarding("PromoCampaign", 5);
        PromoCampaign = onboarding6;
        Onboarding[] onboardingArr = {onboarding, onboarding2, onboarding3, onboarding4, onboarding5, onboarding6};
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
