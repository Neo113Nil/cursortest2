package ru.ozon.app.android.checkoutgeo.location.system;

import B90.E;
import Bc.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.NoPermissionException;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/system/SystemLocationDataSourceImpl;", "Lru/ozon/app/android/checkoutgeo/location/system/SystemLocationDatasource;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Landroid/location/Criteria;", "buildCriteria", "()Landroid/location/Criteria;", "Lio/reactivex/y;", "Landroid/location/Location;", "requestSingleLocation", "()Lio/reactivex/y;", "Landroid/content/Context;", "Landroid/location/LocationManager;", "locationManager$delegate", "LSc/j;", "getLocationManager", "()Landroid/location/LocationManager;", "locationManager", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SystemLocationDataSourceImpl implements SystemLocationDatasource {

    @NotNull
    private final Context appContext;

    /* renamed from: locationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j locationManager;

    public SystemLocationDataSourceImpl(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.locationManager = k.b(new SystemLocationDataSourceImpl$locationManager$2(this));
    }

    private final Criteria buildCriteria() {
        Criteria criteria = new Criteria();
        criteria.setVerticalAccuracy(3);
        criteria.setHorizontalAccuracy(3);
        return criteria;
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocation$lambda$0(SystemLocationDataSourceImpl systemLocationDataSourceImpl, final z emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (!PermissionExtensionsKt.isPermissionGranted(systemLocationDataSourceImpl.appContext, "android.permission.ACCESS_FINE_LOCATION")) {
            emitter.onError(new NoPermissionException());
            return;
        }
        LocationListener locationListener = new LocationListener() { // from class: ru.ozon.app.android.checkoutgeo.location.system.SystemLocationDataSourceImpl$requestSingleLocation$1$locationCheckListener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                emitter.onSuccess(location);
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String provider) {
                Intrinsics.checkNotNullParameter(provider, "provider");
            }
        };
        LocationManager locationManager = systemLocationDataSourceImpl.getLocationManager();
        if (locationManager != null) {
            locationManager.requestSingleUpdate(systemLocationDataSourceImpl.buildCriteria(), locationListener, Looper.getMainLooper());
        } else {
            emitter.onError(new Throwable("location manager service is null"));
        }
    }

    @Override // ru.ozon.app.android.checkoutgeo.location.system.SystemLocationDatasource
    @SuppressLint({"MissingPermission"})
    @NotNull
    public y<Location> requestSingleLocation() {
        b bVar = new b(new E(this, 6));
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
