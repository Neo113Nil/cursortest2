package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.runtime.image.AnimatedImageProvider;

/* loaded from: classes9.dex */
public interface PlacemarkAnimation extends PlacemarkPresentation {
    boolean isReversed();

    void pause();

    void play();

    void play(@NonNull Callback callback);

    void resume();

    void setIcon(@NonNull AnimatedImageProvider animatedImageProvider, @NonNull IconStyle iconStyle);

    void setIcon(@NonNull AnimatedImageProvider animatedImageProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    void setIconStyle(@NonNull IconStyle iconStyle);

    void setReversed(boolean z11);

    void stop();
}
