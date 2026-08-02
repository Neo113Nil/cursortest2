package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: IsPasskeyAvailable.kt */
/* loaded from: classes6.dex */
public final class IsPasskeyAvailable$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public IsPasskeyAvailable$Parameters(String str) {
        this.requestId = str;
    }

    public static final IsPasskeyAvailable$Parameters a(IsPasskeyAvailable$Parameters isPasskeyAvailable$Parameters) {
        return isPasskeyAvailable$Parameters.requestId == null ? new IsPasskeyAvailable$Parameters("default_request_id") : isPasskeyAvailable$Parameters;
    }

    public static final void b(IsPasskeyAvailable$Parameters isPasskeyAvailable$Parameters) {
        if (isPasskeyAvailable$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IsPasskeyAvailable$Parameters) && epx.f(this.requestId, ((IsPasskeyAvailable$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
