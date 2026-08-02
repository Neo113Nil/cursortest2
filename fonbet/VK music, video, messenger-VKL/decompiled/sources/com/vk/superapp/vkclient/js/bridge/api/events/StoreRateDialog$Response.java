package com.vk.superapp.vkclient.js.bridge.api.events;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoreRateDialog.kt */
/* loaded from: classes6.dex */
public final class StoreRateDialog$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public StoreRateDialog$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new StoreRateDialog$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreRateDialog$Response)) {
            return false;
        }
        StoreRateDialog$Response storeRateDialog$Response = (StoreRateDialog$Response) obj;
        return epx.f(this.type, storeRateDialog$Response.type) && epx.f(this.data, storeRateDialog$Response.data) && epx.f(this.requestId, storeRateDialog$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: StoreRateDialog.kt */
    public static final class Data {

        @pmi0("error_reason")
        private final ErrorReason errorReason;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final boolean result;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StoreRateDialog.kt */
        public static final class ErrorReason {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ErrorReason[] $VALUES;

            @pmi0("cancelled")
            public static final ErrorReason CANCELLED;

            @pmi0("internal_error")
            public static final ErrorReason INTERNAL_ERROR;

            @pmi0("invalid_request")
            public static final ErrorReason INVALID_REQUEST;

            @pmi0("store_not_found")
            public static final ErrorReason STORE_NOT_FOUND;

            @pmi0("unknown")
            public static final ErrorReason UNKNOWN;

            static {
                ErrorReason errorReason = new ErrorReason("INTERNAL_ERROR", 0);
                INTERNAL_ERROR = errorReason;
                ErrorReason errorReason2 = new ErrorReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
                UNKNOWN = errorReason2;
                ErrorReason errorReason3 = new ErrorReason("STORE_NOT_FOUND", 2);
                STORE_NOT_FOUND = errorReason3;
                ErrorReason errorReason4 = new ErrorReason("INVALID_REQUEST", 3);
                INVALID_REQUEST = errorReason4;
                ErrorReason errorReason5 = new ErrorReason("CANCELLED", 4);
                CANCELLED = errorReason5;
                ErrorReason[] errorReasonArr = {errorReason, errorReason2, errorReason3, errorReason4, errorReason5};
                $VALUES = errorReasonArr;
                $ENTRIES = new asp(errorReasonArr);
            }

            private ErrorReason(String str, int i) {
            }

            public static ErrorReason valueOf(String str) {
                return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
            }

            public static ErrorReason[] values() {
                return (ErrorReason[]) $VALUES.clone();
            }
        }

        public Data(boolean z, ErrorReason errorReason, String str) {
            this.result = z;
            this.errorReason = errorReason;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.result == data.result && this.errorReason == data.errorReason && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.result) * 31;
            ErrorReason errorReason = this.errorReason;
            int hashCode2 = (hashCode + (errorReason == null ? 0 : errorReason.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, ErrorReason errorReason, String str, int i, zcl zclVar) {
            this(z, (i & 2) != 0 ? null : errorReason, str);
        }
    }

    public /* synthetic */ StoreRateDialog$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppStoreRateDialogResult" : str, data, str2);
    }
}
