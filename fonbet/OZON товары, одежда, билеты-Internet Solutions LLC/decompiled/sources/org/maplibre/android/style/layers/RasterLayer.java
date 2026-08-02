package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class RasterLayer extends Layer {
    @Keep
    RasterLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetRasterBrightnessMax();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterBrightnessMaxTransition();

    @NonNull
    @Keep
    private native Object nativeGetRasterBrightnessMin();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterBrightnessMinTransition();

    @NonNull
    @Keep
    private native Object nativeGetRasterContrast();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterContrastTransition();

    @NonNull
    @Keep
    private native Object nativeGetRasterFadeDuration();

    @NonNull
    @Keep
    private native Object nativeGetRasterHueRotate();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterHueRotateTransition();

    @NonNull
    @Keep
    private native Object nativeGetRasterOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetRasterResampling();

    @NonNull
    @Keep
    private native Object nativeGetRasterSaturation();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetRasterSaturationTransition();

    @Keep
    private native void nativeSetRasterBrightnessMaxTransition(long j11, long j12);

    @Keep
    private native void nativeSetRasterBrightnessMinTransition(long j11, long j12);

    @Keep
    private native void nativeSetRasterContrastTransition(long j11, long j12);

    @Keep
    private native void nativeSetRasterHueRotateTransition(long j11, long j12);

    @Keep
    private native void nativeSetRasterOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetRasterSaturationTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);

    public RasterLayer(String str) {
        initialize("bg", str);
    }
}
