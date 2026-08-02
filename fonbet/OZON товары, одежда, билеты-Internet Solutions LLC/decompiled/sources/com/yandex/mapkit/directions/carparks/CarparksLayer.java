package com.yandex.mapkit.directions.carparks;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface CarparksLayer {
    boolean isValid();

    boolean isVisible();

    void resetCarparksStyles();

    boolean setCarparksStyle(int i11, @NonNull String str);

    boolean setCarparksStyle(@NonNull String str);

    void setVisible(boolean z11);
}
