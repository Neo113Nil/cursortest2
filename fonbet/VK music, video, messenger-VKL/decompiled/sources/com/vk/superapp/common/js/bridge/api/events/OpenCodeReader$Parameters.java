package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenCodeReader.kt */
/* loaded from: classes6.dex */
public final class OpenCodeReader$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenCodeReader$Parameters(String str) {
        this.requestId = str;
    }

    public static final OpenCodeReader$Parameters a(OpenCodeReader$Parameters openCodeReader$Parameters) {
        return openCodeReader$Parameters.requestId == null ? new OpenCodeReader$Parameters("default_request_id") : openCodeReader$Parameters;
    }

    public static final void b(OpenCodeReader$Parameters openCodeReader$Parameters) {
        if (openCodeReader$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenCodeReader$Parameters) && epx.f(this.requestId, ((OpenCodeReader$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
