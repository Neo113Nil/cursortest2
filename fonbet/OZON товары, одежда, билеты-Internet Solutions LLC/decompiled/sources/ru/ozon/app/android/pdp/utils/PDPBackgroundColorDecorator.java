package ru.ozon.app.android.pdp.utils;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.infoSimpleText.presentation.AspectsV4InfoSimpleTextViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.presentation.AspectsV4MarkdownReasonWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageListViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.button.ButtonBrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell.DsCellBrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.original.OriginalBrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.simple.SimpleBrandViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.footer.DeliveryV6FooterViewHolder;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.InstallmentPeriodsViewHolder;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.title.InstallmentTitleViewHolder;
import ru.ozon.app.android.pdp.widgets.nutritionInfoV2.presentation.NutritionInfoV2ViewHolder;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation.PreOrderSubscriptionButtonViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info.PriceV2InfoWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity.PriceV2MultiplicityWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price.PriceV2MainPriceWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.separator.PriceV2SeparatorViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom.PriceV4BottomViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopWithBadgeViewHolder;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.billboard.RichContentBillboardWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderVH;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7IslandsCellVH;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7SimpleCellVH;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7SimpleHeaderVH;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.SellerSortSwitcherViewHolder;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateButtonViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "Ljava/lang/Class;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "viewHolders", "Ljava/util/Set;", "", "backgroundColor$delegate", "LSc/j;", "getBackgroundColor", "()I", "backgroundColor", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "rect$delegate", "getRect", "()Landroid/graphics/Rect;", "rect", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PDPBackgroundColorDecorator extends RecyclerView.n {

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paint;

    /* renamed from: rect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rect;

    @NotNull
    private final Set<Class<? extends k<? extends c>>> viewHolders;

    public PDPBackgroundColorDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Class[] elements = {PriceV4TopViewHolder.class, PriceV4TopWithBadgeViewHolder.class, PriceV4BottomViewHolder.class, PriceV2MainPriceWidgetViewHolder.class, PriceV2InfoWidgetViewHolder.class, PriceV2MultiplicityWidgetViewHolder.class, PriceV2SeparatorViewHolder.class, InstallmentPurchaseWidgetViewHolder.class, InstallmentPeriodsViewHolder.class, AspectsV4ImageListViewHolder.class, AspectsV4InfoWidgetViewHolder.class, AspectsV4InfoSimpleTextViewHolder.class, AspectsV4MarkdownReasonWidgetViewHolder.class, AspectsV4SizeWidgetViewHolder.class, AspectsCompactV2BaseViewHolder.class, AspectCompactV2FooterWidgetViewHolder.class, SellerV7HeaderVH.class, SellerV7IslandsCellVH.class, NutritionInfoV2ViewHolder.class, OutOfStockViewHolder.class, PriceCellViewHolder.class, ButtonBrandViewHolder.class, DsCellBrandViewHolder.class, SimpleBrandViewHolder.class, OriginalBrandViewHolder.class, RichContentBillboardWidgetViewHolder.class, SellerV7SimpleHeaderVH.class, SellerV7SimpleCellVH.class, TranslateButtonViewHolder.class, SellerV7SimpleCellVH.class, PreOrderSubscriptionButtonViewHolder.class, SellerSortSwitcherViewHolder.class, DeliveryV6FooterViewHolder.class, InstallmentTitleViewHolder.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.viewHolders = C7705l.j0(elements);
        this.backgroundColor = LazyUtilsKt.unsafeLazy(new PDPBackgroundColorDecorator$backgroundColor$2(context));
        this.paint = LazyUtilsKt.unsafeLazy(new PDPBackgroundColorDecorator$paint$2(this));
        this.rect = LazyUtilsKt.unsafeLazy(PDPBackgroundColorDecorator$rect$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBackgroundColor() {
        return ((Number) this.backgroundColor.getValue()).intValue();
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    private final Rect getRect() {
        return (Rect) this.rect.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (C7714v.A(this.viewHolders, parent.getChildViewHolder(view).getClass())) {
                parent.getDecoratedBoundsWithMargins(view, getRect());
                Rect rect = getRect();
                rect.left = 0;
                rect.right = parent.getWidth();
                canvas.drawRect(rect, getPaint());
            }
        }
    }
}
