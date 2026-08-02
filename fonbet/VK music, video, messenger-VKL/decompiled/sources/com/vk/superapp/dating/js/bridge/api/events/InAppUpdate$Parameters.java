package com.vk.superapp.dating.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: InAppUpdate.kt */
/* loaded from: classes6.dex */
public final class InAppUpdate$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public InAppUpdate$Parameters(String str) {
        this.requestId = str;
    }

    public static final InAppUpdate$Parameters a(InAppUpdate$Parameters inAppUpdate$Parameters) {
        return inAppUpdate$Parameters.requestId == null ? new InAppUpdate$Parameters("default_request_id") : inAppUpdate$Parameters;
    }

    public static final void b(InAppUpdate$Parameters inAppUpdate$Parameters) {
        if (inAppUpdate$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InAppUpdate$Parameters) && epx.f(this.requestId, ((InAppUpdate$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
