package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class HillshadeLayer extends Layer {
    @Keep
    HillshadeLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetHillshadeAccentColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHillshadeAccentColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeExaggeration();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHillshadeExaggerationTransition();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeHighlightColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHillshadeHighlightColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeIlluminationAltitude();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeIlluminationAnchor();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeIlluminationDirection();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeMethod();

    @NonNull
    @Keep
    private native Object nativeGetHillshadeShadowColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetHillshadeShadowColorTransition();

    @Keep
    private native void nativeSetHillshadeAccentColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetHillshadeExaggerationTransition(long j11, long j12);

    @Keep
    private native void nativeSetHillshadeHighlightColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetHillshadeShadowColorTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);
}
