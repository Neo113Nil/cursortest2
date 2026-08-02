package io.agora.mediaplayer;

import io.agora.base.internal.CalledByNative;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.CacheStatistics;
import io.agora.mediaplayer.data.PlayerPlaybackStats;
import io.agora.mediaplayer.data.PlayerUpdatedInfo;
import io.agora.mediaplayer.data.SrcInfo;

/* loaded from: classes2.dex */
public interface IMediaPlayerObserver {
    @CalledByNative
    @Deprecated
    void onAgoraCDNTokenWillExpire();

    @CalledByNative
    void onAudioVolumeIndication(int i10);

    @CalledByNative
    void onMetaData(Constants.MediaPlayerMetadataType mediaPlayerMetadataType, byte[] bArr);

    @CalledByNative
    void onPlayBufferUpdated(long j10);

    @CalledByNative
    void onPlayerCacheStats(CacheStatistics cacheStatistics);

    @CalledByNative
    void onPlayerEvent(Constants.MediaPlayerEvent mediaPlayerEvent, long j10, String str);

    @CalledByNative
    void onPlayerInfoUpdated(PlayerUpdatedInfo playerUpdatedInfo);

    @CalledByNative
    void onPlayerPlaybackStats(PlayerPlaybackStats playerPlaybackStats);

    @CalledByNative
    void onPlayerSrcInfoChanged(SrcInfo srcInfo, SrcInfo srcInfo2);

    @CalledByNative
    void onPlayerStateChanged(Constants.MediaPlayerState mediaPlayerState, Constants.MediaPlayerReason mediaPlayerReason);

    @CalledByNative
    void onPositionChanged(long j10, long j11);

    @CalledByNative
    void onPreloadEvent(String str, Constants.MediaPlayerPreloadEvent mediaPlayerPreloadEvent);
}
