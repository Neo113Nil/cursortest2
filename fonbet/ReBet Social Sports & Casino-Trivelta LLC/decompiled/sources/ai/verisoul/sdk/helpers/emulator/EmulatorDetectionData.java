package ai.verisoul.sdk.helpers.emulator;

import Gb.c;
import ai.verisoul.sdk.helpers.sensor.get_all.SensorData;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lai/verisoul/sdk/helpers/emulator/EmulatorDetectionData;", "", "isEmulator", "", "sensorsData", "", "Lai/verisoul/sdk/helpers/sensor/get_all/SensorData;", "(ZLjava/util/List;)V", "()Z", "getSensorsData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EmulatorDetectionData {

    @c("isEmulator")
    private final boolean isEmulator;

    @c("sensors")
    @Nullable
    private final List<SensorData> sensorsData;

    public EmulatorDetectionData(boolean z10, @Nullable List<SensorData> list) {
        this.isEmulator = z10;
        this.sensorsData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmulatorDetectionData copy$default(EmulatorDetectionData emulatorDetectionData, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = emulatorDetectionData.isEmulator;
        }
        if ((i10 & 2) != 0) {
            list = emulatorDetectionData.sensorsData;
        }
        return emulatorDetectionData.copy(z10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEmulator() {
        return this.isEmulator;
    }

    @Nullable
    public final List<SensorData> component2() {
        return this.sensorsData;
    }

    @NotNull
    public final EmulatorDetectionData copy(boolean isEmulator, @Nullable List<SensorData> sensorsData) {
        return new EmulatorDetectionData(isEmulator, sensorsData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmulatorDetectionData)) {
            return false;
        }
        EmulatorDetectionData emulatorDetectionData = (EmulatorDetectionData) other;
        return this.isEmulator == emulatorDetectionData.isEmulator && Intrinsics.areEqual(this.sensorsData, emulatorDetectionData.sensorsData);
    }

    @Nullable
    public final List<SensorData> getSensorsData() {
        return this.sensorsData;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEmulator) * 31;
        List<SensorData> list = this.sensorsData;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    @NotNull
    public String toString() {
        return "EmulatorDetectionData(isEmulator=" + this.isEmulator + ", sensorsData=" + this.sensorsData + ")";
    }
}
