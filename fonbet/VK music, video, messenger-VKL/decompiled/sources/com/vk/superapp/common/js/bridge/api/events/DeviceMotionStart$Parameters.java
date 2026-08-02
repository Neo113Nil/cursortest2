package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: DeviceMotionStart.kt */
/* loaded from: classes6.dex */
public final class DeviceMotionStart$Parameters implements ad6 {

    @pmi0("refresh_rate")
    private final Float refreshRate;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public DeviceMotionStart$Parameters(String str, Float f) {
        this.requestId = str;
        this.refreshRate = f;
    }

    public static final DeviceMotionStart$Parameters a(DeviceMotionStart$Parameters deviceMotionStart$Parameters) {
        return deviceMotionStart$Parameters.requestId == null ? new DeviceMotionStart$Parameters("default_request_id", deviceMotionStart$Parameters.refreshRate) : deviceMotionStart$Parameters;
    }

    public static final void b(DeviceMotionStart$Parameters deviceMotionStart$Parameters) {
        if (deviceMotionStart$Parameters.refreshRate != null) {
            if (r0.floatValue() < 20.0d || deviceMotionStart$Parameters.refreshRate.floatValue() > 1000.0d) {
                throw new IllegalArgumentException("Value refreshRate cannot be less than 20.0 or\n                            more than 1000.0");
            }
        }
    }

    public static final void c(DeviceMotionStart$Parameters deviceMotionStart$Parameters) {
        if (deviceMotionStart$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Float d() {
        return this.refreshRate;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMotionStart$Parameters)) {
            return false;
        }
        DeviceMotionStart$Parameters deviceMotionStart$Parameters = (DeviceMotionStart$Parameters) obj;
        return epx.f(this.requestId, deviceMotionStart$Parameters.requestId) && epx.f(this.refreshRate, deviceMotionStart$Parameters.refreshRate);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Float f = this.refreshRate;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", refreshRate=");
        return so.b(sb, this.refreshRate, ')');
    }

    public /* synthetic */ DeviceMotionStart$Parameters(String str, Float f, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : f);
    }
}
