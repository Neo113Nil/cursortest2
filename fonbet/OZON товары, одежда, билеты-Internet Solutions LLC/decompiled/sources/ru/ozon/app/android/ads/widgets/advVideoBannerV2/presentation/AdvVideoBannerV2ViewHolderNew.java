package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.R$layout;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.AdvVideoBannerV2PackshotProductBinderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.AdvVideoBannerV2PreviewBinderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view.AdvVideoBannerV2ViewNew;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001I\b\u0000\u0018\u0000 Q2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001QB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R$\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00100B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/video/playerV2/videoController/VideoController;", "videoController", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/video/playerV2/videoController/VideoController;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;)V", "", "voId", "", "switchVolume", "(J)V", "item", "bindAnalyticsSender", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "Ll20/d;", "bind", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;Ll20/d;)V", "onAttach", "()V", "onDetach", "onRecycle", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isHalfBannerVisible", "Z", "()Z", "", "defaultBackgroundColor", "I", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;", "packshotBinder$delegate", "LSc/j;", "getPackshotBinder", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;", "packshotBinder", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "productBinder$delegate", "getProductBinder", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "productBinder", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2NewBinding;", "binding", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2NewBinding;", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "container", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2PlayerBinder;", "playerBinder", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2PlayerBinder;", "ru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew$lifecycleObserver$1;", "Lxe/B0;", "stateFlowJob", "Lxe/B0;", "getVoId", "()Ljava/lang/Long;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2ViewHolderNew extends k<AdvBannerVideoV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetAdvVideoBannerV2NewBinding binding;

    @NotNull
    private final AsyncFrameLayout container;

    @NotNull
    private final View containerView;
    private final int defaultBackgroundColor;
    private boolean isHalfBannerVisible;

    @NotNull
    private AdvVideoBannerV2ViewHolderNew$lifecycleObserver$1 lifecycleObserver;

    /* renamed from: packshotBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j packshotBinder;

    @NotNull
    private final AdvVideoBannerV2PlayerBinder playerBinder;

    /* renamed from: productBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productBinder;

    @NotNull
    private final ComposerReferences refs;
    private B0 stateFlowJob;

    @NotNull
    private final AdvVideoBannerV2ViewModelNew viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v5, types: [ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew$lifecycleObserver$1] */
    public AdvVideoBannerV2ViewHolderNew(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull VideoController videoController, @NotNull AdvVideoBannerV2ViewModelNew viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(videoController, "videoController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.defaultBackgroundColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.packshotBinder = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2ViewHolderNew$packshotBinder$2(this));
        this.productBinder = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2ViewHolderNew$productBinder$2(this));
        AsyncFrameLayout asyncFrameLayout = new AsyncFrameLayout(getContext(), null, 0, 6, null);
        asyncFrameLayout.inflateAsync(R$layout.widget_adv_video_banner_v2_new);
        Intrinsics.g(containerView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) containerView).addView(asyncFrameLayout);
        asyncFrameLayout.invokeWhenInflated(new AdvVideoBannerV2ViewHolderNew$container$1$1(this));
        this.container = asyncFrameLayout;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.playerBinder = new AdvVideoBannerV2PlayerBinder(this, asyncFrameLayout, refs, viewModel, videoController, getProductBinder(), getPackshotBinder());
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                AsyncFrameLayout asyncFrameLayout2;
                AdvVideoBannerV2PackshotProductBinderNew packshotBinder;
                AdvVideoBannerV2PreviewBinderNew productBinder;
                AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                asyncFrameLayout2 = AdvVideoBannerV2ViewHolderNew.this.container;
                asyncFrameLayout2.clearPendingActions();
                packshotBinder = AdvVideoBannerV2ViewHolderNew.this.getPackshotBinder();
                packshotBinder.clearAsyncFramePendingEvents();
                productBinder = AdvVideoBannerV2ViewHolderNew.this.getProductBinder();
                productBinder.clearPendingActions();
                advVideoBannerV2PlayerBinder = AdvVideoBannerV2ViewHolderNew.this.playerBinder;
                advVideoBannerV2PlayerBinder.unbindPlayer();
                composerReferences = AdvVideoBannerV2ViewHolderNew.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                Long voId;
                AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onPause(owner);
                voId = AdvVideoBannerV2ViewHolderNew.this.getVoId();
                if (voId != null) {
                    advVideoBannerV2ViewModelNew = AdvVideoBannerV2ViewHolderNew.this.viewModel;
                    advVideoBannerV2ViewModelNew.setPausedStateAndDisableVolume(voId.longValue());
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Long voId;
                AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                voId = AdvVideoBannerV2ViewHolderNew.this.getVoId();
                if (voId != null) {
                    AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew = AdvVideoBannerV2ViewHolderNew.this;
                    long longValue = voId.longValue();
                    advVideoBannerV2ViewModelNew = advVideoBannerV2ViewHolderNew.viewModel;
                    advVideoBannerV2ViewModelNew.onHalfBannerVisible(longValue, advVideoBannerV2ViewHolderNew.getIsHalfBannerVisible() && advVideoBannerV2ViewHolderNew.isInVisibleBounds());
                }
            }
        };
    }

    private final void bindAnalyticsSender(AdvBannerVideoV2VO item) {
        this.viewModel.initAdvVideoBannerAnalytics(item.getId(), item.getTokenizedEvents(), item.getSwitchVolumeTracking(), item.getPixel(), x0.a(this.viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvVideoBannerV2PackshotProductBinderNew getPackshotBinder() {
        return (AdvVideoBannerV2PackshotProductBinderNew) this.packshotBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvVideoBannerV2PreviewBinderNew getProductBinder() {
        return (AdvVideoBannerV2PreviewBinderNew) this.productBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getVoId() {
        AdvBannerVideoV2VO boundData = getBoundData();
        if (boundData != null) {
            return Long.valueOf(boundData.getId());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$renderPlayerState(AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder, AdvVideoBannerV2ViewModelNew.State state, d dVar) {
        advVideoBannerV2PlayerBinder.renderPlayerState(state);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchVolume(long voId) {
        this.viewModel.blockSoundEventSending(voId, false);
        this.viewModel.switchVolumeState(voId);
    }

    /* renamed from: isHalfBannerVisible, reason: from getter */
    public final boolean getIsHalfBannerVisible() {
        return this.isHalfBannerVisible;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        PlayerView playerView;
        super.onAttach();
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding != null && (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) != null && (playerView = advVideoBannerV2ViewNew.getPlayerView()) != null) {
            playerView.setLayerType(2, null);
        }
        U7.d.c(this.refs).a(this.lifecycleObserver);
        Long voId = getVoId();
        if (voId != null) {
            this.viewModel.onHalfBannerVisible(voId.longValue(), this.isHalfBannerVisible && isInVisibleBounds());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdvBannerVideoV2VO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        this.stateFlowJob = C2399j.C(new C2408n0(C5427n.a(this.viewModel.getStateFlow(boundData), lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new AdvVideoBannerV2ViewHolderNew$onAttachViewModel$1(this.playerBinder)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        PlayerView playerView;
        super.onDetach();
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding = this.binding;
        if (widgetAdvVideoBannerV2NewBinding != null && (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew) != null && (playerView = advVideoBannerV2ViewNew.getPlayerView()) != null) {
            playerView.setLayerType(0, null);
        }
        U7.d.c(this.refs).e(this.lifecycleObserver);
        this.playerBinder.unbindPlayer();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        B0 b02 = this.stateFlowJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.stateFlowJob = null;
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.playerBinder.unbindPlayer();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            this.isHalfBannerVisible = ((double) o.a(itemView, info, false)) >= 0.5d;
            AdvBannerVideoV2VO boundData = getBoundData();
            if (boundData == null) {
                return;
            }
            this.viewModel.onHalfBannerVisible(boundData.getId(), this.isHalfBannerVisible);
            if (this.isHalfBannerVisible) {
                this.viewModel.onVideoView(boundData.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdvBannerVideoV2VO item, @NotNull l20.d info) {
        Integer marginHorizontal;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        getProductBinder().bind(item);
        getPackshotBinder().bind(item);
        AdvVideoBannerV2DTO.DesignOptions designOptions = item.getDesignOptions();
        int px = ResourceExtKt.toPx((designOptions == null || (marginHorizontal = designOptions.getMarginHorizontal()) == null) ? 16 : marginHorizontal.intValue());
        ViewExtKt.updatePadding$default(this.containerView, px, 0, px, 0, 10, null);
        View view = this.containerView;
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor());
        view.setBackgroundColor(parseColor != null ? parseColor.intValue() : this.defaultBackgroundColor);
        this.container.invokeWhenInflated(new AdvVideoBannerV2ViewHolderNew$bind$1(this, item));
        bindAnalyticsSender(item);
    }
}
