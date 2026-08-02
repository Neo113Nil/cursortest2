package com.playtika.sharedsdk.internal;

import android.util.Log;
import com.playtika.sharedsdk.shaded.okhttp3.Response;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class Metrics {
    private final AtomicLong mCacheHits = new AtomicLong();
    private final AtomicLong mConditionalHits = new AtomicLong();
    private final AtomicLong mNetworkHits = new AtomicLong();
    private final AtomicLong mTotalBytes = new AtomicLong();
    private final AtomicLong mTotalLatencyNs = new AtomicLong();
    private final AtomicLong mResponses = new AtomicLong();

    Metrics() {
    }

    void recordResponse(Response response, byte[] bArr, long j) {
        if (response.cacheResponse() != null && response.networkResponse() == null) {
            this.mCacheHits.incrementAndGet();
        } else if (response.cacheResponse() != null && response.networkResponse() != null) {
            this.mConditionalHits.incrementAndGet();
        } else if (response.networkResponse() != null) {
            this.mNetworkHits.incrementAndGet();
        }
        this.mTotalBytes.addAndGet(bArr != null ? bArr.length : 0L);
        this.mTotalLatencyNs.addAndGet(System.nanoTime() - j);
        this.mResponses.incrementAndGet();
    }

    void log() {
        long j = this.mCacheHits.get();
        long j2 = this.mConditionalHits.get();
        long j3 = this.mNetworkHits.get();
        Log.i("OkHttpTransport", "stats: total=" + (j + j2 + j3) + " cacheHits=" + j + " conditional304=" + j2 + " network=" + j3 + " responses=" + this.mResponses.get() + " bytes=" + this.mTotalBytes.get() + " cumulativeLatencyMs=" + (this.mTotalLatencyNs.get() / 1000000));
    }
}
