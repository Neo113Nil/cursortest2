package com.vk.superapp.base.js.bridge;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$AuthError {

    @pmi0("error_data")
    private final ErrorData errorData;

    @pmi0("error_type")
    private final String errorType;

    /* compiled from: Responses.kt */
    public static final class ErrorData {

        @pmi0("error")
        private final String error;

        @pmi0("error_description")
        private final String errorDescription;

        @pmi0("error_reason")
        private final String errorReason;

        public ErrorData() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorData)) {
                return false;
            }
            ErrorData errorData = (ErrorData) obj;
            return epx.f(this.error, errorData.error) && epx.f(this.errorReason, errorData.errorReason) && epx.f(this.errorDescription, errorData.errorDescription);
        }

        public final int hashCode() {
            String str = this.error;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorReason;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorDescription;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorData(error=");
            sb.append(this.error);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorDescription=");
            return ho8.a(sb, this.errorDescription, ')');
        }

        public ErrorData(String str, String str2, String str3) {
            this.error = str;
            this.errorReason = str2;
            this.errorDescription = str3;
        }

        public /* synthetic */ ErrorData(String str, String str2, String str3, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public Responses$AuthError(String str, ErrorData errorData) {
        this.errorType = str;
        this.errorData = errorData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$AuthError)) {
            return false;
        }
        Responses$AuthError responses$AuthError = (Responses$AuthError) obj;
        return epx.f(this.errorType, responses$AuthError.errorType) && epx.f(this.errorData, responses$AuthError.errorData);
    }

    public final int hashCode() {
        return this.errorData.hashCode() + (this.errorType.hashCode() * 31);
    }

    public final String toString() {
        return "AuthError(errorType=" + this.errorType + ", errorData=" + this.errorData + ')';
    }

    public /* synthetic */ Responses$AuthError(String str, ErrorData errorData, int i, zcl zclVar) {
        this((i & 1) != 0 ? "auth_error" : str, errorData);
    }
}
