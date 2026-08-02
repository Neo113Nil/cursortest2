package com.vk.superapp.multiaccount.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserSecurityStatus.kt */
/* loaded from: classes6.dex */
public final class UserSecurityStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UserSecurityStatus[] $VALUES;
    public static final UserSecurityStatus CRITICAL_VULNERABILITIES;
    public static final a Companion;
    public static final UserSecurityStatus PROTECTION_RECOMMENDATIONS;
    public static final UserSecurityStatus SECURITY_PROTECTED;
    private final int securityCode;
    private final String value;

    /* compiled from: UserSecurityStatus.kt */
    public static final class a {
        public static UserSecurityStatus a(Integer num) {
            UserSecurityStatus userSecurityStatus;
            UserSecurityStatus[] values = UserSecurityStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    userSecurityStatus = null;
                    break;
                }
                userSecurityStatus = values[i];
                int h = userSecurityStatus.h();
                if (num != null && h == num.intValue()) {
                    break;
                }
                i++;
            }
            return userSecurityStatus == null ? UserSecurityStatus.SECURITY_PROTECTED : userSecurityStatus;
        }
    }

    static {
        UserSecurityStatus userSecurityStatus = new UserSecurityStatus("SECURITY_PROTECTED", 0, "securely_protected", 20);
        SECURITY_PROTECTED = userSecurityStatus;
        UserSecurityStatus userSecurityStatus2 = new UserSecurityStatus("PROTECTION_RECOMMENDATIONS", 1, "protection_recommendations", 10);
        PROTECTION_RECOMMENDATIONS = userSecurityStatus2;
        UserSecurityStatus userSecurityStatus3 = new UserSecurityStatus("CRITICAL_VULNERABILITIES", 2, "critical_vulnerabilities", 1);
        CRITICAL_VULNERABILITIES = userSecurityStatus3;
        UserSecurityStatus[] userSecurityStatusArr = {userSecurityStatus, userSecurityStatus2, userSecurityStatus3};
        $VALUES = userSecurityStatusArr;
        $ENTRIES = new asp(userSecurityStatusArr);
        Companion = new a();
    }

    public UserSecurityStatus(String str, int i, String str2, int i2) {
        this.value = str2;
        this.securityCode = i2;
    }

    public static UserSecurityStatus valueOf(String str) {
        return (UserSecurityStatus) Enum.valueOf(UserSecurityStatus.class, str);
    }

    public static UserSecurityStatus[] values() {
        return (UserSecurityStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.securityCode;
    }

    public final String i() {
        return this.value;
    }
}
