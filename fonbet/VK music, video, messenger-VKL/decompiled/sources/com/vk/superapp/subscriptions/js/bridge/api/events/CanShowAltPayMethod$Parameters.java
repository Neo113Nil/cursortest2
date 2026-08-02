package com.vk.superapp.subscriptions.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CanShowAltPayMethod.kt */
/* loaded from: classes6.dex */
public final class CanShowAltPayMethod$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public CanShowAltPayMethod$Parameters(String str) {
        this.requestId = str;
    }

    public static final CanShowAltPayMethod$Parameters a(CanShowAltPayMethod$Parameters canShowAltPayMethod$Parameters) {
        return canShowAltPayMethod$Parameters.requestId == null ? new CanShowAltPayMethod$Parameters("default_request_id") : canShowAltPayMethod$Parameters;
    }

    public static final void b(CanShowAltPayMethod$Parameters canShowAltPayMethod$Parameters) {
        if (canShowAltPayMethod$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CanShowAltPayMethod$Parameters) && epx.f(this.requestId, ((CanShowAltPayMethod$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
