package com.vk.im.engine.models.account;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrivacySetting.kt */
/* loaded from: classes2.dex */
public final class UserListType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserListType[] $VALUES;
    public static final UserListType EXCLUDE;
    public static final UserListType INCLUDE;

    static {
        UserListType userListType = new UserListType("INCLUDE", 0);
        INCLUDE = userListType;
        UserListType userListType2 = new UserListType("EXCLUDE", 1);
        EXCLUDE = userListType2;
        UserListType[] userListTypeArr = {userListType, userListType2};
        $VALUES = userListTypeArr;
        $ENTRIES = new asp(userListTypeArr);
    }

    public UserListType() {
        throw null;
    }

    public static UserListType valueOf(String str) {
        return (UserListType) Enum.valueOf(UserListType.class, str);
    }

    public static UserListType[] values() {
        return (UserListType[]) $VALUES.clone();
    }
}
