package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV3View$bind$1$onClickCallback$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DeliveryWidgetV3VO $this_with;
    final /* synthetic */ DeliveryWidgetV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3View$bind$1$onClickCallback$1(DeliveryWidgetV3View deliveryWidgetV3View, DeliveryWidgetV3VO deliveryWidgetV3VO) {
        super(0);
        this.this$0 = deliveryWidgetV3View;
        this.$this_with = deliveryWidgetV3VO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.onClick;
        if (function1 != null) {
            function1.invoke(this.$this_with.getAction());
        }
    }
}
