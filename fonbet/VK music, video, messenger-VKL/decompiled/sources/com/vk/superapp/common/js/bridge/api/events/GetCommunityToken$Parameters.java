package com.vk.superapp.common.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetCommunityToken.kt */
/* loaded from: classes6.dex */
public final class GetCommunityToken$Parameters implements ad6 {

    @pmi0("app_id")
    private final int appId;

    @pmi0("group_id")
    private final int groupId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("sak_source_url")
    private final String sakSourceUrl;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final String scope;

    public GetCommunityToken$Parameters(int i, int i2, String str, String str2, String str3) {
        this.appId = i;
        this.groupId = i2;
        this.scope = str;
        this.requestId = str2;
        this.sakSourceUrl = str3;
    }

    public static final GetCommunityToken$Parameters a(GetCommunityToken$Parameters getCommunityToken$Parameters) {
        return getCommunityToken$Parameters.requestId == null ? new GetCommunityToken$Parameters(getCommunityToken$Parameters.appId, getCommunityToken$Parameters.groupId, getCommunityToken$Parameters.scope, "default_request_id", getCommunityToken$Parameters.sakSourceUrl) : getCommunityToken$Parameters;
    }

    public static final void b(GetCommunityToken$Parameters getCommunityToken$Parameters) {
        if (getCommunityToken$Parameters.appId < 1) {
            throw new IllegalArgumentException("Value appId cannot be less than 1");
        }
    }

    public static final void c(GetCommunityToken$Parameters getCommunityToken$Parameters) {
        if (getCommunityToken$Parameters.groupId < 1) {
            throw new IllegalArgumentException("Value groupId cannot be less than 1");
        }
    }

    public static final void d(GetCommunityToken$Parameters getCommunityToken$Parameters) {
        if (getCommunityToken$Parameters.scope == null) {
            throw new IllegalArgumentException("Value of non-nullable member scope cannot be\n                        null");
        }
        if (getCommunityToken$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCommunityToken$Parameters)) {
            return false;
        }
        GetCommunityToken$Parameters getCommunityToken$Parameters = (GetCommunityToken$Parameters) obj;
        return this.appId == getCommunityToken$Parameters.appId && this.groupId == getCommunityToken$Parameters.groupId && epx.f(this.scope, getCommunityToken$Parameters.scope) && epx.f(this.requestId, getCommunityToken$Parameters.requestId) && epx.f(this.sakSourceUrl, getCommunityToken$Parameters.sakSourceUrl);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(shy.a(this.groupId, Integer.hashCode(this.appId) * 31, 31), 31, this.scope), 31, this.requestId);
        String str = this.sakSourceUrl;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", sakSourceUrl=");
        return ho8.a(sb, this.sakSourceUrl, ')');
    }

    public /* synthetic */ GetCommunityToken$Parameters(int i, int i2, String str, String str2, String str3, int i3, zcl zclVar) {
        this(i, i2, str, str2, (i3 & 16) != 0 ? null : str3);
    }
}
