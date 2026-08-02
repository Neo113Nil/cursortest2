package com.vk.superapp.common.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.sdk.SharedKt;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetCommunityToken.kt */
/* loaded from: classes6.dex */
public final class GetCommunityToken$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetCommunityToken$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetCommunityToken$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCommunityToken$Response)) {
            return false;
        }
        GetCommunityToken$Response getCommunityToken$Response = (GetCommunityToken$Response) obj;
        return epx.f(this.type, getCommunityToken$Response.type) && epx.f(this.data, getCommunityToken$Response.data) && epx.f(this.requestId, getCommunityToken$Response.requestId);
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

    /* compiled from: GetCommunityToken.kt */
    public static final class Data {

        @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
        private final String accessToken;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
        private final String scope;

        public Data(String str, String str2, String str3) {
            this.accessToken = str;
            this.scope = str2;
            this.requestId = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.accessToken, data.accessToken) && epx.f(this.scope, data.scope) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            String str = this.accessToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.scope;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestId;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(accessToken=");
            sb.append(this.accessToken);
            sb.append(", scope=");
            sb.append(this.scope);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(String str, String str2, String str3, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ GetCommunityToken$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetCommunityTokenResult" : str, data, str2);
    }
}
