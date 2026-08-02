package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Distance;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class RoutingInfo implements NavigationTemplate.b {

    @Nullable
    private final Distance mCurrentDistance;

    @Nullable
    private final Step mCurrentStep;
    private final boolean mIsLoading;

    @Nullable
    private final CarIcon mJunctionImage;

    @Nullable
    private final Step mNextStep;

    public static final class a {
    }

    public RoutingInfo(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingInfo)) {
            return false;
        }
        RoutingInfo routingInfo = (RoutingInfo) obj;
        return this.mIsLoading == routingInfo.mIsLoading && Objects.equals(this.mCurrentStep, routingInfo.mCurrentStep) && Objects.equals(this.mCurrentDistance, routingInfo.mCurrentDistance) && Objects.equals(this.mNextStep, routingInfo.mNextStep) && Objects.equals(this.mJunctionImage, routingInfo.mJunctionImage);
    }

    @Nullable
    public Distance getCurrentDistance() {
        return this.mCurrentDistance;
    }

    @Nullable
    public Step getCurrentStep() {
        return this.mCurrentStep;
    }

    @Nullable
    public CarIcon getJunctionImage() {
        return this.mJunctionImage;
    }

    @Nullable
    public Step getNextStep() {
        return this.mNextStep;
    }

    public int hashCode() {
        return Objects.hash(this.mCurrentStep, this.mCurrentDistance, this.mNextStep, this.mJunctionImage, Boolean.valueOf(this.mIsLoading));
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "RoutingInfo";
    }

    private RoutingInfo() {
        this.mCurrentStep = null;
        this.mCurrentDistance = null;
        this.mNextStep = null;
        this.mJunctionImage = null;
        this.mIsLoading = false;
    }
}
