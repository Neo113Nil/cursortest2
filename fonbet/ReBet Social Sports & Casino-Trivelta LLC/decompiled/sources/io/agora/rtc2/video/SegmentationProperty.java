package io.agora.rtc2.video;

/* loaded from: classes3.dex */
public class SegmentationProperty {
    public static final int SCREEN_COLOR_AUTO = 0;
    public static final int SCREEN_COLOR_BLUE = 2;
    public static final int SCREEN_COLOR_GREEN = 1;
    public static final int SEG_MODEL_AI = 1;
    public static final int SEG_MODEL_GREEN = 2;
    public float greenCapacity;
    public int modelType;
    public int screenColorType;

    public SegmentationProperty() {
        this.modelType = 1;
        this.greenCapacity = 0.5f;
        this.screenColorType = 0;
    }

    public SegmentationProperty(int i10, float f10) {
        this.modelType = i10;
        this.greenCapacity = f10;
        this.screenColorType = 0;
    }
}
