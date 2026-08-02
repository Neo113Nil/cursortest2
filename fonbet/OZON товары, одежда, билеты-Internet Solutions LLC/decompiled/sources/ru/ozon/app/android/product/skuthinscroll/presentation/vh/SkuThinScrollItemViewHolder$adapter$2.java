package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tileContentItems.TileContentItemsAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/tileContentItems/TileContentItemsAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SkuThinScrollItemViewHolder$adapter$2 extends AbstractC7737t implements Function0<TileContentItemsAdapter> {
    final /* synthetic */ SkuThinScrollItemViewHolder<VB> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuThinScrollItemViewHolder$adapter$2(SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder) {
        super(0);
        this.this$0 = skuThinScrollItemViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(SkuThinScrollItemViewHolder skuThinScrollItemViewHolder, View view) {
        X4.a aVar;
        aVar = skuThinScrollItemViewHolder.binding;
        aVar.getConstraintLayout().performClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileContentItemsAdapter invoke() {
        Function1 function1;
        function1 = ((SkuThinScrollItemViewHolder) this.this$0).actionHandler;
        TileContentItemsAdapter tileContentItemsAdapter = new TileContentItemsAdapter(function1);
        final SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder = this.this$0;
        skuThinScrollItemViewHolder.getStateElementsRv().setItemAnimator(null);
        skuThinScrollItemViewHolder.getStateElementsRv().addItemDecoration(new AdditionalItemsPaddingDecoration());
        skuThinScrollItemViewHolder.getStateElementsRv().setAdapter(tileContentItemsAdapter);
        skuThinScrollItemViewHolder.getStateElementsView().setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.product.skuthinscroll.presentation.vh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkuThinScrollItemViewHolder$adapter$2.invoke$lambda$1$lambda$0(SkuThinScrollItemViewHolder.this, view);
            }
        });
        return tileContentItemsAdapter;
    }
}
