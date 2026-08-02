package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.DiscountViewContainerLayout;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DiscountViewContainerLayout$DiscountViewLayoutHolder$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ WannaDiscountV2VO.Discount $item;
    final /* synthetic */ DiscountViewContainerLayout this$0;
    final /* synthetic */ DiscountViewContainerLayout.DiscountViewLayoutHolder this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscountViewContainerLayout$DiscountViewLayoutHolder$bind$1(WannaDiscountV2VO.Discount discount, DiscountViewContainerLayout discountViewContainerLayout, DiscountViewContainerLayout.DiscountViewLayoutHolder discountViewLayoutHolder) {
        super(1);
        this.$item = discount;
        this.this$0 = discountViewContainerLayout;
        this.this$1 = discountViewLayoutHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r0 = r2.this$0.discountClickListener;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction it) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$item.getDiscount().isSelected() || function2 == null) {
            return;
        }
        function2.invoke(Integer.valueOf(this.this$1.getPosition()), it);
    }
}
