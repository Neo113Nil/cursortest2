package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class CircleLayer extends Layer {
    @Keep
    CircleLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetCircleBlur();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleBlurTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetCirclePitchAlignment();

    @NonNull
    @Keep
    private native Object nativeGetCirclePitchScale();

    @NonNull
    @Keep
    private native Object nativeGetCircleRadius();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleRadiusTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleSortKey();

    @NonNull
    @Keep
    private native Object nativeGetCircleStrokeColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleStrokeColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleStrokeOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleStrokeOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleStrokeWidth();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleStrokeWidthTransition();

    @NonNull
    @Keep
    private native Object nativeGetCircleTranslate();

    @NonNull
    @Keep
    private native Object nativeGetCircleTranslateAnchor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetCircleTranslateTransition();

    @Keep
    private native void nativeSetCircleBlurTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleRadiusTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleStrokeColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleStrokeOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleStrokeWidthTransition(long j11, long j12);

    @Keep
    private native void nativeSetCircleTranslateTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);

    public CircleLayer() {
        initialize("ACCURACY_CIRCLE_LAYER_ID", "ACCURACY_CIRCLE_SOURCE_ID");
    }
}
