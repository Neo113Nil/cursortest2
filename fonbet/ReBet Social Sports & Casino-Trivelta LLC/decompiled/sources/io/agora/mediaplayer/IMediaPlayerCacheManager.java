package io.agora.mediaplayer;

/* loaded from: classes2.dex */
public interface IMediaPlayerCacheManager {
    int enableAutoRemoveCache(boolean z10);

    String getCacheDir();

    int getCacheFileCount();

    int getMaxCacheFileCount();

    long getMaxCacheFileSize();

    int removeAllCaches();

    int removeCacheByUri(String str);

    int removeOldCache();

    int setCacheDir(String str);

    int setMaxCacheFileCount(int i10);

    int setMaxCacheFileSize(long j10);
}
