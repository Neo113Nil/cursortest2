package com.yandex.mapkit.transport.time;

/* loaded from: classes9.dex */
public interface AdjustedClock {
    boolean isValid();

    long now();

    void pause();

    void resume();
}
