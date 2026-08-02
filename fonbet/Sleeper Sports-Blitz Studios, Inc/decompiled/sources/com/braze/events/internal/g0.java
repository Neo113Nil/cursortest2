package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f523a;
    public final com.braze.triggers.actions.a b;

    public g0(com.braze.triggers.events.b originalTriggerEvent, com.braze.triggers.actions.a failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.f523a = originalTriggerEvent;
        this.b = failedTriggeredAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f523a, g0Var.f523a) && Intrinsics.areEqual(this.b, g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f523a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f523a + ", failedTriggeredAction=" + this.b + ")";
    }
}
