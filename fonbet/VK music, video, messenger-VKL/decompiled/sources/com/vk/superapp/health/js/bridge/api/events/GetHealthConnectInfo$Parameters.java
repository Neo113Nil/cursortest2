package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetHealthConnectInfo.kt */
/* loaded from: classes6.dex */
public final class GetHealthConnectInfo$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetHealthConnectInfo$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetHealthConnectInfo$Parameters a(GetHealthConnectInfo$Parameters getHealthConnectInfo$Parameters) {
        return getHealthConnectInfo$Parameters.requestId == null ? new GetHealthConnectInfo$Parameters("default_request_id") : getHealthConnectInfo$Parameters;
    }

    public static final void b(GetHealthConnectInfo$Parameters getHealthConnectInfo$Parameters) {
        if (getHealthConnectInfo$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetHealthConnectInfo$Parameters) && epx.f(this.requestId, ((GetHealthConnectInfo$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
