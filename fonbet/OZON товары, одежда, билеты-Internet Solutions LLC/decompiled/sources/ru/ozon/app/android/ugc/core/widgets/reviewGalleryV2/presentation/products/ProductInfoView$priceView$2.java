package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductInfoView$priceView$2 extends AbstractC7737t implements Function0<PriceAtomView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ProductInfoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductInfoView$priceView$2(Context context, ProductInfoView productInfoView) {
        super(0);
        this.$context = context;
        this.this$0 = productInfoView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriceAtomView invoke() {
        PriceAtomView priceAtomView = new PriceAtomView(this.$context, null, 0, 6, null);
        priceAtomView.setId(R$id.reviewGalleryPriceView);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.this$0.addView(priceAtomView);
        return priceAtomView;
    }
}
