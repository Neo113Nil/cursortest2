package ru.ozon.app.android.video.playerV2.playerController.base;

import Gg0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.VideoPlaceholderTimeTracker;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.playerV2.data.ViewTimeInfoCollector;
import ru.ozon.app.android.video.playerV2.performance.placeholder.VideoComposablePlaceholderTimeTracker;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsListener;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHub;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseControllersHubImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerListenersControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerSoundControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BaseVideoInfoControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.compose.BasePlayerComposableControllerImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.utils.VideoModuleExtKt;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b!\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010\u001aJ\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010 J\u000f\u0010+\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010&J\u000f\u0010,\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010#J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R \u00108\u001a\b\u0012\u0004\u0012\u0002070\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020;8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020-8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010/R\u001b\u0010J\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u0010\u001dR\u001b\u0010M\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bL\u0010\u0017R\u001b\u0010P\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\bO\u0010\u001aR\u001b\u0010S\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bR\u0010 R\u001b\u0010V\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00103\u001a\u0004\bU\u0010&R\u001b\u0010Y\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00103\u001a\u0004\bX\u0010#R\u001b\u0010^\u001a\u0002078DX\u0084\u0084\u0002¢\u0006\f\u001a\u0004\bZ\u0010[*\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerControllerImpl;", "Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerController;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "audioRequestService", "LSc/j;", "Lru/ozon/app/android/video/playerV2/performance/playback/PlaybackAnalyticsListener;", "playbackAnalyticsListenerDelegate", "Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "viewTimeInfoCollectorDelegate", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "videoWidgetNamesHolder", "LGg0/f;", "placeholderTimeHandler", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "playerConfigAlias", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;LSc/j;LSc/j;Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;LGg0/f;Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;)V", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewController;", "playerViewController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/BasePlayerViewController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;", "playerComposableController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/basePlayerViewController/compose/BasePlayerComposableController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersController;", "listenersController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerListenersController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "positionController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerPositionController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoController;", "videoInfoController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseVideoInfoController;", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundController;", "soundController", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BasePlayerSoundController;", "createPlayerListenersController", "createPlayerViewController", "createBasePlayerComposableController", "createPlayerPositionController", "createPlayerSoundController", "createVideoInfoController", "Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "createControllersHub", "()Lru/ozon/app/android/video/playerV2/playerController/base/nestedControllers/BaseControllersHub;", "Landroid/content/Context;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/video/player/audioRequestService/AudioRequestService;", "LSc/j;", "Lru/ozon/app/android/video/player/performance/VideoWidgetNamesHolder;", "LGg0/f;", "Lru/ozon/app/android/video/playerV2/playerController/base/playerConfig/PlayerConfigAlias;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayerCreationDelegate", "getExoPlayerCreationDelegate", "()LSc/j;", "Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "placeholderTimeTracker$delegate", "getPlaceholderTimeTracker", "()Lru/ozon/app/android/video/player/VideoPlaceholderTimeTracker;", "placeholderTimeTracker", "Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composablePlaceholderTimeTracker$delegate", "getComposablePlaceholderTimeTracker", "()Lru/ozon/app/android/video/playerV2/performance/placeholder/VideoComposablePlaceholderTimeTracker;", "composablePlaceholderTimeTracker", "baseControllersHub$delegate", "getBaseControllersHub", "baseControllersHub", "basePlayerListenersController$delegate", "getBasePlayerListenersController", "basePlayerListenersController", "basePlayerViewController$delegate", "getBasePlayerViewController", "basePlayerViewController", "basePlayerComposableController$delegate", "getBasePlayerComposableController", "basePlayerComposableController", "basePlayerPositionController$delegate", "getBasePlayerPositionController", "basePlayerPositionController", "basePlayerSoundController$delegate", "getBasePlayerSoundController", "basePlayerSoundController", "baseVideoInfoController$delegate", "getBaseVideoInfoController", "baseVideoInfoController", "getExoPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "getExoPlayer$delegate", "(Lru/ozon/app/android/video/playerV2/playerController/base/BasePlayerControllerImpl;)Ljava/lang/Object;", "exoPlayer", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BasePlayerControllerImpl implements BasePlayerController {

    @NotNull
    private final AudioRequestService audioRequestService;

    /* renamed from: baseControllersHub$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j baseControllersHub;

    /* renamed from: basePlayerComposableController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j basePlayerComposableController;

    /* renamed from: basePlayerListenersController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j basePlayerListenersController;

    /* renamed from: basePlayerPositionController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j basePlayerPositionController;

    /* renamed from: basePlayerSoundController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j basePlayerSoundController;

    /* renamed from: basePlayerViewController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j basePlayerViewController;

    /* renamed from: baseVideoInfoController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j baseVideoInfoController;

    /* renamed from: composablePlaceholderTimeTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composablePlaceholderTimeTracker;

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC4008j<ExoPlayer> exoPlayerCreationDelegate;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final f placeholderTimeHandler;

    /* renamed from: placeholderTimeTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderTimeTracker;

    @NotNull
    private final InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate;

    @NotNull
    private final PlayerConfigAlias playerConfigAlias;

    @NotNull
    private final VideoWidgetNamesHolder videoWidgetNamesHolder;

    @NotNull
    private final InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate;

    public BasePlayerControllerImpl(@NotNull Context context, @NotNull FeatureService featureService, @NotNull AudioRequestService audioRequestService, @NotNull InterfaceC4008j<PlaybackAnalyticsListener> playbackAnalyticsListenerDelegate, @NotNull InterfaceC4008j<ViewTimeInfoCollector> viewTimeInfoCollectorDelegate, @NotNull VideoWidgetNamesHolder videoWidgetNamesHolder, @NotNull f placeholderTimeHandler, @NotNull PlayerConfigAlias playerConfigAlias) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(audioRequestService, "audioRequestService");
        Intrinsics.checkNotNullParameter(playbackAnalyticsListenerDelegate, "playbackAnalyticsListenerDelegate");
        Intrinsics.checkNotNullParameter(viewTimeInfoCollectorDelegate, "viewTimeInfoCollectorDelegate");
        Intrinsics.checkNotNullParameter(videoWidgetNamesHolder, "videoWidgetNamesHolder");
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(playerConfigAlias, "playerConfigAlias");
        this.context = context;
        this.featureService = featureService;
        this.audioRequestService = audioRequestService;
        this.playbackAnalyticsListenerDelegate = playbackAnalyticsListenerDelegate;
        this.viewTimeInfoCollectorDelegate = viewTimeInfoCollectorDelegate;
        this.videoWidgetNamesHolder = videoWidgetNamesHolder;
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.playerConfigAlias = playerConfigAlias;
        this.exoPlayerCreationDelegate = k.b(new BasePlayerControllerImpl$exoPlayerCreationDelegate$1(this));
        this.placeholderTimeTracker = k.b(new BasePlayerControllerImpl$placeholderTimeTracker$2(this));
        this.composablePlaceholderTimeTracker = k.b(new BasePlayerControllerImpl$composablePlaceholderTimeTracker$2(this));
        this.baseControllersHub = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$baseControllersHub$2(this));
        this.basePlayerListenersController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$basePlayerListenersController$2(this));
        this.basePlayerViewController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$basePlayerViewController$2(this));
        this.basePlayerComposableController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$basePlayerComposableController$2(this));
        this.basePlayerPositionController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$basePlayerPositionController$2(this));
        this.basePlayerSoundController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$basePlayerSoundController$2(this));
        this.baseVideoInfoController = VideoModuleExtKt.unsafeLazy(new BasePlayerControllerImpl$baseVideoInfoController$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerComposableController createBasePlayerComposableController() {
        return new BasePlayerComposableControllerImpl(getExoPlayer(), this.playbackAnalyticsListenerDelegate, getComposablePlaceholderTimeTracker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseControllersHub createControllersHub() {
        return new BaseControllersHubImpl(new BasePlayerControllerImpl$createControllersHub$1(this), new BasePlayerControllerImpl$createControllersHub$2(this), new BasePlayerControllerImpl$createControllersHub$3(this), new BasePlayerControllerImpl$createControllersHub$4(this), new BasePlayerControllerImpl$createControllersHub$5(this), new BasePlayerControllerImpl$createControllersHub$6(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerListenersController createPlayerListenersController() {
        return new BasePlayerListenersControllerImpl(getExoPlayer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerPositionController createPlayerPositionController() {
        return new BasePlayerPositionControllerImpl(getExoPlayer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerSoundController createPlayerSoundController() {
        return new BasePlayerSoundControllerImpl(getExoPlayer(), getBaseControllersHub());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerViewController createPlayerViewController() {
        return new BasePlayerViewControllerImpl(getExoPlayer(), this.playbackAnalyticsListenerDelegate, getPlaceholderTimeTracker(), this.videoWidgetNamesHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseVideoInfoController createVideoInfoController() {
        return new BaseVideoInfoControllerImpl(getExoPlayer(), this.playbackAnalyticsListenerDelegate, this.viewTimeInfoCollectorDelegate);
    }

    private final BasePlayerComposableController getBasePlayerComposableController() {
        return (BasePlayerComposableController) this.basePlayerComposableController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerListenersController getBasePlayerListenersController() {
        return (BasePlayerListenersController) this.basePlayerListenersController.getValue();
    }

    private final BasePlayerPositionController getBasePlayerPositionController() {
        return (BasePlayerPositionController) this.basePlayerPositionController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BasePlayerSoundController getBasePlayerSoundController() {
        return (BasePlayerSoundController) this.basePlayerSoundController.getValue();
    }

    private final BasePlayerViewController getBasePlayerViewController() {
        return (BasePlayerViewController) this.basePlayerViewController.getValue();
    }

    private final BaseVideoInfoController getBaseVideoInfoController() {
        return (BaseVideoInfoController) this.baseVideoInfoController.getValue();
    }

    @NotNull
    protected final BaseControllersHub getBaseControllersHub() {
        return (BaseControllersHub) this.baseControllersHub.getValue();
    }

    @NotNull
    protected final VideoComposablePlaceholderTimeTracker getComposablePlaceholderTimeTracker() {
        return (VideoComposablePlaceholderTimeTracker) this.composablePlaceholderTimeTracker.getValue();
    }

    @NotNull
    protected final ExoPlayer getExoPlayer() {
        return this.exoPlayerCreationDelegate.getValue();
    }

    @NotNull
    protected final VideoPlaceholderTimeTracker getPlaceholderTimeTracker() {
        return (VideoPlaceholderTimeTracker) this.placeholderTimeTracker.getValue();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BasePlayerListenersController listenersController() {
        return getBasePlayerListenersController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BasePlayerComposableController playerComposableController() {
        return getBasePlayerComposableController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BasePlayerViewController playerViewController() {
        return getBasePlayerViewController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BasePlayerPositionController positionController() {
        return getBasePlayerPositionController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BasePlayerSoundController soundController() {
        return getBasePlayerSoundController();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.BasePlayerController
    @NotNull
    public BaseVideoInfoController videoInfoController() {
        return getBaseVideoInfoController();
    }
}
