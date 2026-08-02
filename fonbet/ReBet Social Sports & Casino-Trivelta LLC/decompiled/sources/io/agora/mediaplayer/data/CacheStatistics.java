package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class CacheStatistics {
    private long fileSize = 0;
    private long cacheSize = 0;
    private long downloadSize = 0;

    @CalledByNative
    public CacheStatistics() {
    }

    public long getCacheSize() {
        return this.cacheSize;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    @CalledByNative
    public void setCacheSize(long j10) {
        this.cacheSize = j10;
    }

    @CalledByNative
    public void setDownloadSize(long j10) {
        this.downloadSize = j10;
    }

    @CalledByNative
    public void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public String toString() {
        return "CacheStatistics{fileSize=" + this.fileSize + ", cacheSize=" + this.cacheSize + ", downloadSize=" + this.downloadSize + '}';
    }
}
