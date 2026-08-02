package io.agora.rte;

import io.agora.rte.Constants;
import io.agora.rte.exception.RteException;

/* loaded from: classes3.dex */
public class CanvasConfig {
    private long mNativeHandle;

    public CanvasConfig() {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateCanvasConfig();
    }

    private void destroy() {
        nativeReleaseCanvasConfig(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native long nativeCreateCanvasConfig();

    private native Rect nativeGetCropArea(long j10);

    private native int nativeGetVideoMirrorMode(long j10);

    private native int nativeGetVideoRenderMode(long j10);

    private native void nativeReleaseCanvasConfig(long j10);

    private native void nativeSetCropArea(long j10, Rect rect);

    private native void nativeSetVideoMirrorMode(long j10, int i10);

    private native void nativeSetVideoRenderMode(long j10, int i10);

    public void finalize() {
        destroy();
    }

    public Rect getCropArea() {
        return nativeGetCropArea(this.mNativeHandle);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public Constants.VideoMirrorMode getVideoMirrorMode() {
        return Constants.VideoMirrorMode.fromInt(nativeGetVideoMirrorMode(this.mNativeHandle));
    }

    public Constants.VideoRenderMode getVideoRenderMode() {
        return Constants.VideoRenderMode.fromInt(nativeGetVideoRenderMode(this.mNativeHandle));
    }

    public void setCropArea(Rect rect) {
        nativeSetCropArea(this.mNativeHandle, rect);
    }

    public void setVideoMirrorMode(Constants.VideoMirrorMode videoMirrorMode) {
        if (videoMirrorMode == null) {
            throw new RteException("mode is null", Constants.ErrorCode.getValue(Constants.ErrorCode.INVALID_ARGUMENT));
        }
        nativeSetVideoMirrorMode(this.mNativeHandle, Constants.VideoMirrorMode.getValue(videoMirrorMode));
    }

    public void setVideoRenderMode(Constants.VideoRenderMode videoRenderMode) {
        if (videoRenderMode == null) {
            throw new RteException("mode is null", Constants.ErrorCode.getValue(Constants.ErrorCode.INVALID_ARGUMENT));
        }
        nativeSetVideoRenderMode(this.mNativeHandle, Constants.VideoRenderMode.getValue(videoRenderMode));
    }
}
