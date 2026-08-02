package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutTotalView$priceBlocks$2 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckoutTotalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutTotalView$priceBlocks$2(Context context, CheckoutTotalView checkoutTotalView) {
        super(0);
        this.$context = context;
        this.this$0 = checkoutTotalView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        CheckoutTotalView.Companion companion;
        RecyclerView recyclerView = new RecyclerView(this.$context);
        Context context = this.$context;
        recyclerView.setId(R$id.checkoutTotalPrices);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41638j = R$id.checkoutTotalBarrier;
        companion = CheckoutTotalView.Companion;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = companion.getPricesVerticalMargin();
        bVar.f41634h = 0;
        bVar.f41628e = 0;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        this.this$0.addView(recyclerView);
        return recyclerView;
    }
}
