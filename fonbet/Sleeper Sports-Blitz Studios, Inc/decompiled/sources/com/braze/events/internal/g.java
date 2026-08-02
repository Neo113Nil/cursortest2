package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.o f522a;

    public g(com.braze.requests.o request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f522a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f522a, ((g) obj).f522a);
    }

    public final int hashCode() {
        return this.f522a.hashCode();
    }

    public final String toString() {
        return "DispatchSucceededEvent(request=" + this.f522a + ")";
    }
}
