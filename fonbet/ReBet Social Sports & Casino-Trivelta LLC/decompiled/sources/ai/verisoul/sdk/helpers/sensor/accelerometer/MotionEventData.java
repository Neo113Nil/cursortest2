package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;", "", "eventTime", "", "downTime", C5444x.f55808b, "", "y", "(JJLjava/lang/Float;Ljava/lang/Float;)V", "getDownTime", "()J", "getEventTime", "getX", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getY", "component1", "component2", "component3", "component4", "copy", "(JJLjava/lang/Float;Ljava/lang/Float;)Lai/verisoul/sdk/helpers/sensor/accelerometer/MotionEventData;", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MotionEventData {

    @c("down_timestamp")
    private final long downTime;

    @c("up_timestamp")
    private final long eventTime;

    @c(C5444x.f55808b)
    @Nullable
    private final Float x;

    @c("y")
    @Nullable
    private final Float y;

    public MotionEventData(long j10, long j11, @Nullable Float f10, @Nullable Float f11) {
        this.eventTime = j10;
        this.downTime = j11;
        this.x = f10;
        this.y = f11;
    }

    public static /* synthetic */ MotionEventData copy$default(MotionEventData motionEventData, long j10, long j11, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = motionEventData.eventTime;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = motionEventData.downTime;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = motionEventData.x;
        }
        Float f12 = f10;
        if ((i10 & 8) != 0) {
            f11 = motionEventData.y;
        }
        return motionEventData.copy(j12, j13, f12, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDownTime() {
        return this.downTime;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getX() {
        return this.x;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getY() {
        return this.y;
    }

    @NotNull
    public final MotionEventData copy(long eventTime, long downTime, @Nullable Float x10, @Nullable Float y10) {
        return new MotionEventData(eventTime, downTime, x10, y10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionEventData)) {
            return false;
        }
        MotionEventData motionEventData = (MotionEventData) other;
        return this.eventTime == motionEventData.eventTime && this.downTime == motionEventData.downTime && Intrinsics.areEqual((Object) this.x, (Object) motionEventData.x) && Intrinsics.areEqual((Object) this.y, (Object) motionEventData.y);
    }

    public final long getDownTime() {
        return this.downTime;
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    @Nullable
    public final Float getX() {
        return this.x;
    }

    @Nullable
    public final Float getY() {
        return this.y;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.eventTime) * 31) + Long.hashCode(this.downTime)) * 31;
        Float f10 = this.x;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.y;
        return hashCode2 + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MotionEventData(eventTime=" + this.eventTime + ", downTime=" + this.downTime + ", x=" + this.x + ", y=" + this.y + ")";
    }
}
