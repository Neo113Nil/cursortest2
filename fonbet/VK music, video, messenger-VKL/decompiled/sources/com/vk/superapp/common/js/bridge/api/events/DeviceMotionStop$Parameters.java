package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DeviceMotionStop.kt */
/* loaded from: classes6.dex */
public final class DeviceMotionStop$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public DeviceMotionStop$Parameters(String str) {
        this.requestId = str;
    }

    public static final DeviceMotionStop$Parameters a(DeviceMotionStop$Parameters deviceMotionStop$Parameters) {
        return deviceMotionStop$Parameters.requestId == null ? new DeviceMotionStop$Parameters("default_request_id") : deviceMotionStop$Parameters;
    }

    public static final void b(DeviceMotionStop$Parameters deviceMotionStop$Parameters) {
        if (deviceMotionStop$Parameters.requestId == null) {
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
        return (obj instanceof DeviceMotionStop$Parameters) && epx.f(this.requestId, ((DeviceMotionStop$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
