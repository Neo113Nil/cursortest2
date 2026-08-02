package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import Aw.ViewOnClickListenerC2448a;
import Lz.C3602a;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import rc.e;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.product.common.core.ButtonSizeModel;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.ScrollMultiFrameDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.NestedHorizontalSkuVideoTileHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.videocover.UtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0091\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0002\b\u00030\u001aj\u0006\u0012\u0002\b\u0003`\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u000b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\u00112\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010/J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010/J\u000f\u00107\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u0010/J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010/J\u000f\u00109\u001a\u00020\u0011H\u0016¢\u0006\u0004\b9\u0010/J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u00020*H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010?J!\u0010D\u001a\u00020\u00112\u0006\u00102\u001a\u0002012\n\u0010C\u001a\u00060Aj\u0002`B¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010MR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010NR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010OR \u0010\u001c\u001a\u000e\u0012\u0002\b\u00030\u001aj\u0006\u0012\u0002\b\u0003`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010QR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010RR\u0018\u0010S\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "containerView", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/product/common/core/GalleryItem;", "adultListDelegate", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "", "widgetId", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "multiFrameDelegate", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lru/ozon/app/android/cart/ui/CartAtomBinder;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;JLru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/videocover/VideoTileDelegate;)V", "Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "buttonSize", "updateLp", "(Lru/ozon/app/android/product/common/core/ButtonSizeModel;)V", "image", "", "ratio", "bindImage", "(Lru/ozon/app/android/product/common/core/GalleryItem;F)V", "attach", "()V", "detach", "Lru/ozon/app/android/product/common/product/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "navigateOrShowAdultDialog", "(Lru/ozon/app/android/product/common/product/ProductVO;)V", "onDetach", "onAttach", "onRecycle", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "getContainerView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "J", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/ScrollMultiFrameDelegate;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "item", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/NestedHorizontalSkuVideoTileHolder;", "videoCoverDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/videocover/NestedHorizontalSkuVideoTileHolder;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollProductViewHolder extends j implements DefaultLifecycleObserver {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AdultListDelegate<GalleryItem> adultListDelegate;

    @NotNull
    private final CartAtomBinder cartAtomBinder;

    @NotNull
    private final SkuScrollItemView containerView;

    @NotNull
    private InterfaceC8487b disposable;
    private ProductVO item;

    @NotNull
    private final ScrollMultiFrameDelegate multiFrameDelegate;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final NestedHorizontalSkuVideoTileHolder videoCoverDelegate;
    private final long widgetId;

    @NotNull
    private final k<?> widgetViewHolder;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.ScrollProductViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ScrollProductViewHolder.this.getContainerView().performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollProductViewHolder(@NotNull SkuScrollItemView containerView, @NotNull J lifecycleOwner, @NotNull ComposerReferences ref, @NotNull AdultListDelegate<GalleryItem> adultListDelegate, @NotNull CartAtomBinder cartAtomBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, long j11, @NotNull k<?> widgetViewHolder, @NotNull ScrollMultiFrameDelegate multiFrameDelegate, @NotNull PlayerPreloader playerPreloader, @NotNull VideoTileDelegate videoTileDelegate) {
        super(containerView);
        View view;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(multiFrameDelegate, "multiFrameDelegate");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        this.containerView = containerView;
        this.ref = ref;
        this.adultListDelegate = adultListDelegate;
        this.cartAtomBinder = cartAtomBinder;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.widgetId = j11;
        this.widgetViewHolder = widgetViewHolder;
        this.multiFrameDelegate = multiFrameDelegate;
        this.playerPreloader = playerPreloader;
        e eVar = e.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(eVar, "disposed(...)");
        this.disposable = eVar;
        lifecycleOwner.getLifecycle().a(this);
        containerView.setOnClickListener(new ViewOnClickListenerC2448a(this, 6));
        containerView.getImageContainer().setClickListener(new AnonymousClass2());
        containerView.getProductSa().setOnAction(actionHandler);
        SkuImageWrapper imageContainer = containerView.getImageContainer();
        View view2 = widgetViewHolder.itemView;
        RecyclerView recyclerView = null;
        this.videoCoverDelegate = new NestedHorizontalSkuVideoTileHolder(view2 instanceof ViewGroup ? (ViewGroup) view2 : null, ref, imageContainer, widgetViewHolder, videoTileDelegate, this);
        multiFrameDelegate.multiFrameInit(widgetViewHolder, ref, containerView);
        ComponentCallbacksC5392m c11 = ref.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
        }
        multiFrameDelegate.applyRecycler(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ScrollProductViewHolder scrollProductViewHolder, View view) {
        ProductVO productVO = scrollProductViewHolder.item;
        if (productVO == null || productVO.getAction() == null) {
            return;
        }
        scrollProductViewHolder.navigateOrShowAdultDialog(productVO);
    }

    private final void attach() {
        this.multiFrameDelegate.multiFrameAttach(this.widgetViewHolder);
        ProductVO productVO = this.item;
        if (productVO != null && productVO.getIsAdult()) {
            new ScrollProductViewHolder$attach$onAdultDialogCompleted$1(this);
            this.disposable = this.adultListDelegate.observeItems().subscribe(new C3602a(new ScrollProductViewHolder$attach$1(this), 2));
        }
        this.cartAtomBinder.init(this.containerView.getProductSa(), this.tokenizedAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindImage(GalleryItem image, float ratio) {
        if (image == null) {
            this.containerView.getImageContainer().gone();
            return;
        }
        this.containerView.getImageContainer().setRatio(ratio);
        this.containerView.getImageContainer().bindItem(image);
        this.containerView.getImageContainer().show();
    }

    private final void detach() {
        this.multiFrameDelegate.multiFrameDetach();
        this.disposable.dispose();
        this.cartAtomBinder.unbind();
        this.cartAtomBinder.setAdultDialogCommitListener(null);
    }

    private final void navigateOrShowAdultDialog(ProductVO product) {
        final AtomAction action = product.getAction();
        if (action == null) {
            return;
        }
        if (product.getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.ref.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.ScrollProductViewHolder$navigateOrShowAdultDialog$1
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    NestedHorizontalSkuVideoTileHolder nestedHorizontalSkuVideoTileHolder;
                    PlayerPreloader playerPreloader;
                    Function1 function1;
                    nestedHorizontalSkuVideoTileHolder = ScrollProductViewHolder.this.videoCoverDelegate;
                    nestedHorizontalSkuVideoTileHolder.onProductClick();
                    playerPreloader = ScrollProductViewHolder.this.playerPreloader;
                    playerPreloader.tryToPreloadPdpVideo(action);
                    function1 = ScrollProductViewHolder.this.actionHandler;
                    function1.invoke(action);
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, null, false, 12, null);
            return;
        }
        this.videoCoverDelegate.onProductClick();
        this.playerPreloader.tryToPreloadPdpVideo(action);
        this.actionHandler.invoke(action);
    }

    private final void updateLp(ButtonSizeModel buttonSize) {
        SingleAtom productSa = this.containerView.getProductSa();
        ViewGroup.LayoutParams layoutParams = productSa.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = buttonSize.getWidthButton();
        productSa.setLayoutParams(marginLayoutParams);
        View first = ViewGroupExtKt.first(this.containerView.getProductSa());
        if (first != null) {
            ViewGroup.LayoutParams layoutParams2 = first.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = buttonSize.getWidthButton();
            first.setLayoutParams(layoutParams2);
        }
        this.containerView.getProductSa().setClipChildren(buttonSize.getClip());
        this.containerView.getProductSa().setClipToPadding(buttonSize.getClip());
    }

    public final void bind(@NotNull ProductVO product, @NotNull d info) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = product;
        this.videoCoverDelegate.bind(product);
        this.containerView.getImageContainer().setRatio(product.getImageModel().getRatio());
        if (product.getIsAdult()) {
            this.adultListDelegate.bindItems(C7714v.c0(UtilsKt.getImageItem(product)));
        } else if (UtilsKt.imageModelIsNotEmpty(product)) {
            bindImage(UtilsKt.getCurrentItem(product), product.getImageModel().getRatio());
        }
        AtomDTO button = product.getButton();
        if (button != null) {
            ViewExtKt.show(this.containerView.getProductSa());
            if (button instanceof ButtonV3Atom.AddToCartAtom) {
                this.cartAtomBinder.bind(this.containerView.getProductSa(), button, this.actionHandler, this.tokenizedAnalytics, Long.valueOf(this.widgetId));
                this.cartAtomBinder.bindAdult(product.getShouldBlur());
            } else {
                SingleAtom.bind$default(this.containerView.getProductSa(), button, false, 2, null);
                this.containerView.getProductSa().setOnAction(this.actionHandler);
                this.cartAtomBinder.clear();
            }
            updateLp(product.getButtonSizeModel());
        } else {
            ViewExtKt.gone(this.containerView.getProductSa());
        }
        this.multiFrameDelegate.multiFrameBind(product, info, this.widgetViewHolder);
    }

    @NotNull
    public final SkuScrollItemView getContainerView() {
        return this.containerView;
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        attach();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (getLifecycle().b().a(AbstractC5434v.b.CREATED)) {
            attach();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        detach();
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        detach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.multiFrameDelegate.multiFrameOnOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.multiFrameDelegate.multiFrameRecycle();
        detach();
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        NestedHorizontalSkuVideoTileHolder nestedHorizontalSkuVideoTileHolder = this.videoCoverDelegate;
        if (nestedHorizontalSkuVideoTileHolder != null) {
            nestedHorizontalSkuVideoTileHolder.onViewInVisibleBounds();
        }
        ProductVO productVO = this.item;
        if (productVO == null || (tokenizedEvent = productVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        NestedHorizontalSkuVideoTileHolder nestedHorizontalSkuVideoTileHolder = this.videoCoverDelegate;
        if (nestedHorizontalSkuVideoTileHolder != null) {
            nestedHorizontalSkuVideoTileHolder.onViewOutOfVisibleBounds();
        }
    }
}
