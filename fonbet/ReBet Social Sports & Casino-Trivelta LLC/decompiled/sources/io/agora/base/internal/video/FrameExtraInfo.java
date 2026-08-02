package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class FrameExtraInfo {
    public final long captureTimeNs;
    public final long captureTimeRtp;
    public final long ntpTimestamp;
    public final int qp;
    public final long rtpTimestampMs;

    public FrameExtraInfo() {
        this.captureTimeNs = 0L;
        this.captureTimeRtp = 0L;
        this.rtpTimestampMs = 0L;
        this.ntpTimestamp = 0L;
        this.qp = 0;
    }

    @CalledByNative
    public long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    public long getCaptureTimeRtp() {
        return this.captureTimeRtp;
    }

    @CalledByNative
    public long getNtpTimestamp() {
        return this.ntpTimestamp;
    }

    @CalledByNative
    public int getQp() {
        return this.qp;
    }

    @CalledByNative
    public long getRtpTimestampMs() {
        return this.rtpTimestampMs;
    }

    @CalledByNative
    private FrameExtraInfo(long j10, long j11, long j12, long j13, int i10) {
        this.captureTimeNs = j10;
        this.captureTimeRtp = j11;
        this.rtpTimestampMs = j12;
        this.ntpTimestamp = j13;
        this.qp = i10;
    }
}
