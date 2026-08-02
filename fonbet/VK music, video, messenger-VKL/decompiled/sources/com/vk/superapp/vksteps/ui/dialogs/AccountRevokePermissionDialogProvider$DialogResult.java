package com.vk.superapp.vksteps.ui.dialogs;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountRevokePermissionDialogProvider.kt */
/* loaded from: classes6.dex */
public final class AccountRevokePermissionDialogProvider$DialogResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountRevokePermissionDialogProvider$DialogResult[] $VALUES;
    public static final AccountRevokePermissionDialogProvider$DialogResult NEGATIVE;
    public static final AccountRevokePermissionDialogProvider$DialogResult POSITIVE;

    static {
        AccountRevokePermissionDialogProvider$DialogResult accountRevokePermissionDialogProvider$DialogResult = new AccountRevokePermissionDialogProvider$DialogResult("POSITIVE", 0);
        POSITIVE = accountRevokePermissionDialogProvider$DialogResult;
        AccountRevokePermissionDialogProvider$DialogResult accountRevokePermissionDialogProvider$DialogResult2 = new AccountRevokePermissionDialogProvider$DialogResult("NEGATIVE", 1);
        NEGATIVE = accountRevokePermissionDialogProvider$DialogResult2;
        AccountRevokePermissionDialogProvider$DialogResult[] accountRevokePermissionDialogProvider$DialogResultArr = {accountRevokePermissionDialogProvider$DialogResult, accountRevokePermissionDialogProvider$DialogResult2};
        $VALUES = accountRevokePermissionDialogProvider$DialogResultArr;
        $ENTRIES = new asp(accountRevokePermissionDialogProvider$DialogResultArr);
    }

    public AccountRevokePermissionDialogProvider$DialogResult() {
        throw null;
    }

    public static AccountRevokePermissionDialogProvider$DialogResult valueOf(String str) {
        return (AccountRevokePermissionDialogProvider$DialogResult) Enum.valueOf(AccountRevokePermissionDialogProvider$DialogResult.class, str);
    }

    public static AccountRevokePermissionDialogProvider$DialogResult[] values() {
        return (AccountRevokePermissionDialogProvider$DialogResult[]) $VALUES.clone();
    }
}
