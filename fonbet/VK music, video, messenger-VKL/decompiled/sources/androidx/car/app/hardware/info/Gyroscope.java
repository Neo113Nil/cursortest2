package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Gyroscope {

    @NonNull
    private final CarValue<List<Float>> mRotations;

    public Gyroscope(@NonNull CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mRotations = carValue;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gyroscope) {
            return Objects.equals(this.mRotations, ((Gyroscope) obj).mRotations);
        }
        return false;
    }

    @NonNull
    public CarValue<List<Float>> getRotations() {
        return this.mRotations;
    }

    public int hashCode() {
        return Objects.hash(this.mRotations);
    }

    @NonNull
    public String toString() {
        return "[ rotations: " + this.mRotations + " ]";
    }

    private Gyroscope() {
        this.mRotations = CarValue.UNKNOWN_FLOAT_LIST;
    }
}
