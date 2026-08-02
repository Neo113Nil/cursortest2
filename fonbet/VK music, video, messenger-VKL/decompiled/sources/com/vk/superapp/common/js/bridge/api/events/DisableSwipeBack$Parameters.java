package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: DisableSwipeBack.kt */
/* loaded from: classes6.dex */
public final class DisableSwipeBack$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public DisableSwipeBack$Parameters(String str) {
        this.requestId = str;
    }

    public static final DisableSwipeBack$Parameters a(DisableSwipeBack$Parameters disableSwipeBack$Parameters) {
        return disableSwipeBack$Parameters.requestId == null ? new DisableSwipeBack$Parameters("default_request_id") : disableSwipeBack$Parameters;
    }

    public static final void b(DisableSwipeBack$Parameters disableSwipeBack$Parameters) {
        if (disableSwipeBack$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisableSwipeBack$Parameters) && epx.f(this.requestId, ((DisableSwipeBack$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
