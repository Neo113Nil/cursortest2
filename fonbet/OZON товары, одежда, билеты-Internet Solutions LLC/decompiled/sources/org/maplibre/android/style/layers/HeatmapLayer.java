package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class HeatmapLayer extends Layer {
    @Keep
    HeatmapLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetHeatmapColor();

    @NonNull
    @Keep
    private native Object nativeGetHeatmapIntensity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHeatmapIntensityTransition();

    @NonNull
    @Keep
    private native Object nativeGetHeatmapOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHeatmapOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetHeatmapRadius();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHeatmapRadiusTransition();

    @NonNull
    @Keep
    private native Object nativeGetHeatmapWeight();

    @Keep
    private native void nativeSetHeatmapIntensityTransition(long j11, long j12);

    @Keep
    private native void nativeSetHeatmapOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetHeatmapRadiusTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);
}
