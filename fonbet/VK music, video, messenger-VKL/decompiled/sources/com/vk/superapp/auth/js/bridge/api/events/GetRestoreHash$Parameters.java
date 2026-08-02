package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetRestoreHash.kt */
/* loaded from: classes6.dex */
public final class GetRestoreHash$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetRestoreHash$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetRestoreHash$Parameters a(GetRestoreHash$Parameters getRestoreHash$Parameters) {
        return getRestoreHash$Parameters.requestId == null ? new GetRestoreHash$Parameters("default_request_id") : getRestoreHash$Parameters;
    }

    public static final void b(GetRestoreHash$Parameters getRestoreHash$Parameters) {
        if (getRestoreHash$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRestoreHash$Parameters) && epx.f(this.requestId, ((GetRestoreHash$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
