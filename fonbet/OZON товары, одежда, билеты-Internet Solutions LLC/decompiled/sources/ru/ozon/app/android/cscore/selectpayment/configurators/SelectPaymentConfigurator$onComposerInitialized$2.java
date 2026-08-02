package ru.ozon.app.android.cscore.selectpayment.configurators;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectPaymentConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<ActionButtonViewModel.Action, Unit> {
    final /* synthetic */ SelectPaymentConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectPaymentConfigurator$onComposerInitialized$2(SelectPaymentConfigurator selectPaymentConfigurator) {
        super(1);
        this.this$0 = selectPaymentConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionButtonViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionButtonViewModel.Action action) {
        if (action instanceof ActionButtonViewModel.Action.Success) {
            this.this$0.nextPage(action);
        } else {
            if (!(action instanceof ActionButtonViewModel.Action.Error)) {
                throw new o();
            }
            String message = ((ActionButtonViewModel.Action.Error) action).getMessage();
            if (message != null) {
                this.this$0.handleError(message);
            }
        }
    }
}
