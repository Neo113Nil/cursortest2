package com.vk.superapp.js.bridge.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GetAuthToken.kt */
/* loaded from: classes6.dex */
public final class GetAuthToken$Parameters implements ad6 {

    @pmi0("app_id")
    private final int appId;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final String scope;

    public GetAuthToken$Parameters(int i, String str, String str2, String str3) {
        this.appId = i;
        this.scope = str;
        this.redirectUrl = str2;
        this.requestId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthToken$Parameters)) {
            return false;
        }
        GetAuthToken$Parameters getAuthToken$Parameters = (GetAuthToken$Parameters) obj;
        return this.appId == getAuthToken$Parameters.appId && epx.f(this.scope, getAuthToken$Parameters.scope) && epx.f(this.redirectUrl, getAuthToken$Parameters.redirectUrl) && epx.f(this.requestId, getAuthToken$Parameters.requestId);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.appId) * 31;
        String str = this.scope;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetAuthToken$Parameters(int i, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
