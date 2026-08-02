package com.vk.newsfeed.posting.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserType.kt */
/* loaded from: classes4.dex */
public final class UserType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    public static final UserType ADMINISTRATOR;
    public static final UserType EDITOR;
    public static final UserType GUEST;
    public static final UserType MODERATOR;
    public static final UserType WALL_OWNER;

    static {
        UserType userType = new UserType("WALL_OWNER", 0);
        WALL_OWNER = userType;
        UserType userType2 = new UserType("MODERATOR", 1);
        MODERATOR = userType2;
        UserType userType3 = new UserType("EDITOR", 2);
        EDITOR = userType3;
        UserType userType4 = new UserType("ADMINISTRATOR", 3);
        ADMINISTRATOR = userType4;
        UserType userType5 = new UserType("GUEST", 4);
        GUEST = userType5;
        UserType[] userTypeArr = {userType, userType2, userType3, userType4, userType5};
        $VALUES = userTypeArr;
        $ENTRIES = new asp(userTypeArr);
    }

    public UserType() {
        throw null;
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }
}
