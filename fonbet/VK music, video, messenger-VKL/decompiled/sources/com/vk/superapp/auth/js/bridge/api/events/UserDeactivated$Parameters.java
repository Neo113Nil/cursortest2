package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: UserDeactivated.kt */
/* loaded from: classes6.dex */
public final class UserDeactivated$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public UserDeactivated$Parameters(String str) {
        this.requestId = str;
    }

    public static final UserDeactivated$Parameters a(UserDeactivated$Parameters userDeactivated$Parameters) {
        return userDeactivated$Parameters.requestId == null ? new UserDeactivated$Parameters("default_request_id") : userDeactivated$Parameters;
    }

    public static final void b(UserDeactivated$Parameters userDeactivated$Parameters) {
        if (userDeactivated$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserDeactivated$Parameters) && epx.f(this.requestId, ((UserDeactivated$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
