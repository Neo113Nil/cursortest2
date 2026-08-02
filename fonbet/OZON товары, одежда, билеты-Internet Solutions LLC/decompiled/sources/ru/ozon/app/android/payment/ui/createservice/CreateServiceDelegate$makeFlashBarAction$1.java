package ru.ozon.app.android.payment.ui.createservice;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CreateServiceDelegate$makeFlashBarAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CreateServiceDO.CreateServiceError $error;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ CreateServiceDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateServiceDelegate$makeFlashBarAction$1(CreateServiceDelegate createServiceDelegate, CreateServiceDO.CreateServiceError createServiceError, l lVar, Long l11) {
        super(0);
        this.this$0 = createServiceDelegate;
        this.$error = createServiceError;
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
        InterfaceC7851b interfaceC7851b;
        interfaceC7851b = this.this$0.composerController;
        InterfaceC7851b.a.a(interfaceC7851b, this.$error.getAction().getLink(), null, null, null, 14);
        this.this$0.sendClickEvent(this.$tokenizedAnalytics, this.$error.getTrackingInfo(), this.$widgetId);
    }
}
