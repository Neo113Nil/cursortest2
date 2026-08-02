package ai.verisoul.sdk.helpers.sensor.get_all;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/get_all/SensorData;", "", "name", "", "vendor", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVendor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SensorData {

    @c("name")
    @NotNull
    private final String name;

    @c("vendor")
    @NotNull
    private final String vendor;

    public SensorData(@NotNull String name, @NotNull String vendor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        this.name = name;
        this.vendor = vendor;
    }

    public static /* synthetic */ SensorData copy$default(SensorData sensorData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sensorData.name;
        }
        if ((i10 & 2) != 0) {
            str2 = sensorData.vendor;
        }
        return sensorData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    @NotNull
    public final SensorData copy(@NotNull String name, @NotNull String vendor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        return new SensorData(name, vendor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SensorData)) {
            return false;
        }
        SensorData sensorData = (SensorData) other;
        return Intrinsics.areEqual(this.name, sensorData.name) && Intrinsics.areEqual(this.vendor, sensorData.vendor);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.vendor.hashCode();
    }

    @NotNull
    public String toString() {
        return "SensorData(name=" + this.name + ", vendor=" + this.vendor + ")";
    }
}
