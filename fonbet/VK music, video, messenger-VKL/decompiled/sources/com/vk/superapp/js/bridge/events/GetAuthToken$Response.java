package com.vk.superapp.js.bridge.events;

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

    @pmi0("type")
    private final String type;

    public GetAuthToken$Response(String str, Data data) {
        this.type = str;
        this.data = data;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetAuthToken$Response(this.type, Data.a(str, this.data));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthToken$Response)) {
            return false;
        }
        GetAuthToken$Response getAuthToken$Response = (GetAuthToken$Response) obj;
        return epx.f(this.type, getAuthToken$Response.type) && epx.f(this.data, getAuthToken$Response.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Response(type=" + this.type + ", data=" + this.data + ')';
    }

    public /* synthetic */ GetAuthToken$Response(String str, Data data, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAccessTokenReceived" : str, data);
    }

    /* compiled from: GetAuthToken.kt */
    public static final class Data {

        @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
        private final String accessToken;

        @pmi0("expires")
        private final Integer expires;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
        private final String scope;

        @pmi0("status")
        private final Boolean status;

        public Data(String str, String str2, Integer num, Boolean bool, String str3) {
            this.accessToken = str;
            this.scope = str2;
            this.expires = num;
            this.status = bool;
            this.requestId = str3;
        }

        public static Data a(String str, Data data) {
            String str2 = data.accessToken;
            String str3 = data.scope;
            Integer num = data.expires;
            Boolean bool = data.status;
            data.getClass();
            return new Data(str2, str3, num, bool, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.accessToken, data.accessToken) && epx.f(this.scope, data.scope) && epx.f(this.expires, data.expires) && epx.f(this.status, data.status) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = this.accessToken.hashCode() * 31;
            String str = this.scope;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expires;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.status;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.requestId;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(accessToken=");
            sb.append(this.accessToken);
            sb.append(", scope=");
            sb.append(this.scope);
            sb.append(", expires=");
            sb.append(this.expires);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, Integer num, Boolean bool, String str3, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str3);
        }
    }
}
