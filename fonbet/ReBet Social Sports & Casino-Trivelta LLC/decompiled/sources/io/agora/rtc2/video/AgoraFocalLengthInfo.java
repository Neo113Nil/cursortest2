package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class AgoraFocalLengthInfo {
    public int cameraDirection;
    public int focalLengthType;

    @CalledByNative
    public AgoraFocalLengthInfo(int i10, int i11) {
        this.cameraDirection = i10;
        this.focalLengthType = i11;
    }

    public String toString() {
        return "AgoraFocalLengthInfo{cameraDirection=" + this.cameraDirection + ", focalLengthType=" + this.focalLengthType + '}';
    }
}
