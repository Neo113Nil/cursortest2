package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductItemViewHolder$rootCallback$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$rootCallback$1(ProductItemViewHolder productItemViewHolder) {
        super(0);
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtomAction action;
        Function1 function1;
        RateItemsV2VO.RateItemVO.RateProductItemVO item = this.this$0.getItem();
        if (item == null || (action = item.getAction()) == null) {
            return null;
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
        return Unit.f71690a;
    }
}
