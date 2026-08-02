package com.vk.superapp.api.dto.auth;

import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.zrp;

/* compiled from: InitPasswordCheckResponse.kt */
/* loaded from: classes6.dex */
public final class InitPasswordCheckResponse {
    public final AccessFactor a;
    public final AccessFactor2 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InitPasswordCheckResponse.kt */
    public static final class AccessFactor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessFactor[] $VALUES;
        public static final a Companion;
        public static final AccessFactor PASSWORD;
        public static final AccessFactor SMS_CODE;
        private final String value;

        /* compiled from: InitPasswordCheckResponse.kt */
        public static final class a {
        }

        static {
            AccessFactor accessFactor = new AccessFactor("PASSWORD", 0, LoginApiConstants.PARAM_NAME_PASSWORD);
            PASSWORD = accessFactor;
            AccessFactor accessFactor2 = new AccessFactor("SMS_CODE", 1, "sms_code");
            SMS_CODE = accessFactor2;
            AccessFactor[] accessFactorArr = {accessFactor, accessFactor2};
            $VALUES = accessFactorArr;
            $ENTRIES = new asp(accessFactorArr);
            Companion = new a();
        }

        public AccessFactor(String str, int i, String str2) {
            this.value = str2;
        }

        public static AccessFactor valueOf(String str) {
            return (AccessFactor) Enum.valueOf(AccessFactor.class, str);
        }

        public static AccessFactor[] values() {
            return (AccessFactor[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InitPasswordCheckResponse.kt */
    public static final class AccessFactor2 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessFactor2[] $VALUES;
        public static final a Companion;
        public static final AccessFactor2 SMS_CODE;
        private final String value = "sms_code";

        /* compiled from: InitPasswordCheckResponse.kt */
        public static final class a {
        }

        static {
            AccessFactor2 accessFactor2 = new AccessFactor2();
            SMS_CODE = accessFactor2;
            AccessFactor2[] accessFactor2Arr = {accessFactor2};
            $VALUES = accessFactor2Arr;
            $ENTRIES = new asp(accessFactor2Arr);
            Companion = new a();
        }

        public static AccessFactor2 valueOf(String str) {
            return (AccessFactor2) Enum.valueOf(AccessFactor2.class, str);
        }

        public static AccessFactor2[] values() {
            return (AccessFactor2[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public InitPasswordCheckResponse(AccessFactor accessFactor, AccessFactor2 accessFactor2) {
        this.a = accessFactor;
        this.b = accessFactor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitPasswordCheckResponse)) {
            return false;
        }
        InitPasswordCheckResponse initPasswordCheckResponse = (InitPasswordCheckResponse) obj;
        return this.a == initPasswordCheckResponse.a && this.b == initPasswordCheckResponse.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AccessFactor2 accessFactor2 = this.b;
        return hashCode + (accessFactor2 == null ? 0 : accessFactor2.hashCode());
    }

    public final String toString() {
        return "InitPasswordCheckResponse(accessFactor=" + this.a + ", accessFactor2=" + this.b + ')';
    }
}
