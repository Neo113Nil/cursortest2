package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

/* loaded from: classes10.dex */
public interface MapRendererScheduler {
    @Keep
    void queueEvent(Runnable runnable);

    @Keep
    void requestRender();

    @Keep
    void waitForEmpty();
}
