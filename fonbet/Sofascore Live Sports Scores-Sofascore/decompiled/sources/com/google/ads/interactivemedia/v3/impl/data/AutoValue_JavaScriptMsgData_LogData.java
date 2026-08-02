package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_JavaScriptMsgData_LogData extends JavaScriptMsgData.LogData {

    @Nullable
    private final Integer errorCode;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String innerError;

    @Nullable
    private final String type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends JavaScriptMsgData.LogData.Builder {
        private Integer errorCode;
        private String errorMessage;
        private String innerError;
        private String type;

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData.Builder
        public JavaScriptMsgData.LogData build() {
            return new AutoValue_JavaScriptMsgData_LogData(this.type, this.errorCode, this.errorMessage, this.innerError, null);
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData.Builder
        public JavaScriptMsgData.LogData.Builder setErrorCode(@Nullable Integer num) {
            this.errorCode = num;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData.Builder
        public JavaScriptMsgData.LogData.Builder setErrorMessage(@Nullable String str) {
            this.errorMessage = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData.Builder
        public JavaScriptMsgData.LogData.Builder setInnerError(@Nullable String str) {
            this.innerError = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData.Builder
        public JavaScriptMsgData.LogData.Builder setType(@Nullable String str) {
            this.type = str;
            return this;
        }
    }

    private AutoValue_JavaScriptMsgData_LogData(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.errorCode = num;
        this.errorMessage = str2;
        this.innerError = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JavaScriptMsgData.LogData) {
            JavaScriptMsgData.LogData logData = (JavaScriptMsgData.LogData) obj;
            String str = this.type;
            if (str != null ? str.equals(logData.type()) : logData.type() == null) {
                Integer num = this.errorCode;
                if (num != null ? num.equals(logData.errorCode()) : logData.errorCode() == null) {
                    String str2 = this.errorMessage;
                    if (str2 != null ? str2.equals(logData.errorMessage()) : logData.errorMessage() == null) {
                        String str3 = this.innerError;
                        if (str3 != null ? str3.equals(logData.innerError()) : logData.innerError() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData
    @Nullable
    public Integer errorCode() {
        return this.errorCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData
    @Nullable
    public String errorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.errorCode;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i = hashCode ^ 1000003;
        String str2 = this.errorMessage;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.innerError;
        return hashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData
    @Nullable
    public String innerError() {
        return this.innerError;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData.LogData
    @Nullable
    public String type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_JavaScriptMsgData_LogData(String str, Integer num, String str2, String str3, byte[] bArr) {
        this(str, num, str2, str3);
    }
}
