package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class e {
    public e() {
        com.braze.requests.c requestInitiatedBy = com.braze.requests.c.c;
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        com.braze.requests.c cVar = com.braze.requests.c.b;
        ((e) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return com.braze.requests.c.c.hashCode();
    }

    public final String toString() {
        return "ContentCardRefreshRequestedEvent(requestInitiatedBy=" + com.braze.requests.c.c + ")";
    }
}
