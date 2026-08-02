package com.vk.onboardingscreens.impl.recomthemes.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserRecomThemesChooserButtonAction.kt */
/* loaded from: classes4.dex */
public final class UserRecomThemesChooserButtonAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserRecomThemesChooserButtonAction[] $VALUES;
    public static final UserRecomThemesChooserButtonAction Next;
    public static final UserRecomThemesChooserButtonAction Save;

    static {
        UserRecomThemesChooserButtonAction userRecomThemesChooserButtonAction = new UserRecomThemesChooserButtonAction("Next", 0);
        Next = userRecomThemesChooserButtonAction;
        UserRecomThemesChooserButtonAction userRecomThemesChooserButtonAction2 = new UserRecomThemesChooserButtonAction("Save", 1);
        Save = userRecomThemesChooserButtonAction2;
        UserRecomThemesChooserButtonAction[] userRecomThemesChooserButtonActionArr = {userRecomThemesChooserButtonAction, userRecomThemesChooserButtonAction2};
        $VALUES = userRecomThemesChooserButtonActionArr;
        $ENTRIES = new asp(userRecomThemesChooserButtonActionArr);
    }

    public UserRecomThemesChooserButtonAction() {
        throw null;
    }

    public static UserRecomThemesChooserButtonAction valueOf(String str) {
        return (UserRecomThemesChooserButtonAction) Enum.valueOf(UserRecomThemesChooserButtonAction.class, str);
    }

    public static UserRecomThemesChooserButtonAction[] values() {
        return (UserRecomThemesChooserButtonAction[]) $VALUES.clone();
    }
}
