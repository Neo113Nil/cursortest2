package org.maplibre.android.style.light;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.utils.e;

/* loaded from: classes10.dex */
public class Light {

    @Keep
    private long nativePtr;

    @Keep
    Light(long j11) {
        e.a("Mbgl-Light");
        this.nativePtr = j11;
    }

    @NonNull
    @Keep
    private native String nativeGetAnchor();

    @NonNull
    @Keep
    private native String nativeGetColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetColorTransition();

    @NonNull
    @Keep
    private native float nativeGetIntensity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIntensityTransition();

    @NonNull
    @Keep
    private native Position nativeGetPosition();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetPositionTransition();

    @Keep
    private native void nativeSetAnchor(String str);

    @Keep
    private native void nativeSetColor(String str);

    @Keep
    private native void nativeSetColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetIntensity(float f7);

    @Keep
    private native void nativeSetIntensityTransition(long j11, long j12);

    @Keep
    private native void nativeSetPosition(Position position);

    @Keep
    private native void nativeSetPositionTransition(long j11, long j12);
}
