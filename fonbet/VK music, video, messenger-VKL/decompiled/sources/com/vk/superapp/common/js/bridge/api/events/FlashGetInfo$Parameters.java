package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: FlashGetInfo.kt */
/* loaded from: classes6.dex */
public final class FlashGetInfo$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public FlashGetInfo$Parameters(String str) {
        this.requestId = str;
    }

    public static final FlashGetInfo$Parameters a(FlashGetInfo$Parameters flashGetInfo$Parameters) {
        return flashGetInfo$Parameters.requestId == null ? new FlashGetInfo$Parameters("default_request_id") : flashGetInfo$Parameters;
    }

    public static final void b(FlashGetInfo$Parameters flashGetInfo$Parameters) {
        if (flashGetInfo$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlashGetInfo$Parameters) && epx.f(this.requestId, ((FlashGetInfo$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
