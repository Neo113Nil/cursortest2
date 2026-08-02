package io.agora.rtc2.video;

import io.agora.rtc2.video.VideoEncoderConfiguration;

/* loaded from: classes3.dex */
public class ImageTrackOptions {
    private int fps;
    private String imageUrl;
    private VideoEncoderConfiguration.MIRROR_MODE_TYPE mirrorMode;

    public ImageTrackOptions(String str, int i10) {
        this.imageUrl = str;
        this.fps = i10;
        this.mirrorMode = VideoEncoderConfiguration.MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED;
    }

    public int getFps() {
        return this.fps;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getMirrorMode() {
        return this.mirrorMode.getValue();
    }

    public ImageTrackOptions(String str, int i10, VideoEncoderConfiguration.MIRROR_MODE_TYPE mirror_mode_type) {
        this.imageUrl = str;
        this.fps = i10;
        this.mirrorMode = mirror_mode_type;
    }
}
