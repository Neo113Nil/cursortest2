package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductInfoView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductInfoView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryView$productInfoViewDelegate$1 extends AbstractC7737t implements Function0<ProductInfoView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewGalleryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryView$productInfoViewDelegate$1(Context context, ReviewGalleryView reviewGalleryView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewGalleryView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductInfoView invoke() {
        boolean z11;
        ReviewGalleryView.Companion companion;
        Context context = this.$context;
        z11 = this.this$0.isFreshMiniApp;
        ProductInfoView productInfoView = new ProductInfoView(context, z11);
        productInfoView.setId(R$id.reviewGalleryProductInfoView);
        companion = ReviewGalleryView.Companion;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, companion.getNewProductViewHeight());
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = R$id.contentContainer;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = dimens.getDP_16();
        bVar.setMarginStart(dimens.getDP_16());
        bVar.setMarginEnd(dimens.getDP_16());
        productInfoView.setLayoutParams(bVar);
        this.this$0.addView(productInfoView);
        return productInfoView;
    }
}
