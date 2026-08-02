package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseBannerBinding;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseVideoBannerHolder$widgetObserver$2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.nestedControllers.SingleInstanceMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\t*\u00014\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseVideoBannerHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseImageBannerHolder;", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;", "binding", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lkotlin/Function1;", "", "Lru/ozon/app/android/video/manager/ExoManager;", "exoManagerProvider", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "", "setWiseSkuScrollObserver", "Lkotlin/Function0;", "", "getPlayerPosition", "savePlayerPosition", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "resumePlayer", "()V", "pausePlayer", "releasePlayer", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;Ll20/d;)V", "onViewInVisibleBounds", "onViewInOverlapBounds", "onViewOutOfVisibleBounds", "onDetach", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "_player", "Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener$delegate", "LSc/j;", "getPlayerListener", "()Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseVideoBannerHolder$widgetObserver$2$1", "widgetObserver$delegate", "getWidgetObserver", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseVideoBannerHolder$widgetObserver$2$1;", "widgetObserver", "getPlayer", "()Lru/ozon/app/android/video/playerV2/playerController/singleInstance/SingleInstancePlayerController;", "player", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseVideoBannerHolder extends WiseImageBannerHolder {
    private SingleInstancePlayerController _player;

    @NotNull
    private final ItemWiseBannerBinding binding;

    @NotNull
    private final Function1<Boolean, ExoManager> exoManagerProvider;

    @NotNull
    private final Function0<Long> getPlayerPosition;

    /* renamed from: playerListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playerListener;

    @NotNull
    private final Function1<Long, Unit> savePlayerPosition;

    @NotNull
    private final Function1<WiseSkuScrollLifecycle, Unit> setWiseSkuScrollObserver;

    @NotNull
    private final VideoController videoController;

    /* renamed from: widgetObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WiseVideoBannerHolder(@NotNull ItemWiseBannerBinding binding, @NotNull VideoController videoController, @NotNull Function1<? super Boolean, ? extends ExoManager> exoManagerProvider, @NotNull Function1<? super WiseSkuScrollLifecycle, Unit> setWiseSkuScrollObserver, @NotNull Function0<Long> getPlayerPosition, @NotNull Function1<? super Long, Unit> savePlayerPosition, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding, tokenizedAnalytics, actionHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(exoManagerProvider, "exoManagerProvider");
        Intrinsics.checkNotNullParameter(setWiseSkuScrollObserver, "setWiseSkuScrollObserver");
        Intrinsics.checkNotNullParameter(getPlayerPosition, "getPlayerPosition");
        Intrinsics.checkNotNullParameter(savePlayerPosition, "savePlayerPosition");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.videoController = videoController;
        this.exoManagerProvider = exoManagerProvider;
        this.setWiseSkuScrollObserver = setWiseSkuScrollObserver;
        this.getPlayerPosition = getPlayerPosition;
        this.savePlayerPosition = savePlayerPosition;
        this.playerListener = k.b(new WiseVideoBannerHolder$playerListener$2(this));
        this.widgetObserver = k.b(new WiseVideoBannerHolder$widgetObserver$2(this));
        binding.videoView.setContentDescription("type_video");
    }

    private final SingleInstancePlayerController getPlayer() {
        SingleInstancePlayerController singleInstancePlayerController = this._player;
        if (singleInstancePlayerController != null) {
            return singleInstancePlayerController;
        }
        SingleInstancePlayerController singleInstancePlayerController$default = VideoController.DefaultImpls.getSingleInstancePlayerController$default(this.videoController, null, 1, null);
        this._player = singleInstancePlayerController$default;
        return singleInstancePlayerController$default;
    }

    private final PlayerListenersContainer getPlayerListener() {
        return (PlayerListenersContainer) this.playerListener.getValue();
    }

    private final WiseVideoBannerHolder$widgetObserver$2.AnonymousClass1 getWidgetObserver() {
        return (WiseVideoBannerHolder$widgetObserver$2.AnonymousClass1) this.widgetObserver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayer() {
        SingleInstanceMediaPlayController mediaPlayController;
        SingleInstancePlayerController singleInstancePlayerController = this._player;
        if (singleInstancePlayerController == null || (mediaPlayController = singleInstancePlayerController.mediaPlayController()) == null) {
            return;
        }
        mediaPlayController.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releasePlayer() {
        SingleInstancePlayerController singleInstancePlayerController = this._player;
        if (singleInstancePlayerController != null) {
            singleInstancePlayerController.mediaPlayController().pause();
            ImageView backgroundImageView = this.binding.backgroundImageView;
            Intrinsics.checkNotNullExpressionValue(backgroundImageView, "backgroundImageView");
            ViewExtKt.show(backgroundImageView);
            BasePlayerViewController playerViewController = singleInstancePlayerController.playerViewController();
            PlayerView videoView = this.binding.videoView;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            playerViewController.unbindPlayerView(videoView);
            singleInstancePlayerController.listenersController().removePlayerListener(getPlayerListener());
            this.savePlayerPosition.invoke(Long.valueOf(singleInstancePlayerController.positionController().getCurrentPosition()));
            singleInstancePlayerController.mediaPlayController().release(new WiseVideoBannerHolder$releasePlayer$1$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumePlayer() {
        WiseBannerVO item;
        String videoUrl;
        WiseBannerVO item2;
        SingleInstancePlayerController player = getPlayer();
        if (player.mediaPlayController().isPlaying()) {
            return;
        }
        if (player.mediaPlayController().isReadyToPlayAndPaused()) {
            player.mediaPlayController().resume();
            ImageView backgroundImageView = this.binding.backgroundImageView;
            Intrinsics.checkNotNullExpressionValue(backgroundImageView, "backgroundImageView");
            ViewExtKt.hide(backgroundImageView);
            return;
        }
        if (player.mediaPlayController().isPlayerActive() || (item = getItem()) == null || (videoUrl = item.getVideoUrl()) == null || (item2 = getItem()) == null) {
            return;
        }
        boolean isLiveVideo = item2.getIsLiveVideo();
        BasePlayerViewController playerViewController = player.playerViewController();
        PlayerView videoView = this.binding.videoView;
        Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
        BasePlayerViewController.DefaultImpls.bindPlayerView$default(playerViewController, videoView, null, 2, null);
        player.mediaPlayController().prepareMediaToPlay(videoUrl, this.exoManagerProvider.invoke(Boolean.valueOf(isLiveVideo)), false, true, true, getPlayerListener(), null, Long.valueOf(this.getPlayerPosition.invoke().longValue()));
    }

    @Override // jk0.j
    public void onDetach() {
        releasePlayer();
        super.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onViewInOverlapBounds() {
        resumePlayer();
        super.onViewInOverlapBounds();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseImageBannerHolder, ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        resumePlayer();
        super.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        pausePlayer();
        super.onViewOutOfVisibleBounds();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseImageBannerHolder, ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder
    public void bind(@NotNull WiseBannerVO item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.setWiseSkuScrollObserver.invoke(getWidgetObserver());
        super.bind(item, widgetInfo);
    }
}
