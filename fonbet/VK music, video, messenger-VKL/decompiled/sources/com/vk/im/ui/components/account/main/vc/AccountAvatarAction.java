package com.vk.im.ui.components.account.main.vc;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountAvatarAction.kt */
/* loaded from: classes2.dex */
public final class AccountAvatarAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountAvatarAction[] $VALUES;
    public static final AccountAvatarAction DELETE;
    public static final AccountAvatarAction MAKE_PHOTO;
    public static final AccountAvatarAction OPEN;
    public static final AccountAvatarAction OPEN_STORY;
    public static final AccountAvatarAction SELECT_FROM_GALLERY;

    static {
        AccountAvatarAction accountAvatarAction = new AccountAvatarAction("OPEN", 0);
        OPEN = accountAvatarAction;
        AccountAvatarAction accountAvatarAction2 = new AccountAvatarAction("OPEN_STORY", 1);
        OPEN_STORY = accountAvatarAction2;
        AccountAvatarAction accountAvatarAction3 = new AccountAvatarAction("MAKE_PHOTO", 2);
        MAKE_PHOTO = accountAvatarAction3;
        AccountAvatarAction accountAvatarAction4 = new AccountAvatarAction("SELECT_FROM_GALLERY", 3);
        SELECT_FROM_GALLERY = accountAvatarAction4;
        AccountAvatarAction accountAvatarAction5 = new AccountAvatarAction("DELETE", 4);
        DELETE = accountAvatarAction5;
        AccountAvatarAction[] accountAvatarActionArr = {accountAvatarAction, accountAvatarAction2, accountAvatarAction3, accountAvatarAction4, accountAvatarAction5};
        $VALUES = accountAvatarActionArr;
        $ENTRIES = new asp(accountAvatarActionArr);
    }

    public AccountAvatarAction() {
        throw null;
    }

    public static AccountAvatarAction valueOf(String str) {
        return (AccountAvatarAction) Enum.valueOf(AccountAvatarAction.class, str);
    }

    public static AccountAvatarAction[] values() {
        return (AccountAvatarAction[]) $VALUES.clone();
    }
}
