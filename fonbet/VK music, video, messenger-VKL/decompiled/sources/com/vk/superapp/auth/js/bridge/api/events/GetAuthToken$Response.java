package com.vk.superapp.auth.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.sdk.SharedKt;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetAuthToken.kt */
/* loaded from: classes6.dex */
public final class GetAuthToken$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetAuthToken$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetAuthToken$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthToken$Response)) {
            return false;
        }
        GetAuthToken$Response getAuthToken$Response = (GetAuthToken$Response) obj;
        return epx.f(this.type, getAuthToken$Response.type) && epx.f(this.data, getAuthToken$Response.data) && epx.f(this.requestId, getAuthToken$Response.requestId);
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

    public /* synthetic */ GetAuthToken$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAccessTokenReceived" : str, data, str2);
    }

    /* compiled from: GetAuthToken.kt */
    public static final class Data {

        @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
        private final String accessToken;

        @pmi0("expires")
        private final Long expires;

        @pmi0("local_access_token")
        private final String localAccessToken;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
        private final String scope;

        @pmi0("status")
        private final Boolean status;

        public Data(String str, String str2, String str3, Long l, Boolean bool, String str4) {
            this.accessToken = str;
            this.localAccessToken = str2;
            this.scope = str3;
            this.expires = l;
            this.status = bool;
            this.requestId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.accessToken, data.accessToken) && epx.f(this.localAccessToken, data.localAccessToken) && epx.f(this.scope, data.scope) && epx.f(this.expires, data.expires) && epx.f(this.status, data.status) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.accessToken.hashCode() * 31;
            String str = this.localAccessToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.scope;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.expires;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Boolean bool = this.status;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(accessToken=");
            sb.append(this.accessToken);
            sb.append(", localAccessToken=");
            sb.append(this.localAccessToken);
            sb.append(", scope=");
            sb.append(this.scope);
            sb.append(", expires=");
            sb.append(this.expires);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Data(String str, String str2, String str3, Long l, Boolean bool, String str4, int i, zcl zclVar) {
            this(str, str2, str3, l, r7, r8);
            String str5;
            Boolean bool2;
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 4) != 0 ? null : str3;
            l = (i & 8) != 0 ? null : l;
            if ((i & 16) != 0) {
                str5 = str4;
                bool2 = null;
            } else {
                str5 = str4;
                bool2 = bool;
            }
        }
    }
}
