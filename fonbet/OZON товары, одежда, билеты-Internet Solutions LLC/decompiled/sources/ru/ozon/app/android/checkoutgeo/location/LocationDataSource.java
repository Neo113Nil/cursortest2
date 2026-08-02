package ru.ozon.app.android.checkoutgeo.location;

import android.location.Location;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/LocationDataSource;", "", "Lio/reactivex/y;", "Landroid/location/Location;", "getLocation", "()Lio/reactivex/y;", "", "hasPermission", "()Z", "Lio/reactivex/b;", "checkLocationSettings", "()Lio/reactivex/b;", "isLocationEnabled", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LocationDataSource {
    @NotNull
    AbstractC7094b checkLocationSettings();

    @NotNull
    y<Location> getLocation();

    boolean hasPermission();

    boolean isLocationEnabled();
}
