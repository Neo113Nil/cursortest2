package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthByExchangeToken.kt */
/* loaded from: classes6.dex */
public final class AuthByExchangeToken$Parameters implements ad6 {

    @pmi0("exchange_token")
    private final String exchangeToken;

    @pmi0("keep_alive")
    private final Boolean keepAlive;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AuthByExchangeToken$Parameters(String str, String str2, Boolean bool) {
        this.exchangeToken = str;
        this.requestId = str2;
        this.keepAlive = bool;
    }

    public static final AuthByExchangeToken$Parameters a(AuthByExchangeToken$Parameters authByExchangeToken$Parameters) {
        return authByExchangeToken$Parameters.requestId == null ? new AuthByExchangeToken$Parameters(authByExchangeToken$Parameters.exchangeToken, "default_request_id", authByExchangeToken$Parameters.keepAlive) : authByExchangeToken$Parameters;
    }

    public static final void b(AuthByExchangeToken$Parameters authByExchangeToken$Parameters) {
        if (authByExchangeToken$Parameters.exchangeToken == null) {
            throw new IllegalArgumentException("Value of non-nullable member exchangeToken cannot\n                        be null");
        }
        if (authByExchangeToken$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.exchangeToken;
    }

    public final Boolean d() {
        return this.keepAlive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthByExchangeToken$Parameters)) {
            return false;
        }
        AuthByExchangeToken$Parameters authByExchangeToken$Parameters = (AuthByExchangeToken$Parameters) obj;
        return epx.f(this.exchangeToken, authByExchangeToken$Parameters.exchangeToken) && epx.f(this.requestId, authByExchangeToken$Parameters.requestId) && epx.f(this.keepAlive, authByExchangeToken$Parameters.keepAlive);
    }

    public final int hashCode() {
        int a = urd0.a(this.exchangeToken.hashCode() * 31, 31, this.requestId);
        Boolean bool = this.keepAlive;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(exchangeToken=");
        sb.append(this.exchangeToken);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", keepAlive=");
        return tn.a(sb, this.keepAlive, ')');
    }

    public /* synthetic */ AuthByExchangeToken$Parameters(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool);
    }
}
