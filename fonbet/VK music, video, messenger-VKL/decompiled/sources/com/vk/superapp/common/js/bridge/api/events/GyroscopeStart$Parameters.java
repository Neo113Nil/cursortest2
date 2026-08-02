package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: GyroscopeStart.kt */
/* loaded from: classes6.dex */
public final class GyroscopeStart$Parameters implements ad6 {

    @pmi0("refresh_rate")
    private final Float refreshRate;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GyroscopeStart$Parameters(String str, Float f) {
        this.requestId = str;
        this.refreshRate = f;
    }

    public static final GyroscopeStart$Parameters a(GyroscopeStart$Parameters gyroscopeStart$Parameters) {
        return gyroscopeStart$Parameters.requestId == null ? new GyroscopeStart$Parameters("default_request_id", gyroscopeStart$Parameters.refreshRate) : gyroscopeStart$Parameters;
    }

    public static final void b(GyroscopeStart$Parameters gyroscopeStart$Parameters) {
        if (gyroscopeStart$Parameters.refreshRate != null) {
            if (r0.floatValue() < 20.0d || gyroscopeStart$Parameters.refreshRate.floatValue() > 1000.0d) {
                throw new IllegalArgumentException("Value refreshRate cannot be less than 20.0 or\n                            more than 1000.0");
            }
        }
    }

    public static final void c(GyroscopeStart$Parameters gyroscopeStart$Parameters) {
        if (gyroscopeStart$Parameters.requestId == null) {
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
        if (!(obj instanceof GyroscopeStart$Parameters)) {
            return false;
        }
        GyroscopeStart$Parameters gyroscopeStart$Parameters = (GyroscopeStart$Parameters) obj;
        return epx.f(this.requestId, gyroscopeStart$Parameters.requestId) && epx.f(this.refreshRate, gyroscopeStart$Parameters.refreshRate);
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

    public /* synthetic */ GyroscopeStart$Parameters(String str, Float f, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : f);
    }
}
