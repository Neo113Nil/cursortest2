package com.yandex.mapkit.traffic;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface TrafficLayer {
    void addTrafficListener(@NonNull TrafficListener trafficListener);

    boolean isTrafficVisible();

    boolean isValid();

    void removeTrafficListener(@NonNull TrafficListener trafficListener);

    void resetTrafficStyles();

    boolean setTrafficStyle(int i11, @NonNull String str);

    boolean setTrafficStyle(@NonNull String str);

    void setTrafficVisible(boolean z11);
}
