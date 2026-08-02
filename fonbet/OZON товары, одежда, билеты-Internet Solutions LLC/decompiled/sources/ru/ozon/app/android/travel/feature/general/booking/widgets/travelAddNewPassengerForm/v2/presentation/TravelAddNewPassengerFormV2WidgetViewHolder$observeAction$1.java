package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.input.InputsListAdapter;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.uikit.dialog.sort.SortsBottomSheetDialog;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV2WidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TravelAddNewPassengerFormV2ViewModel.Action, Unit> {
    final /* synthetic */ TravelAddNewPassengerFormV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV2WidgetViewHolder$observeAction$1(TravelAddNewPassengerFormV2WidgetViewHolder travelAddNewPassengerFormV2WidgetViewHolder) {
        super(1);
        this.this$0 = travelAddNewPassengerFormV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelAddNewPassengerFormV2ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelAddNewPassengerFormV2ViewModel.Action action) {
        ComposerReferences composerReferences;
        InputsListAdapter inputsListAdapter;
        InputsListAdapter inputsListAdapter2;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ComposerReferences composerReferences4;
        ComposerReferences composerReferences5;
        Function1 function1;
        if (action instanceof TravelAddNewPassengerFormV2ViewModel.Action.HandleAction) {
            function1 = this.this$0.processedActionHandler;
            function1.invoke(((TravelAddNewPassengerFormV2ViewModel.Action.HandleAction) action).getAtomAction());
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV2ViewModel.Action.ShowSelector) {
            TravelAddNewPassengerFormV2ViewModel.Action.ShowSelector showSelector = (TravelAddNewPassengerFormV2ViewModel.Action.ShowSelector) action;
            SortsBottomSheetDialog newInstance = SortsBottomSheetDialog.INSTANCE.newInstance(showSelector.getItems(), new Intent(), showSelector.getSelectorTitle());
            composerReferences4 = this.this$0.references;
            newInstance.setTargetFragment(composerReferences4.getContainer().c(), 34255);
            composerReferences5 = this.this$0.references;
            newInstance.show(composerReferences5.getContainer().k(), "SortsBottomSheetDialog");
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV2ViewModel.Action.ShowDateSelector) {
            TravelAddNewPassengerFormV2ViewModel.Action.ShowDateSelector showDateSelector = (TravelAddNewPassengerFormV2ViewModel.Action.ShowDateSelector) action;
            TravelDateSelectorDialogFragment newInstance$default = TravelDateSelectorDialogFragment.Companion.newInstance$default(TravelDateSelectorDialogFragment.INSTANCE, showDateSelector.getSelectorTitle(), showDateSelector.getSelectedDay(), showDateSelector.getSelectedMonth(), showDateSelector.getSelectedYear(), showDateSelector.getStartDateMillis(), showDateSelector.getEndDateMillis(), false, 64, null);
            composerReferences2 = this.this$0.references;
            newInstance$default.setTargetFragment(composerReferences2.getContainer().c(), 84655);
            composerReferences3 = this.this$0.references;
            newInstance$default.show(composerReferences3.getContainer().k(), "TravelDateSelectorDialogFragment");
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV2ViewModel.Action.SubmitInputs) {
            inputsListAdapter2 = this.this$0.inputsListAdapter;
            inputsListAdapter2.setItems(((TravelAddNewPassengerFormV2ViewModel.Action.SubmitInputs) action).getInputs());
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV2ViewModel.Action.NotifyInputChanged) {
            TravelAddNewPassengerFormV2ViewModel.Action.NotifyInputChanged notifyInputChanged = (TravelAddNewPassengerFormV2ViewModel.Action.NotifyInputChanged) action;
            if (notifyInputChanged.getShouldInputStateChange()) {
                inputsListAdapter = this.this$0.inputsListAdapter;
                inputsListAdapter.notifyItemChanged(notifyInputChanged.getInputPosition(), notifyInputChanged.getPayload());
            }
            TravelAddNewPassengerFormV2VO boundData = this.this$0.getBoundData();
            if (boundData == null || boundData.getIsInputChangedByClient()) {
                return;
            }
            composerReferences = this.this$0.references;
            composerReferences.getController().update(UpdateIsInputChangedByClient.INSTANCE);
        }
    }
}
