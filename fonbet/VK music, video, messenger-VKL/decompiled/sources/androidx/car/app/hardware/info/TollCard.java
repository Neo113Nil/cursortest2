package androidx.car.app.hardware.info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.hardware.common.CarValue;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class TollCard {
    public static final int TOLLCARD_STATE_INVALID = 2;
    public static final int TOLLCARD_STATE_NOT_INSERTED = 3;
    public static final int TOLLCARD_STATE_UNKNOWN = 0;
    public static final int TOLLCARD_STATE_VALID = 1;

    @NonNull
    private final CarValue<Integer> mCardState;

    public static final class a {
    }

    public TollCard(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TollCard) {
            return Objects.equals(this.mCardState, ((TollCard) obj).mCardState);
        }
        return false;
    }

    @NonNull
    public CarValue<Integer> getCardState() {
        CarValue<Integer> carValue = this.mCardState;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mCardState);
    }

    @NonNull
    public String toString() {
        return "[ tollcard state: " + this.mCardState + X3.j.e;
    }

    private TollCard() {
        this.mCardState = CarValue.UNKNOWN_INTEGER;
    }
}
