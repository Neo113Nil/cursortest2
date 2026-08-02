package androidx.car.app.hardware.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.X3;
import java.util.Objects;
import xsna.ss9;

/* loaded from: classes11.dex */
public final class CarZone {
    public static final int CAR_ZONE_COLUMN_ALL = 16;
    public static final int CAR_ZONE_COLUMN_CENTER = 48;
    public static final int CAR_ZONE_COLUMN_DRIVER = 80;
    public static final int CAR_ZONE_COLUMN_LEFT = 32;
    public static final int CAR_ZONE_COLUMN_PASSENGER = 96;
    public static final int CAR_ZONE_COLUMN_RIGHT = 64;
    public static final CarZone CAR_ZONE_GLOBAL = new CarZone(new a());
    public static final int CAR_ZONE_ROW_ALL = 0;
    public static final int CAR_ZONE_ROW_EXCLUDE_FIRST = 4;
    public static final int CAR_ZONE_ROW_FIRST = 1;
    public static final int CAR_ZONE_ROW_SECOND = 2;
    public static final int CAR_ZONE_ROW_THIRD = 3;
    private final int mColumn;
    private final int mRow;

    public static final class a {
    }

    public CarZone(@NonNull a aVar) {
        aVar.getClass();
        this.mRow = 0;
        this.mColumn = 16;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarZone)) {
            return false;
        }
        CarZone carZone = (CarZone) obj;
        return Integer.valueOf(this.mColumn).equals(Integer.valueOf(carZone.getColumn())) && Integer.valueOf(this.mRow).equals(Integer.valueOf(carZone.getRow()));
    }

    public int getColumn() {
        return this.mColumn;
    }

    public int getRow() {
        return this.mRow;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mRow), Integer.valueOf(this.mColumn));
    }

    @NonNull
    public String toString() {
        int i = this.mRow;
        String str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i2 = this.mColumn;
        if (i2 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i2 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i2 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i2 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i2 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i2 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return ss9.a("[CarZone row value: ", str2, ", column value: ", str, X3.j.e);
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
