package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.j f527a;

    public k(com.braze.requests.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f527a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f527a, ((k) obj).f527a);
    }

    public final int hashCode() {
        return this.f527a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f527a + ")";
    }
}
