package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
class VideoCaptureParameter {
    boolean autoWhiteBalance;
    int camera1FocusMode;
    boolean camera1FpsRange;
    int camera2FocusMode;
    int cameraTimeout;
    boolean captureToTexture;
    int customMaxFps;
    int customMinFps;
    boolean customStrictMode;
    boolean enableRefocus;
    boolean enableTargetFps;
    boolean extraSurface;
    boolean faceFocusing;
    int focalLengthType;
    int hardwareLevelSelected;
    int lowCameraSelected;
    int lowFpsLimit;
    int noiseReduce;
    int physicalId;
    int pqFirstCaptureMode;
    int pqFirstDiff;
    int templateType;

    @CalledByNative
    public VideoCaptureParameter(boolean z10, int i10, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15, boolean z13, boolean z14, int i16, int i17, boolean z15, int i18, int i19, int i20, int i21, int i22, boolean z16, boolean z17, int i23) {
        this.captureToTexture = z10;
        this.lowCameraSelected = i10;
        this.hardwareLevelSelected = i11;
        this.templateType = i12;
        this.noiseReduce = i13;
        this.faceFocusing = z11;
        this.extraSurface = z12;
        this.camera1FocusMode = i14;
        this.camera2FocusMode = i15;
        this.autoWhiteBalance = z13;
        this.camera1FpsRange = z14;
        this.focalLengthType = i16;
        this.physicalId = i17;
        this.enableRefocus = z15;
        this.pqFirstCaptureMode = i18;
        this.pqFirstDiff = i19;
        this.cameraTimeout = i20;
        this.customMinFps = i21;
        this.customMaxFps = i22;
        this.enableTargetFps = z16;
        this.customStrictMode = z17;
        this.lowFpsLimit = i23;
    }

    public int getCamera1FocusMode() {
        return this.camera1FocusMode;
    }

    public int getCamera2FocusMode() {
        return this.camera2FocusMode;
    }

    public int getCameraTimeout() {
        return this.cameraTimeout;
    }

    public int getCustomMaxFps() {
        return this.customMaxFps;
    }

    public int getCustomMinFps() {
        return this.customMinFps;
    }

    public int getFocalLengthType() {
        return this.focalLengthType;
    }

    public int getHardwareLevelSelected() {
        return this.hardwareLevelSelected;
    }

    public int getLowCameraSelected() {
        return this.lowCameraSelected;
    }

    public int getLowFpsLimit() {
        return this.lowFpsLimit;
    }

    public int getNoiseReduce() {
        return this.noiseReduce;
    }

    public int getPhysicalId() {
        return this.physicalId;
    }

    public int getPqFirstCaptureMode() {
        return this.pqFirstCaptureMode;
    }

    public int getPqFirstDiff() {
        return this.pqFirstDiff;
    }

    public int getTemplateType() {
        return this.templateType;
    }

    public boolean isAutoWhiteBalance() {
        return this.autoWhiteBalance;
    }

    public boolean isCamera1FpsRange() {
        return this.camera1FpsRange;
    }

    public boolean isCaptureToTexture() {
        return this.captureToTexture;
    }

    public boolean isCustomStrictMode() {
        return this.customStrictMode;
    }

    public boolean isEnableRefocus() {
        return this.enableRefocus;
    }

    public boolean isEnableTargetFps() {
        return this.enableTargetFps;
    }

    public boolean isExtraSurface() {
        return this.extraSurface;
    }

    public boolean isFaceFocusing() {
        return this.faceFocusing;
    }

    public void setAutoWhiteBalance(boolean z10) {
        this.autoWhiteBalance = z10;
    }

    public void setCamera1FocusMode(int i10) {
        this.camera1FocusMode = i10;
    }

    public void setCamera1FpsRange(boolean z10) {
        this.camera1FpsRange = z10;
    }

    public void setCamera2FocusMode(int i10) {
        this.camera2FocusMode = i10;
    }

    public void setCameraTimeout(int i10) {
        this.cameraTimeout = i10;
    }

    public void setCaptureToTexture(boolean z10) {
        this.captureToTexture = z10;
    }

    public void setCustomMaxFps(int i10) {
        this.customMaxFps = i10;
    }

    public void setCustomMinFps(int i10) {
        this.customMinFps = i10;
    }

    public void setCustomStrictMode(boolean z10) {
        this.customStrictMode = z10;
    }

    public void setEnableRefocus(boolean z10) {
        this.enableRefocus = z10;
    }

    public void setEnableTargetFps(boolean z10) {
        this.enableTargetFps = z10;
    }

    public void setExtraSurface(boolean z10) {
        this.extraSurface = z10;
    }

    public void setFaceFocusing(boolean z10) {
        this.faceFocusing = z10;
    }

    public void setFocalLengthType(int i10) {
        this.focalLengthType = i10;
    }

    public void setHardwareLevelSelected(int i10) {
        this.hardwareLevelSelected = i10;
    }

    public void setLowCameraSelected(int i10) {
        this.lowCameraSelected = i10;
    }

    public void setLowFpsLimit(int i10) {
        this.lowFpsLimit = i10;
    }

    public void setNoiseReduce(int i10) {
        this.noiseReduce = i10;
    }

    public void setPhysicalId(int i10) {
        this.physicalId = i10;
    }

    public void setPqFirstCaptureMode(int i10) {
        this.pqFirstCaptureMode = i10;
    }

    public void setPqFirstDiff(int i10) {
        this.pqFirstDiff = i10;
    }

    public void setTemplateType(int i10) {
        this.templateType = i10;
    }
}
