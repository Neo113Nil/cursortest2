package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class ColorReliefLayer extends Layer {
    @Keep
    ColorReliefLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetColorReliefColor();

    @NonNull
    @Keep
    private native Object nativeGetColorReliefOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetColorReliefOpacityTransition();

    @Keep
    private native void nativeSetColorReliefOpacityTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);
}
