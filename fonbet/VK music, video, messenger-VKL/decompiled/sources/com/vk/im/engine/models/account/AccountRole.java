package com.vk.im.engine.models.account;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountRole.kt */
/* loaded from: classes2.dex */
public final class AccountRole {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountRole[] $VALUES;
    public static final a Companion;
    public static final AccountRole DEVELOPER;
    public static final AccountRole TESTER;
    public static final AccountRole UNKNOWN;
    private static final AccountRole[] VALUES;
    public static final AccountRole WORKER;
    private final int id;

    /* compiled from: AccountRole.kt */
    public static final class a {
        public static AccountRole a(int i) {
            AccountRole accountRole;
            AccountRole[] accountRoleArr = AccountRole.VALUES;
            int length = accountRoleArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    accountRole = null;
                    break;
                }
                accountRole = accountRoleArr[i2];
                if (accountRole.i() == i) {
                    break;
                }
                i2++;
            }
            if (accountRole != null) {
                return accountRole;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: "));
        }
    }

    static {
        AccountRole accountRole = new AccountRole(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = accountRole;
        AccountRole accountRole2 = new AccountRole("WORKER", 1, 1);
        WORKER = accountRole2;
        AccountRole accountRole3 = new AccountRole("TESTER", 2, 2);
        TESTER = accountRole3;
        AccountRole accountRole4 = new AccountRole("DEVELOPER", 3, 3);
        DEVELOPER = accountRole4;
        AccountRole[] accountRoleArr = {accountRole, accountRole2, accountRole3, accountRole4};
        $VALUES = accountRoleArr;
        $ENTRIES = new asp(accountRoleArr);
        Companion = new a();
        VALUES = values();
    }

    public AccountRole(String str, int i, int i2) {
        this.id = i2;
    }

    public static AccountRole valueOf(String str) {
        return (AccountRole) Enum.valueOf(AccountRole.class, str);
    }

    public static AccountRole[] values() {
        return (AccountRole[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
