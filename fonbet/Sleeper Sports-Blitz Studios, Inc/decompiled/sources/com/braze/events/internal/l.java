package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f528a;

    public l(List geofencesList) {
        Intrinsics.checkNotNullParameter(geofencesList, "geofencesList");
        this.f528a = geofencesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f528a, ((l) obj).f528a);
    }

    public final int hashCode() {
        return this.f528a.hashCode();
    }

    public final String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f528a + ")";
    }
}
