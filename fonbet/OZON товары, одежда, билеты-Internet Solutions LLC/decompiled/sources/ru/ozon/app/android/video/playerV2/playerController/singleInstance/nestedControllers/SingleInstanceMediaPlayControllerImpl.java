package ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers;

import Sc.InterfaceC4008j;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoKt;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayControllerImpl;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJS\u0010+\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u0018H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/singleInstance/nestedControllers/SingleInstanceMediaPlayControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseMediaPlayControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/nestedControllers/SingleInstanceMediaPlayController;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "baseControllersHub", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "LSc/j;", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "placeholderTimeTracker", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composablePlaceholderTimeTracker", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "Lkotlin/Function0;", "", "onGetCurrentWidgetName", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;LSc/j;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;Lkotlin/jvm/functions/Function0;)V", "videoUrl", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManager", "", "playWhenReady", "repeat", "mute", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lu3/b;", "analyticsListener", "", "position", "", "prepareMediaToPlay", "(Ljava/lang/String;Lru/ozon/app/android/video/manager/ExoManager;ZZZLru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;Lu3/b;Ljava/lang/Long;)V", "releasePlayerLinksCallback", "release", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "LSc/j;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleInstanceMediaPlayControllerImpl extends BaseMediaPlayControllerImpl implements SingleInstanceMediaPlayController {

    @NotNull
    private final BaseControllersHub baseControllersHub;

    @NotNull
    private final ExoPlayer exoPlayer;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceMediaPlayControllerImpl(@NotNull ExoPlayer exoPlayer, @NotNull BaseControllersHub baseControllersHub, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate, @NotNull AudioRequestService audioRequestService, @NotNull VideoPlaceholderTimeTracker placeholderTimeTracker, @NotNull VideoComposablePlaceholderTimeTracker composablePlaceholderTimeTracker, @NotNull PlayerPreferences videoPreferences, @NotNull FeatureService featureService, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper, @NotNull Function0<String> onGetCurrentWidgetName) {
        super(exoPlayer, baseControllersHub, audioRequestService, placeholderTimeTracker, composablePlaceholderTimeTracker, videoPreferences, featureService, videoPerfMetricsManagerHelper, viewTimeInfoCollectorDelegate, onGetCurrentWidgetName);
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(baseControllersHub, "baseControllersHub");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(placeholderTimeTracker, "placeholderTimeTracker");
        Intrinsics.checkNotNullParameter(composablePlaceholderTimeTracker, "composablePlaceholderTimeTracker");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        Intrinsics.checkNotNullParameter(onGetCurrentWidgetName, "onGetCurrentWidgetName");
        this.exoPlayer = exoPlayer;
        this.baseControllersHub = baseControllersHub;
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayControllerImpl, ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseMediaPlayController
    public void prepareMediaToPlay(@NotNull String videoUrl, @NotNull ExoManager exoManager, boolean playWhenReady, boolean repeat, boolean mute, @NotNull PlayerListenersContainer listener, InterfaceC9928b analyticsListener, Long position) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(exoManager, "exoManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.prepareMediaToPlay(this.videoDomainReplacementService.getUrlWithActualDomain(videoUrl), exoManager, playWhenReady, repeat, mute, listener, analyticsListener, position);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController
    public void release(@NotNull Function0<Unit> releasePlayerLinksCallback) {
        Intrinsics.checkNotNullParameter(releasePlayerLinksCallback, "releasePlayerLinksCallback");
        releasePlayerLinksCallback.invoke();
        ViewTimeInfoKt.resetIfInitialized(this.viewTimeInfoCollectorDelegate);
        releaseInternal();
    }
}
