package com.vk.superapp.vksteps.utils.enums;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSyncState.kt */
/* loaded from: classes6.dex */
public final class AccountSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSyncState[] $VALUES;
    public static final AccountSyncState NEW_USER_ID;
    public static final AccountSyncState NEW_VK_RUN_ACCOUNT_ID;
    public static final AccountSyncState NONE;
    public static final AccountSyncState SYNC_AVAILABLE;

    static {
        AccountSyncState accountSyncState = new AccountSyncState("NONE", 0);
        NONE = accountSyncState;
        AccountSyncState accountSyncState2 = new AccountSyncState("SYNC_AVAILABLE", 1);
        SYNC_AVAILABLE = accountSyncState2;
        AccountSyncState accountSyncState3 = new AccountSyncState("NEW_USER_ID", 2);
        NEW_USER_ID = accountSyncState3;
        AccountSyncState accountSyncState4 = new AccountSyncState("NEW_VK_RUN_ACCOUNT_ID", 3);
        NEW_VK_RUN_ACCOUNT_ID = accountSyncState4;
        AccountSyncState[] accountSyncStateArr = {accountSyncState, accountSyncState2, accountSyncState3, accountSyncState4};
        $VALUES = accountSyncStateArr;
        $ENTRIES = new asp(accountSyncStateArr);
    }

    public AccountSyncState() {
        throw null;
    }

    public static AccountSyncState valueOf(String str) {
        return (AccountSyncState) Enum.valueOf(AccountSyncState.class, str);
    }

    public static AccountSyncState[] values() {
        return (AccountSyncState[]) $VALUES.clone();
    }
}
