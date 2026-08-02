package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

/* loaded from: classes10.dex */
public class CustomLayer extends Layer {
    @Keep
    CustomLayer(long j11) {
        super(j11);
    }

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, long j11);

    @Keep
    @Deprecated
    public void update() {
    }
}
