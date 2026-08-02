package ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshSelectedProductsWithLinkHandler;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshWithStateHandler;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewItem.ProductsToPayCellVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewHolder/ProductsToPayCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewItem/ProductsToPayCellVO;", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;", "refreshWithStateHandler", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;", "refreshSelectedProductsWithLinkHandler", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewItem/ProductsToPayCellVO;Ll20/d;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshWithStateHandler;", "Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "getWidgetId", "()Ljava/lang/Long;", "widgetId", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductsToPayCellViewHolder extends k<ProductsToPayCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RefreshSelectedProductsWithLinkHandler refreshSelectedProductsWithLinkHandler;

    @NotNull
    private final RefreshWithStateHandler refreshWithStateHandler;

    @NotNull
    private final CellView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsToPayCellViewHolder(@NotNull CellView view, @NotNull ComposerReferences refs, @NotNull RefreshWithStateHandler refreshWithStateHandler, @NotNull RefreshSelectedProductsWithLinkHandler refreshSelectedProductsWithLinkHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(refreshWithStateHandler, "refreshWithStateHandler");
        Intrinsics.checkNotNullParameter(refreshSelectedProductsWithLinkHandler, "refreshSelectedProductsWithLinkHandler");
        this.view = view;
        this.refreshWithStateHandler = refreshWithStateHandler;
        this.refreshSelectedProductsWithLinkHandler = refreshSelectedProductsWithLinkHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new ProductsToPayCellViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getWidgetId() {
        ProductsToPayCellVO boundData = getBoundData();
        if (boundData != null) {
            return Long.valueOf(boundData.getId());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductsToPayCellVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellHolderKt.bind(this.view, item.getCell(), this.actionHandler);
    }
}
