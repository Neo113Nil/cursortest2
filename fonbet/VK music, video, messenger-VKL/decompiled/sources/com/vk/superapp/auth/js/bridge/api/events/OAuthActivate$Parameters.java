package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OAuthActivate.kt */
/* loaded from: classes6.dex */
public final class OAuthActivate$Parameters implements ad6 {

    @pmi0("oauth_service")
    private final String oauthService;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OAuthActivate$Parameters(String str, String str2) {
        this.oauthService = str;
        this.requestId = str2;
    }

    public static final OAuthActivate$Parameters a(OAuthActivate$Parameters oAuthActivate$Parameters) {
        return oAuthActivate$Parameters.requestId == null ? new OAuthActivate$Parameters(oAuthActivate$Parameters.oauthService, "default_request_id") : oAuthActivate$Parameters;
    }

    public static final void b(OAuthActivate$Parameters oAuthActivate$Parameters) {
        if (oAuthActivate$Parameters.oauthService == null) {
            throw new IllegalArgumentException("Value of non-nullable member oauthService cannot\n                        be null");
        }
        if (oAuthActivate$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.oauthService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthActivate$Parameters)) {
            return false;
        }
        OAuthActivate$Parameters oAuthActivate$Parameters = (OAuthActivate$Parameters) obj;
        return epx.f(this.oauthService, oAuthActivate$Parameters.oauthService) && epx.f(this.requestId, oAuthActivate$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (this.oauthService.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(oauthService=");
        sb.append(this.oauthService);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
