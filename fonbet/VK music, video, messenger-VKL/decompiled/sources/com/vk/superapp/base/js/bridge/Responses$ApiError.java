package com.vk.superapp.base.js.bridge;

import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Responses.kt */
/* loaded from: classes6.dex */
public final class Responses$ApiError {

    @pmi0("error_data")
    private final ErrorData errorData;

    @pmi0("error_type")
    private final String errorType;

    public Responses$ApiError(String str, ErrorData errorData) {
        this.errorType = str;
        this.errorData = errorData;
    }

    public final ErrorData a() {
        return this.errorData;
    }

    public final String b() {
        return this.errorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Responses$ApiError)) {
            return false;
        }
        Responses$ApiError responses$ApiError = (Responses$ApiError) obj;
        return epx.f(this.errorType, responses$ApiError.errorType) && epx.f(this.errorData, responses$ApiError.errorData);
    }

    public final int hashCode() {
        return this.errorData.hashCode() + (this.errorType.hashCode() * 31);
    }

    public final String toString() {
        return "ApiError(errorType=" + this.errorType + ", errorData=" + this.errorData + ')';
    }

    /* compiled from: Responses.kt */
    public static final class ErrorData {

        @pmi0("error_code")
        private final int errorCode;

        @pmi0(SharedKt.PARAM_ERROR_MSG)
        private final String errorMsg;

        @pmi0("request_params")
        private final List<RequestParams> requestParams;

        public ErrorData(int i, String str, List<RequestParams> list) {
            this.errorCode = i;
            this.errorMsg = str;
            this.requestParams = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorData)) {
                return false;
            }
            ErrorData errorData = (ErrorData) obj;
            return this.errorCode == errorData.errorCode && epx.f(this.errorMsg, errorData.errorMsg) && epx.f(this.requestParams, errorData.requestParams);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.errorCode) * 31, 31, this.errorMsg);
            List<RequestParams> list = this.requestParams;
            return a + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorData(errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMsg=");
            sb.append(this.errorMsg);
            sb.append(", requestParams=");
            return ms9.a(')', sb, this.requestParams);
        }

        /* compiled from: Responses.kt */
        public static final class RequestParams {

            @pmi0("key")
            private final String key;

            @pmi0("value")
            private final String value;

            public RequestParams(String str, String str2) {
                this.key = str;
                this.value = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestParams)) {
                    return false;
                }
                RequestParams requestParams = (RequestParams) obj;
                return epx.f(this.key, requestParams.key) && epx.f(this.value, requestParams.value);
            }

            public final int hashCode() {
                int hashCode = this.key.hashCode() * 31;
                String str = this.value;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RequestParams(key=");
                sb.append(this.key);
                sb.append(", value=");
                return ho8.a(sb, this.value, ')');
            }

            public /* synthetic */ RequestParams(String str, String str2, int i, zcl zclVar) {
                this(str, (i & 2) != 0 ? null : str2);
            }
        }

        public /* synthetic */ ErrorData(int i, String str, List list, int i2, zcl zclVar) {
            this(i, str, (i2 & 4) != 0 ? null : list);
        }
    }

    public /* synthetic */ Responses$ApiError(String str, ErrorData errorData, int i, zcl zclVar) {
        this((i & 1) != 0 ? "api_error" : str, errorData);
    }
}
