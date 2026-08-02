package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper.CouponGoalsV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponGoalItemViewHolder$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CouponGoalsV2VO.CouponGoalItemVO $item;
    final /* synthetic */ CouponGoalItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponGoalItemViewHolder$bind$1$1(CouponGoalItemViewHolder couponGoalItemViewHolder, CouponGoalsV2VO.CouponGoalItemVO couponGoalItemVO) {
        super(0);
        this.this$0 = couponGoalItemViewHolder;
        this.$item = couponGoalItemVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.actionHandler;
        function1.invoke(this.$item.getAction());
    }
}
