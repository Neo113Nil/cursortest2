package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.g f516a;

    public d0(com.braze.requests.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f516a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f516a, ((d0) obj).f516a);
    }

    public final int hashCode() {
        return this.f516a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f516a + ")";
    }
}
