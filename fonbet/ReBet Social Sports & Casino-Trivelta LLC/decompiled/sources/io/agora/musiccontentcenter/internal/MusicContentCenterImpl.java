package io.agora.musiccontentcenter.internal;

import io.agora.musiccontentcenter.IAgoraMusicContentCenter;
import io.agora.musiccontentcenter.IAgoraMusicPlayer;
import io.agora.musiccontentcenter.IMusicContentCenterEventHandler;
import io.agora.musiccontentcenter.MusicCacheInfo;
import io.agora.musiccontentcenter.MusicContentCenterConfiguration;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MusicContentCenterImpl extends IAgoraMusicContentCenter {
    private static final String TAG = "MusicContentCenterImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private long mNativeHandle;
    private final RtcEngineImpl mRtcEngine;

    public MusicContentCenterImpl(RtcEngine rtcEngine) {
        this.mNativeHandle = 0L;
        if (!(rtcEngine instanceof RtcEngineImpl)) {
            this.mRtcEngine = null;
            return;
        }
        RtcEngineImpl rtcEngineImpl = (RtcEngineImpl) rtcEngine;
        this.mRtcEngine = rtcEngineImpl;
        synchronized (rtcEngineImpl) {
            this.mNativeHandle = nativeObjectInit(rtcEngine.getNativeHandle());
        }
    }

    private native MusicPlayerProperty nativeCreateMusicPlayer(long j10);

    private static native int nativeDestroy(long j10, long j11);

    private native int nativeDestroyMusicPlayer(long j10, int i10);

    private native MusicCacheInfo[] nativeGetCaches(long j10);

    private native long nativeGetInternalSongCode(long j10, long j11, String str);

    private native String nativeGetLyric(long j10, long j11, int i10);

    private native String nativeGetMusicCharts(long j10);

    private native String nativeGetMusicCollectionByMusicChartId(long j10, int i10, int i11, int i12, String str);

    private native String nativeGetSongSimpleInfo(long j10, long j11);

    private native int nativeInitialize(long j10, Object obj);

    private native int nativeIsPreloaded(long j10, long j11);

    private native long nativeObjectInit(long j10);

    private native int nativePreload(long j10, long j11, String str);

    private native String nativePreloadWithSongCode(long j10, long j11);

    private native int nativeRegisterEventHandler(long j10, Object obj);

    private native int nativeRemoveCache(long j10, long j11);

    private native int nativeRenewToken(long j10, String str);

    private native String nativeSearchMusic(long j10, String str, int i10, int i11, String str2);

    private native int nativeUnregisterEventHandler(long j10);

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public IAgoraMusicPlayer createMusicPlayer() {
        RtcEngineImpl rtcEngineImpl;
        AgoraMusicPlayerImpl agoraMusicPlayerImpl = null;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    MusicPlayerProperty nativeCreateMusicPlayer = nativeCreateMusicPlayer(this.mNativeHandle);
                    long j10 = nativeCreateMusicPlayer.handler;
                    if (j10 != 0) {
                        agoraMusicPlayerImpl = new AgoraMusicPlayerImpl(this.mRtcEngine, j10, nativeCreateMusicPlayer.f49159id);
                    }
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (createMusicPlayer)");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return agoraMusicPlayerImpl;
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int destroyMusicPlayer(IAgoraMusicPlayer iAgoraMusicPlayer) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null || iAgoraMusicPlayer == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeDestroyMusicPlayer(this.mNativeHandle, iAgoraMusicPlayer.getMediaPlayerId());
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (destroyMusicPlayer)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public void doDestroy() {
        RtcEngineImpl rtcEngineImpl = this.mRtcEngine;
        if (rtcEngineImpl == null) {
            return;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0) {
                    this.mIsDestroying.set(true);
                    nativeDestroy(this.mNativeHandle, this.mRtcEngine.getNativeHandle());
                    this.mNativeHandle = 0L;
                    this.mIsDestroying.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public MusicCacheInfo[] getCaches() {
        RtcEngineImpl rtcEngineImpl;
        MusicCacheInfo[] musicCacheInfoArr;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return new MusicCacheInfo[0];
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    musicCacheInfoArr = nativeGetCaches(this.mNativeHandle);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getCaches)");
                musicCacheInfoArr = new MusicCacheInfo[0];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return musicCacheInfoArr;
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public long getInternalSongCode(long j10, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return 0L;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetInternalSongCode(this.mNativeHandle, j10, str);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getInternalSongCode)");
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getLyric(long j10, int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetLyric(this.mNativeHandle, j10, i10);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getLyric)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getMusicCharts() {
        RtcEngineImpl rtcEngineImpl;
        String nativeGetMusicCharts;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                nativeGetMusicCharts = (this.mNativeHandle == 0 || this.mRtcEngine.getNativeHandle() == 0) ? null : nativeGetMusicCharts(this.mNativeHandle);
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getMusicCharts)");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nativeGetMusicCharts;
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getMusicCollectionByMusicChartId(int i10, int i11, int i12, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetMusicCollectionByMusicChartId(this.mNativeHandle, i10, i11, i12, str);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getMusicCollectionByMusicChartId)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String getSongSimpleInfo(long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeGetSongSimpleInfo(this.mNativeHandle, j10);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (getSongSimpleInfo)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int initialize(MusicContentCenterConfiguration musicContentCenterConfiguration) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeInitialize(this.mNativeHandle, musicContentCenterConfiguration);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (initialize)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int isPreloaded(long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeIsPreloaded(this.mNativeHandle, j10);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (isPreloaded)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int preload(long j10, String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativePreload(this.mNativeHandle, j10, str);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (preload)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int registerEventHandler(IMusicContentCenterEventHandler iMusicContentCenterEventHandler) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRegisterEventHandler(this.mNativeHandle, iMusicContentCenterEventHandler);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (registerEventHandler)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int removeCache(long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRemoveCache(this.mNativeHandle, j10);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (removeCache)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int renewToken(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeRenewToken(this.mNativeHandle, str);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (renewToken)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String searchMusic(String str, int i10, int i11, String str2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeSearchMusic(this.mNativeHandle, str, i10, i11, str2);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (searchMusic)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public int unregisterEventHandler() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativeUnregisterEventHandler(this.mNativeHandle);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (unregisterEventHandler)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicContentCenter
    public String preload(long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngine) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle != 0 && this.mRtcEngine.getNativeHandle() != 0) {
                    return nativePreloadWithSongCode(this.mNativeHandle, j10);
                }
                Logging.e(TAG, "MusicContentCenter does not initialize or it may be destroyed (preload)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
