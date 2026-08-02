package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.p f540a;

    public z(com.braze.models.p sealedSession) {
        Intrinsics.checkNotNullParameter(sealedSession, "sealedSession");
        this.f540a = sealedSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f540a, ((z) obj).f540a);
    }

    public final int hashCode() {
        return this.f540a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f540a + ")";
    }
}
