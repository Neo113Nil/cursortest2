package androidx.car.app.model;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes11.dex */
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d, double d2) {
        this.mLat = d;
        this.mLng = d2;
    }

    @NonNull
    public static CarLocation create(double d, double d2) {
        return new CarLocation(d, d2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLat), Double.valueOf(this.mLng));
    }

    public String toString() {
        return X3.j.d + getLatitude() + ", " + getLongitude() + X3.j.e;
    }

    @NonNull
    public static CarLocation create(@NonNull Location location) {
        Objects.requireNonNull(location);
        return create(location.getLatitude(), location.getLongitude());
    }

    private CarLocation() {
        this(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }
}
