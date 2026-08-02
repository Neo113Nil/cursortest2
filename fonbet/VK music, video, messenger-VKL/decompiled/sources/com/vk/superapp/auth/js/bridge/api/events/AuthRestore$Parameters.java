package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthRestore.kt */
/* loaded from: classes6.dex */
public final class AuthRestore$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("user_id")
    private final long userId;

    public AuthRestore$Parameters(long j, String str) {
        this.userId = j;
        this.requestId = str;
    }

    public static final AuthRestore$Parameters a(AuthRestore$Parameters authRestore$Parameters) {
        return authRestore$Parameters.requestId == null ? new AuthRestore$Parameters(authRestore$Parameters.userId, "default_request_id") : authRestore$Parameters;
    }

    public static final void b(AuthRestore$Parameters authRestore$Parameters) {
        if (authRestore$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final long c() {
        return this.userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRestore$Parameters)) {
            return false;
        }
        AuthRestore$Parameters authRestore$Parameters = (AuthRestore$Parameters) obj;
        return this.userId == authRestore$Parameters.userId && epx.f(this.requestId, authRestore$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Long.hashCode(this.userId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(userId=");
        sb.append(this.userId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
