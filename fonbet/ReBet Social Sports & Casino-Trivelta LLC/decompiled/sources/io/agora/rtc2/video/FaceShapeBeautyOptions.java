package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class FaceShapeBeautyOptions {
    public static final int FACE_SHAPE_BEAUTY_STYLE_FEMALE = 0;
    public static final int FACE_SHAPE_BEAUTY_STYLE_MALE = 1;
    public static final int FACE_SHAPE_BEAUTY_STYLE_NATURAL = 2;
    public int shapeStyle;
    public int styleIntensity;

    public FaceShapeBeautyOptions() {
        this.shapeStyle = 0;
        this.styleIntensity = 50;
    }

    @CalledByNative
    public FaceShapeBeautyOptions(int i10, int i11) {
        this.shapeStyle = i10;
        this.styleIntensity = i11;
    }
}
