package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthByExchangeToken.kt */
/* loaded from: classes6.dex */
public final class AuthByExchangeToken$Response implements bd6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public AuthByExchangeToken$Response(String str, String str2) {
        this.type = str;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new AuthByExchangeToken$Response(this.type, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthByExchangeToken$Response)) {
            return false;
        }
        AuthByExchangeToken$Response authByExchangeToken$Response = (AuthByExchangeToken$Response) obj;
        return epx.f(this.type, authByExchangeToken$Response.type) && epx.f(this.requestId, authByExchangeToken$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ AuthByExchangeToken$Response(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppAuthByExchangeTokenResult" : str, str2);
    }
}
