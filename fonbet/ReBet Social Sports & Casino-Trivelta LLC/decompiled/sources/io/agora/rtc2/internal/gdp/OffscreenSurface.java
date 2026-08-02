package io.agora.rtc2.internal.gdp;

/* loaded from: classes3.dex */
public class OffscreenSurface extends EglSurfaceBase {
    public OffscreenSurface(EglCore eglCore, int i10, int i11) {
        super(eglCore);
        createOffscreenSurface(i10, i11);
    }

    public void release() {
        releaseEglSurface();
    }
}
