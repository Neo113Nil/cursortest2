package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public class Badge {

    @Nullable
    private final CarColor mBackgroundColor;
    private final boolean mHasDot;

    @Nullable
    private final CarIcon mIcon;

    public static final class a {
    }

    public Badge(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mBackgroundColor, badge.mBackgroundColor) && Objects.equals(this.mIcon, badge.mIcon);
    }

    @Nullable
    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mBackgroundColor, this.mIcon);
    }

    @NonNull
    public String toString() {
        return "[hasDot: " + this.mHasDot + ", backgroundColor: " + this.mBackgroundColor + ", icon: " + this.mIcon + X3.j.e;
    }

    private Badge() {
        this.mHasDot = false;
        this.mBackgroundColor = null;
        this.mIcon = null;
    }
}
