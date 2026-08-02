package com.vk.im.ui.components.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserActions.kt */
/* loaded from: classes2.dex */
public final class UserActions {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserActions[] $VALUES;
    public static final UserActions ADD_TO_BLACK_LIST;
    public static final UserActions MARK_AS_SPAM;

    static {
        UserActions userActions = new UserActions("ADD_TO_BLACK_LIST", 0);
        ADD_TO_BLACK_LIST = userActions;
        UserActions userActions2 = new UserActions("MARK_AS_SPAM", 1);
        MARK_AS_SPAM = userActions2;
        UserActions[] userActionsArr = {userActions, userActions2};
        $VALUES = userActionsArr;
        $ENTRIES = new asp(userActionsArr);
    }

    public UserActions() {
        throw null;
    }

    public static UserActions valueOf(String str) {
        return (UserActions) Enum.valueOf(UserActions.class, str);
    }

    public static UserActions[] values() {
        return (UserActions[]) $VALUES.clone();
    }
}
