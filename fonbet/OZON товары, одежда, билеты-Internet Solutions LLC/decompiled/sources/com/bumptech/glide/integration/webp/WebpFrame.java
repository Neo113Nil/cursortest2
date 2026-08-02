package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes8.dex */
public class WebpFrame {
    static final int FRAME_DURATION_MS_FOR_MIN = 100;
    static final int MIN_FRAME_DURATION_MS = 11;
    boolean blendPreviousFrame;
    int delay;
    boolean disposeBackgroundColor;

    /* renamed from: ih, reason: collision with root package name */
    int f57583ih;

    /* renamed from: iw, reason: collision with root package name */
    int f57584iw;
    int ix;
    int iy;

    @Keep
    private long mNativePtr;

    WebpFrame(long j11, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12) {
        this.mNativePtr = j11;
        this.ix = i11;
        this.iy = i12;
        this.f57584iw = i13;
        this.f57583ih = i14;
        this.delay = i15;
        this.blendPreviousFrame = z11;
        this.disposeBackgroundColor = z12;
        fixFrameDuration();
    }

    private void fixFrameDuration() {
        if (this.delay < 11) {
            this.delay = 100;
        }
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native void nativeRenderFrame(int i11, int i12, Bitmap bitmap);

    public void dispose() {
        nativeDispose();
    }

    protected void finalize() throws Throwable {
        nativeFinalize();
    }

    public int getDurationMs() {
        return this.delay;
    }

    public int getHeight() {
        return this.f57583ih;
    }

    public int getWidth() {
        return this.f57584iw;
    }

    public int getXOffest() {
        return this.ix;
    }

    public int getYOffest() {
        return this.iy;
    }

    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }

    public void renderFrame(int i11, int i12, Bitmap bitmap) {
        nativeRenderFrame(i11, i12, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
