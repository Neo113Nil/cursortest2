package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f519a;
    public final com.braze.models.k b;

    public e0(String campaignId, com.braze.models.k pushClickEvent) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(pushClickEvent, "pushClickEvent");
        this.f519a = campaignId;
        this.b = pushClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f519a, e0Var.f519a) && Intrinsics.areEqual(this.b, e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f519a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f519a + ", pushClickEvent=" + this.b + ")";
    }
}
