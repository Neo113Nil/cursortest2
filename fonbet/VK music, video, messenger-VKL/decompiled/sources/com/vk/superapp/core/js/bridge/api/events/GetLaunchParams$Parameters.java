package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetLaunchParams.kt */
/* loaded from: classes6.dex */
public final class GetLaunchParams$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetLaunchParams$Parameters(String str) {
        this.requestId = str;
    }

    public static final GetLaunchParams$Parameters a(GetLaunchParams$Parameters getLaunchParams$Parameters) {
        return getLaunchParams$Parameters.requestId == null ? new GetLaunchParams$Parameters("default_request_id") : getLaunchParams$Parameters;
    }

    public static final void b(GetLaunchParams$Parameters getLaunchParams$Parameters) {
        if (getLaunchParams$Parameters.requestId == null) {
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
        return (obj instanceof GetLaunchParams$Parameters) && epx.f(this.requestId, ((GetLaunchParams$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
