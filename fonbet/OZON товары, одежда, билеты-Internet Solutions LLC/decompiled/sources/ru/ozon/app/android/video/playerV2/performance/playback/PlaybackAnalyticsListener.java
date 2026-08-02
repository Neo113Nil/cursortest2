package ru.ozon.app.android.video.playerV2.performance.playback;

import F3.C3013s;
import F3.C3016v;
import Sc.InterfaceC4008j;
import Sg.a;
import j3.C7275q;
import j3.w;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.fromexoplayer.OzPlaybackStatsListener;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.playerV2.performance.playback.events.ErrorEvent;
import ru.ozon.app.android.video.playerV2.performance.playback.events.PlaybackEvent;
import ru.ozon.app.android.video.playerV2.performance.playback.events.VideoInfoUpdateEvent;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00104\u001a\u000200H\u0016¢\u0006\u0004\b5\u00103J7\u00108\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u0002062\u0006\u00107\u001a\u00020\u0012H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010:\u001a\u000200H\u0016¢\u0006\u0004\b;\u00103J\u001f\u0010<\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u000200H\u0016¢\u0006\u0004\b<\u00103J\u0015\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0=¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u0012¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0014¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00142\u0006\u0010I\u001a\u00020>¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00142\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00142\u0006\u0010M\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010M\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010bR\u0016\u0010I\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010cR(\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00120=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010@\"\u0004\bg\u0010hR*\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010e\u001a\u0004\bj\u0010@\"\u0004\bk\u0010h¨\u0006l"}, d2 = {"Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "Lru/ozon/app/android/video/player/fromexoplayer/OzPlaybackStatsListener;", "LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "playbackAnalyticsSender", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "videoPerfMetricsManager", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "playerLogger", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LSg/a;Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lru/ozon/app/android/video/player/logs/PlayerLogger;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lu3/b$a;", "eventTime", "", "isPlaying", "", "onIsPlayingChanged", "(Lu3/b$a;Z)V", "playWhenReady", "", "reason", "onPlayWhenReadyChanged", "(Lu3/b$a;ZI)V", "state", "onPlaybackStateChanged", "(Lu3/b$a;I)V", "Lj3/q;", "mediaItem", "onMediaItemTransition", "(Lu3/b$a;Lj3/q;I)V", "onPlayerReleased", "(Lu3/b$a;)V", "LF3/s;", "loadEventInfo", "LF3/v;", "mediaLoadData", "onLoadStarted", "(Lu3/b$a;LF3/s;LF3/v;)V", "onLoadCanceled", "Lj3/w;", "error", "onPlayerError", "(Lu3/b$a;Lj3/w;)V", "Ljava/lang/Exception;", "audioCodecError", "onAudioCodecError", "(Lu3/b$a;Ljava/lang/Exception;)V", "audioSinkError", "onAudioSinkError", "Ljava/io/IOException;", "wasCanceled", "onLoadError", "(Lu3/b$a;LF3/s;LF3/v;Ljava/io/IOException;Z)V", "videoCodecError", "onVideoCodecError", "onDrmSessionManagerError", "Lkotlin/Function0;", "", "onGetCurrentWidgetName", "()Lkotlin/jvm/functions/Function0;", "checkLoadError", "onCheckLoadErrorFlagChanged", "(Z)V", "onDiscardHistoryStats", "()V", "index", "updateVideoIndex", "(I)V", "widgetName", "updateWidgetName", "(Ljava/lang/String;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;", "event", "handlePlaybackEvent", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/PlaybackEvent;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/events/VideoInfoUpdateEvent;", "handleVideoInfoUpdateEvent", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/VideoInfoUpdateEvent;)V", "Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;", "handleErrorEvent", "(Lru/ozon/app/android/video/playerV2/performance/playback/events/ErrorEvent;)V", "LSg/a;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsSender;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManager;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager;", "playbackStateManager$delegate", "LSc/j;", "getPlaybackStateManager", "()Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager;", "playbackStateManager", "Z", "Ljava/lang/String;", "getIsPlayerAllowedToPlay", "Lkotlin/jvm/functions/Function0;", "getGetIsPlayerAllowedToPlay", "setGetIsPlayerAllowedToPlay", "(Lkotlin/jvm/functions/Function0;)V", "getCurrentMediaUrl", "getGetCurrentMediaUrl", "setGetCurrentMediaUrl", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackAnalyticsListener extends OzPlaybackStatsListener {

    @NotNull
    private final a analyticsScreenStorage;
    private boolean checkLoadError;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private Function0<String> getCurrentMediaUrl;

    @NotNull
    private Function0<Boolean> getIsPlayerAllowedToPlay;

    @NotNull
    private final PlaybackAnalyticsSender playbackAnalyticsSender;

    /* renamed from: playbackStateManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playbackStateManager;

    @NotNull
    private final PlayerLogger playerLogger;

    @NotNull
    private final VideoPerfMetricsManager videoPerfMetricsManager;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @NotNull
    private String widgetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackAnalyticsListener(@NotNull a analyticsScreenStorage, @NotNull PlaybackAnalyticsSender playbackAnalyticsSender, @NotNull VideoPerfMetricsManager videoPerfMetricsManager, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull PlayerLogger playerLogger, @NotNull FeatureService featureService) {
        super(false, null);
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(playbackAnalyticsSender, "playbackAnalyticsSender");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManager, "videoPerfMetricsManager");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(playerLogger, "playerLogger");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.playbackAnalyticsSender = playbackAnalyticsSender;
        this.videoPerfMetricsManager = videoPerfMetricsManager;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.playerLogger = playerLogger;
        this.featureService = featureService;
        this.playbackStateManager = VideoModuleExtKt.unsafeLazy(new PlaybackAnalyticsListener$playbackStateManager$2(this));
        this.widgetName = "";
        this.getIsPlayerAllowedToPlay = PlaybackAnalyticsListener$getIsPlayerAllowedToPlay$1.INSTANCE;
        this.getCurrentMediaUrl = PlaybackAnalyticsListener$getCurrentMediaUrl$1.INSTANCE;
    }

    private final PlaybackStateManager getPlaybackStateManager() {
        return (PlaybackStateManager) this.playbackStateManager.getValue();
    }

    private final void handleErrorEvent(ErrorEvent event) {
        getPlaybackStateManager().handleEvent(event);
    }

    private final void handlePlaybackEvent(PlaybackEvent event) {
        getPlaybackStateManager().handleEvent(event);
    }

    private final void handleVideoInfoUpdateEvent(VideoInfoUpdateEvent event) {
        getPlaybackStateManager().handleEvent(event);
    }

    @NotNull
    public final Function0<String> getGetCurrentMediaUrl() {
        return this.getCurrentMediaUrl;
    }

    @NotNull
    public final Function0<Boolean> getGetIsPlayerAllowedToPlay() {
        return this.getIsPlayerAllowedToPlay;
    }

    @Override // u3.InterfaceC9928b
    public void onAudioCodecError(@NotNull InterfaceC9928b.a eventTime, @NotNull Exception audioCodecError) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(audioCodecError, "audioCodecError");
        handleErrorEvent(new ErrorEvent.NonFatalErrorEvent("onAudioCodecError", audioCodecError.getMessage(), String.valueOf(audioCodecError.getCause())));
    }

    @Override // u3.InterfaceC9928b
    public void onAudioSinkError(@NotNull InterfaceC9928b.a eventTime, @NotNull Exception audioSinkError) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(audioSinkError, "audioSinkError");
        handleErrorEvent(new ErrorEvent.NonFatalErrorEvent("AudioSinkError", audioSinkError.getMessage(), String.valueOf(audioSinkError.getCause())));
    }

    public final void onCheckLoadErrorFlagChanged(boolean checkLoadError) {
        this.checkLoadError = checkLoadError;
    }

    public final void onDiscardHistoryStats() {
        deleteHistoryStats();
    }

    @Override // ru.ozon.app.android.video.player.fromexoplayer.OzPlaybackStatsListener, u3.InterfaceC9928b
    public void onDrmSessionManagerError(@NotNull InterfaceC9928b.a eventTime, @NotNull Exception error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onDrmSessionManagerError(eventTime, error);
        handleErrorEvent(new ErrorEvent.NonFatalErrorEvent("DrmSessionManagerError", error.getMessage(), String.valueOf(error.getCause())));
    }

    @NotNull
    public final Function0<String> onGetCurrentWidgetName() {
        return new PlaybackAnalyticsListener$onGetCurrentWidgetName$1(this);
    }

    @Override // u3.InterfaceC9928b
    public void onIsPlayingChanged(@NotNull InterfaceC9928b.a eventTime, boolean isPlaying) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        handlePlaybackEvent(isPlaying ? new PlaybackEvent.PlayingEvent.OnStartPlaying(eventTime) : new PlaybackEvent.PlayingEvent.OnStopPlaying(eventTime));
    }

    @Override // u3.InterfaceC9928b
    public void onLoadCanceled(@NotNull InterfaceC9928b.a eventTime, @NotNull C3013s loadEventInfo, @NotNull C3016v mediaLoadData) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        String uri = loadEventInfo.f8721a.f80066a.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        handlePlaybackEvent(new PlaybackEvent.LoadStatusEvent.OnLoadCanceled(uri, eventTime));
    }

    @Override // ru.ozon.app.android.video.player.fromexoplayer.OzPlaybackStatsListener, u3.InterfaceC9928b
    public void onLoadError(@NotNull InterfaceC9928b.a eventTime, @NotNull C3013s loadEventInfo, @NotNull C3016v mediaLoadData, @NotNull IOException error, boolean wasCanceled) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onLoadError(eventTime, loadEventInfo, mediaLoadData, error, wasCanceled);
        handleErrorEvent(new ErrorEvent.NonFatalErrorEvent("LoadError", error.getMessage(), String.valueOf(error.getCause())));
    }

    @Override // u3.InterfaceC9928b
    public void onLoadStarted(@NotNull InterfaceC9928b.a eventTime, @NotNull C3013s loadEventInfo, @NotNull C3016v mediaLoadData) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(loadEventInfo, "loadEventInfo");
        Intrinsics.checkNotNullParameter(mediaLoadData, "mediaLoadData");
        String uri = loadEventInfo.f8721a.f80066a.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        handlePlaybackEvent(new PlaybackEvent.LoadStatusEvent.OnLoadStarted(uri, eventTime));
    }

    @Override // u3.InterfaceC9928b
    public void onMediaItemTransition(@NotNull InterfaceC9928b.a eventTime, C7275q mediaItem, int reason) {
        C7275q.f fVar;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        String valueOf = String.valueOf((mediaItem == null || (fVar = mediaItem.f69184b) == null) ? null : fVar.f69240a);
        PlaybackEvent onPlaylistChanged = reason == 3 ? new PlaybackEvent.MediaItemTransitionEvent.OnPlaylistChanged(valueOf) : new PlaybackEvent.MediaItemTransitionEvent.Other(valueOf);
        onAllowToMergeHistoryChanged(Boolean.valueOf(reason == 0));
        handlePlaybackEvent(onPlaylistChanged);
    }

    @Override // u3.InterfaceC9928b
    public void onPlayWhenReadyChanged(@NotNull InterfaceC9928b.a eventTime, boolean playWhenReady, int reason) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        handlePlaybackEvent(playWhenReady ? new PlaybackEvent.ResumePauseEvent.OnResume(eventTime) : PlaybackEvent.ResumePauseEvent.OnPause.INSTANCE);
    }

    @Override // u3.InterfaceC9928b
    public void onPlaybackStateChanged(@NotNull InterfaceC9928b.a eventTime, int state) {
        PlaybackEvent idleState;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (state == 1) {
            idleState = new PlaybackEvent.OnStateChangedEvent.IdleState(eventTime);
        } else if (state == 2) {
            idleState = new PlaybackEvent.OnStateChangedEvent.BufferingState(eventTime);
        } else if (state == 3) {
            idleState = new PlaybackEvent.OnStateChangedEvent.ReadyState(eventTime);
        } else if (state != 4) {
            return;
        } else {
            idleState = new PlaybackEvent.OnStateChangedEvent.ReadyState(eventTime);
        }
        handlePlaybackEvent(idleState);
    }

    @Override // u3.InterfaceC9928b
    public void onPlayerError(@NotNull InterfaceC9928b.a eventTime, @NotNull w error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        handleErrorEvent(new ErrorEvent.FatalErrorEvent(error));
    }

    @Override // u3.InterfaceC9928b
    public void onPlayerReleased(@NotNull InterfaceC9928b.a eventTime) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        handlePlaybackEvent(PlaybackEvent.OnPlayerReleased.INSTANCE);
    }

    @Override // u3.InterfaceC9928b
    public void onVideoCodecError(@NotNull InterfaceC9928b.a eventTime, @NotNull Exception videoCodecError) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(videoCodecError, "videoCodecError");
        handleErrorEvent(new ErrorEvent.NonFatalErrorEvent("VideoCodecError", videoCodecError.getMessage(), String.valueOf(videoCodecError.getCause())));
    }

    public final void setGetCurrentMediaUrl(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getCurrentMediaUrl = function0;
    }

    public final void setGetIsPlayerAllowedToPlay(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getIsPlayerAllowedToPlay = function0;
    }

    public final void updateVideoIndex(int index) {
        handleVideoInfoUpdateEvent(new VideoInfoUpdateEvent.OnVideoIndexUpdate(index));
    }

    public final void updateWidgetName(@NotNull String widgetName) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        this.widgetName = widgetName;
    }
}
