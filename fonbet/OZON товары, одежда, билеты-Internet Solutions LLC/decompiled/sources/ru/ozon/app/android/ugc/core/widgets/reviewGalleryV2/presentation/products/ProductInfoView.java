package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import B3.D;
import Lc.a;
import Sc.InterfaceC4008j;
import W10.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductInfoView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ{\u0010\"\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#JE\u0010*\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00105Jq\u00109\u001a\u00020\n2\u0006\u00108\u001a\u0002072\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "", "isFreshMiniApp", "<init>", "(Landroid/content/Context;Z)V", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "", "bindPrice", "(Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "", "buttons", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favDelegateFactory", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "", "widgetId", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "bindButtons", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;LW10/c;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/lang/Long;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "bindClick", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "itemBackground", "setBackgroundIfNeeded", "(Ljava/lang/String;)V", "", "bgColor", "Landroid/graphics/drawable/Drawable;", "createProductBackground", "(I)Landroid/graphics/drawable/Drawable;", "setupConstraintsWithPrice", "()V", "setupConstraintsWithoutPrice", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO$ProductInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/composer/ui/widget/l;LW10/c;LWZ/l;Ljava/lang/Long;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;)V", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "productMediaView", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "LSc/j;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout;", "buttonsLayout$delegate", "getButtonsLayout", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout;", "buttonsLayout", "lastBackgroundColor", "Ljava/lang/Integer;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ProductInfoView extends ConstraintLayout {

    /* renamed from: buttonsLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsLayout;
    private Integer lastBackgroundColor;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    @NotNull
    private final ProductMediaView productMediaView;

    @NotNull
    private final TextAtomV2View textView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(12);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView$Companion;", "", "<init>", "()V", "CORNER_RADIUS", "", "getCORNER_RADIUS", "()F", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCORNER_RADIUS() {
            return ProductInfoView.CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductInfoView(@NotNull Context context, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
        productMediaView.setId(R$id.reviewGalleryProductMediaView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        productMediaView.setLayoutParams(bVar);
        addView(productMediaView);
        this.productMediaView = productMediaView;
        this.priceView = LazyUtilsKt.unsafeLazy(new ProductInfoView$priceView$2(context, this));
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(textAtomV2View, R$id.reviewGalleryTextView, 0, -2, false);
        addView(textAtomV2View);
        this.textView = textAtomV2View;
        this.buttonsLayout = LazyUtilsKt.unsafeLazy(new ProductInfoView$buttonsLayout$2(context, this));
        Dimens dimens = Dimens.INSTANCE;
        int dp_5 = z11 ? dimens.getDP_5() : dimens.getDP_6();
        Dimens dimens2 = Dimens.INSTANCE;
        setPadding(dimens2.getDP_6(), dp_5, dimens2.getDP_10(), dp_5);
    }

    private final void bindButtons(List<? extends Object> buttons, Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, c trackingData, l viewItem, Function1<? super AtomAction, Unit> actionHandler, WZ.l analytics, Long widgetId, ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder) {
        List<? extends Object> list = buttons;
        if (list != null && !list.isEmpty()) {
            getButtonsLayout().bind(buttons, favDelegateFactory, trackingData, viewItem, analytics, widgetId, actionHandler, cartButtonContainerBinder);
        } else {
            getButtonsLayout().clear();
            ViewExtKt.gone(getButtonsLayout());
        }
    }

    private final void bindClick(final AtomActionDTO action, final Map<String, TokenizedTrackingInfo> trackingInfo, final Function1<? super AtomAction, Unit> actionHandler) {
        if (action != null) {
            setOnClickListener(new View.OnClickListener() { // from class: eV.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductInfoView.bindClick$lambda$4(actionHandler, action, trackingInfo, view);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindClick$lambda$4(Function1 function1, AtomActionDTO atomActionDTO, Map map, View view) {
        if (function1 != null) {
            function1.invoke(AtomActionMapperKt.toAtomAction(atomActionDTO, map));
        }
    }

    private final void bindPrice(PriceDTO price) {
        PriceAtomHolderKt.bindOrGone$default(getPriceView(), price, null, 2, null);
        if (price != null) {
            setupConstraintsWithPrice();
        } else {
            setupConstraintsWithoutPrice();
        }
    }

    private final Drawable createProductBackground(int bgColor) {
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(CORNER_RADIUS);
        b11.setColor(bgColor);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true);
        return new RippleDrawable(ColorStateList.valueOf(typedValue.data), b11, null);
    }

    private final ProductButtonsLayout getButtonsLayout() {
        return (ProductButtonsLayout) this.buttonsLayout.getValue();
    }

    private final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue();
    }

    private final void setBackgroundIfNeeded(String itemBackground) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, itemBackground);
        int intValue = parseColor != null ? parseColor.intValue() : androidx.core.content.a.getColor(getContext(), R$color.oz_semantic_accent_feed_2);
        Integer num = this.lastBackgroundColor;
        if (num != null && num.intValue() == intValue) {
            return;
        }
        setBackground(createProductBackground(intValue));
        this.lastBackgroundColor = Integer.valueOf(intValue);
    }

    private final void setupConstraintsWithPrice() {
        PriceAtomView priceView = getPriceView();
        ViewGroup.LayoutParams layoutParams = priceView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41655s = this.productMediaView.getId();
        bVar.f41657u = getButtonsLayout().getId();
        bVar.f41636i = 0;
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMarginEnd(dimens.getDP_8());
        bVar.setMarginStart(dimens.getDP_8());
        priceView.setLayoutParams(bVar);
        TextAtomV2View textAtomV2View = this.textView;
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41655s = this.productMediaView.getId();
        bVar2.f41657u = getButtonsLayout().getId();
        bVar2.f41638j = getPriceView().getId();
        bVar2.f41642l = 0;
        bVar2.setMarginEnd(dimens.getDP_8());
        bVar2.setMarginStart(dimens.getDP_8());
        textAtomV2View.setLayoutParams(bVar2);
    }

    private final void setupConstraintsWithoutPrice() {
        TextAtomV2View textAtomV2View = this.textView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41655s = this.productMediaView.getId();
        bVar.f41657u = getButtonsLayout().getId();
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41599F = 0.5f;
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMarginEnd(dimens.getDP_8());
        bVar.setMarginStart(dimens.getDP_8());
        textAtomV2View.setLayoutParams(bVar);
    }

    public final void bind(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo item, Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, l viewItem, @NotNull c trackingData, WZ.l analytics, Long widgetId, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(favDelegateFactory, "favDelegateFactory");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
        ProductMediaHolderKt.bind$default(this.productMediaView, item.getProductMedia(), null, 2, null);
        TextHolderKt.bind$default(this.textView, item.getText(), null, 2, null);
        setBackgroundIfNeeded(item.getBackgroundColor());
        bindPrice(item.getPrice());
        bindButtons(item.getProductButtons(), favDelegateFactory, trackingData, viewItem, actionHandler, analytics, widgetId, cartButtonContainerBinder);
        bindClick(item.getAction(), item.getTrackingInfo(), actionHandler);
    }
}
