package com.vk.sharing.core.view;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountTypeForSharing.kt */
/* loaded from: classes5.dex */
public final class AccountTypeForSharing {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountTypeForSharing[] $VALUES;
    public static final a Companion;
    public static final AccountTypeForSharing EDU_ACCOUNT_IN_ME;
    public static final AccountTypeForSharing VK_ACCOUNT;
    public static final AccountTypeForSharing VK_ACCOUNT_IN_ME;

    /* compiled from: AccountTypeForSharing.kt */
    public static final class a {
    }

    static {
        AccountTypeForSharing accountTypeForSharing = new AccountTypeForSharing("VK_ACCOUNT_IN_ME", 0);
        VK_ACCOUNT_IN_ME = accountTypeForSharing;
        AccountTypeForSharing accountTypeForSharing2 = new AccountTypeForSharing("EDU_ACCOUNT_IN_ME", 1);
        EDU_ACCOUNT_IN_ME = accountTypeForSharing2;
        AccountTypeForSharing accountTypeForSharing3 = new AccountTypeForSharing("VK_ACCOUNT", 2);
        VK_ACCOUNT = accountTypeForSharing3;
        AccountTypeForSharing[] accountTypeForSharingArr = {accountTypeForSharing, accountTypeForSharing2, accountTypeForSharing3};
        $VALUES = accountTypeForSharingArr;
        $ENTRIES = new asp(accountTypeForSharingArr);
        Companion = new a();
    }

    public AccountTypeForSharing() {
        throw null;
    }

    public static AccountTypeForSharing valueOf(String str) {
        return (AccountTypeForSharing) Enum.valueOf(AccountTypeForSharing.class, str);
    }

    public static AccountTypeForSharing[] values() {
        return (AccountTypeForSharing[]) $VALUES.clone();
    }
}
