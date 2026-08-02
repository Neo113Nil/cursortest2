package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.feature.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductV2View$bottomDynamicElementsRv$2 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ProductV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductV2View$bottomDynamicElementsRv$2(Context context, ProductV2View productV2View) {
        super(0);
        this.$context = context;
        this.this$0 = productV2View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        RecyclerView recyclerView = new RecyclerView(this.$context);
        ProductV2View productV2View = this.this$0;
        recyclerView.setId(R$id.CartProductBottomDynamicElementsRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = productV2View.getBottomBarrier().getId();
        recyclerView.setLayoutParams(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        this.this$0.addView(recyclerView);
        return recyclerView;
    }
}
