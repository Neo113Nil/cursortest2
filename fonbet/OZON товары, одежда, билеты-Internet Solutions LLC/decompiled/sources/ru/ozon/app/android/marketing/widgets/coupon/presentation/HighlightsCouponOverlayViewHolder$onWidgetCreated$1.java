package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HighlightsCouponOverlayViewHolder$onWidgetCreated$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HighlightsCouponOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsCouponOverlayViewHolder$onWidgetCreated$1(HighlightsCouponOverlayViewHolder highlightsCouponOverlayViewHolder) {
        super(0);
        this.this$0 = highlightsCouponOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction action;
        Function1 function1;
        CouponVO boundData = this.this$0.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        function1 = this.this$0.actionHandler;
        function1.invoke(action);
    }
}
