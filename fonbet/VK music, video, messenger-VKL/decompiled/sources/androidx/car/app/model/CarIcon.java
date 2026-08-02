package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;

    @Nullable
    private final IconCompat mIcon;

    @Nullable
    private final CarColor mTint;
    private final int mType;

    @NonNull
    public static final CarIcon APP_ICON = forStandardType(5);

    @NonNull
    public static final CarIcon BACK = forStandardType(3);

    @NonNull
    public static final CarIcon ALERT = forStandardType(4);

    @NonNull
    public static final CarIcon ERROR = forStandardType(6);

    @NonNull
    public static final CarIcon PAN = forStandardType(7);

    @NonNull
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);

    public CarIcon(@Nullable IconCompat iconCompat, @Nullable CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    private static CarIcon forStandardType(int i) {
        return forStandardType(i, CarColor.DEFAULT);
    }

    private boolean iconCompatEquals(@Nullable IconCompat iconCompat) {
        int h;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (h = iconCompat2.h()) != iconCompat.h()) {
            return false;
        }
        if (h == 2) {
            return Objects.equals(this.mIcon.g(), iconCompat.g()) && this.mIcon.f() == iconCompat.f();
        }
        if (h == 4) {
            return Objects.equals(this.mIcon.i(), iconCompat.i());
        }
        return true;
    }

    @Nullable
    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int h = iconCompat.h();
        if (h != 2) {
            return h == 4 ? this.mIcon.i() : Integer.valueOf(h);
        }
        return this.mIcon.g() + this.mIcon.f();
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon);
    }

    @Nullable
    public IconCompat getIcon() {
        return this.mIcon;
    }

    @Nullable
    public CarColor getTint() {
        return this.mTint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash());
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + X3.j.e;
    }

    private static CarIcon forStandardType(int i, @Nullable CarColor carColor) {
        return new CarIcon(null, carColor, i);
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}
