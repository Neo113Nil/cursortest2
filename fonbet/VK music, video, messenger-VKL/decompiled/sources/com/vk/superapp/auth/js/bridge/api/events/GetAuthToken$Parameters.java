package com.vk.superapp.auth.js.bridge.api.events;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GetAuthToken.kt */
/* loaded from: classes6.dex */
public final class GetAuthToken$Parameters implements ad6 {

    @pmi0("app_id")
    private final long appId;

    @pmi0("append_local")
    private final Boolean appendLocal;

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("sak_is_main_frame")
    private final boolean sakIsMainFrame;

    @pmi0("sak_source_url")
    private final String sakSourceUrl;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final String scope;

    public GetAuthToken$Parameters(long j, String str, boolean z, String str2, Boolean bool, String str3, String str4) {
        this.appId = j;
        this.requestId = str;
        this.sakIsMainFrame = z;
        this.scope = str2;
        this.appendLocal = bool;
        this.redirectUrl = str3;
        this.sakSourceUrl = str4;
    }

    public static final GetAuthToken$Parameters a(GetAuthToken$Parameters getAuthToken$Parameters) {
        return getAuthToken$Parameters.requestId == null ? new GetAuthToken$Parameters(getAuthToken$Parameters.appId, "default_request_id", getAuthToken$Parameters.sakIsMainFrame, getAuthToken$Parameters.scope, getAuthToken$Parameters.appendLocal, getAuthToken$Parameters.redirectUrl, getAuthToken$Parameters.sakSourceUrl) : getAuthToken$Parameters;
    }

    public static final void b(GetAuthToken$Parameters getAuthToken$Parameters) {
        if (getAuthToken$Parameters.appId < 1) {
            throw new IllegalArgumentException("Value appId cannot be less than 1");
        }
    }

    public static final void c(GetAuthToken$Parameters getAuthToken$Parameters) {
        if (getAuthToken$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final long d() {
        return this.appId;
    }

    public final Boolean e() {
        return this.appendLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthToken$Parameters)) {
            return false;
        }
        GetAuthToken$Parameters getAuthToken$Parameters = (GetAuthToken$Parameters) obj;
        return this.appId == getAuthToken$Parameters.appId && epx.f(this.requestId, getAuthToken$Parameters.requestId) && this.sakIsMainFrame == getAuthToken$Parameters.sakIsMainFrame && epx.f(this.scope, getAuthToken$Parameters.scope) && epx.f(this.appendLocal, getAuthToken$Parameters.appendLocal) && epx.f(this.redirectUrl, getAuthToken$Parameters.redirectUrl) && epx.f(this.sakSourceUrl, getAuthToken$Parameters.sakSourceUrl);
    }

    public final String f() {
        return this.requestId;
    }

    public final String g() {
        return this.scope;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(Long.hashCode(this.appId) * 31, 31, this.requestId), 31, this.sakIsMainFrame);
        String str = this.scope;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.appendLocal;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.redirectUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sakSourceUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", sakIsMainFrame=");
        sb.append(this.sakIsMainFrame);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", appendLocal=");
        sb.append(this.appendLocal);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", sakSourceUrl=");
        return ho8.a(sb, this.sakSourceUrl, ')');
    }

    public /* synthetic */ GetAuthToken$Parameters(long j, String str, boolean z, String str2, Boolean bool, String str3, String str4, int i, zcl zclVar) {
        this(j, str, z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
