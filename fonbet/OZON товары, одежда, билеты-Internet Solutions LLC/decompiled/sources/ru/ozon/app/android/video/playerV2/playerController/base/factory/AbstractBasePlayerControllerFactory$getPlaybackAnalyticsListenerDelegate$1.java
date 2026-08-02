package ru.ozon.app.android.video.playerV2.playerController.base.factory;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsSender;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AbstractBasePlayerControllerFactory$getPlaybackAnalyticsListenerDelegate$1 extends AbstractC7737t implements Function0<PlaybackAnalyticsListener> {
    final /* synthetic */ AbstractBasePlayerControllerFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractBasePlayerControllerFactory$getPlaybackAnalyticsListenerDelegate$1(AbstractBasePlayerControllerFactory abstractBasePlayerControllerFactory) {
        super(0);
        this.this$0 = abstractBasePlayerControllerFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PlaybackAnalyticsListener invoke() {
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
        return new PlaybackAnalyticsListener(aVar, playbackAnalyticsSender, videoPerfMetricsManager, videoPerfMetricsManagerHelper, playerLogger, featureService);
    }
}
