package com.braze.location;

import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f560a;
    public final IBrazeGeofenceApi b;

    public a(GeofenceDataStoreProvider geofenceDataStoreProvider) {
        Intrinsics.checkNotNullParameter(geofenceDataStoreProvider, "geofenceDataStoreProvider");
        this.f560a = geofenceDataStoreProvider;
        IBrazeGeofenceApi iBrazeGeofenceApi = null;
        try {
            Object newInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
            iBrazeGeofenceApi = (IBrazeGeofenceApi) newInstance;
        } catch (Exception unused) {
        }
        this.b = iBrazeGeofenceApi;
    }
}
