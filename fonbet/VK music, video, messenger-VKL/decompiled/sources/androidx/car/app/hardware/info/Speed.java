package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Speed {

    @Nullable
    private final CarValue<Float> mDisplaySpeedMetersPerSecond;

    @Nullable
    private final CarValue<Float> mRawSpeedMetersPerSecond;

    @NonNull
    private final CarValue<Integer> mSpeedDisplayUnit;

    public static final class a {
    }

    public Speed(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        return Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
    }

    @NonNull
    public CarValue<Float> getDisplaySpeedMetersPerSecond() {
        CarValue<Float> carValue = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<Float> getRawSpeedMetersPerSecond() {
        CarValue<Float> carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<Integer> getSpeedDisplayUnit() {
        CarValue<Integer> carValue = this.mSpeedDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit);
    }

    @NonNull
    public String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + X3.j.e;
    }

    private Speed() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
