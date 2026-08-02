package ru.ozon.app.android.ugc.widgets.productsforreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.data.ReviewProductMapper;
import ru.ozon.app.android.ugc.widgets.productsforreview.data.ProductsForReviewMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/productsforreview/data/ProductsForReviewMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductsForReviewComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<ProductsForReviewMapper> {
    final /* synthetic */ ProductsForReviewComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewComponent$Companion$create$1$1$mapper$2(ProductsForReviewComponent$Companion$create$1$1 productsForReviewComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = productsForReviewComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductsForReviewMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        ReviewProductMapper reviewProductMapper = new ReviewProductMapper();
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new ProductsForReviewMapper(reviewProductMapper, contextComponentDependencies.getContext());
    }
}
