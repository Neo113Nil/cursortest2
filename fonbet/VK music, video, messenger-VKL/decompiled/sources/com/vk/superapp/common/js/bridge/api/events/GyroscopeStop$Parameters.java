package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GyroscopeStop.kt */
/* loaded from: classes6.dex */
public final class GyroscopeStop$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GyroscopeStop$Parameters(String str) {
        this.requestId = str;
    }

    public static final GyroscopeStop$Parameters a(GyroscopeStop$Parameters gyroscopeStop$Parameters) {
        return gyroscopeStop$Parameters.requestId == null ? new GyroscopeStop$Parameters("default_request_id") : gyroscopeStop$Parameters;
    }

    public static final void b(GyroscopeStop$Parameters gyroscopeStop$Parameters) {
        if (gyroscopeStop$Parameters.requestId == null) {
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
        return (obj instanceof GyroscopeStop$Parameters) && epx.f(this.requestId, ((GyroscopeStop$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
