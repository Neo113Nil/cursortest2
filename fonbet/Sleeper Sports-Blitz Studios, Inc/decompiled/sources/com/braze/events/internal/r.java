package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f534a;

    public r(com.braze.requests.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f534a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.areEqual(this.f534a, ((r) obj).f534a);
    }

    public final int hashCode() {
        return this.f534a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f534a + ")";
    }
}
