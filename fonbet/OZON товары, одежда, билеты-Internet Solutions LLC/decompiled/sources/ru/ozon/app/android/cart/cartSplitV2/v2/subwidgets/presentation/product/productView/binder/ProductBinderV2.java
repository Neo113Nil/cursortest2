package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.binder;

import FK.a;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementListAdapterV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.decorations.VerticalSpacerDecoration;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.view.CheckBoxCutOutView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ProductMediaSizeCalculator;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001b\u0010!\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u001bJ\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0018\u0010\u001c\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u00108\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBinderV2;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "productMediaSizeCalculator", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "Lkotlin/Function0;", "Ll20/d;", "getWidgetInfo", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;LWZ/l;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "sendLocalUpdateState", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)V", "initProductDynamicElementAdapter", "()V", "item", "bind", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "dynamicElements", "bindDynamicElements", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "media", "loadProductImage", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "onAttach", "onDetach", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "LWZ/l;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementListAdapterV2;", "productDynamicElementAdapter", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementListAdapterV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBottomDynamicElementBinder;", "bottomDynamicElementBinder", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBottomDynamicElementBinder;", "onCheckboxClick", "getOnCheckboxClick", "()Lkotlin/jvm/functions/Function0;", "setOnCheckboxClick", "(Lkotlin/jvm/functions/Function0;)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBinderV2 {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;
    private ProductBottomDynamicElementBinder bottomDynamicElementBinder;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final Function0<d> getWidgetInfo;
    private ProductVOV2 item;
    private Function0<Unit> onCheckboxClick;

    @NotNull
    private final DynamicElementListAdapterV2 productDynamicElementAdapter;
    private final ProductMediaSizeCalculator productMediaSizeCalculator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProductV2View view;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductBinderV2(@NotNull ProductV2View view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ComposerReferences composerReferences, ProductMediaSizeCalculator productMediaSizeCalculator, @NotNull l tokenizedAnalytics, @NotNull AsyncCartViewModel asyncCartViewModel, @NotNull Function0<d> getWidgetInfo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        Intrinsics.checkNotNullParameter(getWidgetInfo, "getWidgetInfo");
        this.view = view;
        this.actionHandler = actionHandler;
        this.composerReferences = composerReferences;
        this.productMediaSizeCalculator = productMediaSizeCalculator;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.asyncCartViewModel = asyncCartViewModel;
        this.getWidgetInfo = getWidgetInfo;
        this.productDynamicElementAdapter = new DynamicElementListAdapterV2(actionHandler);
        initProductDynamicElementAdapter();
        view.setOnClickListener(new a(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProductBinderV2 productBinderV2, View view) {
        t trackingInfo;
        AtomAction action;
        ProductVOV2 productVOV2 = productBinderV2.item;
        if (productVOV2 != null && (action = productVOV2.getAction()) != null) {
            productBinderV2.actionHandler.invoke(action);
        }
        ProductVOV2 productVOV22 = productBinderV2.item;
        if (productVOV22 == null || (trackingInfo = productVOV22.getTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(productBinderV2.tokenizedAnalytics, trackingInfo, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ProductBinderV2 productBinderV2, CartSplitV2ProductVO cartSplitV2ProductVO, View view) {
        Function0<Unit> function0 = productBinderV2.onCheckboxClick;
        if (function0 != null) {
            function0.invoke();
        }
        productBinderV2.sendLocalUpdateState(cartSplitV2ProductVO);
    }

    private final void initProductDynamicElementAdapter() {
        ProductV2View productV2View = this.view;
        productV2View.getProductDynamicElementsRv().setAdapter(this.productDynamicElementAdapter);
        productV2View.getProductDynamicElementsRv().setLayoutManager(new LinearLayoutManager(this.view.getContext(), 1, false));
        productV2View.getProductDynamicElementsRv().setItemAnimator(null);
        productV2View.getProductDynamicElementsRv().setRecycledViewPool(this.composerReferences.getComposerViewPoolProvider().getViewPool());
        productV2View.getProductDynamicElementsRv().addItemDecoration(new VerticalSpacerDecoration());
    }

    private final void sendLocalUpdateState(CartSplitV2ProductVO product) {
        if (this.asyncCartViewModel.isEnabled()) {
            C10727i.c(K.a(this.composerReferences.getContainer().g()), C10720e0.a(), null, new ProductBinderV2$sendLocalUpdateState$1(product, this, null), 2);
        }
    }

    public final void bind(@NotNull CartSplitV2ProductVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item.getProduct();
        ProductVOV2 product = item.getProduct();
        ProductV2View productV2View = this.view;
        ProductMediaHolderKt.bindOrGone(productV2View.getMedia(), product.getMedia(), this.actionHandler);
        CheckBoxView checkBox = productV2View.getCheckBox();
        CheckboxVO checkbox = product.getCheckbox();
        CheckBoxHolderKt.bindOrGone$default(checkBox, checkbox != null ? checkbox.getCheckbox() : null, null, 2, null);
        productV2View.getCheckBox().setOnCheckedChangeListener(null);
        productV2View.getCheckBox().setOnClickListener(new GD.a(5, this, item));
        CheckBoxCutOutView cutOutView = productV2View.getCutOutView();
        CheckboxVO checkbox2 = product.getCheckbox();
        cutOutView.setVisibility((checkbox2 != null ? checkbox2.getCheckbox() : null) != null ? 0 : 8);
        this.productDynamicElementAdapter.submitList(product.getDynamicElements());
    }

    public final void bindDynamicElements(@NotNull List<? extends DynamicElementVOV2> dynamicElements) {
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        if (this.bottomDynamicElementBinder == null) {
            this.bottomDynamicElementBinder = new ProductBottomDynamicElementBinder(this.view.getBottomDynamicElementsRv(), this.composerReferences, this.actionHandler);
        }
        ProductBottomDynamicElementBinder productBottomDynamicElementBinder = this.bottomDynamicElementBinder;
        if (productBottomDynamicElementBinder != null) {
            productBottomDynamicElementBinder.bind(dynamicElements);
        }
    }

    public final void loadProductImage(ProductMediaDTO media) {
        ProductMediaDTO.Image image;
        String url = (media == null || (image = media.getImage()) == null) ? null : image.getUrl();
        if (url == null) {
            ImageViewExtKt.clearResource(this.view.getMedia());
            return;
        }
        ProductMediaView media2 = this.view.getMedia();
        ProductMediaSizeCalculator productMediaSizeCalculator = this.productMediaSizeCalculator;
        ImageViewExtKt.load$default(media2, url, null, null, null, productMediaSizeCalculator != null ? productMediaSizeCalculator.calculateImageSize(media) : null, false, null, 110, null);
    }

    public final void onAttach() {
        this.view.getProductDynamicElementsRv().swapAdapter(this.productDynamicElementAdapter, true);
        ProductBottomDynamicElementBinder productBottomDynamicElementBinder = this.bottomDynamicElementBinder;
        if (productBottomDynamicElementBinder != null) {
            productBottomDynamicElementBinder.onAttach();
        }
    }

    public final void onDetach() {
        this.view.getProductDynamicElementsRv().swapAdapter(null, true);
        ProductBottomDynamicElementBinder productBottomDynamicElementBinder = this.bottomDynamicElementBinder;
        if (productBottomDynamicElementBinder != null) {
            productBottomDynamicElementBinder.onDetach();
        }
    }

    public final void setOnCheckboxClick(Function0<Unit> function0) {
        this.onCheckboxClick = function0;
    }
}
