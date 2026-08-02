package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class FaceShapeAreaOptions {
    public static final int FACE_SHAPE_AREA_CHEEK = 106;
    public static final int FACE_SHAPE_AREA_CHEEKBONE = 105;
    public static final int FACE_SHAPE_AREA_CHIN = 108;
    public static final int FACE_SHAPE_AREA_EYEBROWPOSITION = 500;
    public static final int FACE_SHAPE_AREA_EYEBROWTHICKNESS = 501;
    public static final int FACE_SHAPE_AREA_EYEDISTANCE = 201;
    public static final int FACE_SHAPE_AREA_EYEINNERCORNER = 205;
    public static final int FACE_SHAPE_AREA_EYELID = 203;
    public static final int FACE_SHAPE_AREA_EYEOUTERCORNER = 206;
    public static final int FACE_SHAPE_AREA_EYEPOSITION = 202;
    public static final int FACE_SHAPE_AREA_EYEPUPILS = 204;
    public static final int FACE_SHAPE_AREA_EYESCALE = 200;
    public static final int FACE_SHAPE_AREA_FACECONTOUR = 102;
    public static final int FACE_SHAPE_AREA_FACELENGTH = 103;
    public static final int FACE_SHAPE_AREA_FACEWIDTH = 104;
    public static final int FACE_SHAPE_AREA_FOREHEAD = 101;
    public static final int FACE_SHAPE_AREA_HEADSCALE = 100;
    public static final int FACE_SHAPE_AREA_MANDIBLE = 107;
    public static final int FACE_SHAPE_AREA_MOUTHLIP = 403;
    public static final int FACE_SHAPE_AREA_MOUTHPOSITION = 401;
    public static final int FACE_SHAPE_AREA_MOUTHSCALE = 400;
    public static final int FACE_SHAPE_AREA_MOUTHSMILE = 402;
    public static final int FACE_SHAPE_AREA_NONE = -1;
    public static final int FACE_SHAPE_AREA_NOSEBRIDGE = 304;
    public static final int FACE_SHAPE_AREA_NOSEGENERAL = 306;
    public static final int FACE_SHAPE_AREA_NOSELENGTH = 300;
    public static final int FACE_SHAPE_AREA_NOSEROOT = 303;
    public static final int FACE_SHAPE_AREA_NOSETIP = 305;
    public static final int FACE_SHAPE_AREA_NOSEWIDTH = 301;
    public static final int FACE_SHAPE_AREA_NOSEWING = 302;
    public int shapeArea;
    public int shapeIntensity;

    public FaceShapeAreaOptions() {
        this.shapeArea = -1;
        this.shapeIntensity = 0;
    }

    @CalledByNative
    public FaceShapeAreaOptions(int i10, int i11) {
        this.shapeArea = i10;
        this.shapeIntensity = i11;
    }
}
