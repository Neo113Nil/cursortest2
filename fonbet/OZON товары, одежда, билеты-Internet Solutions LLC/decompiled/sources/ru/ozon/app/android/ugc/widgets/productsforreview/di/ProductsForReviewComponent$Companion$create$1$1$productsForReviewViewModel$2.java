package ru.ozon.app.android.ugc.widgets.productsforreview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductsForReviewViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPc/a;", "Lru/ozon/app/android/ugc/widgets/productsforreview/presentation/ProductsForReviewViewModel;", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductsForReviewComponent$Companion$create$1$1$productsForReviewViewModel$2 extends AbstractC7737t implements Function0<Pc.a<ProductsForReviewViewModel>> {
    final /* synthetic */ ProductsForReviewComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewComponent$Companion$create$1$1$productsForReviewViewModel$2(ProductsForReviewComponent$Companion$create$1$1 productsForReviewComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = productsForReviewComponent$Companion$create$1$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductsForReviewViewModel invoke$lambda$0(ProductsForReviewComponent$Companion$create$1$1 productsForReviewComponent$Companion$create$1$1) {
        ActionComponentApi actionComponentApi;
        actionComponentApi = productsForReviewComponent$Companion$create$1$1.actionComponentApi;
        return new ProductsForReviewViewModel(actionComponentApi.getActionRepository());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<ProductsForReviewViewModel> invoke() {
        final ProductsForReviewComponent$Companion$create$1$1 productsForReviewComponent$Companion$create$1$1 = this.this$0;
        return new Pc.a() { // from class: ru.ozon.app.android.ugc.widgets.productsforreview.di.a
            @Override // Pc.a
            public final Object get() {
                ProductsForReviewViewModel invoke$lambda$0;
                invoke$lambda$0 = ProductsForReviewComponent$Companion$create$1$1$productsForReviewViewModel$2.invoke$lambda$0(ProductsForReviewComponent$Companion$create$1$1.this);
                return invoke$lambda$0;
            }
        };
    }
}
