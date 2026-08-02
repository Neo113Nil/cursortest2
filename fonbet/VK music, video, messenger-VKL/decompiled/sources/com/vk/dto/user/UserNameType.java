package com.vk.dto.user;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserNameType.kt */
/* loaded from: classes.dex */
public final class UserNameType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserNameType[] $VALUES;
    public static final UserNameType CONTACT;
    public static final a Companion;
    public static final UserNameType VK;
    private final String value;

    /* compiled from: UserNameType.kt */
    public static final class a {
        public static UserNameType a(String str) {
            for (UserNameType userNameType : UserNameType.values()) {
                if (epx.f(userNameType.h(), str)) {
                    return userNameType;
                }
            }
            return null;
        }
    }

    static {
        UserNameType userNameType = new UserNameType("VK", 0, "vk");
        VK = userNameType;
        UserNameType userNameType2 = new UserNameType("CONTACT", 1, "contact");
        CONTACT = userNameType2;
        UserNameType[] userNameTypeArr = {userNameType, userNameType2};
        $VALUES = userNameTypeArr;
        $ENTRIES = new asp(userNameTypeArr);
        Companion = new a();
    }

    public UserNameType(String str, int i, String str2) {
        this.value = str2;
    }

    public static UserNameType valueOf(String str) {
        return (UserNameType) Enum.valueOf(UserNameType.class, str);
    }

    public static UserNameType[] values() {
        return (UserNameType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
