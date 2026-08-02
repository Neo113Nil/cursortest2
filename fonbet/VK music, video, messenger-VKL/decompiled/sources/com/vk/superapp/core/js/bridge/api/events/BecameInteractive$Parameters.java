package com.vk.superapp.core.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BecameInteractive.kt */
/* loaded from: classes6.dex */
public final class BecameInteractive$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public BecameInteractive$Parameters(String str) {
        this.requestId = str;
    }

    public static final BecameInteractive$Parameters a(BecameInteractive$Parameters becameInteractive$Parameters) {
        return becameInteractive$Parameters.requestId == null ? new BecameInteractive$Parameters("default_request_id") : becameInteractive$Parameters;
    }

    public static final void b(BecameInteractive$Parameters becameInteractive$Parameters) {
        if (becameInteractive$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BecameInteractive$Parameters) && epx.f(this.requestId, ((BecameInteractive$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
