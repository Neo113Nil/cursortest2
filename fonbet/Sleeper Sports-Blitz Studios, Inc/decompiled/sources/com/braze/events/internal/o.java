package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.enums.e f531a;
    public final com.braze.enums.e b;

    public o(com.braze.enums.e oldNetworkLevel, com.braze.enums.e newNetworkLevel) {
        Intrinsics.checkNotNullParameter(oldNetworkLevel, "oldNetworkLevel");
        Intrinsics.checkNotNullParameter(newNetworkLevel, "newNetworkLevel");
        this.f531a = oldNetworkLevel;
        this.b = newNetworkLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f531a == oVar.f531a && this.b == oVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f531a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f531a + ", newNetworkLevel=" + this.b + ")";
    }
}
