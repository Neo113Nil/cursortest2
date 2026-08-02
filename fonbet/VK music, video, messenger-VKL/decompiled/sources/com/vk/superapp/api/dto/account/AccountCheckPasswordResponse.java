package com.vk.superapp.api.dto.account;

import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: AccountCheckPasswordResponse.kt */
/* loaded from: classes6.dex */
public final class AccountCheckPasswordResponse {
    public final SecurityLevel a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountCheckPasswordResponse.kt */
    public static final class SecurityLevel {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SecurityLevel[] $VALUES;
        public static final a Companion;
        public static final SecurityLevel ERROR;
        public static final SecurityLevel INVALID;
        public static final SecurityLevel NORMAL;
        public static final SecurityLevel OK;
        private final int code;

        /* compiled from: AccountCheckPasswordResponse.kt */
        public static final class a {
        }

        static {
            SecurityLevel securityLevel = new SecurityLevel("INVALID", 0, -1);
            INVALID = securityLevel;
            SecurityLevel securityLevel2 = new SecurityLevel("ERROR", 1, 0);
            ERROR = securityLevel2;
            SecurityLevel securityLevel3 = new SecurityLevel("NORMAL", 2, 1);
            NORMAL = securityLevel3;
            SecurityLevel securityLevel4 = new SecurityLevel("OK", 3, 2);
            OK = securityLevel4;
            SecurityLevel[] securityLevelArr = {securityLevel, securityLevel2, securityLevel3, securityLevel4};
            $VALUES = securityLevelArr;
            $ENTRIES = new asp(securityLevelArr);
            Companion = new a();
        }

        public SecurityLevel(String str, int i, int i2) {
            this.code = i2;
        }

        public static SecurityLevel valueOf(String str) {
            return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
        }

        public static SecurityLevel[] values() {
            return (SecurityLevel[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    public AccountCheckPasswordResponse(SecurityLevel securityLevel, String str) {
        this.a = securityLevel;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCheckPasswordResponse)) {
            return false;
        }
        AccountCheckPasswordResponse accountCheckPasswordResponse = (AccountCheckPasswordResponse) obj;
        return this.a == accountCheckPasswordResponse.a && epx.f(this.b, accountCheckPasswordResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountCheckPasswordResponse(securityLevel=");
        sb.append(this.a);
        sb.append(", securityMessage=");
        return ho8.a(sb, this.b, ')');
    }
}
