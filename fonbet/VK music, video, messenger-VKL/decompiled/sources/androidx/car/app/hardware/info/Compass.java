package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Compass {

    @NonNull
    private final CarValue<List<Float>> mOrientations;

    public Compass(@NonNull CarValue<List<Float>> carValue) {
        Objects.requireNonNull(carValue);
        this.mOrientations = carValue;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Compass) {
            return Objects.equals(this.mOrientations, ((Compass) obj).mOrientations);
        }
        return false;
    }

    @NonNull
    public CarValue<List<Float>> getOrientations() {
        return this.mOrientations;
    }

    public int hashCode() {
        return Objects.hash(this.mOrientations);
    }

    @NonNull
    public String toString() {
        return "[ orientations: " + this.mOrientations + " ]";
    }

    private Compass() {
        this.mOrientations = CarValue.UNKNOWN_FLOAT_LIST;
    }
}
