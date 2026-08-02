package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ub implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Tb f12968b = new Tb();

    /* renamed from: c, reason: collision with root package name */
    public static final List f12969c = kotlin.collections.u.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f12970a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f12969c.contains(str)) {
            return !this.f12970a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f12970a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f12970a = false;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationFlagStrategy(enabled=");
        sb2.append(this.f12970a);
        sb2.append(", locationPermissions=");
        return androidx.appcompat.widget.c1.p(sb2, f12969c, ')');
    }
}
