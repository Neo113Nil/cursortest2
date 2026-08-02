package org.maplibre.android.style.light;

import F3.G;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class Position {

    @Keep
    private float azimuthalAngle;

    @Keep
    private float polarAngle;

    @Keep
    private float radialCoordinate;

    @Keep
    public static Position fromPosition(float f7, float f11, float f12) {
        Position position = new Position();
        position.radialCoordinate = f7;
        position.azimuthalAngle = f11;
        position.polarAngle = f12;
        return position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Position position = (Position) obj;
            if (Float.compare(position.radialCoordinate, this.radialCoordinate) == 0 && Float.compare(position.azimuthalAngle, this.azimuthalAngle) == 0 && Float.compare(position.polarAngle, this.polarAngle) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f7 = this.radialCoordinate;
        int floatToIntBits = (f7 != 0.0f ? Float.floatToIntBits(f7) : 0) * 31;
        float f11 = this.azimuthalAngle;
        int floatToIntBits2 = (floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
        float f12 = this.polarAngle;
        return floatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position{radialCoordinate=");
        sb2.append(this.radialCoordinate);
        sb2.append(", azimuthalAngle=");
        sb2.append(this.azimuthalAngle);
        sb2.append(", polarAngle=");
        return G.a(sb2, this.polarAngle, '}');
    }
}
