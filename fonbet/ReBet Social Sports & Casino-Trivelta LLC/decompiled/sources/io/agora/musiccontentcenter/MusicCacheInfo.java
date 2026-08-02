package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class MusicCacheInfo {
    public long songCode;
    public int status;

    public MusicCacheInfo() {
    }

    @CalledByNative
    public long getSongCode() {
        return this.songCode;
    }

    @CalledByNative
    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "MusicCacheInfo{songCode=" + this.songCode + ", status=" + this.status + '}';
    }

    @CalledByNative
    public MusicCacheInfo(long j10, int i10) {
        this.songCode = j10;
        this.status = i10;
    }
}
