package ru.ozon.app.android.video.playerV2.utils;

import androidx.media3.exoplayer.ExoPlayer;
import j3.C7256L;
import j3.Q;
import j3.w;
import j3.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.video.R$string;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "onGetPlayerListener", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lj3/y$c;", "getDefaultPlayerListener", "(Lkotlin/jvm/functions/Function0;Landroidx/media3/exoplayer/ExoPlayer;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;)Lj3/y$c;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPlayerListenerUtilKt {
    @NotNull
    public static final y.c getDefaultPlayerListener(@NotNull final Function0<PlayerListenersContainer> onGetPlayerListener, @NotNull final ExoPlayer exoPlayer, @NotNull final AudioRequestService audioRequestService) {
        Intrinsics.checkNotNullParameter(onGetPlayerListener, "onGetPlayerListener");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        return new y.c() { // from class: ru.ozon.app.android.video.playerV2.utils.DefaultPlayerListenerUtilKt$getDefaultPlayerListener$1
            @Override // j3.y.c
            public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                PlayerStatusSnapshot playerStatusSnapshot = PlayerStatusSnapshotKt.playerStatusSnapshot(exoPlayer);
                PlayerState playerState = new PlayerState(playerStatusSnapshot.getDurationMs(), null, 2, null);
                if (!playerStatusSnapshot.getIsPlaying()) {
                    AudioUtilsKt.abandonAudioFocusRequestForPlayer(audioRequestService, exoPlayer);
                    if (invoke != null) {
                        invoke.onPause();
                        return;
                    }
                    return;
                }
                if (exoPlayer.getVolume() != 0.0f) {
                    AudioUtilsKt.requestAudioFocusForPlayer(audioRequestService, exoPlayer);
                }
                if (invoke != null) {
                    invoke.onStart(playerState);
                }
            }

            @Override // j3.y.c
            public void onPlaybackStateChanged(int playbackState) {
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                PlayerStatusSnapshot playerStatusSnapshot = PlayerStatusSnapshotKt.playerStatusSnapshot(exoPlayer);
                if (playerStatusSnapshot.getIsReady()) {
                    if (invoke != null) {
                        invoke.onReady(new PlayerState(playerStatusSnapshot.getDurationMs(), null, 2, null));
                    }
                    if (exoPlayer.getVolume() == 0.0f) {
                        return;
                    }
                    AudioUtilsKt.requestAudioFocusForPlayer(audioRequestService, exoPlayer);
                    return;
                }
                if (playerStatusSnapshot.getIsBuffering()) {
                    if (invoke != null) {
                        invoke.onBuffer();
                    }
                } else if (playerStatusSnapshot.getIsFinished()) {
                    if (invoke != null) {
                        invoke.onFinish();
                    }
                } else if (playerStatusSnapshot.getIsIdle()) {
                    if (invoke != null) {
                        invoke.onStop();
                    }
                    AudioUtilsKt.abandonAudioFocusRequestForPlayer(audioRequestService, exoPlayer);
                }
            }

            @Override // j3.y.c
            public void onPlayerError(w error) {
                Intrinsics.checkNotNullParameter(error, "error");
                String string = StringProvider.getString(R$string.error_common_player_error);
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                if (invoke != null) {
                    invoke.onError(string, error, Boolean.valueOf(PlayerStatusSnapshotKt.playerStatusSnapshot(exoPlayer).getIsPlaying()));
                }
            }

            @Override // j3.y.c
            public void onRenderedFirstFrame() {
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                if (invoke != null) {
                    invoke.onRenderedFirstFrame();
                }
            }

            @Override // j3.y.c
            public void onTracksChanged(C7256L tracks) {
                Intrinsics.checkNotNullParameter(tracks, "tracks");
                boolean hasAudioInTracks = AudioUtilsKt.hasAudioInTracks(tracks);
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                if (invoke != null) {
                    invoke.hasAudio(hasAudioInTracks);
                }
            }

            @Override // j3.y.c
            public void onVideoSizeChanged(Q videoSize) {
                Intrinsics.checkNotNullParameter(videoSize, "videoSize");
                PlayerListenersContainer invoke = onGetPlayerListener.invoke();
                if (invoke != null) {
                    invoke.onVideoSizeChanged(videoSize);
                }
            }

            @Override // j3.y.c
            public void onVolumeChanged(float volume) {
                if (volume == 0.0f) {
                    AudioUtilsKt.abandonAudioFocusRequestForPlayer(audioRequestService, exoPlayer);
                } else if (exoPlayer.n()) {
                    AudioUtilsKt.requestAudioFocusForPlayer(audioRequestService, exoPlayer);
                }
            }
        };
    }
}
