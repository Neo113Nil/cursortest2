package com.vk.superapp.auth.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: IsMultiaccountAvailable.kt */
/* loaded from: classes6.dex */
public final class IsMultiaccountAvailable$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public IsMultiaccountAvailable$Parameters(String str) {
        this.requestId = str;
    }

    public static final IsMultiaccountAvailable$Parameters a(IsMultiaccountAvailable$Parameters isMultiaccountAvailable$Parameters) {
        return isMultiaccountAvailable$Parameters.requestId == null ? new IsMultiaccountAvailable$Parameters("default_request_id") : isMultiaccountAvailable$Parameters;
    }

    public static final void b(IsMultiaccountAvailable$Parameters isMultiaccountAvailable$Parameters) {
        if (isMultiaccountAvailable$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IsMultiaccountAvailable$Parameters) && epx.f(this.requestId, ((IsMultiaccountAvailable$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
