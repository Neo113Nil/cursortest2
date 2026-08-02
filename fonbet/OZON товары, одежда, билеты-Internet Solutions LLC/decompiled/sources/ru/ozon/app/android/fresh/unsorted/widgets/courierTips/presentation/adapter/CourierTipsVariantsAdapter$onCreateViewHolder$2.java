package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.adapter.CourierTipsVariantsAdapter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CourierTipsVariantsAdapter$onCreateViewHolder$2 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ CourierTipsVariantsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsVariantsAdapter$onCreateViewHolder$2(CourierTipsVariantsAdapter courierTipsVariantsAdapter) {
        super(1);
        this.this$0 = courierTipsVariantsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        int i12;
        Function1 function1;
        CourierTipsVO.CourierTipsVariant item;
        CourierTipsVariantsAdapter courierTipsVariantsAdapter = this.this$0;
        i12 = courierTipsVariantsAdapter.selectedVariantPosition;
        courierTipsVariantsAdapter.notifyItemChanged(i12, CourierTipsVariantsAdapter.PayloadType.UNSELECT);
        this.this$0.selectedVariantPosition = i11;
        function1 = this.this$0.onVariantSelected;
        item = this.this$0.getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "access$getItem(...)");
        function1.invoke(item);
    }
}
