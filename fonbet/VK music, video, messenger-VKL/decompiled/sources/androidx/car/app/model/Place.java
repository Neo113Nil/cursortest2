package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Place {

    @Nullable
    private final CarLocation mLocation;

    @Nullable
    private final PlaceMarker mMarker;

    public static final class a {
    }

    public Place(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    @NonNull
    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        Objects.requireNonNull(carLocation);
        return carLocation;
    }

    @Nullable
    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    @NonNull
    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + X3.j.e;
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
