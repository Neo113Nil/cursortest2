package ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshSelectedProductsWithLinkHandler;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshWithStateHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ProductsToPayCellViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ProductsToPayCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsToPayCellViewHolder$actionHandler$1(ProductsToPayCellViewHolder productsToPayCellViewHolder) {
        super(1);
        this.this$0 = productsToPayCellViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        RefreshWithStateHandler refreshWithStateHandler;
        Long widgetId;
        RefreshSelectedProductsWithLinkHandler refreshSelectedProductsWithLinkHandler;
        Long widgetId2;
        Intrinsics.checkNotNullParameter(it, "it");
        refreshWithStateHandler = this.this$0.refreshWithStateHandler;
        widgetId = this.this$0.getWidgetId();
        refreshWithStateHandler.handle(it, widgetId);
        refreshSelectedProductsWithLinkHandler = this.this$0.refreshSelectedProductsWithLinkHandler;
        widgetId2 = this.this$0.getWidgetId();
        refreshSelectedProductsWithLinkHandler.handle(it, widgetId2);
    }
}
