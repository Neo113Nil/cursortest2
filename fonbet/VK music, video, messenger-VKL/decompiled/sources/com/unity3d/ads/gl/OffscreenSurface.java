package com.unity3d.ads.gl;

/* compiled from: OffscreenSurface.kt */
/* loaded from: classes14.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
