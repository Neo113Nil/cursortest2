package ru.ozon.app.android.cscore.orderTracking.configurators.updater;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.orderTracking.viewmodels.OrderTrackingV4ViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cscore/orderTracking/viewmodels/OrderTrackingV4ViewModel$OrderTrackingV4ViewModelAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BaseOrderTrackingV4UpdaterConfigurator$onCreate$2 extends AbstractC7737t implements Function1<OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction, Unit> {
    final /* synthetic */ BaseOrderTrackingV4UpdaterConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseOrderTrackingV4UpdaterConfigurator$onCreate$2(BaseOrderTrackingV4UpdaterConfigurator baseOrderTrackingV4UpdaterConfigurator) {
        super(1);
        this.this$0 = baseOrderTrackingV4UpdaterConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction orderTrackingV4ViewModelAction) {
        invoke2(orderTrackingV4ViewModelAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction orderTrackingV4ViewModelAction) {
        this.this$0.setConfiguratorEnabled(true);
        if (orderTrackingV4ViewModelAction instanceof OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.LoadNewItems) {
            this.this$0.lastUpdateAction = ((OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.LoadNewItems) orderTrackingV4ViewModelAction).getAction();
            this.this$0.refreshDataOrScreenIfNeed();
        } else {
            if (orderTrackingV4ViewModelAction instanceof OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.EnableConfigurator) {
                return;
            }
            if (!(orderTrackingV4ViewModelAction instanceof OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.SetUpUpdateAction)) {
                throw new o();
            }
            this.this$0.lastUpdateAction = ((OrderTrackingV4ViewModel.OrderTrackingV4ViewModelAction.SetUpUpdateAction) orderTrackingV4ViewModelAction).getAction();
        }
    }
}
