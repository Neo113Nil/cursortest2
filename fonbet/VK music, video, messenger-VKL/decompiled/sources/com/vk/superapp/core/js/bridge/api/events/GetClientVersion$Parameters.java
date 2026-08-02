package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetClientVersion.kt */
/* loaded from: classes6.dex */
public final class GetClientVersion$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetClientVersion$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetClientVersion$Parameters a(GetClientVersion$Parameters getClientVersion$Parameters) {
        return getClientVersion$Parameters.requestId == null ? new GetClientVersion$Parameters("default_request_id") : getClientVersion$Parameters;
    }

    public static final void b(GetClientVersion$Parameters getClientVersion$Parameters) {
        if (getClientVersion$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetClientVersion$Parameters) && epx.f(this.requestId, ((GetClientVersion$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
