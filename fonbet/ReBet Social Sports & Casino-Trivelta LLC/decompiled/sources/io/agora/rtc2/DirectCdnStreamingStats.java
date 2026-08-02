package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;
import java.util.Locale;

@Deprecated
/* loaded from: classes3.dex */
public class DirectCdnStreamingStats {
    public int audioBitrate;
    public int fps;
    public int videoBitrate;
    public int videoHeight;
    public int videoWidth;

    public DirectCdnStreamingStats() {
        this.videoWidth = 0;
        this.videoHeight = 0;
        this.fps = 0;
        this.videoBitrate = 0;
        this.audioBitrate = 0;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "videoWidth=%d videoHeight=%d fps=%d videoBitrate=%d audioBitrate=%d", Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight), Integer.valueOf(this.fps), Integer.valueOf(this.videoBitrate), Integer.valueOf(this.audioBitrate));
    }

    @CalledByNative
    public DirectCdnStreamingStats(int i10, int i11, int i12, int i13, int i14) {
        this.videoWidth = i10;
        this.videoHeight = i11;
        this.fps = i12;
        this.videoBitrate = i13;
        this.audioBitrate = i14;
    }
}
