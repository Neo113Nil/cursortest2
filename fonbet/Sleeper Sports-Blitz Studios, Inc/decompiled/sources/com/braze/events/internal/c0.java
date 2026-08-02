package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.g f514a;

    public c0(com.braze.requests.g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f514a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.areEqual(this.f514a, ((c0) obj).f514a);
    }

    public final int hashCode() {
        return this.f514a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f514a + ")";
    }
}
