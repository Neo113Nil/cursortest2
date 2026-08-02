package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f15055e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15056f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f15055e = looper;
        this.f15056f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final Unit a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f15065d, rVar.f15056f, 0.0f, rVar.f15064c, rVar.f15055e);
        return Unit.f19194a;
    }

    public static final Unit b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f15064c);
        return Unit.f19194a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f15063b.hasNecessaryPermissions(this.f15062a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f15062a, "location", d9.e.l(new StringBuilder("request location updates for "), this.f15065d, " provider"), "location manager", new df.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f15062a, "location", "stop location updates for passive provider", "location manager", new df.a(this, 0));
    }
}
