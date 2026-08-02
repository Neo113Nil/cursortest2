package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f525a;

    public h0(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        this.f525a = triggeredActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.areEqual(this.f525a, ((h0) obj).f525a);
    }

    public final int hashCode() {
        return this.f525a.hashCode();
    }

    public final String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f525a + ")";
    }
}
