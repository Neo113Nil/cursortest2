package io.agora.rte;

import android.view.View;

/* loaded from: classes3.dex */
public class Canvas {
    private long mNativeHandle;

    public Canvas(Rte rte, CanvasInitialConfig canvasInitialConfig) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeCreateCanvas(rte != null ? rte.getNativeHandle() : 0L, canvasInitialConfig != null ? canvasInitialConfig.getNativeHandle() : 0L);
    }

    private void destroy() {
        nativeReleaseCanvas(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    private native void nativeAddView(long j10, View view, long j11);

    private native long nativeCreateCanvas(long j10, long j11);

    private native void nativeGetConfigs(long j10, long j11);

    private native void nativeReleaseCanvas(long j10);

    private native void nativeRemoveView(long j10, View view, long j11);

    private native void nativeSetConfigs(long j10, long j11);

    public void addView(View view, ViewConfig viewConfig) {
        nativeAddView(this.mNativeHandle, view, viewConfig != null ? viewConfig.getNativeHandle() : 0L);
    }

    public void finalize() {
        destroy();
    }

    public void getConfigs(CanvasConfig canvasConfig) {
        nativeGetConfigs(this.mNativeHandle, canvasConfig != null ? canvasConfig.getNativeHandle() : 0L);
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    public void removeView(View view, ViewConfig viewConfig) {
        nativeRemoveView(this.mNativeHandle, view, viewConfig != null ? viewConfig.getNativeHandle() : 0L);
    }

    public void setConfigs(CanvasConfig canvasConfig) {
        nativeSetConfigs(this.mNativeHandle, canvasConfig != null ? canvasConfig.getNativeHandle() : 0L);
    }
}
