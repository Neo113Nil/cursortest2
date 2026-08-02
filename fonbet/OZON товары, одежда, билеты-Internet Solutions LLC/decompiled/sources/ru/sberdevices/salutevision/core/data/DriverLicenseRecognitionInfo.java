package ru.sberdevices.salutevision.core.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "driverLicenseFront", "Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionFront;", "driverLicenseBack", "Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionBack;", "(Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionFront;Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionBack;)V", "getDriverLicenseBack", "()Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionBack;", "getDriverLicenseFront", "()Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionFront;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DriverLicenseRecognitionInfo implements SaluteVisionRecognition.Info {
    private final DriverLicenseRecognitionBack driverLicenseBack;
    private final DriverLicenseRecognitionFront driverLicenseFront;

    public DriverLicenseRecognitionInfo(DriverLicenseRecognitionFront driverLicenseRecognitionFront, DriverLicenseRecognitionBack driverLicenseRecognitionBack) {
        this.driverLicenseFront = driverLicenseRecognitionFront;
        this.driverLicenseBack = driverLicenseRecognitionBack;
    }

    public static /* synthetic */ DriverLicenseRecognitionInfo copy$default(DriverLicenseRecognitionInfo driverLicenseRecognitionInfo, DriverLicenseRecognitionFront driverLicenseRecognitionFront, DriverLicenseRecognitionBack driverLicenseRecognitionBack, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            driverLicenseRecognitionFront = driverLicenseRecognitionInfo.driverLicenseFront;
        }
        if ((i11 & 2) != 0) {
            driverLicenseRecognitionBack = driverLicenseRecognitionInfo.driverLicenseBack;
        }
        return driverLicenseRecognitionInfo.copy(driverLicenseRecognitionFront, driverLicenseRecognitionBack);
    }

    /* renamed from: component1, reason: from getter */
    public final DriverLicenseRecognitionFront getDriverLicenseFront() {
        return this.driverLicenseFront;
    }

    /* renamed from: component2, reason: from getter */
    public final DriverLicenseRecognitionBack getDriverLicenseBack() {
        return this.driverLicenseBack;
    }

    @NotNull
    public final DriverLicenseRecognitionInfo copy(DriverLicenseRecognitionFront driverLicenseFront, DriverLicenseRecognitionBack driverLicenseBack) {
        return new DriverLicenseRecognitionInfo(driverLicenseFront, driverLicenseBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverLicenseRecognitionInfo)) {
            return false;
        }
        DriverLicenseRecognitionInfo driverLicenseRecognitionInfo = (DriverLicenseRecognitionInfo) other;
        return Intrinsics.d(this.driverLicenseFront, driverLicenseRecognitionInfo.driverLicenseFront) && Intrinsics.d(this.driverLicenseBack, driverLicenseRecognitionInfo.driverLicenseBack);
    }

    public final DriverLicenseRecognitionBack getDriverLicenseBack() {
        return this.driverLicenseBack;
    }

    public final DriverLicenseRecognitionFront getDriverLicenseFront() {
        return this.driverLicenseFront;
    }

    public int hashCode() {
        DriverLicenseRecognitionFront driverLicenseRecognitionFront = this.driverLicenseFront;
        int hashCode = (driverLicenseRecognitionFront == null ? 0 : driverLicenseRecognitionFront.hashCode()) * 31;
        DriverLicenseRecognitionBack driverLicenseRecognitionBack = this.driverLicenseBack;
        return hashCode + (driverLicenseRecognitionBack != null ? driverLicenseRecognitionBack.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DriverLicenseRecognitionInfo(driverLicenseFront=" + this.driverLicenseFront + ", driverLicenseBack=" + this.driverLicenseBack + ')';
    }
}
