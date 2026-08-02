package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class EncodedVideoFrameInfo {
    public long captureTimeMs;
    public int codecType;
    public long decodeTimeMs;
    public int frameType;
    public int framesPerSecond;
    public int height;
    public int rotation;
    public int streamType;
    public int trackId;
    public int width;

    public EncodedVideoFrameInfo() {
        this.codecType = 2;
        this.width = 0;
        this.height = 0;
        this.framesPerSecond = 0;
        this.frameType = 0;
        this.rotation = 0;
        this.trackId = 0;
        this.captureTimeMs = 0L;
        this.decodeTimeMs = 0L;
        this.streamType = 0;
    }

    @CalledByNative
    public long getCaptureTimeMs() {
        return this.captureTimeMs;
    }

    @CalledByNative
    public int getCodecType() {
        return this.codecType;
    }

    @CalledByNative
    public long getDecodeTimeMs() {
        return this.decodeTimeMs;
    }

    @CalledByNative
    public int getFrameType() {
        return this.frameType;
    }

    @CalledByNative
    public int getFramesPerSecond() {
        return this.framesPerSecond;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public int getStreamType() {
        return this.streamType;
    }

    @CalledByNative
    public int getTrackId() {
        return this.trackId;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "codecType=" + this.codecType + " width=" + this.width + " height=" + this.height + " framesPerSecond=" + this.framesPerSecond + " frameType=" + this.frameType + " rotation=" + this.rotation + " trackId=" + this.trackId + " captureTimeMs=" + this.captureTimeMs + " decodeTimeMs=" + this.decodeTimeMs + " streamType=" + this.streamType;
    }

    @CalledByNative
    public EncodedVideoFrameInfo(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, long j11, int i17) {
        this.codecType = i10;
        this.width = i11;
        this.height = i12;
        this.framesPerSecond = i13;
        this.frameType = i14;
        this.rotation = i15;
        this.trackId = i16;
        this.captureTimeMs = j10;
        this.decodeTimeMs = j11;
        this.streamType = i17;
    }
}
