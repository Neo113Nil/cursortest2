package com.vk.onboardingscreens.impl.recomthemes.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserRecomThemesChooserStep.kt */
/* loaded from: classes4.dex */
public final class UserRecomThemesChooserStep {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserRecomThemesChooserStep[] $VALUES;
    public static final UserRecomThemesChooserStep SecondLevelThemes;
    public static final UserRecomThemesChooserStep TopLevelThemes;

    static {
        UserRecomThemesChooserStep userRecomThemesChooserStep = new UserRecomThemesChooserStep("TopLevelThemes", 0);
        TopLevelThemes = userRecomThemesChooserStep;
        UserRecomThemesChooserStep userRecomThemesChooserStep2 = new UserRecomThemesChooserStep("SecondLevelThemes", 1);
        SecondLevelThemes = userRecomThemesChooserStep2;
        UserRecomThemesChooserStep[] userRecomThemesChooserStepArr = {userRecomThemesChooserStep, userRecomThemesChooserStep2};
        $VALUES = userRecomThemesChooserStepArr;
        $ENTRIES = new asp(userRecomThemesChooserStepArr);
    }

    public UserRecomThemesChooserStep() {
        throw null;
    }

    public static zrp<UserRecomThemesChooserStep> h() {
        return $ENTRIES;
    }

    public static UserRecomThemesChooserStep valueOf(String str) {
        return (UserRecomThemesChooserStep) Enum.valueOf(UserRecomThemesChooserStep.class, str);
    }

    public static UserRecomThemesChooserStep[] values() {
        return (UserRecomThemesChooserStep[]) $VALUES.clone();
    }
}
