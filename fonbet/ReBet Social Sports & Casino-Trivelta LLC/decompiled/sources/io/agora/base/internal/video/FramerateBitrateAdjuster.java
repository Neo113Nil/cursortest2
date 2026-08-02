package io.agora.base.internal.video;

/* loaded from: classes2.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int INITIAL_FPS = 30;

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public int getCodecConfigFramerate() {
        return 30;
    }

    @Override // io.agora.base.internal.video.BaseBitrateAdjuster, io.agora.base.internal.video.BitrateAdjuster
    public void setTargets(int i10, int i11) {
        if (this.targetFps == 0) {
            i11 = 30;
        }
        super.setTargets(i10, i11);
        this.targetBitrateBps = (this.targetBitrateBps * 30) / this.targetFps;
    }
}
