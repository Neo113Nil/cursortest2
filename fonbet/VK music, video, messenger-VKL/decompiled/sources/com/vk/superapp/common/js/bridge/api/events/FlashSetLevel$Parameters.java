package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: FlashSetLevel.kt */
/* loaded from: classes6.dex */
public final class FlashSetLevel$Parameters implements ad6 {

    @pmi0("level")
    private final float level;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public FlashSetLevel$Parameters(float f, String str) {
        this.level = f;
        this.requestId = str;
    }

    public static final FlashSetLevel$Parameters a(FlashSetLevel$Parameters flashSetLevel$Parameters) {
        return flashSetLevel$Parameters.requestId == null ? new FlashSetLevel$Parameters(flashSetLevel$Parameters.level, "default_request_id") : flashSetLevel$Parameters;
    }

    public static final void b(FlashSetLevel$Parameters flashSetLevel$Parameters) {
        double d = flashSetLevel$Parameters.level;
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d > 1.0d) {
            throw new IllegalArgumentException("Value level cannot be less than 0.0 or more than\n                        1.0");
        }
    }

    public static final void c(FlashSetLevel$Parameters flashSetLevel$Parameters) {
        if (flashSetLevel$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSetLevel$Parameters)) {
            return false;
        }
        FlashSetLevel$Parameters flashSetLevel$Parameters = (FlashSetLevel$Parameters) obj;
        return Float.compare(this.level, flashSetLevel$Parameters.level) == 0 && epx.f(this.requestId, flashSetLevel$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Float.hashCode(this.level) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(level=");
        sb.append(this.level);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
