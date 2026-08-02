package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccelerometerStop.kt */
/* loaded from: classes6.dex */
public final class AccelerometerStop$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AccelerometerStop$Parameters(String str) {
        this.requestId = str;
    }

    public static final AccelerometerStop$Parameters a(AccelerometerStop$Parameters accelerometerStop$Parameters) {
        return accelerometerStop$Parameters.requestId == null ? new AccelerometerStop$Parameters("default_request_id") : accelerometerStop$Parameters;
    }

    public static final void b(AccelerometerStop$Parameters accelerometerStop$Parameters) {
        if (accelerometerStop$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccelerometerStop$Parameters) && epx.f(this.requestId, ((AccelerometerStop$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
