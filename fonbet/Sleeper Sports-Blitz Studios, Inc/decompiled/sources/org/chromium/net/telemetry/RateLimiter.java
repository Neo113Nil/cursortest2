package org.chromium.net.telemetry;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class RateLimiter {
    private static final long ONE_SECOND_MILLIS = 1000;
    private int mSamplesLoggedDuringSecond;
    private final int mSamplesPerSeconds;
    private final Object mLock = new Object();
    private long mLastPermitMillis = Long.MIN_VALUE;

    public RateLimiter(int samplesPerSeconds) {
        if (samplesPerSeconds <= 0) {
            throw new IllegalArgumentException("Expect sample rate to be > 0 sample(s) per second");
        }
        this.mSamplesPerSeconds = samplesPerSeconds;
    }

    public boolean tryAcquire() {
        synchronized (this.mLock) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.mLastPermitMillis + 1000 <= elapsedRealtime) {
                this.mSamplesLoggedDuringSecond = 1;
                this.mLastPermitMillis = elapsedRealtime;
                return true;
            }
            int i = this.mSamplesLoggedDuringSecond;
            if (i >= this.mSamplesPerSeconds) {
                return false;
            }
            this.mSamplesLoggedDuringSecond = i + 1;
            return true;
        }
    }
}
