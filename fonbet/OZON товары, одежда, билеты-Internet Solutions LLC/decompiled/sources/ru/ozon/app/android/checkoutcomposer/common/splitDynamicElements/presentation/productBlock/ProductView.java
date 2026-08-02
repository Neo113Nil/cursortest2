package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPositionKt;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013J.\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00142\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0002J#\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u0010\u001cR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "promoIconView", "bindOrGone", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "onShowTooltip", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "showTooltip", "tooltip", "bindPromoIcon", "promoIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;)Lkotlin/Unit;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductView extends FrameLayout {
    public static final int $stable = IconView.$stable;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final IconView promoIconView;

    public /* synthetic */ ProductView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final Unit bindPromoIcon(IconDTO promoIcon, PromoIconPosition promoIconPosition) {
        IconView iconView = this.promoIconView;
        IconHolderKt.bindOrGone$default(iconView, promoIcon, null, 2, null);
        if (promoIcon == null) {
            return null;
        }
        PromoIconPositionKt.setupPromoIconGravity(iconView, promoIconPosition);
        return Unit.f71690a;
    }

    private final void showTooltip(final DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip tooltip, final Function2<? super DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> onShowTooltip) {
        IconView iconView = this.iconView;
        if (!iconView.isLaidOut() || iconView.isLayoutRequested()) {
            iconView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock.ProductView$showTooltip$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int[] iArr = new int[2];
                    ProductView.this.iconView.getLocationOnScreen(iArr);
                    Integer E11 = C7705l.E(iArr);
                    if (E11 != null) {
                        int intValue = (ProductView.this.getContext().getResources().getDisplayMetrics().widthPixels - E11.intValue()) - (ProductView.this.iconView.getWidth() / 2);
                        Function2 function2 = onShowTooltip;
                        if (function2 != null) {
                            function2.invoke(tooltip, Integer.valueOf(intValue));
                        }
                    }
                }
            });
            return;
        }
        int[] iArr = new int[2];
        this.iconView.getLocationOnScreen(iArr);
        Integer E11 = C7705l.E(iArr);
        if (E11 != null) {
            int intValue = (getContext().getResources().getDisplayMetrics().widthPixels - E11.intValue()) - (this.iconView.getWidth() / 2);
            if (onShowTooltip != null) {
                onShowTooltip.invoke(tooltip, Integer.valueOf(intValue));
            }
        }
    }

    public final void bindOrGone(DynamicElementDTO.ProductsBlockDTO.PromotedProduct product, Function2<? super DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> onShowTooltip) {
        if (product == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        IconHolderKt.bind$default(this.iconView, product.getImage(), null, 2, null);
        String text = product.getImage().getText();
        if (text != null) {
            this.iconView.setContentDescription(text);
        }
        bindPromoIcon(product.getPromoIcon(), product.getPromoIconPosition());
        DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip tooltip = product.getTooltip();
        if (tooltip != null) {
            showTooltip(tooltip, onShowTooltip);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.icon);
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(iconView);
        this.iconView = iconView;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        iconView2.setId(R$id.promoIcon);
        iconView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(iconView2);
        this.promoIconView = iconView2;
    }
}
