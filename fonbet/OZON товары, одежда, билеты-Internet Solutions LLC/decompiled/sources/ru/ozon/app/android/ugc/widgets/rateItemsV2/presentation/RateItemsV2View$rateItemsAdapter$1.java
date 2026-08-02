package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$rateItemsAdapter$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onTimerFinish;
    final /* synthetic */ RateItemsV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RateItemsV2View$rateItemsAdapter$1(Function2<? super Boolean, ? super Boolean, Unit> function2, RateItemsV2View rateItemsV2View) {
        super(0);
        this.$onTimerFinish = function2;
        this.this$0 = rateItemsV2View;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RateItemsV2BottomBehavior rateItemsV2BottomBehavior;
        Function2<Boolean, Boolean, Unit> function2 = this.$onTimerFinish;
        Boolean valueOf = Boolean.valueOf(this.this$0.rateItemsDelegate.isDismissed(this.this$0.widgetPageKey));
        rateItemsV2BottomBehavior = this.this$0.behavior;
        function2.invoke(valueOf, Boolean.valueOf(rateItemsV2BottomBehavior.getState() == 5));
    }
}
