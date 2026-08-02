package ru.ozon.app.android.video.playerV2.utils;

import J3.g;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import j3.C7275q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import t3.C9740f;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aM\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroid/content/Context;", "context", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lkotlin/Function0;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "onGetPlayerListener", "Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayer", "(Landroid/content/Context;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Lru/ozon/app/android/network/abtool/FeatureService;LSc/j;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lkotlin/jvm/functions/Function0;)Landroidx/media3/exoplayer/ExoPlayer;", "", "getCurrentPlayerMediaUrl", "(Landroidx/media3/exoplayer/ExoPlayer;)Ljava/lang/String;", "", "isPlayerActive", "(Landroidx/media3/exoplayer/ExoPlayer;)Z", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerUtilsKt {
    public static final String getCurrentPlayerMediaUrl(@NotNull ExoPlayer exoPlayer) {
        C7275q.f fVar;
        Uri uri;
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        C7275q A11 = exoPlayer.A();
        if (A11 == null || (fVar = A11.f69184b) == null || (uri = fVar.f69240a) == null) {
            return null;
        }
        return uri.toString();
    }

    @NotNull
    public static final ExoPlayer getExoPlayer(@NotNull Context context, @NotNull PlayerConfigAlias playerConfigAlias, @NotNull FeatureService featureService, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull AudioRequestService audioRequestService, @NotNull Function0<PlayerListenersContainer> onGetPlayerListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(onGetPlayerListener, "onGetPlayerListener");
        ExoPlayer.b bVar = new ExoPlayer.b(context);
        C9740f c9740f = new C9740f(context);
        c9740f.c();
        bVar.f(c9740f);
        bVar.c(PlayerConfigUtilsKt.createLoadControl(featureService));
        if (playerConfigAlias.getEnableExperimentalBandwidth()) {
            bVar.b(g.g(context));
        }
        bVar.d(Looper.getMainLooper());
        ExoPlayer a11 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        playbackAnalyticsListenerDelegate.getValue().setGetIsPlayerAllowedToPlay(new ExoPlayerUtilsKt$getExoPlayer$2$1(a11));
        playbackAnalyticsListenerDelegate.getValue().setGetCurrentMediaUrl(new ExoPlayerUtilsKt$getExoPlayer$2$2(a11));
        a11.c(playbackAnalyticsListenerDelegate.getValue());
        a11.t(DefaultPlayerListenerUtilKt.getDefaultPlayerListener(onGetPlayerListener, a11, audioRequestService));
        return a11;
    }

    public static final boolean isPlayerActive(@NotNull ExoPlayer exoPlayer) {
        Intrinsics.checkNotNullParameter(exoPlayer, "<this>");
        return exoPlayer.P() == 2 || exoPlayer.P() == 3 || exoPlayer.P() == 4;
    }
}
