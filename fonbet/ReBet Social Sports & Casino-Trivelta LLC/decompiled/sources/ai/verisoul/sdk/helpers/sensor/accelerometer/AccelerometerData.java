package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerData;", "", EventKeys.TIMESTAMP, "", C5444x.f55808b, "", "y", "z", "(JFFF)V", "getTimestamp", "()J", "getX", "()F", "getY", "getZ", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AccelerometerData {

    @c(EventKeys.TIMESTAMP)
    private final long timestamp;

    @c(C5444x.f55808b)
    private final float x;

    @c("y")
    private final float y;

    @c("z")
    private final float z;

    public AccelerometerData(long j10, float f10, float f11, float f12) {
        this.timestamp = j10;
        this.x = f10;
        this.y = f11;
        this.z = f12;
    }

    public static /* synthetic */ AccelerometerData copy$default(AccelerometerData accelerometerData, long j10, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = accelerometerData.timestamp;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            f10 = accelerometerData.x;
        }
        float f13 = f10;
        if ((i10 & 4) != 0) {
            f11 = accelerometerData.y;
        }
        float f14 = f11;
        if ((i10 & 8) != 0) {
            f12 = accelerometerData.z;
        }
        return accelerometerData.copy(j11, f13, f14, f12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    @NotNull
    public final AccelerometerData copy(long timestamp, float x10, float y10, float z10) {
        return new AccelerometerData(timestamp, x10, y10, z10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerData)) {
            return false;
        }
        AccelerometerData accelerometerData = (AccelerometerData) other;
        return this.timestamp == accelerometerData.timestamp && Float.compare(this.x, accelerometerData.x) == 0 && Float.compare(this.y, accelerometerData.y) == 0 && Float.compare(this.z, accelerometerData.z) == 0;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    @NotNull
    public String toString() {
        return "AccelerometerData(timestamp=" + this.timestamp + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
    }
}
