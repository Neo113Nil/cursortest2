package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: OpenContacts.kt */
/* loaded from: classes6.dex */
public final class OpenContacts$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public OpenContacts$Parameters(String str) {
        this.requestId = str;
    }

    public static final OpenContacts$Parameters a(OpenContacts$Parameters openContacts$Parameters) {
        return openContacts$Parameters.requestId == null ? new OpenContacts$Parameters("default_request_id") : openContacts$Parameters;
    }

    public static final void b(OpenContacts$Parameters openContacts$Parameters) {
        if (openContacts$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenContacts$Parameters) && epx.f(this.requestId, ((OpenContacts$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
