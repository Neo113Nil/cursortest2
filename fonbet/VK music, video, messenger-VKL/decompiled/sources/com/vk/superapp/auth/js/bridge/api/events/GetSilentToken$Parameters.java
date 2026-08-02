package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GetSilentToken.kt */
/* loaded from: classes6.dex */
public final class GetSilentToken$Parameters implements ad6 {

    @pmi0("app_id")
    private final long appId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public GetSilentToken$Parameters(long j, String str) {
        this.appId = j;
        this.requestId = str;
    }

    public static final GetSilentToken$Parameters a(GetSilentToken$Parameters getSilentToken$Parameters) {
        return getSilentToken$Parameters.requestId == null ? new GetSilentToken$Parameters(getSilentToken$Parameters.appId, "default_request_id") : getSilentToken$Parameters;
    }

    public static final void b(GetSilentToken$Parameters getSilentToken$Parameters) {
        if (getSilentToken$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final long c() {
        return this.appId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSilentToken$Parameters)) {
            return false;
        }
        GetSilentToken$Parameters getSilentToken$Parameters = (GetSilentToken$Parameters) obj;
        return this.appId == getSilentToken$Parameters.appId && epx.f(this.requestId, getSilentToken$Parameters.requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode() + (Long.hashCode(this.appId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(appId=");
        sb.append(this.appId);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
