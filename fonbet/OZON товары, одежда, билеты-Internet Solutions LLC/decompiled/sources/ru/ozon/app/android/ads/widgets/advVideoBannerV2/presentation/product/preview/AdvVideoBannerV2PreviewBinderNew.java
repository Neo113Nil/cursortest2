package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.databinding.VideobannerPreviewProductViewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.ProductContentAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "widgetViewHolder", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "viewModel", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;)V", "Lkotlin/Function2;", "", "", "", "containerCallback", "processShow", "(Lkotlin/jvm/functions/Function2;)V", "processHide", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "item", "bind", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;)V", "show", "changeVisibility", "(ZLkotlin/jvm/functions/Function2;)V", "hideProduct", "()V", "clearPendingActions", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "Lru/ozon/app/android/ads/databinding/VideobannerPreviewProductViewBinding;", "binding", "Lru/ozon/app/android/ads/databinding/VideobannerPreviewProductViewBinding;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter;", "productContentAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/rv/ProductContentAdapter;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvBannerVideoV2VO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "LSc/j;", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "asyncRatioFrameLayout", "LSc/j;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2PreviewBinderNew {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PRODUCT_HEIGHT_WITH_PADDINGS = ResourceExtKt.toPx(44);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC4008j<AsyncFrameLayout> asyncRatioFrameLayout;
    private VideobannerPreviewProductViewBinding binding;

    @NotNull
    private final View containerView;
    private AdvBannerVideoV2VO item;

    @NotNull
    private ProductContentAdapter productContentAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AdvVideoBannerV2ViewModelNew viewModel;

    @NotNull
    private final AdvVideoBannerV2ViewHolderNew widgetViewHolder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew$Companion;", "", "<init>", "()V", "PRODUCT_HEIGHT_WITH_PADDINGS", "", "GONE_PREVIEW_HEIGHT", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvVideoBannerV2PreviewBinderNew(@NotNull Context context, @NotNull AdvVideoBannerV2ViewHolderNew widgetViewHolder, @NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AdvVideoBannerV2ViewModelNew viewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.widgetViewHolder = widgetViewHolder;
        this.containerView = containerView;
        this.refs = refs;
        this.viewModel = viewModel;
        this.productContentAdapter = new ProductContentAdapter();
        this.actionHandler = new ActionHandler.Builder(refs, widgetViewHolder).customAnalyticHandler(new AdvVideoBannerV2PreviewBinderNew$actionHandler$1(this)).buildHandler();
        this.asyncRatioFrameLayout = LazyUtilsKt.unsafeLazy(new AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1(context, this));
    }

    private final void processHide(Function2<? super Integer, ? super Boolean, Unit> containerCallback) {
        if (this.asyncRatioFrameLayout.isInitialized()) {
            this.asyncRatioFrameLayout.getValue().invokeWhenInflated(new AdvVideoBannerV2PreviewBinderNew$processHide$1(this, containerCallback));
        }
    }

    private final void processShow(Function2<? super Integer, ? super Boolean, Unit> containerCallback) {
        AdvBannerVideoV2VO advBannerVideoV2VO = this.item;
        if (advBannerVideoV2VO == null) {
            return;
        }
        this.asyncRatioFrameLayout.getValue().invokeWhenInflated(new AdvVideoBannerV2PreviewBinderNew$processShow$1(this, advBannerVideoV2VO, !this.asyncRatioFrameLayout.isInitialized(), containerCallback));
    }

    public final void bind(@NotNull AdvBannerVideoV2VO item) {
        List<Object> list;
        VideobannerPreviewProductViewBinding videobannerPreviewProductViewBinding;
        Image image;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        AdvBannerVideoV2VO.SmallPreviewProduct previewProduct = item.getPreviewProduct();
        if (previewProduct == null || (list = previewProduct.getState()) == null) {
            list = K.f71697a;
        }
        this.productContentAdapter.submitList(list);
        if (!this.asyncRatioFrameLayout.isInitialized() || (videobannerPreviewProductViewBinding = this.binding) == null || (image = videobannerPreviewProductViewBinding.image) == null) {
            return;
        }
        AdvBannerVideoV2VO.SmallPreviewProduct previewProduct2 = item.getPreviewProduct();
        ImageHolderKt.bindOrGone$default(image, previewProduct2 != null ? previewProduct2.getImage() : null, null, 2, null);
    }

    public final void changeVisibility(boolean show, @NotNull Function2<? super Integer, ? super Boolean, Unit> containerCallback) {
        Intrinsics.checkNotNullParameter(containerCallback, "containerCallback");
        if (show) {
            processShow(containerCallback);
        } else {
            processHide(containerCallback);
        }
    }

    public final void clearPendingActions() {
        if (this.asyncRatioFrameLayout.isInitialized()) {
            this.asyncRatioFrameLayout.getValue().clearPendingActions();
        }
    }

    public final void hideProduct() {
        LinearLayout linearLayout;
        VideobannerPreviewProductViewBinding videobannerPreviewProductViewBinding = this.binding;
        if (videobannerPreviewProductViewBinding == null || (linearLayout = videobannerPreviewProductViewBinding.previewProductView) == null) {
            return;
        }
        ViewExtKt.gone(linearLayout);
    }
}
