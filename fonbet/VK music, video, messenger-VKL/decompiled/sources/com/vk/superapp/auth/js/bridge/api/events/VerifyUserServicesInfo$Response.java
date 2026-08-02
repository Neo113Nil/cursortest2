package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VerifyUserServicesInfo.kt */
/* loaded from: classes6.dex */
public final class VerifyUserServicesInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: VerifyUserServicesInfo.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("supported_oauth_verification_providers")
        private final List<SupportedOauthVerificationProviders> supportedOauthVerificationProviders;

        /* compiled from: VerifyUserServicesInfo.kt */
        public static final class SupportedOauthVerificationProviders {

            @pmi0("type")
            private final String type;

            @pmi0("version")
            private final int version;

            public SupportedOauthVerificationProviders(String str, int i) {
                this.type = str;
                this.version = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportedOauthVerificationProviders)) {
                    return false;
                }
                SupportedOauthVerificationProviders supportedOauthVerificationProviders = (SupportedOauthVerificationProviders) obj;
                return epx.f(this.type, supportedOauthVerificationProviders.type) && this.version == supportedOauthVerificationProviders.version;
            }

            public final int hashCode() {
                return Integer.hashCode(this.version) + (this.type.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SupportedOauthVerificationProviders(type=");
                sb.append(this.type);
                sb.append(", version=");
                return vu5.b(sb, this.version, ')');
            }
        }

        public Data(List<SupportedOauthVerificationProviders> list, String str) {
            this.supportedOauthVerificationProviders = list;
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
            return epx.f(this.supportedOauthVerificationProviders, data.supportedOauthVerificationProviders) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.supportedOauthVerificationProviders.hashCode() * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(supportedOauthVerificationProviders=");
            sb.append(this.supportedOauthVerificationProviders);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public VerifyUserServicesInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new VerifyUserServicesInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyUserServicesInfo$Response)) {
            return false;
        }
        VerifyUserServicesInfo$Response verifyUserServicesInfo$Response = (VerifyUserServicesInfo$Response) obj;
        return epx.f(this.type, verifyUserServicesInfo$Response.type) && epx.f(this.data, verifyUserServicesInfo$Response.data) && epx.f(this.requestId, verifyUserServicesInfo$Response.requestId);
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

    public /* synthetic */ VerifyUserServicesInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppVerifyUserServicesInfoResult" : str, data, str2);
    }
}
