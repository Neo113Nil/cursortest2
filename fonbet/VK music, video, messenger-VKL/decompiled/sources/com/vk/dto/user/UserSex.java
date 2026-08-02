package com.vk.dto.user;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserSex.kt */
/* loaded from: classes.dex */
public final class UserSex {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserSex[] $VALUES;
    public static final a Companion;
    public static final UserSex FEMALE;
    public static final UserSex MALE;
    public static final UserSex UNKNOWN;
    private int code;

    /* compiled from: UserSex.kt */
    public static final class a {
        public static UserSex a(Integer num) {
            return num != null ? (num.intValue() < 0 || num.intValue() >= UserSex.values().length) ? UserSex.UNKNOWN : UserSex.values()[num.intValue()] : UserSex.UNKNOWN;
        }
    }

    /* compiled from: UserSex.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSex.values().length];
            try {
                iArr[UserSex.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserSex.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        UserSex userSex = new UserSex(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = userSex;
        UserSex userSex2 = new UserSex("FEMALE", 1, 1);
        FEMALE = userSex2;
        UserSex userSex3 = new UserSex("MALE", 2, 2);
        MALE = userSex3;
        UserSex[] userSexArr = {userSex, userSex2, userSex3};
        $VALUES = userSexArr;
        $ENTRIES = new asp(userSexArr);
        Companion = new a();
    }

    public UserSex(String str, int i, int i2) {
        this.code = i2;
    }

    public static UserSex valueOf(String str) {
        return (UserSex) Enum.valueOf(UserSex.class, str);
    }

    public static UserSex[] values() {
        return (UserSex[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
