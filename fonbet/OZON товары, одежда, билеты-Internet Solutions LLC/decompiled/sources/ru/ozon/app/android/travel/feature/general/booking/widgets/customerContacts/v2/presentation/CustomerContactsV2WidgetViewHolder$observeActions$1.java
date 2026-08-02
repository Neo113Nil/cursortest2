package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2ViewModel;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.InputsListAdapter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CustomerContactsV2WidgetViewHolder$observeActions$1 extends AbstractC7737t implements Function1<CustomerContactsV2ViewModel.Action, Unit> {
    final /* synthetic */ CustomerContactsV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerContactsV2WidgetViewHolder$observeActions$1(CustomerContactsV2WidgetViewHolder customerContactsV2WidgetViewHolder) {
        super(1);
        this.this$0 = customerContactsV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CustomerContactsV2ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerContactsV2ViewModel.Action action) {
        ComposerReferences composerReferences;
        InputsListAdapter inputsListAdapter;
        ComposerReferences composerReferences2;
        Function1 function1;
        if (action instanceof CustomerContactsV2ViewModel.Action.HandleAction) {
            function1 = this.this$0.processedActionHandler;
            function1.invoke(((CustomerContactsV2ViewModel.Action.HandleAction) action).getAtomAction());
            return;
        }
        if (!(action instanceof CustomerContactsV2ViewModel.Action.NotifyInputChanged)) {
            if (!(action instanceof CustomerContactsV2ViewModel.Action.NotifyCheckboxChanged)) {
                throw new o();
            }
            composerReferences = this.this$0.references;
            composerReferences.getController().update(CustomerContactsUpdate$Checkbox.m1107boximpl(CustomerContactsUpdate$Checkbox.m1108constructorimpl(((CustomerContactsV2ViewModel.Action.NotifyCheckboxChanged) action).getCheckboxStatus())));
            return;
        }
        inputsListAdapter = this.this$0.inputsListAdapter;
        CustomerContactsV2ViewModel.Action.NotifyInputChanged notifyInputChanged = (CustomerContactsV2ViewModel.Action.NotifyInputChanged) action;
        inputsListAdapter.notifyItemChanged(notifyInputChanged.getInputPosition(), notifyInputChanged.getPayload());
        composerReferences2 = this.this$0.references;
        composerReferences2.getController().update(new CustomerContactsUpdate$Inputs(notifyInputChanged.getInputPosition(), notifyInputChanged.getInput()));
    }
}
