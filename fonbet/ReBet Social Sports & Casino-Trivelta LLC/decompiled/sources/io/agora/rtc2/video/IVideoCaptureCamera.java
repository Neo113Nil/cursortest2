package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public interface IVideoCaptureCamera extends IVideoCapture {
    @CalledByNative
    float getMaxZoom();

    @CalledByNative
    boolean isAutoFaceFocusSupported();

    @CalledByNative
    boolean isCameraExposureSupported();

    @CalledByNative
    boolean isExposureSupported();

    @CalledByNative
    boolean isFaceDetectSupported();

    @CalledByNative
    boolean isFocusSupported();

    @CalledByNative
    boolean isTorchSupported();

    @CalledByNative
    boolean isZoomSupported();

    boolean needFallback();

    @CalledByNative
    int setAntiBandingMode(int i10);

    @CalledByNative
    int setAutoFaceFocus(boolean z10);

    @CalledByNative
    void setCameraDropCount(int i10);

    @CalledByNative
    int setEdgeEnhanceMode(int i10);

    @CalledByNative
    int setExposure(float f10, float f11);

    @CalledByNative
    int setExposureCompensation(int i10);

    @CalledByNative
    int setFaceDetection(boolean z10);

    @CalledByNative
    int setFocus(float f10, float f11);

    @CalledByNative
    int setNoiseReductionMode(int i10);

    @CalledByNative
    void setPreviewInfo(Object obj, boolean z10, int i10);

    @CalledByNative
    int setTorchMode(boolean z10);

    @CalledByNative
    int setVideoEdgeMode(int i10);

    @CalledByNative
    int setVideoStabilityMode(int i10);

    @CalledByNative
    int setZoom(float f10);
}
