package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class DistanceSpan extends CarSpan {

    @Nullable
    private final Distance mDistance;

    private DistanceSpan(Distance distance) {
        this.mDistance = distance;
    }

    @NonNull
    public static DistanceSpan create(@NonNull Distance distance) {
        Objects.requireNonNull(distance);
        return new DistanceSpan(distance);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceSpan) {
            return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
        }
        return false;
    }

    @NonNull
    public Distance getDistance() {
        Distance distance = this.mDistance;
        Objects.requireNonNull(distance);
        return distance;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    @NonNull
    public String toString() {
        return "[distance: " + this.mDistance + X3.j.e;
    }

    private DistanceSpan() {
        this.mDistance = null;
    }
}
