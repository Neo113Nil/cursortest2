package io.agora.rtc2;

import io.agora.rtc2.video.FaceShapeAreaOptions;

/* loaded from: classes3.dex */
public class PublisherParameters {
    public int width = 360;
    public int height = 640;
    public int framerate = 15;
    public int bitrate = FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
    public int defaultLayout = 1;
    public boolean owner = false;
    public int lifecycle = 1;
    public String publishUrl = null;
    public String rawStreamUrl = null;
    public String extraInfo = null;
    public String injectStreamUrl = null;
    public int injectStreamWidth = 0;
    public int injectStreamHeight = 0;
}
