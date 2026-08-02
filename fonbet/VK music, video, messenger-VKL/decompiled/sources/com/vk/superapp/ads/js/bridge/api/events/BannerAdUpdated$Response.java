package com.vk.superapp.ads.js.bridge.api.events;

import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BannerAdUpdated.kt */
/* loaded from: classes6.dex */
public final class BannerAdUpdated$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public BannerAdUpdated$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new BannerAdUpdated$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdUpdated$Response)) {
            return false;
        }
        BannerAdUpdated$Response bannerAdUpdated$Response = (BannerAdUpdated$Response) obj;
        return epx.f(this.type, bannerAdUpdated$Response.type) && epx.f(this.data, bannerAdUpdated$Response.data) && epx.f(this.requestId, bannerAdUpdated$Response.requestId);
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

    /* compiled from: BannerAdUpdated.kt */
    public static final class Data {

        @pmi0("banner_align")
        private final String bannerAlign;

        @pmi0("banner_height")
        private final int bannerHeight;

        @pmi0("banner_location")
        private final String bannerLocation;

        @pmi0("banner_width")
        private final int bannerWidth;

        @pmi0("error_data")
        private final ErrorData errorData;

        @pmi0("error_type")
        private final ErrorType errorType;

        @pmi0("height_type")
        private final String heightType;

        @pmi0(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)
        private final String layoutType;

        @pmi0(X3.i.n)
        private final String orientation;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final boolean result;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BannerAdUpdated.kt */
        public static final class ErrorType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ErrorType[] $VALUES;

            @pmi0("client_error")
            public static final ErrorType CLIENT_ERROR;

            static {
                ErrorType errorType = new ErrorType("CLIENT_ERROR", 0);
                CLIENT_ERROR = errorType;
                ErrorType[] errorTypeArr = {errorType};
                $VALUES = errorTypeArr;
                $ENTRIES = new asp(errorTypeArr);
            }

            private ErrorType(String str, int i) {
            }

            public static ErrorType valueOf(String str) {
                return (ErrorType) Enum.valueOf(ErrorType.class, str);
            }

            public static ErrorType[] values() {
                return (ErrorType[]) $VALUES.clone();
            }
        }

        public Data(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, ErrorType errorType, ErrorData errorData, String str6) {
            this.result = z;
            this.bannerWidth = i;
            this.bannerHeight = i2;
            this.bannerLocation = str;
            this.layoutType = str2;
            this.bannerAlign = str3;
            this.heightType = str4;
            this.orientation = str5;
            this.errorType = errorType;
            this.errorData = errorData;
            this.requestId = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.result == data.result && this.bannerWidth == data.bannerWidth && this.bannerHeight == data.bannerHeight && epx.f(this.bannerLocation, data.bannerLocation) && epx.f(this.layoutType, data.layoutType) && epx.f(this.bannerAlign, data.bannerAlign) && epx.f(this.heightType, data.heightType) && epx.f(this.orientation, data.orientation) && this.errorType == data.errorType && epx.f(this.errorData, data.errorData) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(shy.a(this.bannerHeight, shy.a(this.bannerWidth, Boolean.hashCode(this.result) * 31, 31), 31), 31, this.bannerLocation), 31, this.layoutType);
            String str = this.bannerAlign;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.heightType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.orientation;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ErrorType errorType = this.errorType;
            int hashCode4 = (hashCode3 + (errorType == null ? 0 : errorType.hashCode())) * 31;
            ErrorData errorData = this.errorData;
            int hashCode5 = (hashCode4 + (errorData == null ? 0 : errorData.hashCode())) * 31;
            String str4 = this.requestId;
            return hashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", bannerWidth=");
            sb.append(this.bannerWidth);
            sb.append(", bannerHeight=");
            sb.append(this.bannerHeight);
            sb.append(", bannerLocation=");
            sb.append(this.bannerLocation);
            sb.append(", layoutType=");
            sb.append(this.layoutType);
            sb.append(", bannerAlign=");
            sb.append(this.bannerAlign);
            sb.append(", heightType=");
            sb.append(this.heightType);
            sb.append(", orientation=");
            sb.append(this.orientation);
            sb.append(", errorType=");
            sb.append(this.errorType);
            sb.append(", errorData=");
            sb.append(this.errorData);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* compiled from: BannerAdUpdated.kt */
        public static final class ErrorData {

            @pmi0("error_code")
            private final int errorCode;

            @pmi0("error_description")
            private final String errorDescription;

            @pmi0("error_reason")
            private final String errorReason;

            public ErrorData(int i, String str, String str2) {
                this.errorCode = i;
                this.errorReason = str;
                this.errorDescription = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorData)) {
                    return false;
                }
                ErrorData errorData = (ErrorData) obj;
                return this.errorCode == errorData.errorCode && epx.f(this.errorReason, errorData.errorReason) && epx.f(this.errorDescription, errorData.errorDescription);
            }

            public final int hashCode() {
                int a = urd0.a(Integer.hashCode(this.errorCode) * 31, 31, this.errorReason);
                String str = this.errorDescription;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ErrorData(errorCode=");
                sb.append(this.errorCode);
                sb.append(", errorReason=");
                sb.append(this.errorReason);
                sb.append(", errorDescription=");
                return ho8.a(sb, this.errorDescription, ')');
            }

            public /* synthetic */ ErrorData(int i, String str, String str2, int i2, zcl zclVar) {
                this(i, str, (i2 & 4) != 0 ? null : str2);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, ErrorType errorType, ErrorData errorData, String str6, int i3, zcl zclVar) {
            this(z, i, i2, str, str2, str3, str4, str5, errorType, r12, r13);
            String str7;
            ErrorData errorData2;
            str3 = (i3 & 32) != 0 ? null : str3;
            str4 = (i3 & 64) != 0 ? null : str4;
            str5 = (i3 & 128) != 0 ? null : str5;
            errorType = (i3 & 256) != 0 ? null : errorType;
            if ((i3 & 512) != 0) {
                str7 = str6;
                errorData2 = null;
            } else {
                str7 = str6;
                errorData2 = errorData;
            }
        }
    }

    public /* synthetic */ BannerAdUpdated$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppBannerAdUpdated" : str, data, str2);
    }
}
