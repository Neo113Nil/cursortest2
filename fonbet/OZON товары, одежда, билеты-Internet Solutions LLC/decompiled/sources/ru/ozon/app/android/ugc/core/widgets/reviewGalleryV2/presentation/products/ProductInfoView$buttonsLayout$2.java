package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductInfoView$buttonsLayout$2 extends AbstractC7737t implements Function0<ProductButtonsLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ProductInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductInfoView$buttonsLayout$2(Context context, ProductInfoView productInfoView) {
        super(0);
        this.$context = context;
        this.this$0 = productInfoView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductButtonsLayout invoke() {
        ProductButtonsLayout productButtonsLayout = new ProductButtonsLayout(this.$context);
        productButtonsLayout.setId(R$id.reviewGalleryButtonsLayout);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        productButtonsLayout.setLayoutParams(bVar);
        this.this$0.addView(productButtonsLayout);
        return productButtonsLayout;
    }
}
