package com.vk.superapp.dating.sdk.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetPermissions.kt */
/* loaded from: classes6.dex */
public final class GetPermissions$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetPermissions$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetPermissions$Parameters a(GetPermissions$Parameters getPermissions$Parameters) {
        return getPermissions$Parameters.requestId == null ? new GetPermissions$Parameters("default_request_id") : getPermissions$Parameters;
    }

    public static final void b(GetPermissions$Parameters getPermissions$Parameters) {
        if (getPermissions$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPermissions$Parameters) && epx.f(this.requestId, ((GetPermissions$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
