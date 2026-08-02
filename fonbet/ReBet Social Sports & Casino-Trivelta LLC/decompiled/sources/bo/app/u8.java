package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f26111a;

    public u8(List geofencesList) {
        Intrinsics.checkNotNullParameter(geofencesList, "geofencesList");
        this.f26111a = geofencesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8) && Intrinsics.areEqual(this.f26111a, ((u8) obj).f26111a);
    }

    public final int hashCode() {
        return this.f26111a.hashCode();
    }

    public final String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f26111a + ")";
    }
}
