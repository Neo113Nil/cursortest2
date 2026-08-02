package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Model {

    @NonNull
    private final CarValue<String> mManufacturer;

    @NonNull
    private final CarValue<String> mName;

    @NonNull
    private final CarValue<Integer> mYear;

    public static final class a {
    }

    public Model(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    @NonNull
    public CarValue<String> getManufacturer() {
        CarValue<String> carValue = this.mManufacturer;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    @NonNull
    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + X3.j.e;
    }

    private Model() {
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }
}
