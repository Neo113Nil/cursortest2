package bo.app;

import com.braze.Constants;
import com.braze.models.BrazeGeofence;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lbo/app/r1;", "", "", "Lcom/braze/models/BrazeGeofence;", Constants.BRAZE_PUSH_CONTENT_KEY, "", "toString", "", "hashCode", "other", "", "equals", "geofencesList", "<init>", "(Ljava/util/List;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class r1 {
    private final List<BrazeGeofence> a;

    public r1(List<BrazeGeofence> geofencesList) {
        Intrinsics.checkNotNullParameter(geofencesList, "geofencesList");
        this.a = geofencesList;
    }

    public final List<BrazeGeofence> a() {
        return this.a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof r1) && Intrinsics.areEqual(this.a, ((r1) other).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.a + ')';
    }
}
