package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetPhoneNumber.kt */
/* loaded from: classes6.dex */
public final class GetPhoneNumber$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetPhoneNumber$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetPhoneNumber$Parameters a(GetPhoneNumber$Parameters getPhoneNumber$Parameters) {
        return getPhoneNumber$Parameters.requestId == null ? new GetPhoneNumber$Parameters("default_request_id") : getPhoneNumber$Parameters;
    }

    public static final void b(GetPhoneNumber$Parameters getPhoneNumber$Parameters) {
        if (getPhoneNumber$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPhoneNumber$Parameters) && epx.f(this.requestId, ((GetPhoneNumber$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
