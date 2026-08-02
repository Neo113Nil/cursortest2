package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import Sc.InterfaceC4008j;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2PackshotBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.ProductContentAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/AdvVideoBannerV2PackshotProductBinderNew;", "", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "widgetViewHolder", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "viewModel", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;)V", "", "processShow", "()V", "processHide", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "bind", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "", "isVisible", "setProductVisibility", "(Z)V", "clearAsyncFramePendingEvents", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2PackshotBinding;", "binding", "Lru/ozon/app/android/ads/databinding/WidgetAdvVideoBannerV2PackshotBinding;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter;", "adapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "LSc/j;", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "asyncRatioFrameLayout", "LSc/j;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2PackshotProductBinderNew {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private ProductContentAdapter adapter;

    @NotNull
    private final InterfaceC4008j<AsyncFrameLayout> asyncRatioFrameLayout;
    private WidgetAdvVideoBannerV2PackshotBinding binding;

    @NotNull
    private final View containerView;
    private AdvBannerVideoV2VO item;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AdvVideoBannerV2ViewModelNew viewModel;

    @NotNull
    private final AdvVideoBannerV2ViewHolderNew widgetViewHolder;

    public AdvVideoBannerV2PackshotProductBinderNew(@NotNull AdvVideoBannerV2ViewHolderNew widgetViewHolder, @NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AdvVideoBannerV2ViewModelNew viewModel) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.widgetViewHolder = widgetViewHolder;
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.adapter = new ProductContentAdapter();
        this.actionHandler = new ActionHandler.Builder(refs, widgetViewHolder).customAnalyticHandler(new AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1(this)).buildHandler();
        this.asyncRatioFrameLayout = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1(this));
    }

    private final void processHide() {
        if (this.asyncRatioFrameLayout.isInitialized()) {
            this.asyncRatioFrameLayout.getValue().invokeWhenInflated(new AdvVideoBannerV2PackshotProductBinderNew$processHide$1(this));
        }
    }

    private final void processShow() {
        AdvBannerVideoV2VO advBannerVideoV2VO = this.item;
        if (advBannerVideoV2VO == null) {
            return;
        }
        this.asyncRatioFrameLayout.getValue().invokeWhenInflated(new AdvVideoBannerV2PackshotProductBinderNew$processShow$1(this, advBannerVideoV2VO, !this.asyncRatioFrameLayout.isInitialized()));
    }

    public final void bind(@NotNull AdvBannerVideoV2VO item) {
        WidgetAdvVideoBannerV2PackshotBinding widgetAdvVideoBannerV2PackshotBinding;
        Image image;
        AdvBannerVideoV2VO.PackShotVO packshotVO;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.adapter.submitList((item == null || (packshotVO = item.getPackshotVO()) == null) ? null : packshotVO.getMainState());
        if (!this.asyncRatioFrameLayout.isInitialized() || (widgetAdvVideoBannerV2PackshotBinding = this.binding) == null || (image = widgetAdvVideoBannerV2PackshotBinding.packshotImage) == null) {
            return;
        }
        AdvBannerVideoV2VO.PackShotVO packshotVO2 = item.getPackshotVO();
        ImageHolderKt.bindOrGone$default(image, packshotVO2 != null ? packshotVO2.getImage() : null, null, 2, null);
    }

    public final void clearAsyncFramePendingEvents() {
        if (this.asyncRatioFrameLayout.isInitialized()) {
            this.asyncRatioFrameLayout.getValue().clearPendingActions();
        }
    }

    public final void setProductVisibility(boolean isVisible) {
        if (isVisible) {
            processShow();
        } else {
            processHide();
        }
    }
}
