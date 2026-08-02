package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetEmail.kt */
/* loaded from: classes6.dex */
public final class GetEmail$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetEmail$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetEmail$Parameters a(GetEmail$Parameters getEmail$Parameters) {
        return getEmail$Parameters.requestId == null ? new GetEmail$Parameters("default_request_id") : getEmail$Parameters;
    }

    public static final void b(GetEmail$Parameters getEmail$Parameters) {
        if (getEmail$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetEmail$Parameters) && epx.f(this.requestId, ((GetEmail$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
