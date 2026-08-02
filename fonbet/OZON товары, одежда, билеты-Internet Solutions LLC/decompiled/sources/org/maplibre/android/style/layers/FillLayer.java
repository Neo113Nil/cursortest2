package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class FillLayer extends Layer {
    @Keep
    FillLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetFillAntialias();

    @NonNull
    @Keep
    private native Object nativeGetFillColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetFillColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetFillOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetFillOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetFillOutlineColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetFillOutlineColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetFillPattern();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetFillPatternTransition();

    @NonNull
    @Keep
    private native Object nativeGetFillSortKey();

    @NonNull
    @Keep
    private native Object nativeGetFillTranslate();

    @NonNull
    @Keep
    private native Object nativeGetFillTranslateAnchor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetFillTranslateTransition();

    @Keep
    private native void nativeSetFillColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetFillOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetFillOutlineColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetFillPatternTransition(long j11, long j12);

    @Keep
    private native void nativeSetFillTranslateTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);

    public FillLayer(String str, String str2) {
        initialize(str, str2);
    }
}
