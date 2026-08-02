package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshSelectedProductsWithLinkHandler;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshWithStateHandler;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view.ProductToPayWidgetView;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewItem.ProductsToPayVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import vW.ViewOnClickListenerC10284a;
import xe.C10727i;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010\u0016J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J)\u00105\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00108\u001a\u000207H\u0014¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00140A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/view/ProductToPayWidgetView;", "view", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;", "refreshWithStateHandler", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;", "refreshSelectedProductsWithLinkHandler", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;", "adultDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/view/ProductToPayWidgetView;Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindCheckbox", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;)V", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;", "image", "bindImage", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductsToPayImage;)V", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;", "productPrice", "bindPrice", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductPriceVO;)V", "productImage", "bindProductImage", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductImageVO;)V", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductToPayMediaImage;", "bindProductMediaImage", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO$ProductToPayMediaImage;)V", "bindCounter", "onItemClick", "", "getCurrentValue", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateCounter", "(I)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewItem/ProductsToPayVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/view/ProductToPayWidgetView;", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper;", "clickHelper", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "getWidgetId", "()Ljava/lang/Long;", "widgetId", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayWidgetViewHolder extends k<ProductsToPayVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultDelegate<ProductsToPayVO.ProductImageVO> adultDelegate;

    @NotNull
    private final ProductsToPayWidgetClickHelper clickHelper;

    @NotNull
    private final RefreshSelectedProductsWithLinkHandler refreshSelectedProductsWithLinkHandler;

    @NotNull
    private final RefreshWithStateHandler refreshWithStateHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AtomsAdapter titleAtomsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProductToPayWidgetView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsToPayWidgetViewHolder(@NotNull ProductToPayWidgetView view, @NotNull RefreshWithStateHandler refreshWithStateHandler, @NotNull RefreshSelectedProductsWithLinkHandler refreshSelectedProductsWithLinkHandler, @NotNull AdultDelegate<ProductsToPayVO.ProductImageVO> adultDelegate, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refreshWithStateHandler, "refreshWithStateHandler");
        Intrinsics.checkNotNullParameter(refreshSelectedProductsWithLinkHandler, "refreshSelectedProductsWithLinkHandler");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.refreshWithStateHandler = refreshWithStateHandler;
        this.refreshSelectedProductsWithLinkHandler = refreshSelectedProductsWithLinkHandler;
        this.adultDelegate = adultDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new ProductsToPayWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.clickHelper = new ProductsToPayWidgetClickHelper(new ProductsToPayWidgetViewHolder$clickHelper$1(buildHandler));
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.titleAtomsAdapter = atomsAdapter;
        view.getTitleLayout().setAdapter(atomsAdapter);
    }

    private final void bindCheckbox(final ProductsToPayVO item) {
        ProductToPayWidgetView productToPayWidgetView = this.view;
        CheckBoxDTO checkbox = item.getCheckbox();
        productToPayWidgetView.getCheckBoxCutOutView().setVisibility(checkbox != null ? 0 : 8);
        CheckBoxHolderKt.bindOrGone(productToPayWidgetView.getCheckBox(), checkbox, this.actionHandler);
        productToPayWidgetView.getCheckBox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wB.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ProductsToPayWidgetViewHolder.this.onItemClick(item);
            }
        });
    }

    private final void bindCounter(ProductsToPayVO item) {
        ProductToPayWidgetView productToPayWidgetView = this.view;
        productToPayWidgetView.changeProductCounterVisibility(item.getProductCounter() != null);
        final ProductsToPayVO.ProductCounterVO productCounter = item.getProductCounter();
        if (productCounter == null) {
            return;
        }
        final String state = item.getState();
        IconButtonV3HolderKt.bind$default(productToPayWidgetView.getMinusIconButton(), productCounter.getMinusButton(), null, 2, null);
        TextHolderKt.bind(productToPayWidgetView.getCountValueTextAtom(), productCounter.getCountValue(), this.actionHandler);
        IconButtonV3HolderKt.bind$default(productToPayWidgetView.getPlusIconButton(), productCounter.getPlusButton(), null, 2, null);
        productToPayWidgetView.getPlusIconButton().setOnClickListener(new ViewOnClickListenerC10284a(productCounter, this, state, 1));
        productToPayWidgetView.getMinusIconButton().setOnClickListener(new View.OnClickListener() { // from class: wB.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductsToPayWidgetViewHolder.bindCounter$lambda$9$lambda$8(ProductsToPayWidgetViewHolder.this, productCounter, state, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCounter$lambda$9$lambda$7(ProductsToPayVO.ProductCounterVO productCounterVO, ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, String str, View view) {
        AtomAction atomAction;
        int currentValue;
        CommonControlSettings common = productCounterVO.getPlusButton().getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null || (currentValue = productsToPayWidgetViewHolder.getCurrentValue()) >= productCounterVO.getMaxValue()) {
            return;
        }
        int i11 = currentValue + 1;
        productsToPayWidgetViewHolder.updateCounter(i11);
        C10727i.c(K.a(productsToPayWidgetViewHolder.refs.getContainer().g()), null, null, new ProductsToPayWidgetViewHolder$bindCounter$1$1$1(productsToPayWidgetViewHolder, atomAction, i11, str, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCounter$lambda$9$lambda$8(ProductsToPayWidgetViewHolder productsToPayWidgetViewHolder, ProductsToPayVO.ProductCounterVO productCounterVO, String str, View view) {
        AtomAction atomAction;
        int currentValue = productsToPayWidgetViewHolder.getCurrentValue();
        CommonControlSettings common = productCounterVO.getMinusButton().getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null || currentValue <= productCounterVO.getMinValue()) {
            return;
        }
        int i11 = currentValue - 1;
        productsToPayWidgetViewHolder.updateCounter(i11);
        C10727i.c(K.a(productsToPayWidgetViewHolder.refs.getContainer().g()), null, null, new ProductsToPayWidgetViewHolder$bindCounter$1$2$1(productsToPayWidgetViewHolder, atomAction, i11, str, null), 3);
    }

    private final void bindImage(ProductsToPayVO.ProductsToPayImage image) {
        if (image instanceof ProductsToPayVO.ProductImageVO) {
            bindProductImage((ProductsToPayVO.ProductImageVO) image);
        } else {
            if (!(image instanceof ProductsToPayVO.ProductToPayMediaImage)) {
                throw new o();
            }
            bindProductMediaImage((ProductsToPayVO.ProductToPayMediaImage) image);
        }
    }

    private final void bindPrice(ProductsToPayVO.ProductPriceVO productPrice) {
        this.view.getTitleLayout().setVisibility(productPrice != null ? 0 : 8);
        if (productPrice == null) {
            return;
        }
        AtomsAdapter atomsAdapter = this.titleAtomsAdapter;
        Context context = getContext();
        AtomDTO[] elements = {productPrice.getPrice(), productPrice.getBadge()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        atomsAdapter.bind(context, C7705l.B(elements));
    }

    private final void bindProductImage(ProductsToPayVO.ProductImageVO productImage) {
        ProductToPayWidgetView productToPayWidgetView = this.view;
        this.adultDelegate.bindItem(productImage);
        BadgeHolderKt.bindOrGone(productToPayWidgetView.getCounterBadgeView(), productImage.getCounter(), this.actionHandler);
        ViewExtKt.gone(productToPayWidgetView.getProductImageView());
        ProductToPayWidgetView.updateGuidelineStartTextInfo$default(productToPayWidgetView, null, 1, null);
    }

    private final void bindProductMediaImage(ProductsToPayVO.ProductToPayMediaImage productImage) {
        Integer num;
        ProductToPayWidgetView productToPayWidgetView = this.view;
        productToPayWidgetView.getProductImageView().bind(productImage.getMedia(), this.actionHandler);
        ViewExtKt.gone(productToPayWidgetView.getCounterBadgeView());
        ViewExtKt.gone(productToPayWidgetView.getImageView());
        ProductMediaDTO.Width width = productImage.getMedia().getProductMedia().getWidth();
        if (width != null) {
            int dp = width.getDp();
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = Integer.valueOf(ResourceExtKt.toPx(dp, context));
        } else {
            num = null;
        }
        productToPayWidgetView.updateGuidelineStartTextInfo(num);
    }

    private final int getCurrentValue() {
        Integer w02 = h.w0(this.view.getCountValueTextAtom().getText().toString());
        if (w02 != null) {
            return w02.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getWidgetId() {
        ProductsToPayVO boundData = getBoundData();
        if (boundData != null) {
            return Long.valueOf(boundData.getId());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(ProductsToPayVO item) {
        C10727i.c(K.a(this.refs.getContainer().g()), null, null, new ProductsToPayWidgetViewHolder$onItemClick$1(item, this, null), 3);
    }

    private final void updateCounter(int value) {
        TextAtomV2View countValueTextAtom = this.view.getCountValueTextAtom();
        String format = String.format(countValueTextAtom.getResources().getConfiguration().getLocales().get(0), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(value)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        countValueTextAtom.setText(format);
        countValueTextAtom.requestLayout();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C10727i.c(K.a(lifecycle), null, null, new ProductsToPayWidgetViewHolder$onAttachViewModel$1(this, null), 3);
        this.clickHelper.initFlow(K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductsToPayVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ProductToPayWidgetView productToPayWidgetView = this.view;
        bindCheckbox(item);
        bindImage(item.getImage());
        bindPrice(item.getProductPrice());
        TextHolderKt.bind(productToPayWidgetView.getSubtitleView(), item.getTitle(), this.actionHandler);
        TextHolderKt.bindOrGone(productToPayWidgetView.getCaptionView(), item.getSubtitle(), this.actionHandler);
        BadgeHolderKt.bindOrGone(productToPayWidgetView.getBadgeView(), item.getBadge(), this.actionHandler);
        bindCounter(item);
        ViewExtKt.setOnClickListenerThrottle$default(this.view, 0L, new ProductsToPayWidgetViewHolder$bind$1$1(item, this), 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductsToPayVO item, @NotNull c trackingData, f viewedPond) {
        TextDTO countValue;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        t mapToTokenizedEvent$default2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ProductsToPayWidgetViewHolder) item, trackingData, viewedPond);
        CommonControlSettings common = item.getCommon();
        if (common != null && (trackingInfo2 = common.getTrackingInfo()) != null && (mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(item.getId()), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default2, null, 2, null);
        }
        ProductsToPayVO.ProductCounterVO productCounter = item.getProductCounter();
        if (productCounter == null || (countValue = productCounter.getCountValue()) == null || (trackingInfo = countValue.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }
}
