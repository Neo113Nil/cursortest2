package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.o f520a;

    public f(com.braze.requests.o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f520a = request;
        request.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f520a, ((f) obj).f520a);
    }

    public final int hashCode() {
        return this.f520a.hashCode();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.f520a + ")";
    }
}
