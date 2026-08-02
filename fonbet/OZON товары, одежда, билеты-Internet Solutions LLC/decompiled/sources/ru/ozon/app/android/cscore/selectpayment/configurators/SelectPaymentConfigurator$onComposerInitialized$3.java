package ru.ozon.app.android.cscore.selectpayment.configurators;

import GZ.g;
import Sc.o;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectPaymentConfigurator$onComposerInitialized$3 extends AbstractC7737t implements Function1<SelectPaymentViewModel.Action, Unit> {
    final /* synthetic */ SelectPaymentConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectPaymentConfigurator$onComposerInitialized$3(SelectPaymentConfigurator selectPaymentConfigurator) {
        super(1);
        this.this$0 = selectPaymentConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SelectPaymentViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SelectPaymentViewModel.Action action) {
        InterfaceC7851b controller;
        g gVar;
        InterfaceC7851b controller2;
        if (action instanceof SelectPaymentViewModel.Action.Success) {
            SelectPaymentViewModel.Action.Success success = (SelectPaymentViewModel.Action.Success) action;
            this.this$0.successRefreshDeeplink = success.getSuccessRefreshDeeplink();
            gVar = this.this$0.ozonRouter;
            gVar.b(success.getDeeplink(), 884, U.c());
            ConfiguratorReferences references = this.this$0.getReferences();
            if (references == null || (controller2 = references.getController()) == null) {
                return;
            }
            controller2.hideLoader();
            return;
        }
        if (action instanceof SelectPaymentViewModel.Action.Error) {
            this.this$0.handleError(((SelectPaymentViewModel.Action.Error) action).getMessage());
            return;
        }
        if (!(action instanceof SelectPaymentViewModel.Action.Loading)) {
            throw new o();
        }
        ConfiguratorReferences references2 = this.this$0.getReferences();
        if (references2 == null || (controller = references2.getController()) == null) {
            return;
        }
        controller.e(new l.a.C1079a(0L, null, 3));
    }
}
