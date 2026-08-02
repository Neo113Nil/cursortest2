package io.agora.musiccontentcenter;

import io.agora.musiccontentcenter.internal.MusicContentCenterImpl;
import io.agora.rtc2.RtcEngine;

/* loaded from: classes2.dex */
public abstract class IAgoraMusicContentCenter {
    private static IAgoraMusicContentCenter mInstance;

    public class MusicCacheStatusType {
        public static final int MUSIC_CACHE_STATUS_TYPE_CACHED = 0;
        public static final int MUSIC_CACHE_STATUS_TYPE_CACHING = 1;

        private MusicCacheStatusType() {
        }
    }

    public class MusicContentCenterStateReason {
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_ERROR = 1;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_GATEWAY = 2;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_HTTP_INTERNAL = 7;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_INTERNAL_DATA_PARSE = 4;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_MUSIC_DECRYPTION = 6;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_MUSIC_LOADING = 5;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_OK = 0;
        public static final int MUSIC_CONTENT_CENTER_STATE_REASON_PERMISSION_AND_RESOURCE = 3;

        private MusicContentCenterStateReason() {
        }
    }

    public class PreloadState {
        public static final int PRELOAD_STATE_COMPLETED = 0;
        public static final int PRELOAD_STATE_FAILED = 1;
        public static final int PRELOAD_STATE_PRELOADING = 2;
        public static final int PRELOAD_STATE_REMOVED = 3;

        private PreloadState() {
        }
    }

    public static synchronized IAgoraMusicContentCenter create(RtcEngine rtcEngine) {
        IAgoraMusicContentCenter iAgoraMusicContentCenter;
        synchronized (IAgoraMusicContentCenter.class) {
            try {
                if (mInstance == null) {
                    mInstance = new MusicContentCenterImpl(rtcEngine);
                }
                iAgoraMusicContentCenter = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iAgoraMusicContentCenter;
    }

    public static synchronized void destroy() {
        synchronized (IAgoraMusicContentCenter.class) {
            IAgoraMusicContentCenter iAgoraMusicContentCenter = mInstance;
            if (iAgoraMusicContentCenter == null) {
                return;
            }
            iAgoraMusicContentCenter.doDestroy();
            mInstance = null;
        }
    }

    public abstract IAgoraMusicPlayer createMusicPlayer();

    public abstract int destroyMusicPlayer(IAgoraMusicPlayer iAgoraMusicPlayer);

    public abstract void doDestroy();

    public abstract MusicCacheInfo[] getCaches();

    public abstract long getInternalSongCode(long j10, String str);

    public abstract String getLyric(long j10, int i10);

    public abstract String getMusicCharts();

    public String getMusicCollectionByMusicChartId(int i10, int i11, int i12) {
        return getMusicCollectionByMusicChartId(i10, i11, i12, null);
    }

    public abstract String getMusicCollectionByMusicChartId(int i10, int i11, int i12, String str);

    public abstract String getSongSimpleInfo(long j10);

    public abstract int initialize(MusicContentCenterConfiguration musicContentCenterConfiguration);

    public abstract int isPreloaded(long j10);

    @Deprecated
    public abstract int preload(long j10, String str);

    public abstract String preload(long j10);

    public abstract int registerEventHandler(IMusicContentCenterEventHandler iMusicContentCenterEventHandler);

    public abstract int removeCache(long j10);

    public abstract int renewToken(String str);

    public String searchMusic(String str, int i10, int i11) {
        return searchMusic(str, i10, i11, null);
    }

    public abstract String searchMusic(String str, int i10, int i11, String str2);

    public abstract int unregisterEventHandler();
}
