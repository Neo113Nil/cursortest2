package com.vk.superapp.bridges;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperappAuthBridge.kt */
/* loaded from: classes6.dex */
public final class LogoutReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LogoutReason[] $VALUES;
    public static final LogoutReason AT_EXPIRED;
    public static final LogoutReason DROP_ACCOUNT_TAP;
    public static final LogoutReason MULTIACCOUNT_LOGOUT;
    public static final LogoutReason PHONE_VALIDATION_DECLINED;
    public static final LogoutReason USER;
    public static final LogoutReason USER_BANNED;
    public static final LogoutReason USER_DEACTIVATED;
    public static final LogoutReason VK_UI;

    static {
        LogoutReason logoutReason = new LogoutReason("VK_UI", 0);
        VK_UI = logoutReason;
        LogoutReason logoutReason2 = new LogoutReason("USER", 1);
        USER = logoutReason2;
        LogoutReason logoutReason3 = new LogoutReason("USER_BANNED", 2);
        USER_BANNED = logoutReason3;
        LogoutReason logoutReason4 = new LogoutReason("USER_DEACTIVATED", 3);
        USER_DEACTIVATED = logoutReason4;
        LogoutReason logoutReason5 = new LogoutReason("AT_EXPIRED", 4);
        AT_EXPIRED = logoutReason5;
        LogoutReason logoutReason6 = new LogoutReason("PHONE_VALIDATION_DECLINED", 5);
        PHONE_VALIDATION_DECLINED = logoutReason6;
        LogoutReason logoutReason7 = new LogoutReason("MULTIACCOUNT_LOGOUT", 6);
        MULTIACCOUNT_LOGOUT = logoutReason7;
        LogoutReason logoutReason8 = new LogoutReason("DROP_ACCOUNT_TAP", 7);
        DROP_ACCOUNT_TAP = logoutReason8;
        LogoutReason[] logoutReasonArr = {logoutReason, logoutReason2, logoutReason3, logoutReason4, logoutReason5, logoutReason6, logoutReason7, logoutReason8};
        $VALUES = logoutReasonArr;
        $ENTRIES = new asp(logoutReasonArr);
    }

    public LogoutReason() {
        throw null;
    }

    public static LogoutReason valueOf(String str) {
        return (LogoutReason) Enum.valueOf(LogoutReason.class, str);
    }

    public static LogoutReason[] values() {
        return (LogoutReason[]) $VALUES.clone();
    }
}
