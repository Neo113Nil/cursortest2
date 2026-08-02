package com.vk.superapp.common.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.q0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CheckAllowedScopes.kt */
/* loaded from: classes6.dex */
public final class CheckAllowedScopes$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public CheckAllowedScopes$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new CheckAllowedScopes$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAllowedScopes$Response)) {
            return false;
        }
        CheckAllowedScopes$Response checkAllowedScopes$Response = (CheckAllowedScopes$Response) obj;
        return epx.f(this.type, checkAllowedScopes$Response.type) && epx.f(this.data, checkAllowedScopes$Response.data) && epx.f(this.requestId, checkAllowedScopes$Response.requestId);
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

    /* compiled from: CheckAllowedScopes.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final List<Result> result;

        /* compiled from: CheckAllowedScopes.kt */
        public static final class Result {

            @pmi0("allowed")
            private final boolean allowed;

            @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
            private final String scope;

            public Result(String str, boolean z) {
                this.scope = str;
                this.allowed = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return epx.f(this.scope, result.scope) && this.allowed == result.allowed;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.allowed) + (this.scope.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(scope=");
                sb.append(this.scope);
                sb.append(", allowed=");
                return q0.a(sb, this.allowed, ')');
            }
        }

        public Data(List<Result> list, String str) {
            this.result = list;
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
            return epx.f(this.result, data.result) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            List<Result> list = this.result;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(List list, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, str);
        }
    }

    public /* synthetic */ CheckAllowedScopes$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppCheckAllowedScopesResult" : str, data, str2);
    }
}
