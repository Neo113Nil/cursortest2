package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.ironsource.X3;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.alk;
import xsna.qs9;

/* loaded from: classes11.dex */
public final class Step {

    @Nullable
    private final CarText mCue;
    private final List<Lane> mLanes;

    @Nullable
    private final CarIcon mLanesImage;

    @Nullable
    private final Maneuver mManeuver;

    @Nullable
    private final CarText mRoad;

    public Step(@Nullable Maneuver maneuver, List<Lane> list, @Nullable CarIcon carIcon, @Nullable CarText carText, @Nullable CarText carText2) {
        this.mManeuver = maneuver;
        this.mLanes = alk.H(list);
        qs9.c.b(carIcon);
        this.mLanesImage = carIcon;
        this.mCue = carText;
        this.mRoad = carText2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad);
    }

    @Nullable
    public CarText getCue() {
        return this.mCue;
    }

    @NonNull
    public List<Lane> getLanes() {
        List<Lane> list = this.mLanes;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Nullable
    public CarIcon getLanesImage() {
        return this.mLanesImage;
    }

    @Nullable
    public Maneuver getManeuver() {
        return this.mManeuver;
    }

    @Nullable
    public CarText getRoad() {
        return this.mRoad;
    }

    public int hashCode() {
        return Objects.hash(this.mManeuver, this.mLanes, this.mLanesImage, this.mCue, this.mRoad);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[maneuver: ");
        sb.append(this.mManeuver);
        sb.append(", lane count: ");
        List<Lane> list = this.mLanes;
        sb.append(list != null ? list.size() : 0);
        sb.append(", lanes image: ");
        sb.append(this.mLanesImage);
        sb.append(", cue: ");
        sb.append(CarText.toShortString(this.mCue));
        sb.append(", road: ");
        sb.append(CarText.toShortString(this.mRoad));
        sb.append(X3.j.e);
        return sb.toString();
    }

    private Step() {
        this.mManeuver = null;
        this.mLanes = Collections.EMPTY_LIST;
        this.mLanesImage = null;
        this.mCue = null;
        this.mRoad = null;
    }
}
