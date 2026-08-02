package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/PointerData;", "", C5444x.f55808b, "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerData {

    @c(C5444x.f55808b)
    private final float x;

    @c("y")
    private final float y;

    public PointerData(float f10, float f11) {
        this.x = f10;
        this.y = f11;
    }

    public static /* synthetic */ PointerData copy$default(PointerData pointerData, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = pointerData.x;
        }
        if ((i10 & 2) != 0) {
            f11 = pointerData.y;
        }
        return pointerData.copy(f10, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final PointerData copy(float x10, float y10) {
        return new PointerData(x10, y10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerData)) {
            return false;
        }
        PointerData pointerData = (PointerData) other;
        return Float.compare(this.x, pointerData.x) == 0 && Float.compare(this.y, pointerData.y) == 0;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "PointerData(x=" + this.x + ", y=" + this.y + ")";
    }
}
