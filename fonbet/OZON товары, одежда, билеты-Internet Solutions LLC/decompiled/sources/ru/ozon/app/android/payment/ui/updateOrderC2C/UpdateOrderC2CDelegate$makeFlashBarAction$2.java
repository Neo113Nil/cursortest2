package ru.ozon.app.android.payment.ui.updateOrderC2C;

import GZ.g;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UpdateOrderC2CDelegate$makeFlashBarAction$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ UpdateOrderDO.UpdateOrderError $error;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ UpdateOrderC2CDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateOrderC2CDelegate$makeFlashBarAction$2(UpdateOrderDO.UpdateOrderError updateOrderError, UpdateOrderC2CDelegate updateOrderC2CDelegate, l lVar, Long l11) {
        super(0);
        this.$error = updateOrderError;
        this.this$0 = updateOrderC2CDelegate;
        this.$tokenizedAnalytics = lVar;
        this.$widgetId = l11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        String link = this.$error.getAction().getLink();
        if (link != null) {
            gVar = this.this$0.router;
            g.a.a(gVar, link, null, null, 6);
        }
        this.this$0.sendClickEvent(this.$tokenizedAnalytics, this.$error.getTrackingInfo(), this.$widgetId);
    }
}
