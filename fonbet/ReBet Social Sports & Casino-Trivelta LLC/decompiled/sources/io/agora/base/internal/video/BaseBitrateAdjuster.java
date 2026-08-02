package io.agora.base.internal.video;

/* loaded from: classes2.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps = 0;
    protected int targetFps = 0;

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public void reportEncodedFrame(int i10) {
    }

    @Override // io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i10, int i11) {
        this.targetBitrateBps = i10;
        this.targetFps = i11;
    }
}
