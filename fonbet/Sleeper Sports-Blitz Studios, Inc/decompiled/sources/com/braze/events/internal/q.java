package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f533a;

    public q(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f533a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f533a, ((q) obj).f533a);
    }

    public final int hashCode() {
        return this.f533a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.f533a + ")";
    }
}
