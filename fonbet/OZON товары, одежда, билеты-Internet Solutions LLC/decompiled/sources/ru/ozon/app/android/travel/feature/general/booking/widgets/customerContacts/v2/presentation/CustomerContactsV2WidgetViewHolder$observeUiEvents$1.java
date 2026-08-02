package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetCustomerContactsV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation.CustomerContactsV2ViewModel;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter.InputsListAdapter;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "uiEvent", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2ViewModel$UiEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CustomerContactsV2WidgetViewHolder$observeUiEvents$1 extends AbstractC7737t implements Function1<CustomerContactsV2ViewModel.UiEvent, Unit> {
    final /* synthetic */ CustomerContactsV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerContactsV2WidgetViewHolder$observeUiEvents$1(CustomerContactsV2WidgetViewHolder customerContactsV2WidgetViewHolder) {
        super(1);
        this.this$0 = customerContactsV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CustomerContactsV2ViewModel.UiEvent uiEvent) {
        invoke2(uiEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerContactsV2ViewModel.UiEvent uiEvent) {
        InputsListAdapter inputsListAdapter;
        WidgetCustomerContactsV2Binding widgetCustomerContactsV2Binding;
        if (!(uiEvent instanceof CustomerContactsV2ViewModel.UiEvent.SetCheckboxStatus)) {
            if (!(uiEvent instanceof CustomerContactsV2ViewModel.UiEvent.SubmitInputs)) {
                throw new o();
            }
            inputsListAdapter = this.this$0.inputsListAdapter;
            inputsListAdapter.submitList(((CustomerContactsV2ViewModel.UiEvent.SubmitInputs) uiEvent).getInputs());
            return;
        }
        CustomerContactsV2ViewModel.UiEvent.SetCheckboxStatus setCheckboxStatus = (CustomerContactsV2ViewModel.UiEvent.SetCheckboxStatus) uiEvent;
        CheckBoxDTO.CheckboxStatus checkboxStatus = setCheckboxStatus.getCheckboxStatus();
        if (checkboxStatus != null) {
            widgetCustomerContactsV2Binding = this.this$0.binding;
            widgetCustomerContactsV2Binding.contactsFormCellInfo.getLeftBlock().getCheckBoxView().setCheckboxState(checkboxStatus);
        }
        this.this$0.trackToggle(setCheckboxStatus.getCheckboxStatus() == CheckBoxDTO.CheckboxStatus.SELECTED);
    }
}
