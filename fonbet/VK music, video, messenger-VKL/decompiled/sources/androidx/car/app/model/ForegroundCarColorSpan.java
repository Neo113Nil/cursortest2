package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.ns9;

/* loaded from: classes11.dex */
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }

    @NonNull
    public static ForegroundCarColorSpan create(@NonNull CarColor carColor) {
        ns9 ns9Var = ns9.b;
        ns9Var.getClass();
        if (ns9Var.a.contains(Integer.valueOf(carColor.getType()))) {
            return new ForegroundCarColorSpan(carColor);
        }
        throw new IllegalArgumentException("Car color type is not allowed: " + carColor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForegroundCarColorSpan) {
            return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    @NonNull
    public CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    @NonNull
    public String toString() {
        return "[color: " + this.mCarColor + X3.j.e;
    }

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }
}
