package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthPauseRequests.kt */
/* loaded from: classes6.dex */
public final class AuthPauseRequests$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AuthPauseRequests$Parameters(String str) {
        this.requestId = str;
    }

    public static final AuthPauseRequests$Parameters a(AuthPauseRequests$Parameters authPauseRequests$Parameters) {
        return authPauseRequests$Parameters.requestId == null ? new AuthPauseRequests$Parameters("default_request_id") : authPauseRequests$Parameters;
    }

    public static final void b(AuthPauseRequests$Parameters authPauseRequests$Parameters) {
        if (authPauseRequests$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthPauseRequests$Parameters) && epx.f(this.requestId, ((AuthPauseRequests$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
