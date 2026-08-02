package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class TravelEstimate {
    public static final long REMAINING_TIME_UNKNOWN = -1;

    @Nullable
    private final DateTimeWithZone mArrivalTimeAtDestination;

    @Nullable
    private final Distance mRemainingDistance;
    private final CarColor mRemainingDistanceColor;
    private final CarColor mRemainingTimeColor;
    private final long mRemainingTimeSeconds;

    @Nullable
    private final CarIcon mTripIcon;

    @Nullable
    private final CarText mTripText;

    public static final class a {
    }

    private TravelEstimate() {
        this.mRemainingDistance = null;
        this.mRemainingTimeSeconds = 0L;
        this.mArrivalTimeAtDestination = null;
        CarColor carColor = CarColor.DEFAULT;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    @Nullable
    public DateTimeWithZone getArrivalTimeAtDestination() {
        return this.mArrivalTimeAtDestination;
    }

    @Nullable
    public Distance getRemainingDistance() {
        return this.mRemainingDistance;
    }

    @Nullable
    public CarColor getRemainingDistanceColor() {
        return this.mRemainingDistanceColor;
    }

    @Nullable
    public CarColor getRemainingTimeColor() {
        return this.mRemainingTimeColor;
    }

    public long getRemainingTimeSeconds() {
        long j = this.mRemainingTimeSeconds;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    @Nullable
    public CarIcon getTripIcon() {
        return this.mTripIcon;
    }

    @Nullable
    public CarText getTripText() {
        return this.mTripText;
    }

    public int hashCode() {
        return Objects.hash(this.mRemainingDistance, Long.valueOf(this.mRemainingTimeSeconds), this.mArrivalTimeAtDestination, this.mRemainingTimeColor, this.mRemainingDistanceColor, this.mTripText, this.mTripIcon);
    }

    @NonNull
    public String toString() {
        return "[ remaining distance: " + this.mRemainingDistance + ", time (s): " + this.mRemainingTimeSeconds + ", ETA: " + this.mArrivalTimeAtDestination + X3.j.e;
    }

    public TravelEstimate(a aVar) {
        throw null;
    }
}
