package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class LineLayer extends Layer {
    @Keep
    LineLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetLineBlur();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineBlurTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineCap();

    @NonNull
    @Keep
    private native Object nativeGetLineColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineDasharray();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineDasharrayTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineGapWidth();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineGapWidthTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineGradient();

    @NonNull
    @Keep
    private native Object nativeGetLineJoin();

    @NonNull
    @Keep
    private native Object nativeGetLineMiterLimit();

    @NonNull
    @Keep
    private native Object nativeGetLineOffset();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineOffsetTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetLinePattern();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLinePatternTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineRoundLimit();

    @NonNull
    @Keep
    private native Object nativeGetLineSortKey();

    @NonNull
    @Keep
    private native Object nativeGetLineTranslate();

    @NonNull
    @Keep
    private native Object nativeGetLineTranslateAnchor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineTranslateTransition();

    @NonNull
    @Keep
    private native Object nativeGetLineWidth();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLineWidthTransition();

    @Keep
    private native void nativeSetLineBlurTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineDasharrayTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineGapWidthTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineOffsetTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetLinePatternTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineTranslateTransition(long j11, long j12);

    @Keep
    private native void nativeSetLineWidthTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);

    public LineLayer(String str, String str2) {
        initialize(str, str2);
    }
}
