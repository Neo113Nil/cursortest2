package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductItemViewHolder$bind$1$4 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$bind$1$4(ProductItemViewHolder productItemViewHolder) {
        super(1);
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(action, "action");
        function2 = this.this$0.cellActionHandler;
        if (function2 != null) {
            RateItemsV2VO.RateItemVO.RateProductItemVO item = this.this$0.getItem();
            String sku = item != null ? item.getSku() : null;
            if (sku == null) {
                sku = "";
            }
            function2.invoke(action, sku);
        }
    }
}
