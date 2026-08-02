package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FocalLengthInfo {
    public int cameraDirection;
    public int cameraId;
    public int focalLengthType;
    public int index;

    public FocalLengthInfo() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FocalLengthInfo focalLengthInfo = (FocalLengthInfo) obj;
            if (this.cameraDirection == focalLengthInfo.cameraDirection && this.focalLengthType == focalLengthInfo.focalLengthType) {
                return true;
            }
        }
        return false;
    }

    @CalledByNative
    public int getCameraDirection() {
        return this.cameraDirection;
    }

    @CalledByNative
    public int getCameraId() {
        return this.cameraId;
    }

    @CalledByNative
    public int getFocalLengthType() {
        return this.focalLengthType;
    }

    @CalledByNative
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.cameraDirection), Integer.valueOf(this.focalLengthType));
    }

    public String toString() {
        return "{cameraDirection=" + this.cameraDirection + ", Type=" + this.focalLengthType + '}';
    }

    public FocalLengthInfo(int i10, int i11, int i12, int i13) {
        this.cameraDirection = i10;
        this.index = i11;
        this.cameraId = i12;
        this.focalLengthType = i13;
    }
}
