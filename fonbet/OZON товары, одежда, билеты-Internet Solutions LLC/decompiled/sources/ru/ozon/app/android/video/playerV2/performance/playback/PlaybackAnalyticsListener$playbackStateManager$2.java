package ru.ozon.app.android.video.playerV2.performance.playback;

import Sg.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.fromexoplayer.OzPlaybackStats;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.playerV2.performance.playback.playbackData.PlaybackStatsData;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackStateManager;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaybackAnalyticsListener$playbackStateManager$2 extends AbstractC7737t implements Function0<PlaybackStateManager> {
    final /* synthetic */ PlaybackAnalyticsListener this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener$playbackStateManager$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ PlaybackAnalyticsListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PlaybackAnalyticsListener playbackAnalyticsListener) {
            super(0);
            this.this$0 = playbackAnalyticsListener;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z11;
            z11 = this.this$0.checkLoadError;
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener$playbackStateManager$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ PlaybackAnalyticsListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PlaybackAnalyticsListener playbackAnalyticsListener) {
            super(0);
            this.this$0 = playbackAnalyticsListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.reset();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/performance/playback/playbackData/PlaybackStatsData;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener$playbackStateManager$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<PlaybackStatsData> {
        final /* synthetic */ PlaybackAnalyticsListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PlaybackAnalyticsListener playbackAnalyticsListener) {
            super(0);
            this.this$0 = playbackAnalyticsListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PlaybackStatsData invoke() {
            OzPlaybackStats combinedOzPlaybackStats = this.this$0.getCombinedOzPlaybackStats();
            if (combinedOzPlaybackStats == null) {
                return null;
            }
            return new PlaybackStatsData(combinedOzPlaybackStats.getTotalPlayTimeMs(), combinedOzPlaybackStats.nonFatalErrorCount, combinedOzPlaybackStats.getTotalRebufferTimeMs() > 0 ? combinedOzPlaybackStats.totalRebufferCount : 0, combinedOzPlaybackStats.getTotalRebufferTimeMs());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaybackAnalyticsListener$playbackStateManager$2(PlaybackAnalyticsListener playbackAnalyticsListener) {
        super(0);
        this.this$0 = playbackAnalyticsListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PlaybackStateManager invoke() {
        a aVar;
        PlaybackAnalyticsSender playbackAnalyticsSender;
        VideoPerfMetricsManager videoPerfMetricsManager;
        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;
        PlayerLogger playerLogger;
        FeatureService featureService;
        aVar = this.this$0.analyticsScreenStorage;
        playbackAnalyticsSender = this.this$0.playbackAnalyticsSender;
        videoPerfMetricsManager = this.this$0.videoPerfMetricsManager;
        videoPerfMetricsManagerHelper = this.this$0.videoPerfMetricsManagerHelper;
        playerLogger = this.this$0.playerLogger;
        featureService = this.this$0.featureService;
        return new PlaybackStateManager(playbackAnalyticsSender, videoPerfMetricsManager, aVar, videoPerfMetricsManagerHelper, playerLogger, featureService, this.this$0.getGetIsPlayerAllowedToPlay(), new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), this.this$0.getGetCurrentMediaUrl(), this.this$0.onGetCurrentWidgetName(), new AnonymousClass3(this.this$0));
    }
}
