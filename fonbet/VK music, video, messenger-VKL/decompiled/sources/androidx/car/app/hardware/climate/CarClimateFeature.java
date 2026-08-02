package androidx.car.app.hardware.climate;

import androidx.annotation.NonNull;
import androidx.car.app.hardware.common.CarZone;
import java.util.List;
import java.util.Objects;
import xsna.ms9;

/* loaded from: classes11.dex */
public final class CarClimateFeature {

    @NonNull
    private final List<CarZone> mCarZones;
    private final int mFeature;

    public static final class a {
    }

    public CarClimateFeature(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CarClimateFeature.class == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ClimateProfileFeature{mFeature='");
        sb.append(this.mFeature);
        sb.append("', mCarZones=");
        return ms9.a('}', sb, this.mCarZones);
    }
}
