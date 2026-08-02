package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OAuthDeactivate.kt */
/* loaded from: classes6.dex */
public final class OAuthDeactivate$Parameters implements ad6 {

    @pmi0("auth_label")
    private final String authLabel;

    @pmi0("is_deactivate_all_auth_labels")
    private final Boolean isDeactivateAllAuthLabels;

    @pmi0("oauth_service")
    private final String oauthService;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OAuthDeactivate$Parameters(String str, String str2, String str3, Boolean bool) {
        this.oauthService = str;
        this.requestId = str2;
        this.authLabel = str3;
        this.isDeactivateAllAuthLabels = bool;
    }

    public static final OAuthDeactivate$Parameters a(OAuthDeactivate$Parameters oAuthDeactivate$Parameters) {
        return oAuthDeactivate$Parameters.requestId == null ? new OAuthDeactivate$Parameters(oAuthDeactivate$Parameters.oauthService, "default_request_id", oAuthDeactivate$Parameters.authLabel, oAuthDeactivate$Parameters.isDeactivateAllAuthLabels) : oAuthDeactivate$Parameters;
    }

    public static final void b(OAuthDeactivate$Parameters oAuthDeactivate$Parameters) {
        if (oAuthDeactivate$Parameters.oauthService == null) {
            throw new IllegalArgumentException("Value of non-nullable member oauthService cannot\n                        be null");
        }
        if (oAuthDeactivate$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.authLabel;
    }

    public final String d() {
        return this.oauthService;
    }

    public final Boolean e() {
        return this.isDeactivateAllAuthLabels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthDeactivate$Parameters)) {
            return false;
        }
        OAuthDeactivate$Parameters oAuthDeactivate$Parameters = (OAuthDeactivate$Parameters) obj;
        return epx.f(this.oauthService, oAuthDeactivate$Parameters.oauthService) && epx.f(this.requestId, oAuthDeactivate$Parameters.requestId) && epx.f(this.authLabel, oAuthDeactivate$Parameters.authLabel) && epx.f(this.isDeactivateAllAuthLabels, oAuthDeactivate$Parameters.isDeactivateAllAuthLabels);
    }

    public final int hashCode() {
        int a = urd0.a(this.oauthService.hashCode() * 31, 31, this.requestId);
        String str = this.authLabel;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDeactivateAllAuthLabels;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(oauthService=");
        sb.append(this.oauthService);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", authLabel=");
        sb.append(this.authLabel);
        sb.append(", isDeactivateAllAuthLabels=");
        return tn.a(sb, this.isDeactivateAllAuthLabels, ')');
    }

    public /* synthetic */ OAuthDeactivate$Parameters(String str, String str2, String str3, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
