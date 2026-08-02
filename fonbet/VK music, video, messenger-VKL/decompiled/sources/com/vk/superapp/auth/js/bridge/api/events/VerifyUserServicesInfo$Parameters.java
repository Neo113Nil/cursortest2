package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VerifyUserServicesInfo.kt */
/* loaded from: classes6.dex */
public final class VerifyUserServicesInfo$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public VerifyUserServicesInfo$Parameters(String str) {
        this.requestId = str;
    }

    public static final VerifyUserServicesInfo$Parameters a(VerifyUserServicesInfo$Parameters verifyUserServicesInfo$Parameters) {
        return verifyUserServicesInfo$Parameters.requestId == null ? new VerifyUserServicesInfo$Parameters("default_request_id") : verifyUserServicesInfo$Parameters;
    }

    public static final void b(VerifyUserServicesInfo$Parameters verifyUserServicesInfo$Parameters) {
        if (verifyUserServicesInfo$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifyUserServicesInfo$Parameters) && epx.f(this.requestId, ((VerifyUserServicesInfo$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
