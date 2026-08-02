package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.n23;

/* loaded from: classes11.dex */
public final class LaneDirection {
    public static final int SHAPE_NORMAL_LEFT = 5;
    public static final int SHAPE_NORMAL_RIGHT = 6;
    public static final int SHAPE_SHARP_LEFT = 7;
    public static final int SHAPE_SHARP_RIGHT = 8;
    public static final int SHAPE_SLIGHT_LEFT = 3;
    public static final int SHAPE_SLIGHT_RIGHT = 4;
    public static final int SHAPE_STRAIGHT = 2;
    public static final int SHAPE_UNKNOWN = 1;
    public static final int SHAPE_U_TURN_LEFT = 9;
    public static final int SHAPE_U_TURN_RIGHT = 10;
    private final boolean mIsRecommended;
    private final int mShape;

    private LaneDirection(int i, boolean z) {
        this.mShape = i;
        this.mIsRecommended = z;
    }

    @NonNull
    public static LaneDirection create(int i, boolean z) {
        return new LaneDirection(i, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mShape), Boolean.valueOf(this.mIsRecommended));
    }

    public boolean isRecommended() {
        return this.mIsRecommended;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[shape: ");
        sb.append(this.mShape);
        sb.append(", isRecommended: ");
        return n23.b(sb, this.mIsRecommended, X3.j.e);
    }

    private LaneDirection() {
        this.mShape = 1;
        this.mIsRecommended = false;
    }
}
