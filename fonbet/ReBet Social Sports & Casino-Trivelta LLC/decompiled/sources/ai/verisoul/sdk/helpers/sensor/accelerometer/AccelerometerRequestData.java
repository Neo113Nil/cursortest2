package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerRequestData;", "", C5444x.f55808b, "", "", "y", "z", EventKeys.TIMESTAMP, "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTimestamp", "()Ljava/util/List;", "getX", "getY", "getZ", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccelerometerRequestData {

    @c(EventKeys.TIMESTAMP)
    @NotNull
    private final List<Long> timestamp;

    @c(C5444x.f55808b)
    @NotNull
    private final List<Float> x;

    @c("y")
    @NotNull
    private final List<Float> y;

    @c("z")
    @NotNull
    private final List<Float> z;

    public AccelerometerRequestData(@NotNull List<Float> x10, @NotNull List<Float> y10, @NotNull List<Float> z10, @NotNull List<Long> timestamp) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.x = x10;
        this.y = y10;
        this.z = z10;
        this.timestamp = timestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccelerometerRequestData copy$default(AccelerometerRequestData accelerometerRequestData, List list, List list2, List list3, List list4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = accelerometerRequestData.x;
        }
        if ((i10 & 2) != 0) {
            list2 = accelerometerRequestData.y;
        }
        if ((i10 & 4) != 0) {
            list3 = accelerometerRequestData.z;
        }
        if ((i10 & 8) != 0) {
            list4 = accelerometerRequestData.timestamp;
        }
        return accelerometerRequestData.copy(list, list2, list3, list4);
    }

    @NotNull
    public final List<Float> component1() {
        return this.x;
    }

    @NotNull
    public final List<Float> component2() {
        return this.y;
    }

    @NotNull
    public final List<Float> component3() {
        return this.z;
    }

    @NotNull
    public final List<Long> component4() {
        return this.timestamp;
    }

    @NotNull
    public final AccelerometerRequestData copy(@NotNull List<Float> x10, @NotNull List<Float> y10, @NotNull List<Float> z10, @NotNull List<Long> timestamp) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        Intrinsics.checkNotNullParameter(z10, "z");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new AccelerometerRequestData(x10, y10, z10, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerRequestData)) {
            return false;
        }
        AccelerometerRequestData accelerometerRequestData = (AccelerometerRequestData) other;
        return Intrinsics.areEqual(this.x, accelerometerRequestData.x) && Intrinsics.areEqual(this.y, accelerometerRequestData.y) && Intrinsics.areEqual(this.z, accelerometerRequestData.z) && Intrinsics.areEqual(this.timestamp, accelerometerRequestData.timestamp);
    }

    @NotNull
    public final List<Long> getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final List<Float> getX() {
        return this.x;
    }

    @NotNull
    public final List<Float> getY() {
        return this.y;
    }

    @NotNull
    public final List<Float> getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.timestamp.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccelerometerRequestData(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", timestamp=" + this.timestamp + ")";
    }
}
