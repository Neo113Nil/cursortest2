package bo.app;

import com.braze.location.BrazeInternalGeofenceApi;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f26095a;

    /* renamed from: b, reason: collision with root package name */
    public final IBrazeGeofenceApi f26096b;

    public u1(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        Intrinsics.checkNotNullParameter(geofenceDataStoreProvider, "geofenceDataStoreProvider");
        this.f26095a = geofenceDataStoreProvider;
        IBrazeGeofenceApi iBrazeGeofenceApi = null;
        try {
            Object newInstance = BrazeInternalGeofenceApi.class.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            iBrazeGeofenceApi = (IBrazeGeofenceApi) newInstance;
        } catch (Exception unused) {
        }
        this.f26096b = iBrazeGeofenceApi;
    }
}
