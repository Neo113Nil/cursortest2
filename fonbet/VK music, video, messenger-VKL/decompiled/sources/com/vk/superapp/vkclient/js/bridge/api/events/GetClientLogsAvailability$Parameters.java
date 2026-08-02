package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetClientLogsAvailability.kt */
/* loaded from: classes6.dex */
public final class GetClientLogsAvailability$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetClientLogsAvailability$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetClientLogsAvailability$Parameters a(GetClientLogsAvailability$Parameters getClientLogsAvailability$Parameters) {
        return getClientLogsAvailability$Parameters.requestId == null ? new GetClientLogsAvailability$Parameters("default_request_id") : getClientLogsAvailability$Parameters;
    }

    public static final void b(GetClientLogsAvailability$Parameters getClientLogsAvailability$Parameters) {
        if (getClientLogsAvailability$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetClientLogsAvailability$Parameters) && epx.f(this.requestId, ((GetClientLogsAvailability$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
