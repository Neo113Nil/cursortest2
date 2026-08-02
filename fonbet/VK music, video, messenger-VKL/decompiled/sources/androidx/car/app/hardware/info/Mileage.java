package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Mileage {

    @NonNull
    private final CarValue<Integer> mDistanceDisplayUnit;

    @Nullable
    private final CarValue<Float> mOdometerMeters;

    public static final class a {
    }

    public Mileage(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerMeters(), mileage.getOdometerMeters()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    @NonNull
    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<Float> getOdometerMeters() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getOdometerMeters(), this.mDistanceDisplayUnit);
    }

    @NonNull
    public String toString() {
        return "[ odometer: " + getOdometerMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + X3.j.e;
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
