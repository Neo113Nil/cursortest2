package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15062a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f15063b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f15064c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15065d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f15062a = context;
        this.f15063b = permissionResolutionStrategy;
        this.f15064c = locationListener;
        this.f15065d = str;
    }

    @NotNull
    public final Context a() {
        return this.f15062a;
    }

    @NotNull
    public final LocationListener b() {
        return this.f15064c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.f15063b;
    }

    @NotNull
    public final String d() {
        return this.f15065d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f15063b.hasNecessaryPermissions(this.f15062a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f15062a, "location", "getting last known location for provider " + this.f15065d, "location manager", new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(16, this));
            if (location != null) {
                this.f15064c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f15065d);
    }
}
