package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Toggle;
import java.util.Objects;
import xsna.e8o0;
import xsna.ug90;

/* loaded from: classes11.dex */
public final class NavigationTemplate implements e8o0 {

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final CarColor mBackgroundColor;

    @Nullable
    private final TravelEstimate mDestinationTravelEstimate;

    @Nullable
    private final ActionStrip mMapActionStrip;

    @Nullable
    private final b mNavigationInfo;

    @Nullable
    private final ug90 mPanModeDelegate;

    @Nullable
    private final Toggle mPanModeToggle;

    public static final class a {
    }

    public interface b {
    }

    public NavigationTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
        if (Objects.equals(this.mNavigationInfo, navigationTemplate.mNavigationInfo) && Objects.equals(this.mBackgroundColor, navigationTemplate.mBackgroundColor) && Objects.equals(this.mDestinationTravelEstimate, navigationTemplate.mDestinationTravelEstimate) && Objects.equals(this.mActionStrip, navigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, navigationTemplate.mMapActionStrip) && Objects.equals(this.mPanModeToggle, navigationTemplate.mPanModeToggle)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(navigationTemplate.mPanModeDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public ActionStrip getActionStrip() {
        ActionStrip actionStrip = this.mActionStrip;
        Objects.requireNonNull(actionStrip);
        return actionStrip;
    }

    @Nullable
    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Nullable
    public TravelEstimate getDestinationTravelEstimate() {
        return this.mDestinationTravelEstimate;
    }

    @Nullable
    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    @Nullable
    public b getNavigationInfo() {
        return this.mNavigationInfo;
    }

    @Nullable
    public ug90 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Nullable
    @Deprecated
    public Toggle getPanModeToggle() {
        return this.mPanModeToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mNavigationInfo, this.mBackgroundColor, this.mDestinationTravelEstimate, this.mActionStrip, this.mMapActionStrip, this.mPanModeToggle, Boolean.valueOf(this.mPanModeDelegate == null));
    }

    @NonNull
    public String toString() {
        return "NavigationTemplate";
    }

    private NavigationTemplate() {
        this.mNavigationInfo = null;
        this.mBackgroundColor = null;
        this.mDestinationTravelEstimate = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeToggle = null;
        this.mPanModeDelegate = null;
    }
}
