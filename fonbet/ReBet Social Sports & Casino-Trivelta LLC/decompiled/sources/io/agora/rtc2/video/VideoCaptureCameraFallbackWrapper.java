package io.agora.rtc2.video;

import androidx.annotation.NonNull;
import io.agora.base.internal.Logging;
import io.agora.rtc2.video.IVideoCapture;

/* loaded from: classes3.dex */
public class VideoCaptureCameraFallbackWrapper implements IVideoCaptureCamera {
    private static final String TAG = "VideoCaptureCameraFallbackWrapper";

    @NonNull
    private IVideoCaptureCamera captuer;
    private IVideoCapture.Events events;

    @NonNull
    private OnCameraFallbackListener fallbackListener;
    private VideoCaptureFormat format;

    public interface OnCameraFallbackListener {
        IVideoCaptureCamera createFallbackCamera();
    }

    public VideoCaptureCameraFallbackWrapper(@NonNull IVideoCaptureCamera iVideoCaptureCamera, @NonNull OnCameraFallbackListener onCameraFallbackListener) {
        this.captuer = iVideoCaptureCamera;
        this.fallbackListener = onCameraFallbackListener;
    }

    private boolean createFallbackCamera() {
        if (!this.captuer.needFallback()) {
            return false;
        }
        Logging.w(TAG, "capture fallback to low level camera. ");
        IVideoCaptureCamera createFallbackCamera = this.fallbackListener.createFallbackCamera();
        this.captuer = createFallbackCamera;
        createFallbackCamera.setEventsCallback(this.events);
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        this.format = videoCaptureFormat;
        if (this.captuer.allocate(videoCaptureFormat)) {
            return true;
        }
        this.captuer.stopCaptureAndBlockUntilStopped();
        this.captuer.deallocate();
        this.captuer.dispose();
        if (createFallbackCamera()) {
            return this.captuer.allocate(videoCaptureFormat);
        }
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        this.captuer.deallocate();
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void dispose() {
        this.captuer.dispose();
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public VideoCaptureFormat getCaptureFormat() {
        return this.captuer.getCaptureFormat();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        return this.captuer.getMaxZoom();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        return this.captuer.isAutoFaceFocusSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        return this.captuer.isExposureSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        return this.captuer.isExposureSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        return this.captuer.isFaceDetectSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        return this.captuer.isFocusSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        return this.captuer.isTorchSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        return this.captuer.isZoomSupported();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(int i10) {
        return this.captuer.setAntiBandingMode(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z10) {
        return this.captuer.setAutoFaceFocus(z10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setCameraDropCount(int i10) {
        this.captuer.setCameraDropCount(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i10) {
        return this.captuer.setEdgeEnhanceMode(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void setEventsCallback(IVideoCapture.Events events) {
        this.events = events;
        this.captuer.setEventsCallback(events);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f10, float f11) {
        return this.captuer.setExposure(f10, f11);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i10) {
        return this.captuer.setExposureCompensation(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z10) {
        return this.captuer.setFaceDetection(z10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f10, float f11) {
        return this.captuer.setFocus(f10, f11);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i10) {
        return this.captuer.setNoiseReductionMode(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setPreviewInfo(Object obj, boolean z10, int i10) {
        this.captuer.setPreviewInfo(obj, z10, i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z10) {
        return this.captuer.setTorchMode(z10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i10) {
        return this.captuer.setVideoEdgeMode(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i10) {
        return this.captuer.setVideoStabilityMode(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f10) {
        return this.captuer.setZoom(f10);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        if (!this.captuer.startCaptureMaybeAsync()) {
            this.captuer.stopCaptureAndBlockUntilStopped();
            this.captuer.deallocate();
            this.captuer.dispose();
            if (createFallbackCamera()) {
                return this.captuer.allocate(this.format) && this.captuer.startCaptureMaybeAsync();
            }
        }
        return true;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        this.captuer.stopCaptureAndBlockUntilStopped();
    }
}
