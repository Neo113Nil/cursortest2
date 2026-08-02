package com.vk.superapp.analytics.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetMyTrackerId.kt */
/* loaded from: classes6.dex */
public final class GetMyTrackerId$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetMyTrackerId$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetMyTrackerId$Parameters a(GetMyTrackerId$Parameters getMyTrackerId$Parameters) {
        return getMyTrackerId$Parameters.requestId == null ? new GetMyTrackerId$Parameters("default_request_id") : getMyTrackerId$Parameters;
    }

    public static final void b(GetMyTrackerId$Parameters getMyTrackerId$Parameters) {
        if (getMyTrackerId$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetMyTrackerId$Parameters) && epx.f(this.requestId, ((GetMyTrackerId$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
