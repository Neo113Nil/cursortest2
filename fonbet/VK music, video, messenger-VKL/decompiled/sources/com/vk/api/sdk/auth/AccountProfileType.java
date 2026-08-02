package com.vk.api.sdk.auth;

import org.json.JSONObject;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountProfileType.kt */
/* loaded from: classes.dex */
public final class AccountProfileType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountProfileType[] $VALUES;
    public static final a Companion;
    public static final AccountProfileType EDU;
    public static final AccountProfileType NORMAL;
    public static final AccountProfileType PROMO;
    public static final AccountProfileType RELATED;
    private final int code;

    /* compiled from: AccountProfileType.kt */
    public static final class a {
        public static AccountProfileType a(Integer num) {
            for (AccountProfileType accountProfileType : AccountProfileType.values()) {
                int h = accountProfileType.h();
                if (num != null && h == num.intValue()) {
                    return accountProfileType;
                }
            }
            return null;
        }
    }

    static {
        AccountProfileType accountProfileType = new AccountProfileType("NORMAL", 0, 0);
        NORMAL = accountProfileType;
        AccountProfileType accountProfileType2 = new AccountProfileType("PROMO", 1, 1);
        PROMO = accountProfileType2;
        AccountProfileType accountProfileType3 = new AccountProfileType("EDU", 2, 2);
        EDU = accountProfileType3;
        AccountProfileType accountProfileType4 = new AccountProfileType("RELATED", 3, 4);
        RELATED = accountProfileType4;
        AccountProfileType[] accountProfileTypeArr = {accountProfileType, accountProfileType2, accountProfileType3, accountProfileType4};
        $VALUES = accountProfileTypeArr;
        $ENTRIES = new asp(accountProfileTypeArr);
        Companion = new a();
    }

    public AccountProfileType(String str, int i, int i2) {
        this.code = i2;
    }

    public static AccountProfileType valueOf(String str) {
        return (AccountProfileType) Enum.valueOf(AccountProfileType.class, str);
    }

    public static AccountProfileType[] values() {
        return (AccountProfileType[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }

    public final JSONObject i() {
        return new JSONObject().put("code", this.code);
    }
}
