package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class BackgroundLayer extends Layer {
    @Keep
    BackgroundLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetBackgroundColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetBackgroundColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetBackgroundOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetBackgroundPattern();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetBackgroundPatternTransition();

    @Keep
    private native void nativeSetBackgroundColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetBackgroundOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetBackgroundPatternTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str);
}
