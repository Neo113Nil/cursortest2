package io.agora.musiccontentcenter.internal;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.IMediaPlayerAudioFrameObserver;
import io.agora.mediaplayer.IMediaPlayerObserver;
import io.agora.mediaplayer.IMediaPlayerVideoFrameObserver;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.musiccontentcenter.IAgoraMusicPlayer;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class AgoraMusicPlayerImpl implements IAgoraMusicPlayer {
    private static final String TAG = "AgoraMusicPlayerImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private long mNativeHandle;
    private final int mNativeMediaPlayerSourceId;
    private final RtcEngineImpl mRtcEngineImpl;

    public AgoraMusicPlayerImpl(RtcEngineImpl rtcEngineImpl, long j10, int i10) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = j10;
        this.mNativeMediaPlayerSourceId = i10;
        this.mRtcEngineImpl = rtcEngineImpl;
    }

    private native int nativeAdjustPlayoutVolume(long j10, int i10);

    private native int nativeAdjustPublishSignalVolume(long j10, int i10);

    private native int nativeChangePlaybackSpeed(long j10, int i10);

    private static native int nativeDestroy(long j10);

    private native int nativeEnableAutoSwitchAgoraCDN(long j10, boolean z10);

    private native int nativeGetAgoraCDNLineCount(long j10);

    private native int nativeGetAudioBufferDelay(long j10);

    private native int nativeGetCurrentAgoraCDNIndex(long j10);

    private native long nativeGetDuration(long j10);

    private native boolean nativeGetMute(long j10);

    private native long nativeGetPlayPosition(long j10);

    private native String nativeGetPlaySrc(long j10);

    private native int nativeGetPlayoutVolume(long j10);

    private native int nativeGetPublishSignalVolume(long j10);

    private native int nativeGetState(long j10);

    private native int nativeGetStreamCount(long j10);

    private native MediaStreamInfo nativeGetStreamInfo(long j10, int i10);

    private native int nativeMute(long j10, boolean z10);

    private native int nativeOpen(long j10, long j11, long j12);

    private native int nativeOpenWithAgoraCDNSrc(long j10, String str, long j11);

    private native int nativeOpenWithSource(long j10, MediaPlayerSource mediaPlayerSource);

    private native int nativeOpenWithUrl(long j10, String str, long j11);

    private native int nativePause(long j10);

    private native int nativePlay(long j10);

    private native int nativePlayPreloadedSrc(long j10, String str);

    private native int nativePreloadSrc(long j10, String str, long j11);

    private native int nativeRegisterAudioFrameObserver(long j10, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i10);

    private native int nativeRegisterAudioSpectrumObserver(long j10, IAudioSpectrumObserver iAudioSpectrumObserver, int i10);

    private native int nativeRegisterPlayerObserver(long j10, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeRegisterVideoFrameObserver(long j10, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    private native int nativeRenewAgoraCDNSrcToken(long j10, String str, long j11);

    private native int nativeResume(long j10);

    private native int nativeSeek(long j10, long j11);

    private native int nativeSelectAudioTrack(long j10, int i10);

    private native int nativeSelectInternalSubtitle(long j10, int i10);

    private native int nativeSelectMultiAudioTrack(long j10, int i10, int i11);

    private native int nativeSetAudioDualMonoMode(long j10, int i10);

    private native int nativeSetAudioPitch(long j10, int i10);

    private native int nativeSetExternalSubtitle(long j10, String str);

    private native int nativeSetLoopCount(long j10, int i10);

    private static native int nativeSetPlayMode(long j10, int i10);

    private native int nativeSetPlayerOption(long j10, String str, int i10);

    private native int nativeSetPlayerOptionString(long j10, String str, String str2);

    private native int nativeSetRenderMode(long j10, int i10);

    private native int nativeSetSpatialAudioParams(long j10, SpatialAudioParams spatialAudioParams);

    private native int nativeSetView(long j10, View view);

    private native int nativeStop(long j10);

    private native int nativeSwitchAgoraCDNLineByIndex(long j10, int i10);

    private native int nativeSwitchAgoraCDNSrc(long j10, String str, boolean z10);

    private native int nativeSwitchSrc(long j10, String str, boolean z10);

    private native int nativeTakeScreenshot(long j10, String str);

    private native int nativeUnRegisterAudioSpectrumObserver(long j10, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnRegisterPlayerObserver(long j10, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeUnloadSrc(long j10, String str);

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPlayoutVolume(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeAdjustPlayoutVolume(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (adjustPlayoutVolume)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int adjustPublishSignalVolume(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeAdjustPublishSignalVolume(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (adjustPublishSignalVolume)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int destroy() {
        RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl;
        if (rtcEngineImpl == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (destroy)");
                    return -7;
                }
                this.mIsDestroying.set(true);
                int nativeDestroy = nativeDestroy(this.mNativeHandle);
                this.mNativeHandle = 0L;
                this.mIsDestroying.set(false);
                return nativeDestroy;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int enableAutoSwitchAgoraCDN(boolean z10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeEnableAutoSwitchAgoraCDN(j10, z10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (enableAutoSwitchAgoraCDN)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getAgoraCDNLineCount() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetAgoraCDNLineCount(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getAgoraCDNLineCount)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getAudioBufferDelay() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetAudioBufferDelay(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getAudioBufferDelay)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getCurrentAgoraCDNIndex() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetCurrentAgoraCDNIndex(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getCurrentAgoraCDNIndex)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getDuration() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8L;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetDuration(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getDuration)");
                return -7L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getMediaPlayerId() {
        return this.mNativeMediaPlayerSourceId;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public boolean getMute() {
        RtcEngineImpl rtcEngineImpl;
        boolean z10 = false;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return false;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getMute)");
                } else {
                    z10 = nativeGetMute(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public long getPlayPosition() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8L;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetPlayPosition(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlayPosition)");
                return -7L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public String getPlaySrc() {
        RtcEngineImpl rtcEngineImpl;
        String str = null;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlaySrc)");
                } else {
                    str = nativeGetPlaySrc(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPlayoutVolume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetPlayoutVolume(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPlayoutVolume)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getPublishSignalVolume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetPublishSignalVolume(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getPublishSignalVolume)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public Constants.MediaPlayerState getState() {
        RtcEngineImpl rtcEngineImpl;
        Constants.MediaPlayerState stateByValue;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return Constants.MediaPlayerState.PLAYER_STATE_UNKNOWN;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getState)");
                    stateByValue = Constants.MediaPlayerState.PLAYER_STATE_UNKNOWN;
                } else {
                    stateByValue = Constants.MediaPlayerState.getStateByValue(nativeGetState(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stateByValue;
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int getStreamCount() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetStreamCount(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getStreamCount)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public MediaStreamInfo getStreamInfo(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return null;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeGetStreamInfo(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (getStreamInfo)");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int mute(boolean z10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMute(j10, z10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (mute)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer
    public int open(long j10, long j11) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j12 = this.mNativeHandle;
                if (j12 != 0) {
                    return nativeOpen(j12, j10, j11);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with songCode)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithAgoraCDNSrc(String str, long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeOpenWithAgoraCDNSrc(j11, str, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (openWithAgoraCDNSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int openWithMediaSource(MediaPlayerSource mediaPlayerSource) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeOpenWithSource(j10, mediaPlayerSource);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (openWithMediaSource)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int pause() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativePause(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (pause)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int play() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativePlay(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (play)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int playPreloadedSrc(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativePlayPreloadedSrc(j10, str);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (playPreloadedSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int preloadSrc(String str, long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativePreloadSrc(j11, str, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (preloadSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeRegisterAudioFrameObserver(j10, iMediaPlayerAudioFrameObserver, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerAudioFrameObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver, int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeRegisterAudioSpectrumObserver(j10, iAudioSpectrumObserver, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerMediaPlayerAudioSpectrumObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeRegisterPlayerObserver(j10, iMediaPlayerObserver);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerPlayerObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeRegisterVideoFrameObserver(j10, iMediaPlayerVideoFrameObserver);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (registerVideoFrameObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int renewAgoraCDNSrcToken(String str, long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeRenewAgoraCDNSrcToken(j11, str, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (renewAgoraCDNSrcToken)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int resume() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeResume(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (resume)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int seek(long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeSeek(j11, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (seek)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectAudioTrack(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSelectAudioTrack(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectAudioTrack)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectInternalSubtitle(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSelectInternalSubtitle(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectInternalSubtitle)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int selectMultiAudioTrack(int i10, int i11) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSelectMultiAudioTrack(j10, i10, i11);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (selectMultiAudioTrack)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioDualMonoMode(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetAudioDualMonoMode(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setAudioDualMonoMode)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setAudioPitch(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetAudioPitch(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setAudioPitch)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setExternalSubtitle(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetExternalSubtitle(j10, str);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setExternalSubtitle)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setLoopCount(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetLoopCount(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setLoopCount)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer
    public int setPlayMode(IAgoraMusicPlayer.MusicPlayMode musicPlayMode) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null || musicPlayMode == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetPlayMode(j10, musicPlayMode.getValue());
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayMode)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlaybackSpeed(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeChangePlaybackSpeed(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlaybackSpeed)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOption(String str, int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetPlayerOption(j10, str, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayerOption)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setPlayerOptionString(String str, String str2) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetPlayerOptionString(j10, str, str2);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setPlayerOptionString)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setRenderMode(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetRenderMode(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setRenderMode)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setSpatialAudioParams(SpatialAudioParams spatialAudioParams) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetSpatialAudioParams(j10, spatialAudioParams);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setSpatialAudioParams)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int setView(View view) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSetView(j10, view);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (setView)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int stop() {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeStop(j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (stop)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNLineByIndex(int i10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSwitchAgoraCDNLineByIndex(j10, i10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchAgoraCDNLineByIndex)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchAgoraCDNSrc(String str, boolean z10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSwitchAgoraCDNSrc(j10, str, z10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchAgoraCDNSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int switchSrc(String str, boolean z10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeSwitchSrc(j10, str, z10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (switchSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int takeScreenshot(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeTakeScreenshot(j10, str);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (takeScreenshot)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unRegisterPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeUnRegisterPlayerObserver(j10, iMediaPlayerObserver);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unRegisterPlayerObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unloadSrc(String str) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeUnloadSrc(j10, str);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unloadSrc)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeUnRegisterAudioSpectrumObserver(j10, iAudioSpectrumObserver);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (unregisterMediaPlayerAudioSpectrumObserver)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    public int open(Uri uri, long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with uri)");
                    return -7;
                }
                String contentFilePath = CommonUtility.getContentFilePath(this.mRtcEngineImpl.getContext(), uri);
                if (contentFilePath != null && !contentFilePath.equals("")) {
                    return nativeOpenWithUrl(this.mNativeHandle, contentFilePath, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer Can not open incorrect Uri Param");
                return -2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.musiccontentcenter.IAgoraMusicPlayer, io.agora.mediaplayer.IMediaPlayer
    public int open(String str, long j10) {
        RtcEngineImpl rtcEngineImpl;
        if (this.mIsDestroying.get() || (rtcEngineImpl = this.mRtcEngineImpl) == null) {
            return -8;
        }
        synchronized (rtcEngineImpl) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeOpenWithUrl(j11, str, j10);
                }
                Logging.e(TAG, "AgoraMusicPlayer does not initialize or it may be destroyed (open with url)");
                return -7;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
