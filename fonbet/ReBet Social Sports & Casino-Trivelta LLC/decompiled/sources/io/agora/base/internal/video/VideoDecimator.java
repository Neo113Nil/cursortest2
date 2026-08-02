package io.agora.base.internal.video;

import io.agora.base.internal.Logging;

/* loaded from: classes2.dex */
public class VideoDecimator {
    private static int FrameCountHistorySize = 90;
    private static int FrameShitoryWindowMs = 2000;
    private static final String TAG = "VideoDecimator";
    private int dropCount;
    private float incomingFrameRate;
    private int keepCount;
    private float overshootModifier;
    private float targetFrameRate;
    private int maxFrameRate = 90;
    private boolean enableTemoralDecimation = true;
    private boolean dropNextFrame = false;
    private long[] incomingFrameTimes = new long[FrameCountHistorySize];

    private void processIncomingFramerate(long j10) {
        int i10 = 0;
        int i11 = 1;
        while (i11 < FrameCountHistorySize - 1) {
            long j11 = this.incomingFrameTimes[i11];
            if (j11 <= 0 || j10 - j11 > FrameShitoryWindowMs) {
                break;
            }
            i10++;
            i11++;
        }
        if (i11 <= 1) {
            this.incomingFrameRate = i10 * 1.0f;
            return;
        }
        long j12 = j10 - this.incomingFrameTimes[i11 - 1];
        this.incomingFrameRate = 1.0f;
        if (j12 > 0) {
            this.incomingFrameRate = (i10 * 1000.0f) / (j12 * 1.0f);
        }
    }

    public int decimatedFramerate() {
        processIncomingFramerate(System.currentTimeMillis());
        return !this.enableTemoralDecimation ? Math.round(this.incomingFrameRate) : Math.min((int) this.targetFrameRate, Math.round(this.incomingFrameRate));
    }

    public boolean dropFrame() {
        if (!this.enableTemoralDecimation) {
            return false;
        }
        float f10 = this.incomingFrameRate;
        if (f10 <= 0.0f) {
            return false;
        }
        int round = Math.round(f10);
        float f11 = this.targetFrameRate;
        if (f11 == 0.0f) {
            return true;
        }
        float f12 = round;
        if (f12 > f11) {
            int i10 = (int) (this.overshootModifier + (f12 - f11));
            if (i10 < 0) {
                this.overshootModifier = 0.0f;
                i10 = 0;
            }
            if (i10 != 0 && i10 * 2 < round) {
                if (this.dropCount != 0) {
                    this.dropCount = 0;
                    return true;
                }
                int i11 = round / i10;
                int i12 = this.keepCount;
                if (i12 <= i11) {
                    this.keepCount = i12 + 1;
                    return false;
                }
                this.overshootModifier = (-(round % i10)) / 3.0f;
                this.keepCount = 1;
                return true;
            }
            this.keepCount = 0;
            float f13 = i10;
            int i13 = (int) (f13 / f11);
            int i14 = this.dropCount;
            if (i14 < i13) {
                this.dropCount = i14 + 1;
                return true;
            }
            this.overshootModifier = f13 - (((int) (f13 / f11)) * f11);
            this.dropCount = 0;
        }
        return false;
    }

    public boolean dropNextFrame() {
        return this.dropNextFrame;
    }

    public void enableTemporalDecimation(boolean z10) {
        this.enableTemoralDecimation = z10;
    }

    public int getTargetFrameRate() {
        return (int) this.targetFrameRate;
    }

    public int inputFramerate() {
        processIncomingFramerate(System.currentTimeMillis());
        return Math.round(this.incomingFrameRate);
    }

    public boolean needDropNextFrame(boolean z10) {
        this.dropNextFrame = z10;
        return z10;
    }

    public void reset() {
        this.overshootModifier = 0.0f;
        this.dropCount = 0;
        this.keepCount = 0;
        this.targetFrameRate = 30.0f;
        this.incomingFrameRate = 0.0f;
        this.maxFrameRate = 90;
        this.enableTemoralDecimation = true;
        this.incomingFrameTimes = new long[FrameCountHistorySize];
    }

    public int setMaxFramerate(int i10) {
        if (i10 <= 0) {
            Logging.w(TAG, "setMaxFramerate invalid max frame rate");
            return -1;
        }
        this.maxFrameRate = i10;
        float f10 = i10;
        if (this.targetFrameRate <= f10) {
            return 0;
        }
        this.targetFrameRate = f10;
        return 0;
    }

    public int setTargetFramerate(float f10) {
        if (f10 < 0.1d) {
            Logging.w(TAG, "setTargetFramerate invalid frame rate ");
            return -1;
        }
        int i10 = this.maxFrameRate;
        if (f10 > i10) {
            this.targetFrameRate = i10;
            return 0;
        }
        this.targetFrameRate = f10;
        return 0;
    }

    public void updateIncomingFramerate() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.incomingFrameTimes[0] != 0) {
            for (int i10 = FrameCountHistorySize - 2; i10 >= 0; i10--) {
                long[] jArr = this.incomingFrameTimes;
                jArr[i10 + 1] = jArr[i10];
            }
        }
        this.incomingFrameTimes[0] = currentTimeMillis;
        processIncomingFramerate(currentTimeMillis);
    }
}
