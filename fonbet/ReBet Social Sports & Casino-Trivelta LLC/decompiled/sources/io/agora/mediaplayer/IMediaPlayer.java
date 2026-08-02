package io.agora.mediaplayer;

import android.net.Uri;
import android.view.View;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.audio.IAudioSpectrumObserver;

/* loaded from: classes2.dex */
public interface IMediaPlayer {
    int adjustPlayoutVolume(int i10);

    int adjustPublishSignalVolume(int i10);

    int destroy();

    @Deprecated
    int enableAutoSwitchAgoraCDN(boolean z10);

    @Deprecated
    int getAgoraCDNLineCount();

    int getAudioBufferDelay();

    @Deprecated
    int getCurrentAgoraCDNIndex();

    long getDuration();

    int getMediaPlayerId();

    boolean getMute();

    long getPlayPosition();

    String getPlaySrc();

    int getPlayoutVolume();

    int getPublishSignalVolume();

    Constants.MediaPlayerState getState();

    int getStreamCount();

    MediaStreamInfo getStreamInfo(int i10);

    int mute(boolean z10);

    int open(Uri uri, long j10);

    int open(String str, long j10);

    @Deprecated
    int openWithAgoraCDNSrc(String str, long j10);

    int openWithMediaSource(MediaPlayerSource mediaPlayerSource);

    int pause();

    int play();

    int playPreloadedSrc(String str);

    int preloadSrc(String str, long j10);

    int registerAudioFrameObserver(IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i10);

    int registerMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver, int i10);

    int registerPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver);

    int registerVideoFrameObserver(IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    @Deprecated
    int renewAgoraCDNSrcToken(String str, long j10);

    int resume();

    int seek(long j10);

    int selectAudioTrack(int i10);

    int selectInternalSubtitle(int i10);

    int selectMultiAudioTrack(int i10, int i11);

    int setAudioDualMonoMode(int i10);

    int setAudioPitch(int i10);

    int setExternalSubtitle(String str);

    int setLoopCount(int i10);

    int setPlaybackSpeed(int i10);

    int setPlayerOption(String str, int i10);

    int setPlayerOptionString(String str, String str2);

    int setRenderMode(int i10);

    int setSpatialAudioParams(SpatialAudioParams spatialAudioParams);

    int setView(View view);

    int stop();

    @Deprecated
    int switchAgoraCDNLineByIndex(int i10);

    @Deprecated
    int switchAgoraCDNSrc(String str, boolean z10);

    int switchSrc(String str, boolean z10);

    int takeScreenshot(String str);

    int unRegisterPlayerObserver(IMediaPlayerObserver iMediaPlayerObserver);

    int unloadSrc(String str);

    int unregisterMediaPlayerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);
}
