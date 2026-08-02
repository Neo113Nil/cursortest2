package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.a f513a;

    public c(com.braze.requests.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f513a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f513a, ((c) obj).f513a);
    }

    public final int hashCode() {
        return this.f513a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.f513a + ")";
    }
}
