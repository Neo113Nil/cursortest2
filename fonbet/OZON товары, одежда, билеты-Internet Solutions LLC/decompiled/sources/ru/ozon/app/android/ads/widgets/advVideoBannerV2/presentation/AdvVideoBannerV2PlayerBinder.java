package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Hl.C3165a;
import Hl.C3166b;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.AdvVideoBannerV2PackshotProductBinderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.AdvVideoBannerV2PreviewBinderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view.AdvVideoBannerV2ViewNew;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.BasePlayerPositionController;
import ru.ozon.app.android.video.playerV2.playerController.base.nestedControllers.basePlayerViewController.BasePlayerViewController;
import ru.ozon.app.android.video.playerV2.playerController.base.playerConfig.PlayerConfigAlias;
import ru.ozon.app.android.video.playerV2.playerController.pool.PoolPlayerController;
import ru.ozon.app.android.video.playerV2.playerController.pool.nestedControllers.PoolMediaPlayController;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config.PoolStorageConfig;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.R$drawable;
import u3.InterfaceC9928b;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u0018J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010\"J\u0017\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b.\u0010\u0018J\u001f\u00100\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u0010\"J\u000f\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010\u0018J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020\u001fH\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2PlayerBinder;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "widgetViewHolder", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "viewModel", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "productBinder", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;", "packshotBinder", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;Lru/ozon/uni/android/component/layout/AsyncFrameLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;)V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;", "state", "", "renderPlayerState", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$State;)V", "unbindPlayer", "()V", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;", "productState", "renderProductState", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew$ProductState;)V", "", "isVisible", "changeProductVisibility", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;Z)V", "setPreviewVisibleState", "setEmptyState", "video", "volumeOn", "playVideo", "Lru/ozon/app/android/video/manager/ExoManager;", "getExoManager", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)Lru/ozon/app/android/video/manager/ExoManager;", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "getOrCreatePlayerController", "()Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "resumePlayerIfNeeded", "wasFinished", "pausePlayer", "stopPlayer", "showPreview", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "setVolumeIcon", "(Z)Lkotlin/Unit;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2NewBinding;", "binding", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2NewBinding;", "playerController", "Lru/ozon/app/android/video/playerV2/playerController/pool/PoolPlayerController;", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "playerListener", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "", "getVoId", "()Ljava/lang/Long;", "voId", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2PlayerBinder {
    private static final int PREVIEW_IMAGE_CORNER_RADIUS = UiExtKt.toPx(16);
    private WidgetAdvVideoBannerV2NewBinding binding;

    @NotNull
    private final AsyncFrameLayout container;

    @NotNull
    private final AdvVideoBannerV2PackshotProductBinderNew packshotBinder;
    private PoolPlayerController playerController;

    @NotNull
    private final PlayerListenersContainer playerListener;

    @NotNull
    private final AdvVideoBannerV2PreviewBinderNew productBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final VideoController videoController;

    @NotNull
    private final AdvVideoBannerV2ViewModelNew viewModel;

    @NotNull
    private final AdvVideoBannerV2ViewHolderNew widgetViewHolder;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "inflatedView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
            invoke2(asyncFrameLayout, view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AsyncFrameLayout invokeWhenInflated, View inflatedView) {
            Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
            Intrinsics.checkNotNullParameter(inflatedView, "inflatedView");
            AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder = AdvVideoBannerV2PlayerBinder.this;
            WidgetAdvVideoBannerV2NewBinding bind = WidgetAdvVideoBannerV2NewBinding.bind(inflatedView);
            bind.advVideoBannerContainerNew.getPreviewImageView().setClipToOutline(true);
            advVideoBannerV2PlayerBinder.binding = bind;
        }
    }

    public AdvVideoBannerV2PlayerBinder(@NotNull AdvVideoBannerV2ViewHolderNew widgetViewHolder, @NotNull AsyncFrameLayout container, @NotNull ComposerReferences refs, @NotNull AdvVideoBannerV2ViewModelNew viewModel, @NotNull VideoController videoController, @NotNull AdvVideoBannerV2PreviewBinderNew productBinder, @NotNull AdvVideoBannerV2PackshotProductBinderNew packshotBinder) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(productBinder, "productBinder");
        Intrinsics.checkNotNullParameter(packshotBinder, "packshotBinder");
        this.widgetViewHolder = widgetViewHolder;
        this.container = container;
        this.refs = refs;
        this.viewModel = viewModel;
        this.videoController = videoController;
        this.productBinder = productBinder;
        this.packshotBinder = packshotBinder;
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        builder.onFinish(new C3165a(this));
        builder.onError(new C3166b(this));
        builder.onReady(new Kr.b(this, 3));
        this.playerListener = builder.build();
        container.invokeWhenInflated(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeProductVisibility(AdvBannerVideoV2VO item, boolean isVisible) {
        this.productBinder.changeVisibility(isVisible, new AdvVideoBannerV2PlayerBinder$changeProductVisibility$1(item, this));
    }

    private final ExoManager getExoManager(AdvBannerVideoV2VO video) {
        return video.getVideoCoverDisabled() ? this.videoController.getProgressiveWithCacheExoManager() : this.videoController.getProgressiveExoManager();
    }

    private final PoolPlayerController getOrCreatePlayerController() {
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController != null) {
            return poolPlayerController;
        }
        PoolPlayerController poolPlayerController2 = this.videoController.getPlayerPoolManager().getPoolPlayerController(PlayerConfigAlias.Default.INSTANCE, null, PoolStorageConfig.DEFAULT);
        this.playerController = poolPlayerController2;
        return poolPlayerController2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getVoId() {
        AdvBannerVideoV2VO boundData = this.widgetViewHolder.getBoundData();
        if (boundData != null) {
            return Long.valueOf(boundData.getId());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pausePlayer(AdvBannerVideoV2VO video, boolean wasFinished) {
        PoolPlayerController poolPlayerController;
        PoolMediaPlayController mediaPlayController;
        PoolPlayerController poolPlayerController2 = this.playerController;
        if ((poolPlayerController2 == null || (mediaPlayController = poolPlayerController2.mediaPlayController()) == null || !mediaPlayController.isReadyToPlayAndPaused()) && (poolPlayerController = this.playerController) != null) {
            poolPlayerController.mediaPlayController().pause();
            if (wasFinished) {
                return;
            }
            video.setPosition(poolPlayerController.positionController().getCurrentPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playVideo(AdvBannerVideoV2VO video, boolean volumeOn) {
        PoolPlayerController orCreatePlayerController;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        PlayerView playerView;
        PoolMediaPlayController mediaPlayController;
        PoolPlayerController poolPlayerController = this.playerController;
        if ((poolPlayerController == null || (mediaPlayController = poolPlayerController.mediaPlayController()) == null || !mediaPlayController.isPlaying()) && (orCreatePlayerController = getOrCreatePlayerController()) != null) {
            WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
            if (widgetAdvVideoBannerV2NewBinding != null && (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) != null && (playerView = advVideoBannerV2ViewNew.getPlayerView()) != null) {
                BasePlayerViewController.DefaultImpls.bindPlayerView$default(orCreatePlayerController.playerViewController(), playerView, null, 2, null);
            }
            orCreatePlayerController.mediaPlayController().prepareMediaToPlay(video.getPlaylistUrl(), getExoManager(video), false, false, !volumeOn, this.playerListener, this.viewModel.getAnalyticsListenerById(video.getId()), Long.valueOf(video.getPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$5$lambda$0(AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder) {
        BasePlayerPositionController positionController;
        AdvBannerVideoV2VO boundData = advVideoBannerV2PlayerBinder.widgetViewHolder.getBoundData();
        if (boundData == null) {
            return;
        }
        PoolPlayerController poolPlayerController = advVideoBannerV2PlayerBinder.playerController;
        boundData.setPosition((poolPlayerController == null || (positionController = poolPlayerController.positionController()) == null) ? 0L : positionController.getCurrentPosition());
        advVideoBannerV2PlayerBinder.viewModel.setFinishedState(boundData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$5$lambda$2(AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder, String str, Exception exc, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Long voId = advVideoBannerV2PlayerBinder.getVoId();
        if (voId != null) {
            long longValue = voId.longValue();
            advVideoBannerV2PlayerBinder.viewModel.clearStateOnError(longValue);
            advVideoBannerV2PlayerBinder.refs.getController().m(longValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playerListener$lambda$5$lambda$4(AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder, PlayerState playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        advVideoBannerV2PlayerBinder.resumePlayerIfNeeded();
        Long voId = advVideoBannerV2PlayerBinder.getVoId();
        if (voId != null) {
            advVideoBannerV2PlayerBinder.viewModel.setVideoDuration(voId.longValue(), playerState.getDuration());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProductState(AdvBannerVideoV2VO item, AdvVideoBannerV2ViewModelNew.ProductState productState) {
        this.container.invokeWhenInflated(new AdvVideoBannerV2PlayerBinder$renderProductState$1(this, productState, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumePlayerIfNeeded() {
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        ImageView previewImageView;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew2;
        PlayerView playerView;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew3;
        PoolMediaPlayController mediaPlayController;
        Long voId = getVoId();
        boolean z11 = false;
        if (voId != null ? this.viewModel.isPackshotBlurred(voId.longValue()) : false) {
            return;
        }
        if (this.widgetViewHolder.getIsHalfBannerVisible() && this.widgetViewHolder.isInVisibleBounds()) {
            z11 = true;
        }
        if (!z11) {
            AdvBannerVideoV2VO boundData = this.widgetViewHolder.getBoundData();
            if (boundData != null) {
                showPreview(boundData);
                return;
            }
            return;
        }
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController != null && (mediaPlayController = poolPlayerController.mediaPlayController()) != null) {
            mediaPlayController.resume();
        }
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding != null && (advVideoBannerV2ViewNew3 = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) != null) {
            ViewExtKt.show(advVideoBannerV2ViewNew3);
        }
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding2 = this.binding;
        if (widgetAdvVideoBannerV2NewBinding2 != null && (advVideoBannerV2ViewNew2 = widgetAdvVideoBannerV2NewBinding2.advVideoBannerContainerNew) != null && (playerView = advVideoBannerV2ViewNew2.getPlayerView()) != null) {
            ViewExtKt.show(playerView);
        }
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding3 = this.binding;
        if (widgetAdvVideoBannerV2NewBinding3 == null || (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding3.advVideoBannerContainerNew) == null || (previewImageView = advVideoBannerV2ViewNew.getPreviewImageView()) == null) {
            return;
        }
        ViewExtKt.gone(previewImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setEmptyState() {
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        this.productBinder.hideProduct();
        this.packshotBinder.setProductVisibility(false);
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding == null || (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) == null) {
            return;
        }
        advVideoBannerV2ViewNew.showEmptyState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPreviewVisibleState() {
        this.productBinder.hideProduct();
        this.packshotBinder.setProductVisibility(true);
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding != null) {
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.hideEmptyState();
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.setPackshotStateForViews();
            AdvVideoBannerV2ViewNew.repositionLegalStateIfNeeded$default(widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew, 0, 1, true, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setVolumeIcon(boolean volumeOn) {
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding == null || (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) == null) {
            return null;
        }
        advVideoBannerV2ViewNew.getVolumeImageButton().setContentDescription(volumeOn ? "soundOn" : "soundOff");
        advVideoBannerV2ViewNew.getVolumeImageButton().setImageResource(volumeOn ? R$drawable.ic_s_volume_filled : R$drawable.ic_s_volume_no_filled);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showPreview(AdvBannerVideoV2VO item) {
        int i11 = 2;
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding == null) {
            return;
        }
        if (item.getVideoCoverDisabled()) {
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.setVideoCoverDisabled();
        } else {
            ImageView previewImageView = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.getPreviewImageView();
            Context context = previewImageView.getContext();
            if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
                return;
            } else {
                ImageViewExtKt.load$default(previewImageView, item.getPreviewUrl(), C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(PREVIEW_IMAGE_CORNER_RADIUS, null, i11, 0 == true ? 1 : 0)), null, null, null, false, null, 124, null);
            }
        }
        ViewExtKt.show(widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.getPreviewImageView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPlayer() {
        InterfaceC9928b analyticsListenerById;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        PlayerView playerView;
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController == null) {
            return;
        }
        poolPlayerController.listenersController().removePlayerListener(this.playerListener);
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding != null && (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) != null && (playerView = advVideoBannerV2ViewNew.getPlayerView()) != null) {
            poolPlayerController.playerViewController().unbindPlayerView(playerView);
        }
        Long voId = getVoId();
        if (voId != null && (analyticsListenerById = this.viewModel.getAnalyticsListenerById(voId.longValue())) != null) {
            poolPlayerController.listenersController().removeAnalyticsListener(analyticsListenerById);
        }
        poolPlayerController.mediaPlayController().stopAndReturnToFreePool(AdvVideoBannerV2PlayerBinder$stopPlayer$4.INSTANCE);
        this.playerController = null;
    }

    public final void renderPlayerState(@NotNull AdvVideoBannerV2ViewModelNew.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.container.invokeWhenInflated(new AdvVideoBannerV2PlayerBinder$renderPlayerState$1(state, this, state.getItem()));
    }

    public final void unbindPlayer() {
        AdvBannerVideoV2VO boundData;
        PoolPlayerController poolPlayerController = this.playerController;
        if (poolPlayerController != null && (boundData = this.widgetViewHolder.getBoundData()) != null) {
            boundData.setPosition(poolPlayerController.positionController().getCurrentPosition());
        }
        Long voId = getVoId();
        if (voId != null) {
            this.viewModel.setStoppedState(voId.longValue());
        }
        stopPlayer();
    }
}
