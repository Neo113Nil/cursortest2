package com.microsoft.codepush.react;

import androidx.collection.SieveCacheKt;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

/* loaded from: classes8.dex */
class DownloadProgress {
    private long mReceivedBytes;
    private long mTotalBytes;

    public DownloadProgress(long j, long j2) {
        this.mTotalBytes = j;
        this.mReceivedBytes = j2;
    }

    public WritableMap createWritableMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        long j = this.mTotalBytes;
        if (j < SieveCacheKt.NodeLinkMask) {
            writableNativeMap.putInt("totalBytes", (int) j);
            writableNativeMap.putInt("receivedBytes", (int) this.mReceivedBytes);
            return writableNativeMap;
        }
        writableNativeMap.putDouble("totalBytes", j);
        writableNativeMap.putDouble("receivedBytes", this.mReceivedBytes);
        return writableNativeMap;
    }

    public boolean isCompleted() {
        return this.mTotalBytes == this.mReceivedBytes;
    }

    public int getProgressPercent() {
        long j = this.mTotalBytes;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.mReceivedBytes * 100) / j);
    }
}
