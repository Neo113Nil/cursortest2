package ru.ozon.app.android.checkoutgeo.location;

import AA.c;
import B90.Y;
import Fl.d;
import Gk0.b;
import Lm0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.AbstractC7094b;
import io.reactivex.B;
import io.reactivex.InterfaceC7095c;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.location.GoogleLocationDataSourceImpl;
import ru.ozon.app.android.location.NoLastLocationException;
import ru.ozon.app.android.location.NoPermissionException;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import vc.C10298c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000b*\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u000bH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/GoogleLocationDataSourceImpl;", "Lru/ozon/app/android/checkoutgeo/location/LocationDataSource;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/location/LocationRequest;", "createLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "Lcom/google/android/gms/tasks/Task;", "Landroid/location/Location;", "Lio/reactivex/y;", "asSingle", "(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/y;", "getLocationFromLocationManager", "()Landroid/location/Location;", "TResult", "Lio/reactivex/b;", "asCompletable", "(Lcom/google/android/gms/tasks/Task;)Lio/reactivex/b;", "", "hasPermission", "()Z", "getLocation", "()Lio/reactivex/y;", "checkLocationSettings", "()Lio/reactivex/b;", "isLocationEnabled", "Landroid/content/Context;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationClient", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GoogleLocationDataSourceImpl implements LocationDataSource {

    @NotNull
    private final Context context;

    public GoogleLocationDataSourceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final <TResult> AbstractC7094b asCompletable(Task<TResult> task) {
        C10298c c10298c = new C10298c(new b(task));
        Intrinsics.checkNotNullExpressionValue(c10298c, "create(...)");
        return c10298c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asCompletable$lambda$7(Task task, InterfaceC7095c emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        task.addOnSuccessListener(new c(new GoogleLocationDataSourceImpl$asCompletable$1$1(emitter), 5));
        task.addOnFailureListener(new Y(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asCompletable$lambda$7$lambda$6(InterfaceC7095c interfaceC7095c, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC7095c.onError(it);
    }

    private final y<Location> asSingle(final Task<Location> task) {
        Bc.b bVar = new Bc.b(new B() { // from class: kp.b
            @Override // io.reactivex.B
            public final void b(z zVar) {
                GoogleLocationDataSourceImpl.asSingle$lambda$3(GoogleLocationDataSourceImpl.this, task, zVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asSingle$lambda$3(final GoogleLocationDataSourceImpl googleLocationDataSourceImpl, Task task, final z emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (!googleLocationDataSourceImpl.hasPermission()) {
            emitter.onError(new NoPermissionException());
        } else {
            task.addOnSuccessListener(new d(new GoogleLocationDataSourceImpl$asSingle$1$1(task, emitter), 2));
            task.addOnFailureListener(new OnFailureListener() { // from class: kp.a
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GoogleLocationDataSourceImpl.asSingle$lambda$3$lambda$2(GoogleLocationDataSourceImpl.this, emitter, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asSingle$lambda$3$lambda$2(GoogleLocationDataSourceImpl googleLocationDataSourceImpl, z zVar, Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        a.f17149a.e(e11);
        Location locationFromLocationManager = googleLocationDataSourceImpl.getLocationFromLocationManager();
        if (locationFromLocationManager != null) {
            zVar.onSuccess(locationFromLocationManager);
        } else {
            zVar.b(new NoLastLocationException());
        }
    }

    private final LocationRequest createLocationRequest() {
        LocationRequest create = LocationRequest.create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        create.setPriority(100);
        create.setInterval(10000L);
        create.setFastestInterval(2000L);
        return create;
    }

    private final FusedLocationProviderClient getLocationClient() {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        return fusedLocationProviderClient;
    }

    @SuppressLint({"MissingPermission"})
    private final Location getLocationFromLocationManager() {
        LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(this.context, LocationManager.class);
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        String bestProvider = locationManager != null ? locationManager.getBestProvider(criteria, true) : null;
        if (bestProvider != null) {
            try {
                return locationManager.getLastKnownLocation(bestProvider);
            } catch (IllegalArgumentException | SecurityException unused) {
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.checkoutgeo.location.LocationDataSource
    @NotNull
    public AbstractC7094b checkLocationSettings() {
        LocationSettingsRequest.Builder addLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(createLocationRequest());
        Intrinsics.checkNotNullExpressionValue(addLocationRequest, "addLocationRequest(...)");
        SettingsClient settingsClient = LocationServices.getSettingsClient(this.context);
        Intrinsics.checkNotNullExpressionValue(settingsClient, "getSettingsClient(...)");
        Task<LocationSettingsResponse> checkLocationSettings = settingsClient.checkLocationSettings(addLocationRequest.build());
        Intrinsics.checkNotNullExpressionValue(checkLocationSettings, "checkLocationSettings(...)");
        return asCompletable(checkLocationSettings);
    }

    @Override // ru.ozon.app.android.checkoutgeo.location.LocationDataSource
    @SuppressLint({"MissingPermission"})
    @NotNull
    public y<Location> getLocation() {
        Task<Location> lastLocation = getLocationClient().getLastLocation();
        Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
        return asSingle(lastLocation);
    }

    @Override // ru.ozon.app.android.checkoutgeo.location.LocationDataSource
    public boolean hasPermission() {
        return PermissionExtensionsKt.isPermissionGranted(this.context, "android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // ru.ozon.app.android.checkoutgeo.location.LocationDataSource
    public boolean isLocationEnabled() {
        Object systemService = this.context.getSystemService("location");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return androidx.core.location.b.a((LocationManager) systemService);
    }
}
