package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: KeepScreenOn.kt */
/* loaded from: classes6.dex */
public final class KeepScreenOn$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("time")
    private final int time;

    public KeepScreenOn$Parameters(String str, int i) {
        this.requestId = str;
        this.time = i;
    }

    public static final KeepScreenOn$Parameters a(KeepScreenOn$Parameters keepScreenOn$Parameters) {
        return keepScreenOn$Parameters.requestId == null ? new KeepScreenOn$Parameters("default_request_id", keepScreenOn$Parameters.time) : keepScreenOn$Parameters;
    }

    public static final void b(KeepScreenOn$Parameters keepScreenOn$Parameters) {
        int i = keepScreenOn$Parameters.time;
        if (i < 1 || i > 1800) {
            throw new IllegalArgumentException("Value time cannot be less than 1 or more than\n                        1800");
        }
    }

    public static final void c(KeepScreenOn$Parameters keepScreenOn$Parameters) {
        if (keepScreenOn$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeepScreenOn$Parameters)) {
            return false;
        }
        KeepScreenOn$Parameters keepScreenOn$Parameters = (KeepScreenOn$Parameters) obj;
        return epx.f(this.requestId, keepScreenOn$Parameters.requestId) && this.time == keepScreenOn$Parameters.time;
    }

    public final int hashCode() {
        return Integer.hashCode(this.time) + (this.requestId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", time=");
        return vu5.b(sb, this.time, ')');
    }
}
