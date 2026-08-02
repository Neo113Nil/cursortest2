package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetConfig.kt */
/* loaded from: classes6.dex */
public final class GetConfig$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetConfig$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetConfig$Parameters a(GetConfig$Parameters getConfig$Parameters) {
        return getConfig$Parameters.requestId == null ? new GetConfig$Parameters("default_request_id") : getConfig$Parameters;
    }

    public static final void b(GetConfig$Parameters getConfig$Parameters) {
        if (getConfig$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetConfig$Parameters) && epx.f(this.requestId, ((GetConfig$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
