package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import com.ironsource.X3;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class EnergyProfile {
    public static final int EVCONNECTOR_TYPE_CHADEMO = 3;
    public static final int EVCONNECTOR_TYPE_COMBO_1 = 4;
    public static final int EVCONNECTOR_TYPE_COMBO_2 = 5;
    public static final int EVCONNECTOR_TYPE_GBT = 9;
    public static final int EVCONNECTOR_TYPE_GBT_DC = 10;
    public static final int EVCONNECTOR_TYPE_J1772 = 1;
    public static final int EVCONNECTOR_TYPE_MENNEKES = 2;
    public static final int EVCONNECTOR_TYPE_OTHER = 101;
    public static final int EVCONNECTOR_TYPE_SCAME = 11;
    public static final int EVCONNECTOR_TYPE_TESLA_HPWC = 7;
    public static final int EVCONNECTOR_TYPE_TESLA_ROADSTER = 6;
    public static final int EVCONNECTOR_TYPE_TESLA_SUPERCHARGER = 8;
    public static final int EVCONNECTOR_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_BIODIESEL = 5;
    public static final int FUEL_TYPE_CNG = 8;
    public static final int FUEL_TYPE_DIESEL_1 = 3;
    public static final int FUEL_TYPE_DIESEL_2 = 4;
    public static final int FUEL_TYPE_E85 = 6;
    public static final int FUEL_TYPE_ELECTRIC = 10;
    public static final int FUEL_TYPE_HYDROGEN = 11;
    public static final int FUEL_TYPE_LEADED = 2;
    public static final int FUEL_TYPE_LNG = 9;
    public static final int FUEL_TYPE_LPG = 7;
    public static final int FUEL_TYPE_OTHER = 12;
    public static final int FUEL_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_UNLEADED = 1;

    @NonNull
    private final CarValue<List<Integer>> mEvConnectorTypes;

    @NonNull
    private final CarValue<List<Integer>> mFuelTypes;

    public static final class a {
    }

    public EnergyProfile(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    @NonNull
    public CarValue<List<Integer>> getEvConnectorTypes() {
        CarValue<List<Integer>> carValue = this.mEvConnectorTypes;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @NonNull
    public CarValue<List<Integer>> getFuelTypes() {
        CarValue<List<Integer>> carValue = this.mFuelTypes;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvConnectorTypes, this.mFuelTypes);
    }

    @NonNull
    public String toString() {
        return "[ evConnectorTypes: " + this.mEvConnectorTypes + ", fuelTypes: " + this.mFuelTypes + X3.j.e;
    }

    private EnergyProfile() {
        CarValue<List<Integer>> carValue = CarValue.UNKNOWN_INTEGER_LIST;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }
}
