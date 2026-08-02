package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV3OverlayViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ DeliveryWidgetV3OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3OverlayViewHolder$onWidgetCreated$2(DeliveryWidgetV3OverlayViewHolder deliveryWidgetV3OverlayViewHolder) {
        super(1);
        this.this$0 = deliveryWidgetV3OverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 actionHandler;
        t tokenizedEvent;
        l tokenizedAnalytics;
        Intrinsics.checkNotNullParameter(action, "action");
        actionHandler = this.this$0.getActionHandler();
        actionHandler.invoke(action);
        DeliveryWidgetV3VO deliveryWidgetV3VO = (DeliveryWidgetV3VO) this.this$0.getBoundData();
        if (deliveryWidgetV3VO == null || (tokenizedEvent = deliveryWidgetV3VO.getTokenizedEvent()) == null) {
            return;
        }
        tokenizedAnalytics = this.this$0.getTokenizedAnalytics();
        m.a(tokenizedAnalytics, tokenizedEvent, null);
    }
}
