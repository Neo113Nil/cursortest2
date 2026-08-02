package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.d f538a;

    public x(com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        this.f538a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f538a, ((x) obj).f538a);
    }

    public final int hashCode() {
        return this.f538a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f538a + ")";
    }
}
