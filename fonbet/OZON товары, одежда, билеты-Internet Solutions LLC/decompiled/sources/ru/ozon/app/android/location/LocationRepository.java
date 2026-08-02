package ru.ozon.app.android.location;

import android.location.Location;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/location/LocationRepository;", "", "", "forceReal", "Lio/reactivex/y;", "Landroid/location/Location;", "getLastLocation", "(Z)Lio/reactivex/y;", "hasLocationPermission", "()Z", "Lio/reactivex/b;", "checkLocationSettings", "()Lio/reactivex/b;", "requestSingleLocation", "isLocationEnabled", "", "disableMockLocation", "()V", "isNeedUseMockLocation", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LocationRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ y getLastLocation$default(LocationRepository locationRepository, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLastLocation");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return locationRepository.getLastLocation(z11);
        }

        public static /* synthetic */ y requestSingleLocation$default(LocationRepository locationRepository, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSingleLocation");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return locationRepository.requestSingleLocation(z11);
        }
    }

    @NotNull
    AbstractC7094b checkLocationSettings();

    void disableMockLocation();

    @NotNull
    y<Location> getLastLocation(boolean forceReal);

    boolean hasLocationPermission();

    boolean isLocationEnabled();

    boolean isNeedUseMockLocation();

    @NotNull
    y<Location> requestSingleLocation(boolean forceReal);
}
