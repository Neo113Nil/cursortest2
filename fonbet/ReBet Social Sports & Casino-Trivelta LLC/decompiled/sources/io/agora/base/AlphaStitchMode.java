package io.agora.base;

/* loaded from: classes2.dex */
public enum AlphaStitchMode {
    ALPHA_NO_STITCH(0),
    ALPHA_STITCH_UP(1),
    ALPHA_STITCH_BELOW(2),
    ALPHA_STITCH_LEFT(3),
    ALPHA_STITCH_RIGHT(4);

    private final int stitchMode;

    AlphaStitchMode(int i10) {
        this.stitchMode = i10;
    }

    public int value() {
        return this.stitchMode;
    }
}
