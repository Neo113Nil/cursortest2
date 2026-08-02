package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.d f521a;

    public f0(com.braze.triggers.events.d triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f521a = triggerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.areEqual(this.f521a, ((f0) obj).f521a);
    }

    public final int hashCode() {
        return this.f521a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f521a + ")";
    }
}
