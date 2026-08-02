package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.n f539a;

    public y(com.braze.models.n session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f539a = session;
        if (session.d) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f539a, ((y) obj).f539a);
    }

    public final int hashCode() {
        return this.f539a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f539a + ")";
    }
}
