package com.vk.onboardingscreens.impl.recomthemes.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserRecomThemesBackButtonAction.kt */
/* loaded from: classes4.dex */
public final class UserRecomThemesBackButtonAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserRecomThemesBackButtonAction[] $VALUES;
    public static final UserRecomThemesBackButtonAction Back;
    public static final UserRecomThemesBackButtonAction Close;
    public static final UserRecomThemesBackButtonAction None;

    static {
        UserRecomThemesBackButtonAction userRecomThemesBackButtonAction = new UserRecomThemesBackButtonAction("Back", 0);
        Back = userRecomThemesBackButtonAction;
        UserRecomThemesBackButtonAction userRecomThemesBackButtonAction2 = new UserRecomThemesBackButtonAction("Close", 1);
        Close = userRecomThemesBackButtonAction2;
        UserRecomThemesBackButtonAction userRecomThemesBackButtonAction3 = new UserRecomThemesBackButtonAction("None", 2);
        None = userRecomThemesBackButtonAction3;
        UserRecomThemesBackButtonAction[] userRecomThemesBackButtonActionArr = {userRecomThemesBackButtonAction, userRecomThemesBackButtonAction2, userRecomThemesBackButtonAction3};
        $VALUES = userRecomThemesBackButtonActionArr;
        $ENTRIES = new asp(userRecomThemesBackButtonActionArr);
    }

    public UserRecomThemesBackButtonAction() {
        throw null;
    }

    public static UserRecomThemesBackButtonAction valueOf(String str) {
        return (UserRecomThemesBackButtonAction) Enum.valueOf(UserRecomThemesBackButtonAction.class, str);
    }

    public static UserRecomThemesBackButtonAction[] values() {
        return (UserRecomThemesBackButtonAction[]) $VALUES.clone();
    }
}
