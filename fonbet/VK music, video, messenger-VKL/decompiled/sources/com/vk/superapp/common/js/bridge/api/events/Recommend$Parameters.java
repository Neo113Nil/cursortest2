package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Recommend.kt */
/* loaded from: classes6.dex */
public final class Recommend$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public Recommend$Parameters(String str) {
        this.requestId = str;
    }

    public static final Recommend$Parameters a(Recommend$Parameters recommend$Parameters) {
        return recommend$Parameters.requestId == null ? new Recommend$Parameters("default_request_id") : recommend$Parameters;
    }

    public static final void b(Recommend$Parameters recommend$Parameters) {
        if (recommend$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Recommend$Parameters) && epx.f(this.requestId, ((Recommend$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
