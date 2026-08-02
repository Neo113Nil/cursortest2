package org.maplibre.android.location;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.TransitionOptions;

/* loaded from: classes10.dex */
class LocationIndicatorLayer extends Layer {
    @Keep
    LocationIndicatorLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetAccuracyRadius();

    @NonNull
    @Keep
    private native Object nativeGetAccuracyRadiusBorderColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusBorderColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetAccuracyRadiusColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusColorTransition();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusTransition();

    @NonNull
    @Keep
    private native Object nativeGetBearing();

    @NonNull
    @Keep
    private native Object nativeGetBearingImage();

    @NonNull
    @Keep
    private native Object nativeGetBearingImageSize();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetBearingImageSizeTransition();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetBearingTransition();

    @NonNull
    @Keep
    private native Object nativeGetImageTiltDisplacement();

    @NonNull
    @Keep
    private native Object nativeGetLocation();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetLocationTransition();

    @NonNull
    @Keep
    private native Object nativeGetPerspectiveCompensation();

    @NonNull
    @Keep
    private native Object nativeGetShadowImage();

    @NonNull
    @Keep
    private native Object nativeGetShadowImageSize();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetShadowImageSizeTransition();

    @NonNull
    @Keep
    private native Object nativeGetTopImage();

    @NonNull
    @Keep
    private native Object nativeGetTopImageSize();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTopImageSizeTransition();

    @Keep
    private native void nativeSetAccuracyRadiusBorderColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetAccuracyRadiusColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetAccuracyRadiusTransition(long j11, long j12);

    @Keep
    private native void nativeSetBearingImageSizeTransition(long j11, long j12);

    @Keep
    private native void nativeSetBearingTransition(long j11, long j12);

    @Keep
    private native void nativeSetLocationTransition(long j11, long j12);

    @Keep
    private native void nativeSetShadowImageSizeTransition(long j11, long j12);

    @Keep
    private native void nativeSetTopImageSizeTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str);
}
