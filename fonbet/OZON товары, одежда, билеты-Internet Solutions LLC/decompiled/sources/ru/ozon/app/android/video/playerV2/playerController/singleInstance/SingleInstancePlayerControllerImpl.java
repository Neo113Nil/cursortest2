package ru.ozon.app.android.video.playerV2.playerController.singleInstance;

import Gg0.f;
import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayControllerImpl;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001b\u0010+\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "videoDomainReplacementService", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "videoWidgetNamesHolder", "LGg0/f;", "placeholderTimeHandler", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "videoPreferences", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "videoPerfMetricsManagerHelper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;LSc/j;LSc/j;Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;LGg0/f;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;)V", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/nestedControllers/SingleInstanceMediaPlayController;", "createMediaPlayController", "()Lru/ozon/app/android/video/playerV2/playerController/singleInstance/nestedControllers/SingleInstanceMediaPlayController;", "mediaPlayController", "Lru/ozon/app/android/video/domainreplacement/domain/VideoDomainReplacementService;", "LSc/j;", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "LGg0/f;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "Lru/ozon/app/android/video/player/playerpreferences/PlayerPreferences;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricsManagerHelper;", "singleInstanceMediaPlayController$delegate", "getSingleInstanceMediaPlayController", "singleInstanceMediaPlayController", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleInstancePlayerControllerImpl extends BasePlayerControllerImpl implements SingleInstancePlayerController {

    @NotNull
    private final AudioRequestService audioRequestService;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final f placeholderTimeHandler;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    @NotNull
    private final PlayerConfigAlias playerConfigAlias;

    /* renamed from: singleInstanceMediaPlayController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j singleInstanceMediaPlayController;

    @NotNull
    private final VideoDomainReplacementService videoDomainReplacementService;

    @NotNull
    private final VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;

    @NotNull
    private final PlayerPreferences videoPreferences;

    @NotNull
    private final VideoWidgetNamesHolder videoWidgetNamesHolder;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstancePlayerControllerImpl(@NotNull Context context, @NotNull VideoDomainReplacementService videoDomainReplacementService, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate, @NotNull VideoWidgetNamesHolder videoWidgetNamesHolder, @NotNull f placeholderTimeHandler, @NotNull AudioRequestService audioRequestService, @NotNull PlayerPreferences videoPreferences, @NotNull FeatureService featureService, @NotNull PlayerConfigAlias playerConfigAlias, @NotNull VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper) {
        super(context, featureService, audioRequestService, playbackAnalyticsListenerDelegate, viewTimeInfoCollectorDelegate, videoWidgetNamesHolder, placeholderTimeHandler, playerConfigAlias);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoDomainReplacementService, "videoDomainReplacementService");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        Intrinsics.checkNotNullParameter(videoWidgetNamesHolder, "videoWidgetNamesHolder");
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(videoPreferences, "videoPreferences");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        Intrinsics.checkNotNullParameter(videoPerfMetricsManagerHelper, "videoPerfMetricsManagerHelper");
        this.videoDomainReplacementService = videoDomainReplacementService;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
        this.videoWidgetNamesHolder = videoWidgetNamesHolder;
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.audioRequestService = audioRequestService;
        this.videoPreferences = videoPreferences;
        this.featureService = featureService;
        this.playerConfigAlias = playerConfigAlias;
        this.videoPerfMetricsManagerHelper = videoPerfMetricsManagerHelper;
        this.singleInstanceMediaPlayController = VideoModuleExtKt.unsafeLazy(new SingleInstancePlayerControllerImpl$singleInstanceMediaPlayController$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SingleInstanceMediaPlayController createMediaPlayController() {
        return new SingleInstanceMediaPlayControllerImpl(getExoPlayer(), getBaseControllersHub(), this.videoDomainReplacementService, this.viewTimeInfoCollectorDelegate, this.audioRequestService, getPlaceholderTimeTracker(), getComposablePlaceholderTimeTracker(), this.videoPreferences, this.featureService, this.videoPerfMetricsManagerHelper, this.playbackAnalyticsListenerDelegate.getValue().onGetCurrentWidgetName());
    }

    private final SingleInstanceMediaPlayController getSingleInstanceMediaPlayController() {
        return (SingleInstanceMediaPlayController) this.singleInstanceMediaPlayController.getValue();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public SingleInstanceMediaPlayController mediaPlayController() {
        return getSingleInstanceMediaPlayController();
    }
}
