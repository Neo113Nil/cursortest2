package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: RelatedPinCodeChanged.kt */
/* loaded from: classes6.dex */
public final class RelatedPinCodeChanged$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public RelatedPinCodeChanged$Parameters(String str) {
        this.requestId = str;
    }

    public static final RelatedPinCodeChanged$Parameters a(RelatedPinCodeChanged$Parameters relatedPinCodeChanged$Parameters) {
        return relatedPinCodeChanged$Parameters.requestId == null ? new RelatedPinCodeChanged$Parameters("default_request_id") : relatedPinCodeChanged$Parameters;
    }

    public static final void b(RelatedPinCodeChanged$Parameters relatedPinCodeChanged$Parameters) {
        if (relatedPinCodeChanged$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelatedPinCodeChanged$Parameters) && epx.f(this.requestId, ((RelatedPinCodeChanged$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
