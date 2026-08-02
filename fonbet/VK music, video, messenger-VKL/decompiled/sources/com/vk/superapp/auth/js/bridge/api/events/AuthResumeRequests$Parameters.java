package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthResumeRequests.kt */
/* loaded from: classes6.dex */
public final class AuthResumeRequests$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AuthResumeRequests$Parameters(String str) {
        this.requestId = str;
    }

    public static final AuthResumeRequests$Parameters a(AuthResumeRequests$Parameters authResumeRequests$Parameters) {
        return authResumeRequests$Parameters.requestId == null ? new AuthResumeRequests$Parameters("default_request_id") : authResumeRequests$Parameters;
    }

    public static final void b(AuthResumeRequests$Parameters authResumeRequests$Parameters) {
        if (authResumeRequests$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthResumeRequests$Parameters) && epx.f(this.requestId, ((AuthResumeRequests$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
