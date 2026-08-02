package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshSelectedProductsWithLinkHandler;
import ru.ozon.app.android.orderdetails.productsToPay.RefreshWithStateHandler;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.view.ProductToPayWidgetView;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProductsToPayViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProductsToPayWidgetViewHolder> {
    final /* synthetic */ ProductsToPayViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsToPayViewMapper$holderProducer$1(ProductsToPayViewMapper productsToPayViewMapper) {
        super(2);
        this.this$0 = productsToPayViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductsToPayWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new ProductsToPayWidgetViewHolder((ProductToPayWidgetView) view, new RefreshWithStateHandler(refs, this.this$0.component().getTokenizedAnalytics()), new RefreshSelectedProductsWithLinkHandler(refs, this.this$0.component().getTokenizedAnalytics()), this.this$0.component().getAdultDelegate(), this.this$0.component().getTokenizedAnalytics(), refs);
    }
}
