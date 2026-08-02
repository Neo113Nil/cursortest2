package ru.ozon.app.android.payment.ui.updateOrderC2C;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UpdateOrderC2CConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<UpdateOrderC2CEvent, Unit> {
    final /* synthetic */ ConfiguratorReferences $references;
    final /* synthetic */ UpdateOrderC2CConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateOrderC2CConfigurator$onComposerInitialized$2(UpdateOrderC2CConfigurator updateOrderC2CConfigurator, ConfiguratorReferences configuratorReferences) {
        super(1);
        this.this$0 = updateOrderC2CConfigurator;
        this.$references = configuratorReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpdateOrderC2CEvent updateOrderC2CEvent) {
        invoke2(updateOrderC2CEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UpdateOrderC2CEvent updateOrderC2CEvent) {
        UpdateOrderC2CDelegate updateOrderC2CDelegate;
        updateOrderC2CDelegate = this.this$0.updateOrderC2CDelegate;
        if (updateOrderC2CDelegate != null) {
            Intrinsics.f(updateOrderC2CEvent);
            updateOrderC2CDelegate.processEvent(updateOrderC2CEvent, this.$references.getTokenizedAnalytics());
        }
    }
}
