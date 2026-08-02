package io.agora.rtc2.internal;

import io.agora.mediaplayer.IMediaPlayerCacheManager;

/* loaded from: classes3.dex */
public class MediaPlayerCacheManagerImpl implements IMediaPlayerCacheManager {
    protected static MediaPlayerCacheManagerImpl mInstance;
    private int cacheManagerInitStatus;
    private final RtcEngineImpl mRtcEngineImpl;

    private MediaPlayerCacheManagerImpl(RtcEngineImpl rtcEngineImpl) {
        this.cacheManagerInitStatus = -1;
        this.mRtcEngineImpl = rtcEngineImpl;
        this.cacheManagerInitStatus = rtcEngineImpl.initMediaPlayerCacheManager();
    }

    public static synchronized void destroyMediaPlayerCacheManager() {
        synchronized (MediaPlayerCacheManagerImpl.class) {
            mInstance = null;
        }
    }

    public static synchronized IMediaPlayerCacheManager getMediaPlayerCacheManager(RtcEngineImpl rtcEngineImpl) {
        synchronized (MediaPlayerCacheManagerImpl.class) {
            if (rtcEngineImpl == null) {
                return null;
            }
            try {
                if (mInstance == null) {
                    mInstance = new MediaPlayerCacheManagerImpl(rtcEngineImpl);
                }
                return mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int enableAutoRemoveCache(boolean z10) {
        return this.mRtcEngineImpl.mediaPlayerCacheEnableAutoRemoveCache(z10);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public String getCacheDir() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetCacheDir();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int getCacheFileCount() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetCacheFileCount();
    }

    public int getCacheManagerInitStatus() {
        return this.cacheManagerInitStatus;
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int getMaxCacheFileCount() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetMaxCacheFileCount();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public long getMaxCacheFileSize() {
        return this.mRtcEngineImpl.mediaPlayerCacheGetMaxCacheFileSize();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeAllCaches() {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveAllCaches();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeCacheByUri(String str) {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveCacheByUri(str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int removeOldCache() {
        return this.mRtcEngineImpl.mediaPlayerCacheRemoveOldCache();
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setCacheDir(String str) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetCacheDir(str);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setMaxCacheFileCount(int i10) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetMaxCacheFileCount(i10);
    }

    @Override // io.agora.mediaplayer.IMediaPlayerCacheManager
    public int setMaxCacheFileSize(long j10) {
        return this.mRtcEngineImpl.mediaPlayerCacheSetMaxCacheFileSize(j10);
    }
}
